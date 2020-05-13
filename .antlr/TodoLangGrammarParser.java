// Generated from c:\Users\amazz\OneDrive\Bureau\Work\TodoLangEditor\TodoLangGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TodoLangGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, TODO=2, COMPLETE=3, STRING=4, EOL=5, WS=6;
	public static final int
		RULE_todoExpressions = 0, RULE_addExpression = 1, RULE_completeExpression = 2;
	public static final String[] ruleNames = {
		"todoExpressions", "addExpression", "completeExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ADD'", "'TODO'", "'COMPLETE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ADD", "TODO", "COMPLETE", "STRING", "EOL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TodoLangGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TodoLangGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TodoExpressionsContext extends ParserRuleContext {
		public List<AddExpressionContext> addExpression() {
			return getRuleContexts(AddExpressionContext.class);
		}
		public AddExpressionContext addExpression(int i) {
			return getRuleContext(AddExpressionContext.class,i);
		}
		public List<CompleteExpressionContext> completeExpression() {
			return getRuleContexts(CompleteExpressionContext.class);
		}
		public CompleteExpressionContext completeExpression(int i) {
			return getRuleContext(CompleteExpressionContext.class,i);
		}
		public TodoExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_todoExpressions; }
	}

	public final TodoExpressionsContext todoExpressions() throws RecognitionException {
		TodoExpressionsContext _localctx = new TodoExpressionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_todoExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD) {
				{
				{
				setState(6);
				addExpression();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPLETE) {
				{
				{
				setState(12);
				completeExpression();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(TodoLangGrammarParser.ADD, 0); }
		public TerminalNode TODO() { return getToken(TodoLangGrammarParser.TODO, 0); }
		public TerminalNode STRING() { return getToken(TodoLangGrammarParser.STRING, 0); }
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_addExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ADD);
			setState(19);
			match(TODO);
			setState(20);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompleteExpressionContext extends ParserRuleContext {
		public TerminalNode COMPLETE() { return getToken(TodoLangGrammarParser.COMPLETE, 0); }
		public TerminalNode TODO() { return getToken(TodoLangGrammarParser.TODO, 0); }
		public TerminalNode STRING() { return getToken(TodoLangGrammarParser.STRING, 0); }
		public CompleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completeExpression; }
	}

	public final CompleteExpressionContext completeExpression() throws RecognitionException {
		CompleteExpressionContext _localctx = new CompleteExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_completeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(COMPLETE);
			setState(23);
			match(TODO);
			setState(24);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\35\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\7\2\20\n\2\f\2\16\2\23"+
		"\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\33\2\13\3"+
		"\2\2\2\4\24\3\2\2\2\6\30\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13"+
		"\t\3\2\2\2\13\f\3\2\2\2\f\21\3\2\2\2\r\13\3\2\2\2\16\20\5\6\4\2\17\16"+
		"\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21"+
		"\3\2\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\27\7\6\2\2\27\5\3\2\2\2\30\31"+
		"\7\5\2\2\31\32\7\4\2\2\32\33\7\6\2\2\33\7\3\2\2\2\4\13\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}