import { TodoExpressionsContext } from "../ANTLR/TodoLangGrammarParser";
import { parseAndGetASTRoot, parseAndGetSyntaxErrors } from "./Parser";
import { ITodoLangError } from "./TodoLangErrorListener";

export default class TodoLangLanguageService {
    validate(code: string): ITodoLangError[] {
        const syntaxErrors: ITodoLangError[] = parseAndGetSyntaxErrors(code);
        //Later we will append semantic errors
        return syntaxErrors;
    }
}