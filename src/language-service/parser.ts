import { TodoLangGrammarParser, TodoExpressionsContext } from "../ANTLR/TodoLangGrammarParser";
import { TodoLangGrammarLexer } from "../ANTLR/TodoLangGrammarLexer";
import { ANTLRInputStream, CommonTokenStream } from "antlr4ts";
import TodoLangErrorListener, { ITodoLangError } from "./TodoLangErrorListener";

function parse(code: string): {ast:TodoExpressionsContext, errors: ITodoLangError[]} {
    const inputStream = new ANTLRInputStream(code);
    const lexer = new TodoLangGrammarLexer(inputStream);
    lexer.removeErrorListeners()
    const todoLangErrorsListener = new TodoLangErrorListener();
    lexer.addErrorListener(todoLangErrorsListener);
    const tokenStream = new CommonTokenStream(lexer);
    const parser = new TodoLangGrammarParser(tokenStream);
    parser.removeErrorListeners();
    parser.addErrorListener(todoLangErrorsListener);
    const ast =  parser.todoExpressions();
    const errors: ITodoLangError[]  = todoLangErrorsListener.getErrors();
    return {ast, errors};
}
export function parseAndGetASTRoot(code: string): TodoExpressionsContext {
    const {ast} = parse(code);
    return ast;
}
export function parseAndGetSyntaxErrors(code: string): ITodoLangError[] {
    const {errors} = parse(code);
    return errors;
}