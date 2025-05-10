// Generated from /home/alpaca/compiler/project3/myparser.g4 by ANTLR 4.13.1

    // import packages here.
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class myparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Break=1, Case=2, Char=3, Const=4, Continue=5, Default=6, Do=7, Double=8, 
		Else=9, Float=10, For=11, If=12, Int=13, Return=14, Short=15, Switch=16, 
		Void=17, While=18, Printf=19, Scanf=20, Malloc=21, Free=22, LeftParen=23, 
		RightParen=24, LeftBracket=25, RightBracket=26, LeftBrace=27, RightBrace=28, 
		Dot=29, Semi=30, Comma=31, Colon=32, Less=33, LessEqual=34, Greater=35, 
		GreaterEqual=36, LeftShift=37, RightShift=38, Plus=39, PlusPlus=40, Minus=41, 
		MinusMinus=42, Star=43, Div=44, Mod=45, And=46, Or=47, AndAnd=48, OrOr=49, 
		Caret=50, Not=51, Tilde=52, Assign=53, StarAssign=54, DivAssign=55, ModAssign=56, 
		PlusAssign=57, MinusAssign=58, LeftShiftAssign=59, RightShiftAssign=60, 
		AndAssign=61, XorAssign=62, OrAssign=63, Equal=64, NotEqual=65, Identifier=66, 
		Constant=67, IntegerConstant=68, FloatingConstant=69, DoubleConstant=70, 
		CharacterConstant=71, StringLiteral=72, Directive=73, Whitespace=74, Newline=75, 
		BlockComment=76, LineComment=77;
	public static final int
		RULE_translationUnit = 0, RULE_declaration = 1, RULE_initialization = 2, 
		RULE_type = 3, RULE_declarator = 4, RULE_parameterList = 5, RULE_parameterDeclaration = 6, 
		RULE_functionDefinition = 7, RULE_block = 8, RULE_statement = 9, RULE_constant = 10, 
		RULE_simpleExpression = 11, RULE_postfixExpression = 12, RULE_prefixExpression = 13, 
		RULE_unaryOperator = 14, RULE_unaryExpression = 15, RULE_mulicativeExpression = 16, 
		RULE_additiveExpression = 17, RULE_shiftExpression = 18, RULE_compareExpression = 19, 
		RULE_equalityExpression = 20, RULE_andExpression = 21, RULE_exclusiveOrExpression = 22, 
		RULE_inclusiveOrExpression = 23, RULE_logicalAndExpression = 24, RULE_logicalOrExpression = 25, 
		RULE_assignmentExpression = 26, RULE_assignmentOperator = 27, RULE_expression = 28, 
		RULE_selection = 29, RULE_caseStatement = 30, RULE_defaultStatement = 31, 
		RULE_iteration = 32, RULE_forCondition = 33, RULE_forDeclaration = 34, 
		RULE_functionCall = 35, RULE_printf = 36, RULE_scanf = 37, RULE_malloc = 38, 
		RULE_free = 39, RULE_customerFunction = 40, RULE_parameter = 41, RULE_generalParameter = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "declaration", "initialization", "type", "declarator", 
			"parameterList", "parameterDeclaration", "functionDefinition", "block", 
			"statement", "constant", "simpleExpression", "postfixExpression", "prefixExpression", 
			"unaryOperator", "unaryExpression", "mulicativeExpression", "additiveExpression", 
			"shiftExpression", "compareExpression", "equalityExpression", "andExpression", 
			"exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "selection", "caseStatement", "defaultStatement", "iteration", 
			"forCondition", "forDeclaration", "functionCall", "printf", "scanf", 
			"malloc", "free", "customerFunction", "parameter", "generalParameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'case'", "'char'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'float'", "'for'", "'if'", "'int'", "'return'", 
			"'short'", "'switch'", "'void'", "'while'", "'printf'", "'scanf'", "'malloc'", 
			"'free'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "';'", "','", 
			"':'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
			"'&='", "'^='", "'|='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Break", "Case", "Char", "Const", "Continue", "Default", "Do", 
			"Double", "Else", "Float", "For", "If", "Int", "Return", "Short", "Switch", 
			"Void", "While", "Printf", "Scanf", "Malloc", "Free", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Dot", "Semi", 
			"Comma", "Colon", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", 
			"Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Assign", 
			"StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", 
			"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", 
			"Equal", "NotEqual", "Identifier", "Constant", "IntegerConstant", "FloatingConstant", 
			"DoubleConstant", "CharacterConstant", "StringLiteral", "Directive", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "myparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    static final boolean TRACEON = false;

	    HashMap<String,Integer> symtab = new HashMap<String, Type>();
	    HashMap<String,Integer> funs = new HashMap<String, Type>();

	    enum Type {
	        Int,
	        Float,
	        Double,
	        Char,
	        Short,
	        Void,
	        IntPtr,
	        FloatPtr,
	        DoublePtr,
	        CharPtr,
	        ShortPtr,
	        VoidPtr,
	        Function,
	        Boolean
	    }

	    static Type toPtr(Type t) {
	        switch(t) {
	            case Type.Int:
	                return Type.IntPtr;
	            case Type.Float:
	                return Type.FloatPtr;
	            case Type.Double:
	                return Type.DoublePtr;
	            case Type.Char:
	                return Type.CharPtr;
	            case Type.Short:
	                return Type.ShortPtr;
	            case Type.Void:
	                return Type.VoidPtr;
	            default:
	                return t;
	        }
	    }

	    static Type toElement(Type t) {
	        switch(t) {
	            case Type.IntPtr:
	                return Type.Int;
	            case Type.FloatPtr:
	                return Type.Float;
	            case Type.DoublePtr:
	                return Type.Double;
	            case Type.CharPtr:
	                return Type.CharPtr;
	            case Type.ShortPtr:
	                return Type.Short;
	            case Type.VoidPtr:
	                return Type.Void;
	            default:
	                return t;
	        }
	    }

	public myparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(myparserParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(myparserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(myparserParser.Semi, i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073915160L) != 0)) {
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(86);
					declaration();
					}
					break;
				case 2:
					{
					setState(87);
					functionDefinition();
					}
					break;
				case 3:
					{
					setState(88);
					match(Semi);
					}
					break;
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(EOF);
			 if (TRACEON) System.out.println("translationUnit: (declaration | functionDefinition | ';')* EOF"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Semi() { return getToken(myparserParser.Semi, 0); }
		public TerminalNode Const() { return getToken(myparserParser.Const, 0); }
		public TerminalNode Star() { return getToken(myparserParser.Star, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(97);
				match(Const);
				}
			}

			setState(100);
			((DeclarationContext)_localctx).type = type();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(101);
				match(Star);
				}
			}

			setState(104);
			declarator(((DeclarationContext)_localctx).type.attr_t);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(105);
				initialization(((DeclarationContext)_localctx).type.attr_t);
				}
			}

			setState(108);
			match(Semi);
			 
			        if (TRACEON) System.out.println("declaration: 'const'? type '*'? declarator initialization? ';'"); 
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationContext extends ParserRuleContext {
		public Type typ;
		public AssignmentExpressionContext assignmentExpression;
		public FunctionCallContext functionCall;
		public TerminalNode Assign() { return getToken(myparserParser.Assign, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitializationContext(ParserRuleContext parent, int invokingState, Type typ) {
			super(parent, invokingState);
			this.typ = typ;
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
	}

	public final InitializationContext initialization(Type typ) throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState(), typ);
		enterRule(_localctx, 4, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(Assign);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(112);
				((InitializationContext)_localctx).assignmentExpression = assignmentExpression();

				        if(((InitializationContext)_localctx).assignmentExpression.typ != _localctx.typ) {
				            System.err.println("Error! line number: " + (((InitializationContext)_localctx).assignmentExpression!=null?(((InitializationContext)_localctx).assignmentExpression.start):null).getLine() + "imcompatible types.");
				        }
				    
				}
				break;
			case 2:
				{
				setState(115);
				((InitializationContext)_localctx).functionCall = functionCall();

				        if(((InitializationContext)_localctx).functionCall.typ != _localctx.typ) {
				            System.err.println("Error! line number: " + (((InitializationContext)_localctx).functionCall!=null?(((InitializationContext)_localctx).functionCall.start):null).getLine() + "imcompatible types.");
				        }
				    
				}
				break;
			}
			 if (TRACEON) System.out.println("initialization: '=' (assignmentExpression | functionCall)"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type attr_t;
		public TerminalNode Char() { return getToken(myparserParser.Char, 0); }
		public TerminalNode Int() { return getToken(myparserParser.Int, 0); }
		public TerminalNode Float() { return getToken(myparserParser.Float, 0); }
		public TerminalNode Double() { return getToken(myparserParser.Double, 0); }
		public TerminalNode Void() { return getToken(myparserParser.Void, 0); }
		public TerminalNode Short() { return getToken(myparserParser.Short, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(Char);
				 ((TypeContext)_localctx).attr_t =  Type.Char; 
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(Int);
				 ((TypeContext)_localctx).attr_t =  Type.Int; 
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(Float);
				 ((TypeContext)_localctx).attr_t =  Type.Float; 
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(Double);
				 ((TypeContext)_localctx).attr_t =  Type.Double; 
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(Void);
				 ((TypeContext)_localctx).attr_t =  Type.Void; 
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(Short);
				 ((TypeContext)_localctx).attr_t =  Type.Short; 
				 if (TRACEON) System.out.println("type: Char | Int | Float | Double | Void"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public Type typ;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(myparserParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(myparserParser.RightBracket, 0); }
		public TerminalNode IntegerConstant() { return getToken(myparserParser.IntegerConstant, 0); }
		public DeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclaratorContext(ParserRuleContext parent, int invokingState, Type typ) {
			super(parent, invokingState);
			this.typ = typ;
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator(Type typ) throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState(), typ);
		enterRule(_localctx, 8, RULE_declarator);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((DeclaratorContext)_localctx).Identifier = match(Identifier);

				        if(symtab.containKey(((DeclaratorContext)_localctx).Identifier)) {
				            System.err.println("Error: " + ((DeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				        } else {
				            symtab.put((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null), _localctx.typ);
				        }
				        if (TRACEON) System.out.println("declarator: Identifier");
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((DeclaratorContext)_localctx).Identifier = match(Identifier);

				        if(symtab.containKey(((DeclaratorContext)_localctx).Identifier)) {
				            System.err.println("Error: " + ((DeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				        } else if(funs.containKey(((DeclaratorContext)_localctx).Identifier)) {
				            System.err.println("Error: " + ((DeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared function.");
				        } else {
				            symtab.put((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null), Type.Function);
				            funs.put((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null), _localctx.typ);
				        }
				    
				setState(141);
				match(LeftParen);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 173320L) != 0)) {
					{
					setState(142);
					parameterList();
					}
				}

				setState(145);
				match(RightParen);
				 
				        if (TRACEON) System.out.println("declarator: Identifier '(' parameterList? ')'"); 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				((DeclaratorContext)_localctx).Identifier = match(Identifier);

				        if(symtab.containKey(((DeclaratorContext)_localctx).Identifier)) {
				            System.err.println("Error: " + ((DeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				        } else {
				            symtab.put((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null), toPtr(_localctx.typ));
				        }
				    
				setState(149);
				match(LeftBracket);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntegerConstant) {
					{
					setState(150);
					match(IntegerConstant);
					}
				}

				setState(153);
				match(RightBracket);
				 
				        if (TRACEON) System.out.println("declarator: Identifier '[' IntegerConstant? ']'"); 
				    
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(myparserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(myparserParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			parameterDeclaration();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(158);
				match(Comma);
				setState(159);
				parameterDeclaration();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("parameterList: parameterDeclaration (',' parameterDeclaration)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public TerminalNode Star() { return getToken(myparserParser.Star, 0); }
		public TerminalNode LeftBracket() { return getToken(myparserParser.LeftBracket, 0); }
		public TerminalNode IntegerConstant() { return getToken(myparserParser.IntegerConstant, 0); }
		public TerminalNode RightBracket() { return getToken(myparserParser.RightBracket, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterDeclaration);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				type();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(168);
					match(Star);
					}
				}

				setState(171);
				match(Identifier);
				 if (TRACEON) System.out.println("parameterDeclaration: type '*'? Identifier"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				type();
				setState(175);
				match(Identifier);
				setState(176);
				match(LeftBracket);
				setState(177);
				match(IntegerConstant);
				setState(178);
				match(RightBracket);
				 if (TRACEON) System.out.println("parameterDeclaration: type Identifier '[' IntegerConstant ']'"); 
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			type();
			setState(184);
			match(Identifier);
			setState(185);
			match(LeftParen);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 173320L) != 0)) {
				{
				setState(186);
				parameterList();
				}
			}

			setState(189);
			match(RightParen);
			setState(190);
			block();
			 if (TRACEON) System.out.println("functionDefinition: type Identifier '(' parameterList? ')' block"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(myparserParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(myparserParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LeftBrace);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6842810766458298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 125L) != 0)) {
				{
				{
				setState(194);
				statement();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(RightBrace);
			 if (TRACEON) System.out.println("block: '{' statement* '}'"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(myparserParser.Semi, 0); }
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public TerminalNode Break() { return getToken(myparserParser.Break, 0); }
		public TerminalNode Continue() { return getToken(myparserParser.Continue, 0); }
		public TerminalNode Return() { return getToken(myparserParser.Return, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				block();
				 if (TRACEON) System.out.println("statement: block"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				declaration();
				 if (TRACEON) System.out.println("statement: declaration"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				expression();
				setState(210);
				match(Semi);
				 if (TRACEON) System.out.println("statement: expression ';'"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				selection();
				 if (TRACEON) System.out.println("statement: selection"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				iteration();
				 if (TRACEON) System.out.println("statement: iteration"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(219);
					match(Break);
					}
					break;
				case Continue:
					{
					setState(220);
					match(Continue);
					}
					break;
				case Return:
					{
					setState(221);
					match(Return);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 1099512443502593L) != 0)) {
						{
						setState(222);
						expression();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227);
				match(Semi);
				 if (TRACEON) System.out.println("statement: ('break' | 'continue' | 'return' expression?) ';'"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				functionCall();
				setState(230);
				match(Semi);
				 if (TRACEON) System.out.println("statement: functionCall ';'"); 
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public Type typ;
		public TerminalNode IntegerConstant() { return getToken(myparserParser.IntegerConstant, 0); }
		public TerminalNode FloatingConstant() { return getToken(myparserParser.FloatingConstant, 0); }
		public TerminalNode DoubleConstant() { return getToken(myparserParser.DoubleConstant, 0); }
		public TerminalNode CharacterConstant() { return getToken(myparserParser.CharacterConstant, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerConstant:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(IntegerConstant);

				        ((ConstantContext)_localctx).typ =  Type.Int;
				        if (TRACEON) System.out.println("constant: IntegerConstant"); 
				    
				}
				break;
			case FloatingConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(FloatingConstant);

				        ((ConstantContext)_localctx).typ =  Type.Float;
				        if (TRACEON) System.out.println("constant: FloatingConstant"); 
				    
				}
				break;
			case DoubleConstant:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(DoubleConstant);

				        ((ConstantContext)_localctx).typ =  Type.Double;
				        if (TRACEON) System.out.println("constant: DoubleConstant"); 
				    
				}
				break;
			case CharacterConstant:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(CharacterConstant);

				        ((ConstantContext)_localctx).typ =  Type.Char;
				        if (TRACEON) System.out.println("constant: CharacterConstant"); 
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends ParserRuleContext {
		public Type typ;
		public Token Identifier;
		public ConstantContext constant;
		public ExpressionContext expression;
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(myparserParser.StringLiteral, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleExpression);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				((SimpleExpressionContext)_localctx).Identifier = match(Identifier);

				        if(symtab.containKey((((SimpleExpressionContext)_localctx).Identifier!=null?((SimpleExpressionContext)_localctx).Identifier.getText():null))) {
				            ((SimpleExpressionContext)_localctx).typ =  symtab((((SimpleExpressionContext)_localctx).Identifier!=null?((SimpleExpressionContext)_localctx).Identifier.getText():null));
				        } else {
				            System.err.println("Error! line number: " + ((SimpleExpressionContext)_localctx).Identifier.getLine() + "variable not declared!");
				        }
				        if (TRACEON) System.out.println("simpleExpression: Identifier"); 
				    
				}
				break;
			case IntegerConstant:
			case FloatingConstant:
			case DoubleConstant:
			case CharacterConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				((SimpleExpressionContext)_localctx).constant = constant();

				        ((SimpleExpressionContext)_localctx).typ =  ((SimpleExpressionContext)_localctx).constant.typ;
				        if (TRACEON) System.out.println("simpleExpression: constant"); 
				    
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(StringLiteral);

				        ((SimpleExpressionContext)_localctx).typ =  Type.String;
				        if (TRACEON) System.out.println("simpleExpression: StringLiteral"); 
				    
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(LeftParen);
				setState(253);
				((SimpleExpressionContext)_localctx).expression = expression();
				setState(254);
				match(RightParen);

				        ((SimpleExpressionContext)_localctx).typ =  ((SimpleExpressionContext)_localctx).expression.typ;
				        if (TRACEON) System.out.println("simpleExpression: '(' expression ')'");
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public Type typ;
		public SimpleExpressionContext simpleExpression;
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(myparserParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(myparserParser.MinusMinus, 0); }
		public TerminalNode LeftBracket() { return getToken(myparserParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(myparserParser.RightBracket, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((PostfixExpressionContext)_localctx).simpleExpression = simpleExpression();
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlusPlus:
				{
				setState(260);
				match(PlusPlus);
				 ((PostfixExpressionContext)_localctx).typ =  ((PostfixExpressionContext)_localctx).simpleExpression.typ; 
				}
				break;
			case MinusMinus:
				{
				setState(262);
				match(MinusMinus);
				 ((PostfixExpressionContext)_localctx).typ =  ((PostfixExpressionContext)_localctx).simpleExpression.typ; 
				}
				break;
			case LeftBracket:
				{
				setState(264);
				match(LeftBracket);
				setState(265);
				expression();
				setState(266);
				match(RightBracket);
				 ((PostfixExpressionContext)_localctx).typ =  toElement(((PostfixExpressionContext)_localctx).simpleExpression.typ); 
				}
				break;
			case RightParen:
			case RightBracket:
			case Semi:
			case Comma:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
				break;
			default:
				break;
			}
			 if (TRACEON) System.out.println("postfixExpression: simpleExpression ('++' | '--' | '.' Identifier | '[' expression ']')*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixExpressionContext extends ParserRuleContext {
		public Type typ;
		public PostfixExpressionContext postfixExpression;
		public UnaryExpressionContext unaryExpression;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(myparserParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(myparserParser.MinusMinus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpression; }
	}

	public final PrefixExpressionContext prefixExpression() throws RecognitionException {
		PrefixExpressionContext _localctx = new PrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prefixExpression);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case PlusPlus:
			case MinusMinus:
			case Identifier:
			case IntegerConstant:
			case FloatingConstant:
			case DoubleConstant:
			case CharacterConstant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PlusPlus || _la==MinusMinus) {
					{
					setState(273);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(276);
				((PrefixExpressionContext)_localctx).postfixExpression = postfixExpression();

				        ((PrefixExpressionContext)_localctx).typ =  ((PrefixExpressionContext)_localctx).postfixExpression.typ;
				        if (TRACEON) System.out.println("prefixExpression: ('++' | '--')? postfixExpression");
				    
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				((PrefixExpressionContext)_localctx).unaryExpression = unaryExpression();

				        ((PrefixExpressionContext)_localctx).typ =  ((PrefixExpressionContext)_localctx).unaryExpression.typ;
				        if (TRACEON) System.out.println("prefixExpression: unaryExpression");
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(myparserParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(myparserParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(myparserParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(myparserParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryOperator);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(Plus);
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(Minus);
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(Tilde);
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(Not);
				 if (TRACEON) System.out.println("unaryOperator: '+' | '-' | '~' | '!'"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public Type typ;
		public PostfixExpressionContext postfixExpression;
		public TerminalNode And() { return getToken(myparserParser.And, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(myparserParser.Star, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryExpression);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(And);
				setState(292);
				((UnaryExpressionContext)_localctx).postfixExpression = postfixExpression();
				 ((UnaryExpressionContext)_localctx).typ =  toPtr(((UnaryExpressionContext)_localctx).postfixExpression.typ); 
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(Star);
				setState(296);
				((UnaryExpressionContext)_localctx).postfixExpression = postfixExpression();
				 ((UnaryExpressionContext)_localctx).typ =  toElement(((UnaryExpressionContext)_localctx).postfixExpression.typ); 
				}
				break;
			case Plus:
			case Minus:
			case Not:
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				unaryOperator();
				setState(300);
				((UnaryExpressionContext)_localctx).postfixExpression = postfixExpression();
				 ((UnaryExpressionContext)_localctx).typ =  ((UnaryExpressionContext)_localctx).postfixExpression.typ; 
				 if (TRACEON) System.out.println("unaryExpression: unaryOperator* postfixExpression"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulicativeExpressionContext extends ParserRuleContext {
		public Type typ;
		public PrefixExpressionContext p1;
		public PrefixExpressionContext p2;
		public List<PrefixExpressionContext> prefixExpression() {
			return getRuleContexts(PrefixExpressionContext.class);
		}
		public PrefixExpressionContext prefixExpression(int i) {
			return getRuleContext(PrefixExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(myparserParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(myparserParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(myparserParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(myparserParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(myparserParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(myparserParser.Mod, i);
		}
		public MulicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulicativeExpression; }
	}

	public final MulicativeExpressionContext mulicativeExpression() throws RecognitionException {
		MulicativeExpressionContext _localctx = new MulicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mulicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((MulicativeExpressionContext)_localctx).p1 = prefixExpression();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) {
				{
				{
				setState(307);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(308);
				((MulicativeExpressionContext)_localctx).p2 = prefixExpression();

				        if(((MulicativeExpressionContext)_localctx).p1.typ != ((MulicativeExpressionContext)_localctx).p2.typ) {
				            System.err.println("Error! line number: " + (((MulicativeExpressionContext)_localctx).p2!=null?(((MulicativeExpressionContext)_localctx).p2.start):null).getLine() + "imcompatible types.");
				        }
				        ((MulicativeExpressionContext)_localctx).typ =  ((MulicativeExpressionContext)_localctx).p1.typ;
				    
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("mulicativeExpression: prefixExpression (('*' | '/' | '%') prefixExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Type typ;
		public MulicativeExpressionContext m1;
		public MulicativeExpressionContext m2;
		public List<MulicativeExpressionContext> mulicativeExpression() {
			return getRuleContexts(MulicativeExpressionContext.class);
		}
		public MulicativeExpressionContext mulicativeExpression(int i) {
			return getRuleContext(MulicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(myparserParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(myparserParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(myparserParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(myparserParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((AdditiveExpressionContext)_localctx).m1 = mulicativeExpression();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				((AdditiveExpressionContext)_localctx).m2 = mulicativeExpression();

				        if(((AdditiveExpressionContext)_localctx).m1.typ != ((AdditiveExpressionContext)_localctx).m2.typ) {
				            System.err.println("Error! line number: " + (((AdditiveExpressionContext)_localctx).m2!=null?(((AdditiveExpressionContext)_localctx).m2.start):null).getLine() + "imcompatible types.");
				        }
				        ((AdditiveExpressionContext)_localctx).typ =  ((AdditiveExpressionContext)_localctx).m1.typ;
				    
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("additiveExpression: mulicativeExpression (('+' | '-') mulicativeExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ParserRuleContext {
		public Type typ;
		public AdditiveExpressionContext a1;
		public AdditiveExpressionContext a2;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LeftShift() { return getTokens(myparserParser.LeftShift); }
		public TerminalNode LeftShift(int i) {
			return getToken(myparserParser.LeftShift, i);
		}
		public List<TerminalNode> RightShift() { return getTokens(myparserParser.RightShift); }
		public TerminalNode RightShift(int i) {
			return getToken(myparserParser.RightShift, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			((ShiftExpressionContext)_localctx).a1 = additiveExpression();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
				((ShiftExpressionContext)_localctx).a2 = additiveExpression();

				        if(((ShiftExpressionContext)_localctx).a1.typ != ((ShiftExpressionContext)_localctx).a2.typ) {
				            System.err.println("Error! line number: " + (((ShiftExpressionContext)_localctx).a2!=null?(((ShiftExpressionContext)_localctx).a2.start):null).getLine() + "imcompatible types.");
				        } 
				        ((ShiftExpressionContext)_localctx).typ =  ((ShiftExpressionContext)_localctx).a1.typ;
				    
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("shiftExpression: additiveExpression (('<<' | '>>') additiveExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompareExpressionContext extends ParserRuleContext {
		public Type typ;
		public ShiftExpressionContext s1;
		public ShiftExpressionContext s2;
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(myparserParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(myparserParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(myparserParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(myparserParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(myparserParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(myparserParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(myparserParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(myparserParser.GreaterEqual, i);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compareExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((CompareExpressionContext)_localctx).s1 = shiftExpression();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) {
				{
				{
				setState(343);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(344);
				((CompareExpressionContext)_localctx).s2 = shiftExpression();

				        if(((CompareExpressionContext)_localctx).s1.typ != ((CompareExpressionContext)_localctx).s2.typ) {
				            System.err.println("Error! line number: " + (((CompareExpressionContext)_localctx).s2!=null?(((CompareExpressionContext)_localctx).s2.start):null).getLine() + "imcompatible types.");
				        } 
				        ((CompareExpressionContext)_localctx).typ =  Type.Boolean;
				    
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("compareExpression: shiftExpression (('<' | '>' | '<=' | '>=') shiftExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public Type typ;
		public CompareExpressionContext c1;
		public CompareExpressionContext c2;
		public List<CompareExpressionContext> compareExpression() {
			return getRuleContexts(CompareExpressionContext.class);
		}
		public CompareExpressionContext compareExpression(int i) {
			return getRuleContext(CompareExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(myparserParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(myparserParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(myparserParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(myparserParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((EqualityExpressionContext)_localctx).c1 = compareExpression();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(356);
				((EqualityExpressionContext)_localctx).c2 = compareExpression();

				        if(((EqualityExpressionContext)_localctx).c1.typ != ((EqualityExpressionContext)_localctx).c2.typ) {
				            System.err.println("Error! line number: " + (((EqualityExpressionContext)_localctx).c2!=null?(((EqualityExpressionContext)_localctx).c2.start):null).getLine() + "imcompatible types.");
				        } 
				        ((EqualityExpressionContext)_localctx).typ =  ((EqualityExpressionContext)_localctx).c1.typ;
				    
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("equalityExpression: compareExpression (('==' | '!=') compareExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public Type typ;
		public EqualityExpressionContext e1;
		public EqualityExpressionContext e2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(myparserParser.And); }
		public TerminalNode And(int i) {
			return getToken(myparserParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((AndExpressionContext)_localctx).e1 = equalityExpression();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(367);
				match(And);
				setState(368);
				((AndExpressionContext)_localctx).e2 = equalityExpression();

				        if(((AndExpressionContext)_localctx).e1.typ != ((AndExpressionContext)_localctx).e2.typ) {
				            System.err.println("Error! line number: " + (((AndExpressionContext)_localctx).e2!=null?(((AndExpressionContext)_localctx).e2.start):null).getLine() + "imcompatible types.");
				        } 
				        ((AndExpressionContext)_localctx).typ =  ((AndExpressionContext)_localctx).e1.typ;
				    
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("andExpression: equalityExpression ('&' equalityExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public Type typ;
		public AndExpressionContext a1;
		public AndExpressionContext a2;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(myparserParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(myparserParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((ExclusiveOrExpressionContext)_localctx).a1 = andExpression();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(379);
				match(Caret);
				setState(380);
				((ExclusiveOrExpressionContext)_localctx).a2 = andExpression();

				        if(((ExclusiveOrExpressionContext)_localctx).a1.typ != ((ExclusiveOrExpressionContext)_localctx).a2.typ) {
				            System.err.println("Error! line number: " + (((ExclusiveOrExpressionContext)_localctx).a2!=null?(((ExclusiveOrExpressionContext)_localctx).a2.start):null).getLine() + "imcompatible types.");
				        } 
				        ((ExclusiveOrExpressionContext)_localctx).typ =  ((ExclusiveOrExpressionContext)_localctx).a1.typ;
				    
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("exclusiveOrExpression: andExpression ('^' andExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public Type typ;
		public ExclusiveOrExpressionContext e1;
		public ExclusiveOrExpressionContext e2;
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(myparserParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(myparserParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(391);
				match(Or);
				setState(392);
				((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();

				        if(((InclusiveOrExpressionContext)_localctx).e1.typ != ((InclusiveOrExpressionContext)_localctx).e2.typ) {
				            System.err.println("Error! line number: " + (((InclusiveOrExpressionContext)_localctx).e2!=null?(((InclusiveOrExpressionContext)_localctx).e2.start):null).getLine() + "imcompatible types.");
				        } 
				        ((InclusiveOrExpressionContext)_localctx).typ =  ((InclusiveOrExpressionContext)_localctx).e1.typ;
				    
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("inclusiveOrExpression: exclusiveOrExpression ('|' exclusiveOrExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public Type typ;
		public InclusiveOrExpressionContext i1;
		public InclusiveOrExpressionContext i2;
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(myparserParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(myparserParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			((LogicalAndExpressionContext)_localctx).i1 = inclusiveOrExpression();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(403);
				match(AndAnd);
				setState(404);
				((LogicalAndExpressionContext)_localctx).i2 = inclusiveOrExpression();

				        if(((LogicalAndExpressionContext)_localctx).i1.typ != ((LogicalAndExpressionContext)_localctx).i2.typ) {
				            System.err.println("Error! line number: " + (((LogicalAndExpressionContext)_localctx).i2!=null?(((LogicalAndExpressionContext)_localctx).i2.start):null).getLine() + "imcompatible types.");
				        } 
				        ((LogicalAndExpressionContext)_localctx).typ =  ((LogicalAndExpressionContext)_localctx).i1.typ;
				    
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("logicalAndExpression: inclusiveOrExpression ('&&' inclusiveOrExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public Type typ;
		public LogicalAndExpressionContext l1;
		public LogicalAndExpressionContext l2;
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(myparserParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(myparserParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((LogicalOrExpressionContext)_localctx).l1 = logicalAndExpression();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(415);
				match(OrOr);
				setState(416);
				((LogicalOrExpressionContext)_localctx).l2 = logicalAndExpression();

				        if(((LogicalOrExpressionContext)_localctx).l1.typ != ((LogicalOrExpressionContext)_localctx).l2.typ) {
				            System.err.println("Error! line number: " + (((LogicalOrExpressionContext)_localctx).l2!=null?(((LogicalOrExpressionContext)_localctx).l2.start):null).getLine() + "imcompatible types.");
				        } 
				        ((LogicalOrExpressionContext)_localctx).typ =  ((LogicalOrExpressionContext)_localctx).l1.typ;
				    
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("logicalOrExpression: logicalAndExpression ('||' logicalAndExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public Type typ;
		public LogicalOrExpressionContext logicalOrExpression;
		public PrefixExpressionContext p;
		public LogicalOrExpressionContext l;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentExpression);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				((AssignmentExpressionContext)_localctx).logicalOrExpression = logicalOrExpression();

				        ((AssignmentExpressionContext)_localctx).typ =  ((AssignmentExpressionContext)_localctx).logicalOrExpression.typ;
				        if (TRACEON) System.out.println("assignmentExpression: logicalOrExpression");
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				((AssignmentExpressionContext)_localctx).p = prefixExpression();
				setState(430);
				assignmentOperator();
				setState(431);
				((AssignmentExpressionContext)_localctx).l = logicalOrExpression();

				        if(((AssignmentExpressionContext)_localctx).p.typ != ((AssignmentExpressionContext)_localctx).l.typ) {
				            System.err.println("Error! line number: " + (((AssignmentExpressionContext)_localctx).l!=null?(((AssignmentExpressionContext)_localctx).l.start):null).getLine() + "imcompatible types.");
				        }
				        ((AssignmentExpressionContext)_localctx).typ =  ((AssignmentExpressionContext)_localctx).p.typ;
				        if (TRACEON) System.out.println("assignmentExpression: prefixExpression assignmentOperator logicalOrExpression");
				    
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode StarAssign() { return getToken(myparserParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(myparserParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(myparserParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(myparserParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(myparserParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(myparserParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(myparserParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(myparserParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(myparserParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(myparserParser.OrAssign, 0); }
		public TerminalNode Assign() { return getToken(myparserParser.Assign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentOperator);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StarAssign:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				match(MinusAssign);
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				match(LeftShiftAssign);
				}
				break;
			case RightShiftAssign:
				enterOuterAlt(_localctx, 7);
				{
				setState(442);
				match(RightShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(443);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(444);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(445);
				match(OrAssign);
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 11);
				{
				setState(446);
				match(Assign);
				 if (TRACEON) System.out.println("assignmentOperator: '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' | '='"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Type typ;
		public AssignmentExpressionContext a1;
		public AssignmentExpressionContext a2;
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(myparserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(myparserParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			((ExpressionContext)_localctx).a1 = assignmentExpression();
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					match(Comma);
					setState(452);
					((ExpressionContext)_localctx).a2 = assignmentExpression();

					        if(((ExpressionContext)_localctx).a1.typ != ((ExpressionContext)_localctx).a2.typ) {
					            System.err.println("Error! line number: " + (((ExpressionContext)_localctx).a2!=null?(((ExpressionContext)_localctx).a2.start):null).getLine() + "imcompatible types.");
					        } 
					        // return a2's value
					        ((ExpressionContext)_localctx).typ =  ((ExpressionContext)_localctx).a2.typ;
					    
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			 if (TRACEON) System.out.println("expression: assignmentExpression (',' assignmentExpression)*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode If() { return getToken(myparserParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(myparserParser.Else, 0); }
		public TerminalNode Switch() { return getToken(myparserParser.Switch, 0); }
		public TerminalNode LeftBrace() { return getToken(myparserParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(myparserParser.RightBrace, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selection);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(If);
				setState(463);
				match(LeftParen);
				setState(464);
				((SelectionContext)_localctx).expression = expression();

				        if(((SelectionContext)_localctx).expression.typ != Type.Boolean) {
				            System.err.println("Error! line number: " + (((SelectionContext)_localctx).expression!=null?(((SelectionContext)_localctx).expression.start):null).getLine() + "if needs boolean expression.");
				        } 
				    
				setState(466);
				match(RightParen);
				setState(467);
				statement();
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(468);
					match(Else);
					setState(469);
					statement();
					}
					break;
				}
				 if (TRACEON) System.out.println("selection: 'if' '(' expression ')' statement ('else' statement)?"); 
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(Switch);
				setState(475);
				match(LeftParen);
				setState(476);
				expression();
				setState(477);
				match(RightParen);
				setState(478);
				match(LeftBrace);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case) {
					{
					{
					setState(479);
					caseStatement();
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(485);
					defaultStatement();
					}
				}

				setState(488);
				match(RightBrace);
				 if (TRACEON) System.out.println("selection: 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}'"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(myparserParser.Case, 0); }
		public TerminalNode Constant() { return getToken(myparserParser.Constant, 0); }
		public TerminalNode Colon() { return getToken(myparserParser.Colon, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(Case);
			setState(494);
			match(Constant);
			setState(495);
			match(Colon);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6842810766458298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 125L) != 0)) {
				{
				{
				setState(496);
				statement();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("caseStatement: 'case' Constant ':' statement*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultStatementContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(myparserParser.Default, 0); }
		public TerminalNode Colon() { return getToken(myparserParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(Default);
			setState(505);
			match(Colon);
			setState(506);
			statement();
			 if (TRACEON) System.out.println("defaultStatement: 'default' ':' statement"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode While() { return getToken(myparserParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(myparserParser.Do, 0); }
		public TerminalNode Semi() { return getToken(myparserParser.Semi, 0); }
		public TerminalNode For() { return getToken(myparserParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_iteration);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(While);
				setState(510);
				match(LeftParen);
				setState(511);
				((IterationContext)_localctx).expression = expression();

				        if(((IterationContext)_localctx).expression.typ != Type.Boolean) {
				            System.err.println("Error! line number: " + (((IterationContext)_localctx).expression!=null?(((IterationContext)_localctx).expression.start):null).getLine() + "while needs boolean expression.");
				        }
				    
				setState(513);
				match(RightParen);
				setState(514);
				statement();
				 if (TRACEON) System.out.println("iteration: 'while' '(' expression ')' statement"); 
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(Do);
				setState(518);
				statement();
				setState(519);
				match(While);
				setState(520);
				match(LeftParen);
				setState(521);
				((IterationContext)_localctx).expression = expression();

				        if(((IterationContext)_localctx).expression.typ != Type.Boolean) {
				            System.err.println("Error! line number: " + (((IterationContext)_localctx).expression!=null?(((IterationContext)_localctx).expression.start):null).getLine() + "do while needs boolean expression.");
				        }
				    
				setState(523);
				match(RightParen);
				setState(524);
				match(Semi);
				 if (TRACEON) System.out.println("iteration: 'do' statement 'while' '(' expression ')' ';'"); 
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				match(For);
				setState(528);
				match(LeftParen);
				setState(529);
				forCondition();
				setState(530);
				match(RightParen);
				setState(531);
				statement();
				 if (TRACEON) System.out.println("iteration: 'for' '(' forCondition ')' statement"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<TerminalNode> Semi() { return getTokens(myparserParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(myparserParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Short:
			case Void:
				{
				setState(536);
				forDeclaration();
				}
				break;
			case LeftParen:
			case Semi:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Identifier:
			case IntegerConstant:
			case FloatingConstant:
			case DoubleConstant:
			case CharacterConstant:
			case StringLiteral:
				{
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 1099512443502593L) != 0)) {
					{
					setState(537);
					((ForConditionContext)_localctx).expression = expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(542);
			match(Semi);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 1099512443502593L) != 0)) {
				{
				setState(543);
				((ForConditionContext)_localctx).expression = expression();
				}
			}


			        if(((ForConditionContext)_localctx).expression.typ != Type.Boolean) {
			            System.err.println("Error! line number: " + (((ForConditionContext)_localctx).expression!=null?(((ForConditionContext)_localctx).expression.start):null).getLine() + "for needs boolean expression.");
			        }
			    
			setState(547);
			match(Semi);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 1099512443502593L) != 0)) {
				{
				setState(548);
				((ForConditionContext)_localctx).expression = expression();
				}
			}

			 if (TRACEON) System.out.println("forCondition: (forDeclaration | expression?) ';' expression* ';' expression*"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Star() { return getToken(myparserParser.Star, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			((ForDeclarationContext)_localctx).type = type();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(554);
				match(Star);
				}
			}

			setState(557);
			declarator(type.attr_t);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(558);
				initialization(((ForDeclarationContext)_localctx).type.attr_t);
				}
			}

			 if (TRACEON) System.out.println("forDeclaration: type '*'? declarator initialization?"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public Type typ;
		public CustomerFunctionContext customerFunction;
		public PrintfContext printf() {
			return getRuleContext(PrintfContext.class,0);
		}
		public ScanfContext scanf() {
			return getRuleContext(ScanfContext.class,0);
		}
		public MallocContext malloc() {
			return getRuleContext(MallocContext.class,0);
		}
		public FreeContext free() {
			return getRuleContext(FreeContext.class,0);
		}
		public CustomerFunctionContext customerFunction() {
			return getRuleContext(CustomerFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionCall);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Printf:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				printf();

				        ((FunctionCallContext)_localctx).typ =  Type.Int;
				        if (TRACEON) System.out.println("functionCall: printf");
				    
				}
				break;
			case Scanf:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				scanf();

				        ((FunctionCallContext)_localctx).typ =  Type.Int;
				        if (TRACEON) System.out.println("functionCall: scanf");
				    
				}
				break;
			case Malloc:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				malloc();

				        ((FunctionCallContext)_localctx).typ =  Type.VoidPtr;
				        if (TRACEON) System.out.println("functionCall: malloc");
				    
				}
				break;
			case Free:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				free();

				        ((FunctionCallContext)_localctx).typ =  Type.Void;
				        if (TRACEON) System.out.println("functionCall: free");
				    
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(575);
				((FunctionCallContext)_localctx).customerFunction = customerFunction();

				        ((FunctionCallContext)_localctx).typ =  ((FunctionCallContext)_localctx).customerFunction.typ;
				        if (TRACEON) System.out.println("functionCall: customerFunction");
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintfContext extends ParserRuleContext {
		public TerminalNode Printf() { return getToken(myparserParser.Printf, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(myparserParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public PrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf; }
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_printf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Printf);
			setState(581);
			match(LeftParen);
			setState(582);
			match(StringLiteral);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(583);
				parameter();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
			match(RightParen);
			 if (TRACEON) System.out.println("printf: 'printf' '(' StringLiteral parameter* ')'"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScanfContext extends ParserRuleContext {
		public TerminalNode Scanf() { return getToken(myparserParser.Scanf, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(myparserParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ScanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanf; }
	}

	public final ScanfContext scanf() throws RecognitionException {
		ScanfContext _localctx = new ScanfContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_scanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(Scanf);
			setState(593);
			match(LeftParen);
			setState(594);
			match(StringLiteral);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(595);
				parameter();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			match(RightParen);
			 if (TRACEON) System.out.println("scanf: 'scanf' '(' StringLiteral parameter* ')'"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MallocContext extends ParserRuleContext {
		public TerminalNode Malloc() { return getToken(myparserParser.Malloc, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public MallocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_malloc; }
	}

	public final MallocContext malloc() throws RecognitionException {
		MallocContext _localctx = new MallocContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_malloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(Malloc);
			setState(605);
			match(LeftParen);
			setState(606);
			expression();
			setState(607);
			match(RightParen);
			 if (TRACEON) System.out.println("malloc: 'malloc' '(' expression ')'"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FreeContext extends ParserRuleContext {
		public TerminalNode Free() { return getToken(myparserParser.Free, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public FreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_free; }
	}

	public final FreeContext free() throws RecognitionException {
		FreeContext _localctx = new FreeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_free);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(Free);
			setState(611);
			match(LeftParen);
			setState(612);
			expression();
			setState(613);
			match(RightParen);
			 if (TRACEON) System.out.println("free: 'free' '(' expression ')'"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CustomerFunctionContext extends ParserRuleContext {
		public Type typ;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(myparserParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(myparserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(myparserParser.RightParen, 0); }
		public GeneralParameterContext generalParameter() {
			return getRuleContext(GeneralParameterContext.class,0);
		}
		public CustomerFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customerFunction; }
	}

	public final CustomerFunctionContext customerFunction() throws RecognitionException {
		CustomerFunctionContext _localctx = new CustomerFunctionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_customerFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			((CustomerFunctionContext)_localctx).Identifier = match(Identifier);
			setState(617);
			match(LeftParen);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 1099512443502593L) != 0)) {
				{
				setState(618);
				generalParameter();
				}
			}

			setState(621);
			match(RightParen);

			        if(funs.containKey((((CustomerFunctionContext)_localctx).Identifier!=null?((CustomerFunctionContext)_localctx).Identifier.getText():null))) {
			            ((CustomerFunctionContext)_localctx).typ =  funs((((CustomerFunctionContext)_localctx).Identifier!=null?((CustomerFunctionContext)_localctx).Identifier.getText():null));
			        } else {
			            System.err.println("Error! line number: " + ((CustomerFunctionContext)_localctx).Identifier.getLine() + "function not declared!");
			        }
			        if (TRACEON) System.out.println("customerFunction: Identifier '(' generalParameter? ')'");
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(myparserParser.Comma, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(Comma);
			setState(625);
			expression();
			 if (TRACEON) System.out.println("parameter: ',' expression"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class GeneralParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public GeneralParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalParameter; }
	}

	public final GeneralParameterContext generalParameter() throws RecognitionException {
		GeneralParameterContext _localctx = new GeneralParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_generalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			expression();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(629);
				parameter();
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("generalParameter: expression parameter*"); 
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
		"\u0004\u0001M\u027e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001g\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002w\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0088\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0090"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0098\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a1\b\u0005"+
		"\n\u0005\f\u0005\u00a4\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00aa\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00b6\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00bc\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0005\b\u00c4\b\b\n\b\f\b\u00c7\t\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e0\b\t\u0003\t\u00e2\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ea\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f4\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0102\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u010e\b\f\u0001\f\u0001\f\u0001\r\u0003"+
		"\r\u0113\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u011b"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0122\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0131\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0138\b\u0010\n"+
		"\u0010\f\u0010\u013b\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0144\b\u0011\n"+
		"\u0011\f\u0011\u0147\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0150\b\u0012\n"+
		"\u0012\f\u0012\u0153\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u015c\b\u0013\n"+
		"\u0013\f\u0013\u015f\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0168\b\u0014\n"+
		"\u0014\f\u0014\u016b\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0174\b\u0015\n"+
		"\u0015\f\u0015\u0177\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0180\b\u0016\n"+
		"\u0016\f\u0016\u0183\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u018c\b\u0017\n"+
		"\u0017\f\u0017\u018f\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0198\b\u0018\n"+
		"\u0018\f\u0018\u019b\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01a4\b\u0019\n"+
		"\u0019\f\u0019\u01a7\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01b3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01c1\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01c8\b\u001c\n"+
		"\u001c\f\u001c\u01cb\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u01d7\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01e1"+
		"\b\u001d\n\u001d\f\u001d\u01e4\t\u001d\u0001\u001d\u0003\u001d\u01e7\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01ec\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01f2\b\u001e\n"+
		"\u001e\f\u001e\u01f5\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0217\b \u0001!\u0001!\u0003!\u021b\b!\u0003!\u021d\b"+
		"!\u0001!\u0001!\u0003!\u0221\b!\u0001!\u0001!\u0001!\u0003!\u0226\b!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0003\"\u022c\b\"\u0001\"\u0001\"\u0003\"\u0230"+
		"\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0243"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0005$\u0249\b$\n$\f$\u024c\t$\u0001$"+
		"\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0005%\u0255\b%\n%\f%\u0258"+
		"\t%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0003"+
		"(\u026c\b(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0005*\u0277\b*\n*\f*\u027a\t*\u0001*\u0001*\u0001*\u0000\u0000+\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRT\u0000\u0006\u0002\u0000((**\u0001\u0000"+
		"+-\u0002\u0000\'\'))\u0001\u0000%&\u0001\u0000!$\u0001\u0000@A\u02ab\u0000"+
		"[\u0001\u0000\u0000\u0000\u0002b\u0001\u0000\u0000\u0000\u0004o\u0001"+
		"\u0000\u0000\u0000\u0006\u0087\u0001\u0000\u0000\u0000\b\u009b\u0001\u0000"+
		"\u0000\u0000\n\u009d\u0001\u0000\u0000\u0000\f\u00b5\u0001\u0000\u0000"+
		"\u0000\u000e\u00b7\u0001\u0000\u0000\u0000\u0010\u00c1\u0001\u0000\u0000"+
		"\u0000\u0012\u00e9\u0001\u0000\u0000\u0000\u0014\u00f3\u0001\u0000\u0000"+
		"\u0000\u0016\u0101\u0001\u0000\u0000\u0000\u0018\u0103\u0001\u0000\u0000"+
		"\u0000\u001a\u011a\u0001\u0000\u0000\u0000\u001c\u0121\u0001\u0000\u0000"+
		"\u0000\u001e\u0130\u0001\u0000\u0000\u0000 \u0132\u0001\u0000\u0000\u0000"+
		"\"\u013e\u0001\u0000\u0000\u0000$\u014a\u0001\u0000\u0000\u0000&\u0156"+
		"\u0001\u0000\u0000\u0000(\u0162\u0001\u0000\u0000\u0000*\u016e\u0001\u0000"+
		"\u0000\u0000,\u017a\u0001\u0000\u0000\u0000.\u0186\u0001\u0000\u0000\u0000"+
		"0\u0192\u0001\u0000\u0000\u00002\u019e\u0001\u0000\u0000\u00004\u01b2"+
		"\u0001\u0000\u0000\u00006\u01c0\u0001\u0000\u0000\u00008\u01c2\u0001\u0000"+
		"\u0000\u0000:\u01eb\u0001\u0000\u0000\u0000<\u01ed\u0001\u0000\u0000\u0000"+
		">\u01f8\u0001\u0000\u0000\u0000@\u0216\u0001\u0000\u0000\u0000B\u021c"+
		"\u0001\u0000\u0000\u0000D\u0229\u0001\u0000\u0000\u0000F\u0242\u0001\u0000"+
		"\u0000\u0000H\u0244\u0001\u0000\u0000\u0000J\u0250\u0001\u0000\u0000\u0000"+
		"L\u025c\u0001\u0000\u0000\u0000N\u0262\u0001\u0000\u0000\u0000P\u0268"+
		"\u0001\u0000\u0000\u0000R\u0270\u0001\u0000\u0000\u0000T\u0274\u0001\u0000"+
		"\u0000\u0000VZ\u0003\u0002\u0001\u0000WZ\u0003\u000e\u0007\u0000XZ\u0005"+
		"\u001e\u0000\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0000\u0000\u0001_`\u0006\u0000\uffff\uffff\u0000"+
		"`\u0001\u0001\u0000\u0000\u0000ac\u0005\u0004\u0000\u0000ba\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0003"+
		"\u0006\u0003\u0000eg\u0005+\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0003\b\u0004\u0000ik\u0003"+
		"\u0004\u0002\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0005\u001e\u0000\u0000mn\u0006\u0001\uffff"+
		"\uffff\u0000n\u0003\u0001\u0000\u0000\u0000ov\u00055\u0000\u0000pq\u0003"+
		"4\u001a\u0000qr\u0006\u0002\uffff\uffff\u0000rw\u0001\u0000\u0000\u0000"+
		"st\u0003F#\u0000tu\u0006\u0002\uffff\uffff\u0000uw\u0001\u0000\u0000\u0000"+
		"vp\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0006\u0002\uffff\uffff\u0000y\u0005\u0001\u0000\u0000\u0000"+
		"z{\u0005\u0003\u0000\u0000{\u0088\u0006\u0003\uffff\uffff\u0000|}\u0005"+
		"\r\u0000\u0000}\u0088\u0006\u0003\uffff\uffff\u0000~\u007f\u0005\n\u0000"+
		"\u0000\u007f\u0088\u0006\u0003\uffff\uffff\u0000\u0080\u0081\u0005\b\u0000"+
		"\u0000\u0081\u0088\u0006\u0003\uffff\uffff\u0000\u0082\u0083\u0005\u0011"+
		"\u0000\u0000\u0083\u0088\u0006\u0003\uffff\uffff\u0000\u0084\u0085\u0005"+
		"\u000f\u0000\u0000\u0085\u0086\u0006\u0003\uffff\uffff\u0000\u0086\u0088"+
		"\u0006\u0003\uffff\uffff\u0000\u0087z\u0001\u0000\u0000\u0000\u0087|\u0001"+
		"\u0000\u0000\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000"+
		"\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000"+
		"\u0000\u0000\u0088\u0007\u0001\u0000\u0000\u0000\u0089\u008a\u0005B\u0000"+
		"\u0000\u008a\u009c\u0006\u0004\uffff\uffff\u0000\u008b\u008c\u0005B\u0000"+
		"\u0000\u008c\u008d\u0006\u0004\uffff\uffff\u0000\u008d\u008f\u0005\u0017"+
		"\u0000\u0000\u008e\u0090\u0003\n\u0005\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0018\u0000\u0000\u0092\u009c\u0006\u0004\uffff"+
		"\uffff\u0000\u0093\u0094\u0005B\u0000\u0000\u0094\u0095\u0006\u0004\uffff"+
		"\uffff\u0000\u0095\u0097\u0005\u0019\u0000\u0000\u0096\u0098\u0005D\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u001a\u0000"+
		"\u0000\u009a\u009c\u0006\u0004\uffff\uffff\u0000\u009b\u0089\u0001\u0000"+
		"\u0000\u0000\u009b\u008b\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000"+
		"\u0000\u0000\u009c\t\u0001\u0000\u0000\u0000\u009d\u00a2\u0003\f\u0006"+
		"\u0000\u009e\u009f\u0005\u001f\u0000\u0000\u009f\u00a1\u0003\f\u0006\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0006\u0005\uffff\uffff\u0000\u00a6\u000b\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a9\u0003\u0006\u0003\u0000\u00a8\u00aa\u0005+\u0000\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005B\u0000\u0000\u00ac"+
		"\u00ad\u0006\u0006\uffff\uffff\u0000\u00ad\u00b6\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0003\u0006\u0003\u0000\u00af\u00b0\u0005B\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0019\u0000\u0000\u00b1\u00b2\u0005D\u0000\u0000\u00b2\u00b3"+
		"\u0005\u001a\u0000\u0000\u00b3\u00b4\u0006\u0006\uffff\uffff\u0000\u00b4"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b5\u00a7\u0001\u0000\u0000\u0000\u00b5"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b6\r\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0003\u0006\u0003\u0000\u00b8\u00b9\u0005B\u0000\u0000\u00b9\u00bb\u0005"+
		"\u0017\u0000\u0000\u00ba\u00bc\u0003\n\u0005\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005\u0018\u0000\u0000\u00be\u00bf\u0003\u0010"+
		"\b\u0000\u00bf\u00c0\u0006\u0007\uffff\uffff\u0000\u00c0\u000f\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c5\u0005\u001b\u0000\u0000\u00c2\u00c4\u0003\u0012"+
		"\t\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005\u001c\u0000\u0000\u00c9\u00ca\u0006\b\uffff\uffff"+
		"\u0000\u00ca\u0011\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003\u0010\b\u0000"+
		"\u00cc\u00cd\u0006\t\uffff\uffff\u0000\u00cd\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0003\u0002\u0001\u0000\u00cf\u00d0\u0006\t\uffff\uffff\u0000"+
		"\u00d0\u00ea\u0001\u0000\u0000\u0000\u00d1\u00d2\u00038\u001c\u0000\u00d2"+
		"\u00d3\u0005\u001e\u0000\u0000\u00d3\u00d4\u0006\t\uffff\uffff\u0000\u00d4"+
		"\u00ea\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003:\u001d\u0000\u00d6\u00d7"+
		"\u0006\t\uffff\uffff\u0000\u00d7\u00ea\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0003@ \u0000\u00d9\u00da\u0006\t\uffff\uffff\u0000\u00da\u00ea\u0001"+
		"\u0000\u0000\u0000\u00db\u00e2\u0005\u0001\u0000\u0000\u00dc\u00e2\u0005"+
		"\u0005\u0000\u0000\u00dd\u00df\u0005\u000e\u0000\u0000\u00de\u00e0\u0003"+
		"8\u001c\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000"+
		"\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u001e"+
		"\u0000\u0000\u00e4\u00ea\u0006\t\uffff\uffff\u0000\u00e5\u00e6\u0003F"+
		"#\u0000\u00e6\u00e7\u0005\u001e\u0000\u0000\u00e7\u00e8\u0006\t\uffff"+
		"\uffff\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ce\u0001\u0000\u0000\u0000\u00e9\u00d1\u0001\u0000"+
		"\u0000\u0000\u00e9\u00d5\u0001\u0000\u0000\u0000\u00e9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e1\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000"+
		"\u0000\u0000\u00ea\u0013\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005D\u0000"+
		"\u0000\u00ec\u00f4\u0006\n\uffff\uffff\u0000\u00ed\u00ee\u0005E\u0000"+
		"\u0000\u00ee\u00f4\u0006\n\uffff\uffff\u0000\u00ef\u00f0\u0005F\u0000"+
		"\u0000\u00f0\u00f4\u0006\n\uffff\uffff\u0000\u00f1\u00f2\u0005G\u0000"+
		"\u0000\u00f2\u00f4\u0006\n\uffff\uffff\u0000\u00f3\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u0015\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0005B\u0000\u0000\u00f6\u0102\u0006\u000b\uffff\uffff"+
		"\u0000\u00f7\u00f8\u0003\u0014\n\u0000\u00f8\u00f9\u0006\u000b\uffff\uffff"+
		"\u0000\u00f9\u0102\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005H\u0000\u0000"+
		"\u00fb\u0102\u0006\u000b\uffff\uffff\u0000\u00fc\u00fd\u0005\u0017\u0000"+
		"\u0000\u00fd\u00fe\u00038\u001c\u0000\u00fe\u00ff\u0005\u0018\u0000\u0000"+
		"\u00ff\u0100\u0006\u000b\uffff\uffff\u0000\u0100\u0102\u0001\u0000\u0000"+
		"\u0000\u0101\u00f5\u0001\u0000\u0000\u0000\u0101\u00f7\u0001\u0000\u0000"+
		"\u0000\u0101\u00fa\u0001\u0000\u0000\u0000\u0101\u00fc\u0001\u0000\u0000"+
		"\u0000\u0102\u0017\u0001\u0000\u0000\u0000\u0103\u010d\u0003\u0016\u000b"+
		"\u0000\u0104\u0105\u0005(\u0000\u0000\u0105\u010e\u0006\f\uffff\uffff"+
		"\u0000\u0106\u0107\u0005*\u0000\u0000\u0107\u010e\u0006\f\uffff\uffff"+
		"\u0000\u0108\u0109\u0005\u0019\u0000\u0000\u0109\u010a\u00038\u001c\u0000"+
		"\u010a\u010b\u0005\u001a\u0000\u0000\u010b\u010c\u0006\f\uffff\uffff\u0000"+
		"\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0104\u0001\u0000\u0000\u0000"+
		"\u010d\u0106\u0001\u0000\u0000\u0000\u010d\u0108\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0006\f\uffff\uffff\u0000\u0110\u0019\u0001\u0000\u0000\u0000"+
		"\u0111\u0113\u0007\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0003\u0018\f\u0000\u0115\u0116\u0006\r\uffff\uffff\u0000"+
		"\u0116\u011b\u0001\u0000\u0000\u0000\u0117\u0118\u0003\u001e\u000f\u0000"+
		"\u0118\u0119\u0006\r\uffff\uffff\u0000\u0119\u011b\u0001\u0000\u0000\u0000"+
		"\u011a\u0112\u0001\u0000\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000"+
		"\u011b\u001b\u0001\u0000\u0000\u0000\u011c\u0122\u0005\'\u0000\u0000\u011d"+
		"\u0122\u0005)\u0000\u0000\u011e\u0122\u00054\u0000\u0000\u011f\u0120\u0005"+
		"3\u0000\u0000\u0120\u0122\u0006\u000e\uffff\uffff\u0000\u0121\u011c\u0001"+
		"\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121\u011e\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u001d\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005.\u0000\u0000\u0124\u0125\u0003\u0018"+
		"\f\u0000\u0125\u0126\u0006\u000f\uffff\uffff\u0000\u0126\u0131\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005+\u0000\u0000\u0128\u0129\u0003\u0018\f"+
		"\u0000\u0129\u012a\u0006\u000f\uffff\uffff\u0000\u012a\u0131\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0003\u001c\u000e\u0000\u012c\u012d\u0003\u0018"+
		"\f\u0000\u012d\u012e\u0006\u000f\uffff\uffff\u0000\u012e\u012f\u0006\u000f"+
		"\uffff\uffff\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u0123\u0001"+
		"\u0000\u0000\u0000\u0130\u0127\u0001\u0000\u0000\u0000\u0130\u012b\u0001"+
		"\u0000\u0000\u0000\u0131\u001f\u0001\u0000\u0000\u0000\u0132\u0139\u0003"+
		"\u001a\r\u0000\u0133\u0134\u0007\u0001\u0000\u0000\u0134\u0135\u0003\u001a"+
		"\r\u0000\u0135\u0136\u0006\u0010\uffff\uffff\u0000\u0136\u0138\u0001\u0000"+
		"\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0006\u0010\uffff\uffff\u0000\u013d!\u0001\u0000"+
		"\u0000\u0000\u013e\u0145\u0003 \u0010\u0000\u013f\u0140\u0007\u0002\u0000"+
		"\u0000\u0140\u0141\u0003 \u0010\u0000\u0141\u0142\u0006\u0011\uffff\uffff"+
		"\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u013f\u0001\u0000\u0000"+
		"\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0006\u0011\uffff"+
		"\uffff\u0000\u0149#\u0001\u0000\u0000\u0000\u014a\u0151\u0003\"\u0011"+
		"\u0000\u014b\u014c\u0007\u0003\u0000\u0000\u014c\u014d\u0003\"\u0011\u0000"+
		"\u014d\u014e\u0006\u0012\uffff\uffff\u0000\u014e\u0150\u0001\u0000\u0000"+
		"\u0000\u014f\u014b\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000"+
		"\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0006\u0012\uffff\uffff\u0000\u0155%\u0001\u0000\u0000"+
		"\u0000\u0156\u015d\u0003$\u0012\u0000\u0157\u0158\u0007\u0004\u0000\u0000"+
		"\u0158\u0159\u0003$\u0012\u0000\u0159\u015a\u0006\u0013\uffff\uffff\u0000"+
		"\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0157\u0001\u0000\u0000\u0000"+
		"\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0006\u0013\uffff\uffff"+
		"\u0000\u0161\'\u0001\u0000\u0000\u0000\u0162\u0169\u0003&\u0013\u0000"+
		"\u0163\u0164\u0007\u0005\u0000\u0000\u0164\u0165\u0003&\u0013\u0000\u0165"+
		"\u0166\u0006\u0014\uffff\uffff\u0000\u0166\u0168\u0001\u0000\u0000\u0000"+
		"\u0167\u0163\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0006\u0014\uffff\uffff\u0000\u016d)\u0001\u0000\u0000\u0000"+
		"\u016e\u0175\u0003(\u0014\u0000\u016f\u0170\u0005.\u0000\u0000\u0170\u0171"+
		"\u0003(\u0014\u0000\u0171\u0172\u0006\u0015\uffff\uffff\u0000\u0172\u0174"+
		"\u0001\u0000\u0000\u0000\u0173\u016f\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0006\u0015\uffff\uffff\u0000\u0179"+
		"+\u0001\u0000\u0000\u0000\u017a\u0181\u0003*\u0015\u0000\u017b\u017c\u0005"+
		"2\u0000\u0000\u017c\u017d\u0003*\u0015\u0000\u017d\u017e\u0006\u0016\uffff"+
		"\uffff\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u017b\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0185\u0006\u0016"+
		"\uffff\uffff\u0000\u0185-\u0001\u0000\u0000\u0000\u0186\u018d\u0003,\u0016"+
		"\u0000\u0187\u0188\u0005/\u0000\u0000\u0188\u0189\u0003,\u0016\u0000\u0189"+
		"\u018a\u0006\u0017\uffff\uffff\u0000\u018a\u018c\u0001\u0000\u0000\u0000"+
		"\u018b\u0187\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000"+
		"\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000"+
		"\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0006\u0017\uffff\uffff\u0000\u0191/\u0001\u0000\u0000\u0000"+
		"\u0192\u0199\u0003.\u0017\u0000\u0193\u0194\u00050\u0000\u0000\u0194\u0195"+
		"\u0003.\u0017\u0000\u0195\u0196\u0006\u0018\uffff\uffff\u0000\u0196\u0198"+
		"\u0001\u0000\u0000\u0000\u0197\u0193\u0001\u0000\u0000\u0000\u0198\u019b"+
		"\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0001\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0199"+
		"\u0001\u0000\u0000\u0000\u019c\u019d\u0006\u0018\uffff\uffff\u0000\u019d"+
		"1\u0001\u0000\u0000\u0000\u019e\u01a5\u00030\u0018\u0000\u019f\u01a0\u0005"+
		"1\u0000\u0000\u01a0\u01a1\u00030\u0018\u0000\u01a1\u01a2\u0006\u0019\uffff"+
		"\uffff\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u019f\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0006\u0019"+
		"\uffff\uffff\u0000\u01a93\u0001\u0000\u0000\u0000\u01aa\u01ab\u00032\u0019"+
		"\u0000\u01ab\u01ac\u0006\u001a\uffff\uffff\u0000\u01ac\u01b3\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0003\u001a\r\u0000\u01ae\u01af\u00036\u001b"+
		"\u0000\u01af\u01b0\u00032\u0019\u0000\u01b0\u01b1\u0006\u001a\uffff\uffff"+
		"\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01aa\u0001\u0000\u0000"+
		"\u0000\u01b2\u01ad\u0001\u0000\u0000\u0000\u01b35\u0001\u0000\u0000\u0000"+
		"\u01b4\u01c1\u00056\u0000\u0000\u01b5\u01c1\u00057\u0000\u0000\u01b6\u01c1"+
		"\u00058\u0000\u0000\u01b7\u01c1\u00059\u0000\u0000\u01b8\u01c1\u0005:"+
		"\u0000\u0000\u01b9\u01c1\u0005;\u0000\u0000\u01ba\u01c1\u0005<\u0000\u0000"+
		"\u01bb\u01c1\u0005=\u0000\u0000\u01bc\u01c1\u0005>\u0000\u0000\u01bd\u01c1"+
		"\u0005?\u0000\u0000\u01be\u01bf\u00055\u0000\u0000\u01bf\u01c1\u0006\u001b"+
		"\uffff\uffff\u0000\u01c0\u01b4\u0001\u0000\u0000\u0000\u01c0\u01b5\u0001"+
		"\u0000\u0000\u0000\u01c0\u01b6\u0001\u0000\u0000\u0000\u01c0\u01b7\u0001"+
		"\u0000\u0000\u0000\u01c0\u01b8\u0001\u0000\u0000\u0000\u01c0\u01b9\u0001"+
		"\u0000\u0000\u0000\u01c0\u01ba\u0001\u0000\u0000\u0000\u01c0\u01bb\u0001"+
		"\u0000\u0000\u0000\u01c0\u01bc\u0001\u0000\u0000\u0000\u01c0\u01bd\u0001"+
		"\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c17\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c9\u00034\u001a\u0000\u01c3\u01c4\u0005\u001f\u0000"+
		"\u0000\u01c4\u01c5\u00034\u001a\u0000\u01c5\u01c6\u0006\u001c\uffff\uffff"+
		"\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cd\u0006\u001c\uffff"+
		"\uffff\u0000\u01cd9\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\f\u0000"+
		"\u0000\u01cf\u01d0\u0005\u0017\u0000\u0000\u01d0\u01d1\u00038\u001c\u0000"+
		"\u01d1\u01d2\u0006\u001d\uffff\uffff\u0000\u01d2\u01d3\u0005\u0018\u0000"+
		"\u0000\u01d3\u01d6\u0003\u0012\t\u0000\u01d4\u01d5\u0005\t\u0000\u0000"+
		"\u01d5\u01d7\u0003\u0012\t\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0006\u001d\uffff\uffff\u0000\u01d9\u01ec\u0001\u0000\u0000\u0000"+
		"\u01da\u01db\u0005\u0010\u0000\u0000\u01db\u01dc\u0005\u0017\u0000\u0000"+
		"\u01dc\u01dd\u00038\u001c\u0000\u01dd\u01de\u0005\u0018\u0000\u0000\u01de"+
		"\u01e2\u0005\u001b\u0000\u0000\u01df\u01e1\u0003<\u001e\u0000\u01e0\u01df"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e7"+
		"\u0003>\u001f\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005"+
		"\u001c\u0000\u0000\u01e9\u01ea\u0006\u001d\uffff\uffff\u0000\u01ea\u01ec"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ce\u0001\u0000\u0000\u0000\u01eb\u01da"+
		"\u0001\u0000\u0000\u0000\u01ec;\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005"+
		"\u0002\u0000\u0000\u01ee\u01ef\u0005C\u0000\u0000\u01ef\u01f3\u0005 \u0000"+
		"\u0000\u01f0\u01f2\u0003\u0012\t\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f7\u0006\u001e\uffff\uffff"+
		"\u0000\u01f7=\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\u0006\u0000\u0000"+
		"\u01f9\u01fa\u0005 \u0000\u0000\u01fa\u01fb\u0003\u0012\t\u0000\u01fb"+
		"\u01fc\u0006\u001f\uffff\uffff\u0000\u01fc?\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0005\u0012\u0000\u0000\u01fe\u01ff\u0005\u0017\u0000\u0000\u01ff"+
		"\u0200\u00038\u001c\u0000\u0200\u0201\u0006 \uffff\uffff\u0000\u0201\u0202"+
		"\u0005\u0018\u0000\u0000\u0202\u0203\u0003\u0012\t\u0000\u0203\u0204\u0006"+
		" \uffff\uffff\u0000\u0204\u0217\u0001\u0000\u0000\u0000\u0205\u0206\u0005"+
		"\u0007\u0000\u0000\u0206\u0207\u0003\u0012\t\u0000\u0207\u0208\u0005\u0012"+
		"\u0000\u0000\u0208\u0209\u0005\u0017\u0000\u0000\u0209\u020a\u00038\u001c"+
		"\u0000\u020a\u020b\u0006 \uffff\uffff\u0000\u020b\u020c\u0005\u0018\u0000"+
		"\u0000\u020c\u020d\u0005\u001e\u0000\u0000\u020d\u020e\u0006 \uffff\uffff"+
		"\u0000\u020e\u0217\u0001\u0000\u0000\u0000\u020f\u0210\u0005\u000b\u0000"+
		"\u0000\u0210\u0211\u0005\u0017\u0000\u0000\u0211\u0212\u0003B!\u0000\u0212"+
		"\u0213\u0005\u0018\u0000\u0000\u0213\u0214\u0003\u0012\t\u0000\u0214\u0215"+
		"\u0006 \uffff\uffff\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u01fd"+
		"\u0001\u0000\u0000\u0000\u0216\u0205\u0001\u0000\u0000\u0000\u0216\u020f"+
		"\u0001\u0000\u0000\u0000\u0217A\u0001\u0000\u0000\u0000\u0218\u021d\u0003"+
		"D\"\u0000\u0219\u021b\u00038\u001c\u0000\u021a\u0219\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021d\u0001\u0000\u0000"+
		"\u0000\u021c\u0218\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0220\u0005\u001e\u0000"+
		"\u0000\u021f\u0221\u00038\u001c\u0000\u0220\u021f\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0006!\uffff\uffff\u0000\u0223\u0225\u0005\u001e\u0000\u0000"+
		"\u0224\u0226\u00038\u001c\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0006!\uffff\uffff\u0000\u0228C\u0001\u0000\u0000\u0000\u0229\u022b"+
		"\u0003\u0006\u0003\u0000\u022a\u022c\u0005+\u0000\u0000\u022b\u022a\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0001"+
		"\u0000\u0000\u0000\u022d\u022f\u0003\b\u0004\u0000\u022e\u0230\u0003\u0004"+
		"\u0002\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0006\"\uffff"+
		"\uffff\u0000\u0232E\u0001\u0000\u0000\u0000\u0233\u0234\u0003H$\u0000"+
		"\u0234\u0235\u0006#\uffff\uffff\u0000\u0235\u0243\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0003J%\u0000\u0237\u0238\u0006#\uffff\uffff\u0000\u0238"+
		"\u0243\u0001\u0000\u0000\u0000\u0239\u023a\u0003L&\u0000\u023a\u023b\u0006"+
		"#\uffff\uffff\u0000\u023b\u0243\u0001\u0000\u0000\u0000\u023c\u023d\u0003"+
		"N\'\u0000\u023d\u023e\u0006#\uffff\uffff\u0000\u023e\u0243\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0003P(\u0000\u0240\u0241\u0006#\uffff\uffff"+
		"\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u0233\u0001\u0000\u0000"+
		"\u0000\u0242\u0236\u0001\u0000\u0000\u0000\u0242\u0239\u0001\u0000\u0000"+
		"\u0000\u0242\u023c\u0001\u0000\u0000\u0000\u0242\u023f\u0001\u0000\u0000"+
		"\u0000\u0243G\u0001\u0000\u0000\u0000\u0244\u0245\u0005\u0013\u0000\u0000"+
		"\u0245\u0246\u0005\u0017\u0000\u0000\u0246\u024a\u0005H\u0000\u0000\u0247"+
		"\u0249\u0003R)\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024c\u0001"+
		"\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001"+
		"\u0000\u0000\u0000\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u024a\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0005\u0018\u0000\u0000\u024e\u024f\u0006"+
		"$\uffff\uffff\u0000\u024fI\u0001\u0000\u0000\u0000\u0250\u0251\u0005\u0014"+
		"\u0000\u0000\u0251\u0252\u0005\u0017\u0000\u0000\u0252\u0256\u0005H\u0000"+
		"\u0000\u0253\u0255\u0003R)\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255"+
		"\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0001\u0000\u0000\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258"+
		"\u0256\u0001\u0000\u0000\u0000\u0259\u025a\u0005\u0018\u0000\u0000\u025a"+
		"\u025b\u0006%\uffff\uffff\u0000\u025bK\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0005\u0015\u0000\u0000\u025d\u025e\u0005\u0017\u0000\u0000\u025e\u025f"+
		"\u00038\u001c\u0000\u025f\u0260\u0005\u0018\u0000\u0000\u0260\u0261\u0006"+
		"&\uffff\uffff\u0000\u0261M\u0001\u0000\u0000\u0000\u0262\u0263\u0005\u0016"+
		"\u0000\u0000\u0263\u0264\u0005\u0017\u0000\u0000\u0264\u0265\u00038\u001c"+
		"\u0000\u0265\u0266\u0005\u0018\u0000\u0000\u0266\u0267\u0006\'\uffff\uffff"+
		"\u0000\u0267O\u0001\u0000\u0000\u0000\u0268\u0269\u0005B\u0000\u0000\u0269"+
		"\u026b\u0005\u0017\u0000\u0000\u026a\u026c\u0003T*\u0000\u026b\u026a\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0005\u0018\u0000\u0000\u026e\u026f\u0006"+
		"(\uffff\uffff\u0000\u026fQ\u0001\u0000\u0000\u0000\u0270\u0271\u0005\u001f"+
		"\u0000\u0000\u0271\u0272\u00038\u001c\u0000\u0272\u0273\u0006)\uffff\uffff"+
		"\u0000\u0273S\u0001\u0000\u0000\u0000\u0274\u0278\u00038\u001c\u0000\u0275"+
		"\u0277\u0003R)\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0277\u027a\u0001"+
		"\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278\u0279\u0001"+
		"\u0000\u0000\u0000\u0279\u027b\u0001\u0000\u0000\u0000\u027a\u0278\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0006*\uffff\uffff\u0000\u027cU\u0001\u0000"+
		"\u0000\u00007Y[bfjv\u0087\u008f\u0097\u009b\u00a2\u00a9\u00b5\u00bb\u00c5"+
		"\u00df\u00e1\u00e9\u00f3\u0101\u010d\u0112\u011a\u0121\u0130\u0139\u0145"+
		"\u0151\u015d\u0169\u0175\u0181\u018d\u0199\u01a5\u01b2\u01c0\u01c9\u01d6"+
		"\u01e2\u01e6\u01eb\u01f3\u0216\u021a\u021c\u0220\u0225\u022b\u022f\u0242"+
		"\u024a\u0256\u026b\u0278";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}