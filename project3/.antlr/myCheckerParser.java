// Generated from /home/alpaca/compiler/project3/myChecker.g4 by ANTLR 4.13.1

    // import packages here.
    import java.util.HashMap;
    import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class myCheckerParser extends Parser {
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
		IntegerConstant=67, FloatingConstant=68, DoubleConstant=69, CharacterConstant=70, 
		StringLiteral=71, Directive=72, Whitespace=73, Newline=74, BlockComment=75, 
		LineComment=76;
	public static final int
		RULE_translationUnit = 0, RULE_declaration = 1, RULE_initialization = 2, 
		RULE_type = 3, RULE_pointerDeclarator = 4, RULE_declarator = 5, RULE_parameterList = 6, 
		RULE_parameterDeclaration = 7, RULE_functionDefinition = 8, RULE_block = 9, 
		RULE_statement = 10, RULE_constant = 11, RULE_simpleExpression = 12, RULE_postfixExpression = 13, 
		RULE_prefixExpression = 14, RULE_unaryOperator = 15, RULE_unaryExpression = 16, 
		RULE_mulicativeExpression = 17, RULE_additiveExpression = 18, RULE_shiftExpression = 19, 
		RULE_compareExpression = 20, RULE_equalityExpression = 21, RULE_andExpression = 22, 
		RULE_exclusiveOrExpression = 23, RULE_inclusiveOrExpression = 24, RULE_logicalAndExpression = 25, 
		RULE_logicalOrExpression = 26, RULE_assignmentExpression = 27, RULE_assignmentOperator = 28, 
		RULE_expression = 29, RULE_selection = 30, RULE_caseStatement = 31, RULE_defaultStatement = 32, 
		RULE_iteration = 33, RULE_forCondition = 34, RULE_forDeclaration = 35, 
		RULE_functionCall = 36, RULE_printf = 37, RULE_scanf = 38, RULE_malloc = 39, 
		RULE_free = 40, RULE_customerFunction = 41, RULE_parameter = 42, RULE_generalParameter = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "declaration", "initialization", "type", "pointerDeclarator", 
			"declarator", "parameterList", "parameterDeclaration", "functionDefinition", 
			"block", "statement", "constant", "simpleExpression", "postfixExpression", 
			"prefixExpression", "unaryOperator", "unaryExpression", "mulicativeExpression", 
			"additiveExpression", "shiftExpression", "compareExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
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
			"Equal", "NotEqual", "Identifier", "IntegerConstant", "FloatingConstant", 
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
	public String getGrammarFileName() { return "myChecker.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    static final boolean TRACEON = false;

	    SymbolTable symtab = new SymbolTable();
	    HashMap<String,Type> funs = new HashMap<String, Type>();

	    public static class SymbolTable {
	        Stack<HashMap<String,Type>> stack = new Stack<>();

	        public void enterScope() {
	            stack.push(new HashMap<>());
	        }

	        public void exitScope() {
	            stack.pop();
	        }

	        public boolean put(String name, Type symbol) {
	            HashMap<String, Type> current = stack.peek();
	            if (current.containsKey(name)) return false;
	            current.put(name, symbol);
	            return true;
	        }

	        public Type get(String name) {
	            for (int i = stack.size() - 1; i >= 0; i--) {
	                if (stack.get(i).containsKey(name)) return stack.get(i).get(name);
	            }
	            return null;
	        }

	        public boolean containsKey(String name) {
	            HashMap<String, Type> current = stack.peek();
	            return current.containsKey(name);
	        }
	    }


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

	public myCheckerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(myCheckerParser.EOF, 0); }
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
		public List<TerminalNode> Semi() { return getTokens(myCheckerParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(myCheckerParser.Semi, i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);

		        symtab.enterScope();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073915160L) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(88);
					declaration();
					}
					break;
				case 2:
					{
					setState(89);
					functionDefinition();
					}
					break;
				case 3:
					{
					setState(90);
					match(Semi);
					}
					break;
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
		public Token ptr;
		public PointerDeclaratorContext pd;
		public DeclaratorContext d;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Semi() { return getToken(myCheckerParser.Semi, 0); }
		public TerminalNode Star() { return getToken(myCheckerParser.Star, 0); }
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public TerminalNode Const() { return getToken(myCheckerParser.Const, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(99);
					match(Const);
					}
				}

				setState(102);
				((DeclarationContext)_localctx).type = type();
				setState(103);
				((DeclarationContext)_localctx).ptr = match(Star);
				setState(104);
				((DeclarationContext)_localctx).pd = pointerDeclarator(((DeclarationContext)_localctx).type.attr_t);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(105);
					initialization(((DeclarationContext)_localctx).pd.id);
					}
				}

				setState(108);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(110);
					match(Const);
					}
				}

				setState(113);
				((DeclarationContext)_localctx).type = type();
				setState(114);
				((DeclarationContext)_localctx).d = declarator(((DeclarationContext)_localctx).type.attr_t);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(115);
					initialization(((DeclarationContext)_localctx).d.id);
					}
				}

				setState(118);
				match(Semi);
				 
				        if (TRACEON) System.out.println("declaration: 'const'? type '*'? declarator initialization? ';'"); 
				    
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
	public static class InitializationContext extends ParserRuleContext {
		public String id;
		public AssignmentExpressionContext assignmentExpression;
		public FunctionCallContext functionCall;
		public TerminalNode Assign() { return getToken(myCheckerParser.Assign, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitializationContext(ParserRuleContext parent, int invokingState, String id) {
			super(parent, invokingState);
			this.id = id;
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
	}

	public final InitializationContext initialization(String id) throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState(), id);
		enterRule(_localctx, 4, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Assign);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(124);
				((InitializationContext)_localctx).assignmentExpression = assignmentExpression();

				        if(((InitializationContext)_localctx).assignmentExpression.typ != symtab.get(_localctx.id)) {
				            // System.err.println(((InitializationContext)_localctx).assignmentExpression.typ);
				            // System.err.println(symtab.get(_localctx.id));
				            System.err.println("Error! line number: " + (((InitializationContext)_localctx).assignmentExpression!=null?(((InitializationContext)_localctx).assignmentExpression.start):null).getLine() + " imcompatible types.");
				        }
				    
				}
				break;
			case 2:
				{
				setState(127);
				((InitializationContext)_localctx).functionCall = functionCall();

				        if(((InitializationContext)_localctx).functionCall.typ != symtab.get(_localctx.id)) {
				            System.err.println("Error! line number: " + (((InitializationContext)_localctx).functionCall!=null?(((InitializationContext)_localctx).functionCall.start):null).getLine() + " imcompatible types.");
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
		public TerminalNode Char() { return getToken(myCheckerParser.Char, 0); }
		public TerminalNode Int() { return getToken(myCheckerParser.Int, 0); }
		public TerminalNode Float() { return getToken(myCheckerParser.Float, 0); }
		public TerminalNode Double() { return getToken(myCheckerParser.Double, 0); }
		public TerminalNode Void() { return getToken(myCheckerParser.Void, 0); }
		public TerminalNode Short() { return getToken(myCheckerParser.Short, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(Char);
				 ((TypeContext)_localctx).attr_t =  Type.Char; 
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(Int);
				 ((TypeContext)_localctx).attr_t =  Type.Int; 
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(Float);
				 ((TypeContext)_localctx).attr_t =  Type.Float; 
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(Double);
				 ((TypeContext)_localctx).attr_t =  Type.Double; 
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(Void);
				 ((TypeContext)_localctx).attr_t =  Type.Void; 
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
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
	public static class PointerDeclaratorContext extends ParserRuleContext {
		public Type typ;
		public String id;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public PointerDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PointerDeclaratorContext(ParserRuleContext parent, int invokingState, Type typ) {
			super(parent, invokingState);
			this.typ = typ;
		}
		@Override public int getRuleIndex() { return RULE_pointerDeclarator; }
	}

	public final PointerDeclaratorContext pointerDeclarator(Type typ) throws RecognitionException {
		PointerDeclaratorContext _localctx = new PointerDeclaratorContext(_ctx, getState(), typ);
		enterRule(_localctx, 8, RULE_pointerDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((PointerDeclaratorContext)_localctx).Identifier = match(Identifier);

			        if(symtab.containsKey((((PointerDeclaratorContext)_localctx).Identifier!=null?((PointerDeclaratorContext)_localctx).Identifier.getText():null))) {
			            System.err.println("Error: " + ((PointerDeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
			        } else {
			            symtab.put((((PointerDeclaratorContext)_localctx).Identifier!=null?((PointerDeclaratorContext)_localctx).Identifier.getText():null), toPtr(_localctx.typ));
			            ((PointerDeclaratorContext)_localctx).id =  (((PointerDeclaratorContext)_localctx).Identifier!=null?((PointerDeclaratorContext)_localctx).Identifier.getText():null);
			        }
			        if (TRACEON) System.out.println("declarator: Identifier");
			    
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
		public String id;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(myCheckerParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(myCheckerParser.RightBracket, 0); }
		public TerminalNode IntegerConstant() { return getToken(myCheckerParser.IntegerConstant, 0); }
		public DeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclaratorContext(ParserRuleContext parent, int invokingState, Type typ) {
			super(parent, invokingState);
			this.typ = typ;
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator(Type typ) throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState(), typ);
		enterRule(_localctx, 10, RULE_declarator);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				((DeclaratorContext)_localctx).Identifier = match(Identifier);

				        if(symtab.containsKey((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null))) {
				            System.err.println("Error: " + ((DeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				        } else {
				            symtab.put((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null), _localctx.typ);
				            ((DeclaratorContext)_localctx).id =  (((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null);
				        }
				        if (TRACEON) System.out.println("declarator: Identifier");
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				((DeclaratorContext)_localctx).Identifier = match(Identifier);

				        if(symtab.containsKey((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null))) {
				            System.err.println("Error: " + ((DeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				        } else if(funs.containsKey(((DeclaratorContext)_localctx).Identifier)) {
				            System.err.println("Error: " + ((DeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared function.");
				        } else {
				            symtab.put((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null), Type.Function);
				            funs.put((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null), _localctx.typ);
				            ((DeclaratorContext)_localctx).id =  (((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null);
				        }
				    
				setState(156);
				match(LeftParen);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 173320L) != 0)) {
					{
					setState(157);
					parameterList();
					}
				}

				setState(160);
				match(RightParen);
				 
				        if (TRACEON) System.out.println("declarator: Identifier '(' parameterList? ')'"); 
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				((DeclaratorContext)_localctx).Identifier = match(Identifier);

				        if(symtab.containsKey((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null))) {
				            System.err.println("Error: " + ((DeclaratorContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				        } else {
				            symtab.put((((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null), toPtr(_localctx.typ));
				            ((DeclaratorContext)_localctx).id =  (((DeclaratorContext)_localctx).Identifier!=null?((DeclaratorContext)_localctx).Identifier.getText():null);
				        }
				    
				setState(164);
				match(LeftBracket);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntegerConstant) {
					{
					setState(165);
					match(IntegerConstant);
					}
				}

				setState(168);
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
		public List<TerminalNode> Comma() { return getTokens(myCheckerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(myCheckerParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			parameterDeclaration();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(173);
				match(Comma);
				setState(174);
				parameterDeclaration();
				}
				}
				setState(179);
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
		public TypeContext type;
		public Token Identifier;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public TerminalNode Star() { return getToken(myCheckerParser.Star, 0); }
		public TerminalNode LeftBracket() { return getToken(myCheckerParser.LeftBracket, 0); }
		public TerminalNode IntegerConstant() { return getToken(myCheckerParser.IntegerConstant, 0); }
		public TerminalNode RightBracket() { return getToken(myCheckerParser.RightBracket, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterDeclaration);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((ParameterDeclarationContext)_localctx).type = type();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(183);
					match(Star);
					}
				}

				setState(186);
				((ParameterDeclarationContext)_localctx).Identifier = match(Identifier);

				        if(symtab.containsKey((((ParameterDeclarationContext)_localctx).Identifier!=null?((ParameterDeclarationContext)_localctx).Identifier.getText():null))) {
				            System.err.println("Error: " + ((ParameterDeclarationContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				        } else {
				            symtab.put((((ParameterDeclarationContext)_localctx).Identifier!=null?((ParameterDeclarationContext)_localctx).Identifier.getText():null), ((ParameterDeclarationContext)_localctx).type.attr_t);
				        }
				        if (TRACEON) System.out.println("parameterDeclaration: type '*'? Identifier");
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((ParameterDeclarationContext)_localctx).type = type();
				setState(190);
				((ParameterDeclarationContext)_localctx).Identifier = match(Identifier);
				setState(191);
				match(LeftBracket);
				setState(192);
				match(IntegerConstant);
				setState(193);
				match(RightBracket);

				        if(symtab.containsKey((((ParameterDeclarationContext)_localctx).Identifier!=null?((ParameterDeclarationContext)_localctx).Identifier.getText():null))) {
				            System.err.println("Error: " + ((ParameterDeclarationContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				        } else {
				            symtab.put((((ParameterDeclarationContext)_localctx).Identifier!=null?((ParameterDeclarationContext)_localctx).Identifier.getText():null), toPtr(((ParameterDeclarationContext)_localctx).type.attr_t));
				        }
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
		public TypeContext type;
		public Token Identifier;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
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
		enterRule(_localctx, 16, RULE_functionDefinition);

		        symtab.enterScope();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((FunctionDefinitionContext)_localctx).type = type();
			setState(199);
			((FunctionDefinitionContext)_localctx).Identifier = match(Identifier);

			        if(symtab.containsKey((((FunctionDefinitionContext)_localctx).Identifier!=null?((FunctionDefinitionContext)_localctx).Identifier.getText():null))) {
			            if(symtab.get((((FunctionDefinitionContext)_localctx).Identifier!=null?((FunctionDefinitionContext)_localctx).Identifier.getText():null)) != Type.Function) {
			                System.err.println("Error: " + ((FunctionDefinitionContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
			            }
			        } else {
			            symtab.put((((FunctionDefinitionContext)_localctx).Identifier!=null?((FunctionDefinitionContext)_localctx).Identifier.getText():null), Type.Function);
			            funs.put((((FunctionDefinitionContext)_localctx).Identifier!=null?((FunctionDefinitionContext)_localctx).Identifier.getText():null), ((FunctionDefinitionContext)_localctx).type.attr_t);
			        }
			    
			setState(201);
			match(LeftParen);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 173320L) != 0)) {
				{
				setState(202);
				parameterList();
				}
			}

			setState(205);
			match(RightParen);
			setState(206);
			block(false);

			        symtab.exitScope();
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
		public boolean newSymtab;
		public TerminalNode LeftBrace() { return getToken(myCheckerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(myCheckerParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockContext(ParserRuleContext parent, int invokingState, boolean newSymtab) {
			super(parent, invokingState);
			this.newSymtab = newSymtab;
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block(boolean newSymtab) throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState(), newSymtab);
		enterRule(_localctx, 18, RULE_block);

		        if(_localctx.newSymtab) {
		            symtab.enterScope();
		        }
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LeftBrace);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6842810766458298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 63L) != 0)) {
				{
				{
				setState(210);
				statement(true);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RightBrace);

			        if(_localctx.newSymtab) {
			            symtab.exitScope();
			        }
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
		public boolean newSymtab;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(myCheckerParser.Semi, 0); }
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public TerminalNode Break() { return getToken(myCheckerParser.Break, 0); }
		public TerminalNode Continue() { return getToken(myCheckerParser.Continue, 0); }
		public TerminalNode Return() { return getToken(myCheckerParser.Return, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, boolean newSymtab) {
			super(parent, invokingState);
			this.newSymtab = newSymtab;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement(boolean newSymtab) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), newSymtab);
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				block(newSymtab);
				 if (TRACEON) System.out.println("statement: block"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				declaration();
				 if (TRACEON) System.out.println("statement: declaration"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				expression();
				setState(226);
				match(Semi);
				 if (TRACEON) System.out.println("statement: expression ';'"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				selection();
				 if (TRACEON) System.out.println("statement: selection"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				iteration();
				 if (TRACEON) System.out.println("statement: iteration"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(235);
					match(Break);
					}
					break;
				case Continue:
					{
					setState(236);
					match(Continue);
					}
					break;
				case Return:
					{
					setState(237);
					match(Return);
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 554154676125697L) != 0)) {
						{
						setState(238);
						expression();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(243);
				match(Semi);
				 if (TRACEON) System.out.println("statement: ('break' | 'continue' | 'return' expression?) ';'"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				functionCall();
				setState(246);
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
		public TerminalNode IntegerConstant() { return getToken(myCheckerParser.IntegerConstant, 0); }
		public TerminalNode FloatingConstant() { return getToken(myCheckerParser.FloatingConstant, 0); }
		public TerminalNode DoubleConstant() { return getToken(myCheckerParser.DoubleConstant, 0); }
		public TerminalNode CharacterConstant() { return getToken(myCheckerParser.CharacterConstant, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerConstant:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(IntegerConstant);

				        ((ConstantContext)_localctx).typ =  Type.Int;
				        if (TRACEON) System.out.println("constant: IntegerConstant"); 
				    
				}
				break;
			case FloatingConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(FloatingConstant);

				        ((ConstantContext)_localctx).typ =  Type.Float;
				        if (TRACEON) System.out.println("constant: FloatingConstant"); 
				    
				}
				break;
			case DoubleConstant:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(DoubleConstant);

				        ((ConstantContext)_localctx).typ =  Type.Double;
				        if (TRACEON) System.out.println("constant: DoubleConstant"); 
				    
				}
				break;
			case CharacterConstant:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
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
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(myCheckerParser.StringLiteral, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleExpression);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((SimpleExpressionContext)_localctx).Identifier = match(Identifier);

				        if(symtab.get((((SimpleExpressionContext)_localctx).Identifier!=null?((SimpleExpressionContext)_localctx).Identifier.getText():null)) != null) {
				            ((SimpleExpressionContext)_localctx).typ =  symtab.get((((SimpleExpressionContext)_localctx).Identifier!=null?((SimpleExpressionContext)_localctx).Identifier.getText():null));
				        } else {
				            System.err.println("Error! line number: " + ((SimpleExpressionContext)_localctx).Identifier.getLine() + " variable not declared!");
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
				setState(263);
				((SimpleExpressionContext)_localctx).constant = constant();

				        ((SimpleExpressionContext)_localctx).typ =  ((SimpleExpressionContext)_localctx).constant.typ;
				        if (TRACEON) System.out.println("simpleExpression: constant"); 
				    
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(StringLiteral);

				        ((SimpleExpressionContext)_localctx).typ =  Type.CharPtr;
				        if (TRACEON) System.out.println("simpleExpression: StringLiteral"); 
				    
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(LeftParen);
				setState(269);
				((SimpleExpressionContext)_localctx).expression = expression();
				setState(270);
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
		public TerminalNode PlusPlus() { return getToken(myCheckerParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(myCheckerParser.MinusMinus, 0); }
		public TerminalNode LeftBracket() { return getToken(myCheckerParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(myCheckerParser.RightBracket, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((PostfixExpressionContext)_localctx).simpleExpression = simpleExpression();
			((PostfixExpressionContext)_localctx).typ =  ((PostfixExpressionContext)_localctx).simpleExpression.typ;
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlusPlus:
				{
				setState(277);
				match(PlusPlus);
				 ((PostfixExpressionContext)_localctx).typ =  ((PostfixExpressionContext)_localctx).simpleExpression.typ; 
				}
				break;
			case MinusMinus:
				{
				setState(279);
				match(MinusMinus);
				 ((PostfixExpressionContext)_localctx).typ =  ((PostfixExpressionContext)_localctx).simpleExpression.typ; 
				}
				break;
			case LeftBracket:
				{
				setState(281);
				match(LeftBracket);
				setState(282);
				expression();
				setState(283);
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
		public TerminalNode PlusPlus() { return getToken(myCheckerParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(myCheckerParser.MinusMinus, 0); }
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
		enterRule(_localctx, 28, RULE_prefixExpression);
		int _la;
		try {
			setState(299);
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
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PlusPlus || _la==MinusMinus) {
					{
					setState(290);
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

				setState(293);
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
				setState(296);
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
		public TerminalNode Plus() { return getToken(myCheckerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(myCheckerParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(myCheckerParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(myCheckerParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryOperator);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(Plus);
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(Minus);
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(Tilde);
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
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
		public TerminalNode And() { return getToken(myCheckerParser.And, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(myCheckerParser.Star, 0); }
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
		enterRule(_localctx, 32, RULE_unaryExpression);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(And);
				setState(309);
				((UnaryExpressionContext)_localctx).postfixExpression = postfixExpression();
				 ((UnaryExpressionContext)_localctx).typ =  toPtr(((UnaryExpressionContext)_localctx).postfixExpression.typ); 
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(Star);
				setState(313);
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
				setState(316);
				unaryOperator();
				setState(317);
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
		public List<TerminalNode> Star() { return getTokens(myCheckerParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(myCheckerParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(myCheckerParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(myCheckerParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(myCheckerParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(myCheckerParser.Mod, i);
		}
		public MulicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulicativeExpression; }
	}

	public final MulicativeExpressionContext mulicativeExpression() throws RecognitionException {
		MulicativeExpressionContext _localctx = new MulicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mulicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((MulicativeExpressionContext)_localctx).p1 = prefixExpression();
			 ((MulicativeExpressionContext)_localctx).typ =  ((MulicativeExpressionContext)_localctx).p1.typ; 
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) {
				{
				{
				setState(325);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(326);
				((MulicativeExpressionContext)_localctx).p2 = prefixExpression();

				        if(((MulicativeExpressionContext)_localctx).p1.typ != ((MulicativeExpressionContext)_localctx).p2.typ) {
				            System.err.println("Error! line number: " + (((MulicativeExpressionContext)_localctx).p2!=null?(((MulicativeExpressionContext)_localctx).p2.start):null).getLine() + " imcompatible types.");
				        }
				        ((MulicativeExpressionContext)_localctx).typ =  ((MulicativeExpressionContext)_localctx).p1.typ;
				    
				}
				}
				setState(333);
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
		public List<TerminalNode> Plus() { return getTokens(myCheckerParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(myCheckerParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(myCheckerParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(myCheckerParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			((AdditiveExpressionContext)_localctx).m1 = mulicativeExpression();
			((AdditiveExpressionContext)_localctx).typ =  ((AdditiveExpressionContext)_localctx).m1.typ;
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				((AdditiveExpressionContext)_localctx).m2 = mulicativeExpression();

				        if(((AdditiveExpressionContext)_localctx).m1.typ != ((AdditiveExpressionContext)_localctx).m2.typ) {
				            System.err.println("Error! line number: " + (((AdditiveExpressionContext)_localctx).m2!=null?(((AdditiveExpressionContext)_localctx).m2.start):null).getLine() + " imcompatible types.");
				        }
				        ((AdditiveExpressionContext)_localctx).typ =  ((AdditiveExpressionContext)_localctx).m1.typ;
				    
				}
				}
				setState(346);
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
		public List<TerminalNode> LeftShift() { return getTokens(myCheckerParser.LeftShift); }
		public TerminalNode LeftShift(int i) {
			return getToken(myCheckerParser.LeftShift, i);
		}
		public List<TerminalNode> RightShift() { return getTokens(myCheckerParser.RightShift); }
		public TerminalNode RightShift(int i) {
			return getToken(myCheckerParser.RightShift, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((ShiftExpressionContext)_localctx).a1 = additiveExpression();
			((ShiftExpressionContext)_localctx).typ =  ((ShiftExpressionContext)_localctx).a1.typ;
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(352);
				((ShiftExpressionContext)_localctx).a2 = additiveExpression();

				        if(((ShiftExpressionContext)_localctx).a1.typ != ((ShiftExpressionContext)_localctx).a2.typ) {
				            System.err.println("Error! line number: " + (((ShiftExpressionContext)_localctx).a2!=null?(((ShiftExpressionContext)_localctx).a2.start):null).getLine() + " imcompatible types.");
				        } 
				        ((ShiftExpressionContext)_localctx).typ =  ((ShiftExpressionContext)_localctx).a1.typ;
				    
				}
				}
				setState(359);
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
		public List<TerminalNode> Less() { return getTokens(myCheckerParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(myCheckerParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(myCheckerParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(myCheckerParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(myCheckerParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(myCheckerParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(myCheckerParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(myCheckerParser.GreaterEqual, i);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compareExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((CompareExpressionContext)_localctx).s1 = shiftExpression();
			((CompareExpressionContext)_localctx).typ =  ((CompareExpressionContext)_localctx).s1.typ;
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) {
				{
				{
				setState(364);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(365);
				((CompareExpressionContext)_localctx).s2 = shiftExpression();

				        if(((CompareExpressionContext)_localctx).s1.typ != ((CompareExpressionContext)_localctx).s2.typ) {
				            System.err.println("Error! line number: " + (((CompareExpressionContext)_localctx).s2!=null?(((CompareExpressionContext)_localctx).s2.start):null).getLine() + " imcompatible types.");
				        } 
				        ((CompareExpressionContext)_localctx).typ =  Type.Boolean;
				    
				}
				}
				setState(372);
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
		public List<TerminalNode> Equal() { return getTokens(myCheckerParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(myCheckerParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(myCheckerParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(myCheckerParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((EqualityExpressionContext)_localctx).c1 = compareExpression();
			((EqualityExpressionContext)_localctx).typ =  ((EqualityExpressionContext)_localctx).c1.typ;
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(377);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(378);
				((EqualityExpressionContext)_localctx).c2 = compareExpression();

				        if(((EqualityExpressionContext)_localctx).c1.typ != ((EqualityExpressionContext)_localctx).c2.typ) {
				            System.err.println("Error! line number: " + (((EqualityExpressionContext)_localctx).c2!=null?(((EqualityExpressionContext)_localctx).c2.start):null).getLine() + " imcompatible types.");
				        } 
				        ((EqualityExpressionContext)_localctx).typ =  Type.Boolean;
				    
				}
				}
				setState(385);
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
		public List<TerminalNode> And() { return getTokens(myCheckerParser.And); }
		public TerminalNode And(int i) {
			return getToken(myCheckerParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).typ =  ((AndExpressionContext)_localctx).e1.typ;
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(390);
				match(And);
				setState(391);
				((AndExpressionContext)_localctx).e2 = equalityExpression();

				        if(((AndExpressionContext)_localctx).e1.typ != ((AndExpressionContext)_localctx).e2.typ) {
				            System.err.println("Error! line number: " + (((AndExpressionContext)_localctx).e2!=null?(((AndExpressionContext)_localctx).e2.start):null).getLine() + " imcompatible types.");
				        } 
				        ((AndExpressionContext)_localctx).typ =  ((AndExpressionContext)_localctx).e1.typ;
				    
				}
				}
				setState(398);
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
		public List<TerminalNode> Caret() { return getTokens(myCheckerParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(myCheckerParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((ExclusiveOrExpressionContext)_localctx).a1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).typ =  ((ExclusiveOrExpressionContext)_localctx).a1.typ;
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(403);
				match(Caret);
				setState(404);
				((ExclusiveOrExpressionContext)_localctx).a2 = andExpression();

				        if(((ExclusiveOrExpressionContext)_localctx).a1.typ != ((ExclusiveOrExpressionContext)_localctx).a2.typ) {
				            System.err.println("Error! line number: " + (((ExclusiveOrExpressionContext)_localctx).a2!=null?(((ExclusiveOrExpressionContext)_localctx).a2.start):null).getLine() + " imcompatible types.");
				        } 
				        ((ExclusiveOrExpressionContext)_localctx).typ =  ((ExclusiveOrExpressionContext)_localctx).a1.typ;
				    
				}
				}
				setState(411);
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
		public List<TerminalNode> Or() { return getTokens(myCheckerParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(myCheckerParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).typ =  ((InclusiveOrExpressionContext)_localctx).e1.typ;
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(416);
				match(Or);
				setState(417);
				((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();

				        if(((InclusiveOrExpressionContext)_localctx).e1.typ != ((InclusiveOrExpressionContext)_localctx).e2.typ) {
				            System.err.println("Error! line number: " + (((InclusiveOrExpressionContext)_localctx).e2!=null?(((InclusiveOrExpressionContext)_localctx).e2.start):null).getLine() + " imcompatible types.");
				        } 
				        ((InclusiveOrExpressionContext)_localctx).typ =  ((InclusiveOrExpressionContext)_localctx).e1.typ;
				    
				}
				}
				setState(424);
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
		public List<TerminalNode> AndAnd() { return getTokens(myCheckerParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(myCheckerParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			((LogicalAndExpressionContext)_localctx).i1 = inclusiveOrExpression();
			((LogicalAndExpressionContext)_localctx).typ =  ((LogicalAndExpressionContext)_localctx).i1.typ;
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(429);
				match(AndAnd);
				setState(430);
				((LogicalAndExpressionContext)_localctx).i2 = inclusiveOrExpression();

				        if(((LogicalAndExpressionContext)_localctx).i1.typ != ((LogicalAndExpressionContext)_localctx).i2.typ) {
				            System.err.println("Error! line number: " + (((LogicalAndExpressionContext)_localctx).i2!=null?(((LogicalAndExpressionContext)_localctx).i2.start):null).getLine() + " imcompatible types.");
				        } 
				        ((LogicalAndExpressionContext)_localctx).typ =  Type.Boolean;
				    
				}
				}
				setState(437);
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
		public List<TerminalNode> OrOr() { return getTokens(myCheckerParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(myCheckerParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			((LogicalOrExpressionContext)_localctx).l1 = logicalAndExpression();
			((LogicalOrExpressionContext)_localctx).typ =  ((LogicalOrExpressionContext)_localctx).l1.typ;
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(442);
				match(OrOr);
				setState(443);
				((LogicalOrExpressionContext)_localctx).l2 = logicalAndExpression();

				        if(((LogicalOrExpressionContext)_localctx).l1.typ != ((LogicalOrExpressionContext)_localctx).l2.typ) {
				            System.err.println("Error! line number: " + (((LogicalOrExpressionContext)_localctx).l2!=null?(((LogicalOrExpressionContext)_localctx).l2.start):null).getLine() + " imcompatible types.");
				        } 
				        ((LogicalOrExpressionContext)_localctx).typ =  Type.Boolean;
				    
				}
				}
				setState(450);
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
		enterRule(_localctx, 54, RULE_assignmentExpression);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				((AssignmentExpressionContext)_localctx).logicalOrExpression = logicalOrExpression();

				        ((AssignmentExpressionContext)_localctx).typ =  ((AssignmentExpressionContext)_localctx).logicalOrExpression.typ;
				        if (TRACEON) System.out.println("assignmentExpression: logicalOrExpression");
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				((AssignmentExpressionContext)_localctx).p = prefixExpression();
				setState(457);
				assignmentOperator();
				setState(458);
				((AssignmentExpressionContext)_localctx).l = logicalOrExpression();

				        if(((AssignmentExpressionContext)_localctx).p.typ != ((AssignmentExpressionContext)_localctx).l.typ) {
				            System.err.println("Error! line number: " + (((AssignmentExpressionContext)_localctx).l!=null?(((AssignmentExpressionContext)_localctx).l.start):null).getLine() + " imcompatible types.");
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
		public TerminalNode StarAssign() { return getToken(myCheckerParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(myCheckerParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(myCheckerParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(myCheckerParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(myCheckerParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(myCheckerParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(myCheckerParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(myCheckerParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(myCheckerParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(myCheckerParser.OrAssign, 0); }
		public TerminalNode Assign() { return getToken(myCheckerParser.Assign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignmentOperator);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StarAssign:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				match(MinusAssign);
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(LeftShiftAssign);
				}
				break;
			case RightShiftAssign:
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				match(RightShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(470);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(471);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(472);
				match(OrAssign);
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 11);
				{
				setState(473);
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
		public List<TerminalNode> Comma() { return getTokens(myCheckerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(myCheckerParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			((ExpressionContext)_localctx).a1 = assignmentExpression();
			((ExpressionContext)_localctx).typ =  ((ExpressionContext)_localctx).a1.typ;
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					match(Comma);
					setState(480);
					((ExpressionContext)_localctx).a2 = assignmentExpression();

					        // return a2's value
					        ((ExpressionContext)_localctx).typ =  ((ExpressionContext)_localctx).a2.typ;
					    
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		public TerminalNode If() { return getToken(myCheckerParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(myCheckerParser.Else, 0); }
		public TerminalNode Switch() { return getToken(myCheckerParser.Switch, 0); }
		public TerminalNode LeftBrace() { return getToken(myCheckerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(myCheckerParser.RightBrace, 0); }
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
		enterRule(_localctx, 60, RULE_selection);
		int _la;
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(If);
				setState(491);
				match(LeftParen);
				setState(492);
				((SelectionContext)_localctx).expression = expression();

				        if(((SelectionContext)_localctx).expression.typ != Type.Boolean) {
				            System.err.println("Error! line number: " + (((SelectionContext)_localctx).expression!=null?(((SelectionContext)_localctx).expression.start):null).getLine() + " if needs boolean expression.");
				        } 
				    
				setState(494);
				match(RightParen);
				setState(495);
				statement(true);
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(496);
					match(Else);
					setState(497);
					statement(true);
					}
					break;
				}
				 if (TRACEON) System.out.println("selection: 'if' '(' expression ')' statement ('else' statement)?"); 
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(Switch);
				setState(503);
				match(LeftParen);
				setState(504);
				expression();
				setState(505);
				match(RightParen);
				setState(506);
				match(LeftBrace);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case) {
					{
					{
					setState(507);
					caseStatement();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(513);
					defaultStatement();
					}
				}

				setState(516);
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
		public TerminalNode Case() { return getToken(myCheckerParser.Case, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode Colon() { return getToken(myCheckerParser.Colon, 0); }
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
		enterRule(_localctx, 62, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(Case);
			setState(522);
			constant();
			setState(523);
			match(Colon);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6842810766458298L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 63L) != 0)) {
				{
				{
				setState(524);
				statement(true);
				}
				}
				setState(529);
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
		public TerminalNode Default() { return getToken(myCheckerParser.Default, 0); }
		public TerminalNode Colon() { return getToken(myCheckerParser.Colon, 0); }
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
		enterRule(_localctx, 64, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(Default);
			setState(533);
			match(Colon);
			setState(534);
			statement(true);
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
		public TerminalNode While() { return getToken(myCheckerParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(myCheckerParser.Do, 0); }
		public TerminalNode Semi() { return getToken(myCheckerParser.Semi, 0); }
		public TerminalNode For() { return getToken(myCheckerParser.For, 0); }
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
		enterRule(_localctx, 66, RULE_iteration);
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(While);
				setState(538);
				match(LeftParen);
				setState(539);
				((IterationContext)_localctx).expression = expression();

				        if(((IterationContext)_localctx).expression.typ != Type.Boolean) {
				            System.err.println("Error! line number: " + (((IterationContext)_localctx).expression!=null?(((IterationContext)_localctx).expression.start):null).getLine() + " while needs boolean expression.");
				        }
				    
				setState(541);
				match(RightParen);
				setState(542);
				statement(true);
				 if (TRACEON) System.out.println("iteration: 'while' '(' expression ')' statement"); 
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(Do);
				setState(546);
				statement(true);
				setState(547);
				match(While);
				setState(548);
				match(LeftParen);
				setState(549);
				((IterationContext)_localctx).expression = expression();

				        if(((IterationContext)_localctx).expression.typ != Type.Boolean) {
				            System.err.println("Error! line number: " + (((IterationContext)_localctx).expression!=null?(((IterationContext)_localctx).expression.start):null).getLine() + " do while needs boolean expression.");
				        }
				    
				setState(551);
				match(RightParen);
				setState(552);
				match(Semi);
				 if (TRACEON) System.out.println("iteration: 'do' statement 'while' '(' expression ')' ';'"); 
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				match(For);
				setState(556);
				match(LeftParen);

				        symtab.enterScope();
				    
				setState(558);
				forCondition();
				setState(559);
				match(RightParen);
				setState(560);
				statement(false);

				        symtab.exitScope();
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
		public List<TerminalNode> Semi() { return getTokens(myCheckerParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(myCheckerParser.Semi, i);
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
		enterRule(_localctx, 68, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Short:
			case Void:
				{
				setState(565);
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
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 554154676125697L) != 0)) {
					{
					setState(566);
					((ForConditionContext)_localctx).expression = expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(571);
			match(Semi);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 554154676125697L) != 0)) {
				{
				setState(572);
				((ForConditionContext)_localctx).expression = expression();
				}
			}


			        if(((ForConditionContext)_localctx).expression.typ != Type.Boolean) {
			            System.err.println("Error! line number: " + (((ForConditionContext)_localctx).expression!=null?(((ForConditionContext)_localctx).expression.start):null).getLine() + " for needs boolean expression.");
			        }
			    
			setState(576);
			match(Semi);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 554154676125697L) != 0)) {
				{
				setState(577);
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
		public Token ptr;
		public PointerDeclaratorContext pd;
		public DeclaratorContext d;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Star() { return getToken(myCheckerParser.Star, 0); }
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forDeclaration);
		int _la;
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				((ForDeclarationContext)_localctx).type = type();
				setState(583);
				((ForDeclarationContext)_localctx).ptr = match(Star);
				setState(584);
				((ForDeclarationContext)_localctx).pd = pointerDeclarator(((ForDeclarationContext)_localctx).type.attr_t);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(585);
					initialization(((ForDeclarationContext)_localctx).pd.id);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				((ForDeclarationContext)_localctx).type = type();
				setState(589);
				((ForDeclarationContext)_localctx).d = declarator(((ForDeclarationContext)_localctx).type.attr_t);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(590);
					initialization(((ForDeclarationContext)_localctx).d.id);
					}
				}

				 if (TRACEON) System.out.println("forDeclaration: type '*'? declarator initialization?"); 
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
		enterRule(_localctx, 72, RULE_functionCall);
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Printf:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				printf();

				        ((FunctionCallContext)_localctx).typ =  Type.Int;
				        if (TRACEON) System.out.println("functionCall: printf");
				    
				}
				break;
			case Scanf:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				scanf();

				        ((FunctionCallContext)_localctx).typ =  Type.Int;
				        if (TRACEON) System.out.println("functionCall: scanf");
				    
				}
				break;
			case Malloc:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				malloc();

				        ((FunctionCallContext)_localctx).typ =  Type.VoidPtr;
				        if (TRACEON) System.out.println("functionCall: malloc");
				    
				}
				break;
			case Free:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				free();

				        ((FunctionCallContext)_localctx).typ =  Type.Void;
				        if (TRACEON) System.out.println("functionCall: free");
				    
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(609);
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
		public TerminalNode Printf() { return getToken(myCheckerParser.Printf, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(myCheckerParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
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
		enterRule(_localctx, 74, RULE_printf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(Printf);
			setState(615);
			match(LeftParen);
			setState(616);
			match(StringLiteral);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(617);
				parameter();
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
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
		public TerminalNode Scanf() { return getToken(myCheckerParser.Scanf, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(myCheckerParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
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
		enterRule(_localctx, 76, RULE_scanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(Scanf);
			setState(627);
			match(LeftParen);
			setState(628);
			match(StringLiteral);
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
			setState(635);
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
		public TerminalNode Malloc() { return getToken(myCheckerParser.Malloc, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
		public MallocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_malloc; }
	}

	public final MallocContext malloc() throws RecognitionException {
		MallocContext _localctx = new MallocContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_malloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(Malloc);
			setState(639);
			match(LeftParen);
			setState(640);
			expression();
			setState(641);
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
		public TerminalNode Free() { return getToken(myCheckerParser.Free, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
		public FreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_free; }
	}

	public final FreeContext free() throws RecognitionException {
		FreeContext _localctx = new FreeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_free);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(Free);
			setState(645);
			match(LeftParen);
			setState(646);
			expression();
			setState(647);
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
		public TerminalNode Identifier() { return getToken(myCheckerParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(myCheckerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(myCheckerParser.RightParen, 0); }
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
		enterRule(_localctx, 82, RULE_customerFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			((CustomerFunctionContext)_localctx).Identifier = match(Identifier);
			setState(651);
			match(LeftParen);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 554154676125697L) != 0)) {
				{
				setState(652);
				generalParameter();
				}
			}

			setState(655);
			match(RightParen);

			        if(funs.containsKey((((CustomerFunctionContext)_localctx).Identifier!=null?((CustomerFunctionContext)_localctx).Identifier.getText():null))) {
			            ((CustomerFunctionContext)_localctx).typ =  funs.get((((CustomerFunctionContext)_localctx).Identifier!=null?((CustomerFunctionContext)_localctx).Identifier.getText():null));
			        } else {
			            System.err.println("Error! line number: " + ((CustomerFunctionContext)_localctx).Identifier.getLine() + " function not declared!");
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
		public TerminalNode Comma() { return getToken(myCheckerParser.Comma, 0); }
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
		enterRule(_localctx, 84, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(Comma);
			setState(659);
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
		enterRule(_localctx, 86, RULE_generalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			expression();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(663);
				parameter();
				}
				}
				setState(668);
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
		"\u0004\u0001L\u02a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000_\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001e\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001p\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001z\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0083\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0094\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u009f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a7\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00ab\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00b0\b\u0006\n\u0006\f\u0006\u00b3\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00b9\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c5\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00cc\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\t\u00d4\b\t\n\t\f\t\u00d7\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f0\b\n\u0003\n\u00f2\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00fa\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0104\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0112\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u011f\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0003\u000e\u0124\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u012c\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0133\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0142\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u014a\b\u0011\n\u0011\f\u0011\u014d"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0157\b\u0012\n\u0012\f\u0012"+
		"\u015a\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0164\b\u0013\n\u0013"+
		"\f\u0013\u0167\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0171\b\u0014"+
		"\n\u0014\f\u0014\u0174\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u017e"+
		"\b\u0015\n\u0015\f\u0015\u0181\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u018b\b\u0016\n\u0016\f\u0016\u018e\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0198\b\u0017\n\u0017\f\u0017\u019b\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u01a5\b\u0018\n\u0018\f\u0018\u01a8\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u01b2\b\u0019\n\u0019\f\u0019\u01b5\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u01bf\b\u001a\n\u001a\f\u001a\u01c2\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01ce\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01dc\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u01e4\b\u001d\n\u001d\f\u001d\u01e7\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01f3\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u01fd\b\u001e\n\u001e\f\u001e\u0200"+
		"\t\u001e\u0001\u001e\u0003\u001e\u0203\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0208\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u020e\b\u001f\n\u001f\f\u001f\u0211\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0234\b!\u0001\"\u0001\"\u0003\"\u0238\b"+
		"\"\u0003\"\u023a\b\"\u0001\"\u0001\"\u0003\"\u023e\b\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u0243\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u024b\b#\u0001#\u0001#\u0001#\u0003#\u0250\b#\u0001#\u0001#\u0003"+
		"#\u0254\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0265\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0005%\u026b\b%\n%\f%\u026e\t%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u0277\b&\n&\f&\u027a\t&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0003)\u028e\b)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0005+\u0299\b+\n+"+
		"\f+\u029c\t+\u0001+\u0001+\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTV\u0000\u0006\u0002\u0000((**\u0001\u0000+-\u0002\u0000"+
		"\'\'))\u0001\u0000%&\u0001\u0000!$\u0001\u0000@A\u02cf\u0000]\u0001\u0000"+
		"\u0000\u0000\u0002y\u0001\u0000\u0000\u0000\u0004{\u0001\u0000\u0000\u0000"+
		"\u0006\u0093\u0001\u0000\u0000\u0000\b\u0095\u0001\u0000\u0000\u0000\n"+
		"\u00aa\u0001\u0000\u0000\u0000\f\u00ac\u0001\u0000\u0000\u0000\u000e\u00c4"+
		"\u0001\u0000\u0000\u0000\u0010\u00c6\u0001\u0000\u0000\u0000\u0012\u00d1"+
		"\u0001\u0000\u0000\u0000\u0014\u00f9\u0001\u0000\u0000\u0000\u0016\u0103"+
		"\u0001\u0000\u0000\u0000\u0018\u0111\u0001\u0000\u0000\u0000\u001a\u0113"+
		"\u0001\u0000\u0000\u0000\u001c\u012b\u0001\u0000\u0000\u0000\u001e\u0132"+
		"\u0001\u0000\u0000\u0000 \u0141\u0001\u0000\u0000\u0000\"\u0143\u0001"+
		"\u0000\u0000\u0000$\u0150\u0001\u0000\u0000\u0000&\u015d\u0001\u0000\u0000"+
		"\u0000(\u016a\u0001\u0000\u0000\u0000*\u0177\u0001\u0000\u0000\u0000,"+
		"\u0184\u0001\u0000\u0000\u0000.\u0191\u0001\u0000\u0000\u00000\u019e\u0001"+
		"\u0000\u0000\u00002\u01ab\u0001\u0000\u0000\u00004\u01b8\u0001\u0000\u0000"+
		"\u00006\u01cd\u0001\u0000\u0000\u00008\u01db\u0001\u0000\u0000\u0000:"+
		"\u01dd\u0001\u0000\u0000\u0000<\u0207\u0001\u0000\u0000\u0000>\u0209\u0001"+
		"\u0000\u0000\u0000@\u0214\u0001\u0000\u0000\u0000B\u0233\u0001\u0000\u0000"+
		"\u0000D\u0239\u0001\u0000\u0000\u0000F\u0253\u0001\u0000\u0000\u0000H"+
		"\u0264\u0001\u0000\u0000\u0000J\u0266\u0001\u0000\u0000\u0000L\u0272\u0001"+
		"\u0000\u0000\u0000N\u027e\u0001\u0000\u0000\u0000P\u0284\u0001\u0000\u0000"+
		"\u0000R\u028a\u0001\u0000\u0000\u0000T\u0292\u0001\u0000\u0000\u0000V"+
		"\u0296\u0001\u0000\u0000\u0000X\\\u0003\u0002\u0001\u0000Y\\\u0003\u0010"+
		"\b\u0000Z\\\u0005\u001e\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0000\u0000\u0001ab\u0006\u0000"+
		"\uffff\uffff\u0000b\u0001\u0001\u0000\u0000\u0000ce\u0005\u0004\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0003\u0006\u0003\u0000gh\u0005+\u0000\u0000hj\u0003\b"+
		"\u0004\u0000ik\u0003\u0004\u0002\u0000ji\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005\u001e\u0000\u0000"+
		"mz\u0001\u0000\u0000\u0000np\u0005\u0004\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0003\u0006"+
		"\u0003\u0000rt\u0003\n\u0005\u0000su\u0003\u0004\u0002\u0000ts\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005"+
		"\u001e\u0000\u0000wx\u0006\u0001\uffff\uffff\u0000xz\u0001\u0000\u0000"+
		"\u0000yd\u0001\u0000\u0000\u0000yo\u0001\u0000\u0000\u0000z\u0003\u0001"+
		"\u0000\u0000\u0000{\u0082\u00055\u0000\u0000|}\u00036\u001b\u0000}~\u0006"+
		"\u0002\uffff\uffff\u0000~\u0083\u0001\u0000\u0000\u0000\u007f\u0080\u0003"+
		"H$\u0000\u0080\u0081\u0006\u0002\uffff\uffff\u0000\u0081\u0083\u0001\u0000"+
		"\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u0002\uffff"+
		"\uffff\u0000\u0085\u0005\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0003"+
		"\u0000\u0000\u0087\u0094\u0006\u0003\uffff\uffff\u0000\u0088\u0089\u0005"+
		"\r\u0000\u0000\u0089\u0094\u0006\u0003\uffff\uffff\u0000\u008a\u008b\u0005"+
		"\n\u0000\u0000\u008b\u0094\u0006\u0003\uffff\uffff\u0000\u008c\u008d\u0005"+
		"\b\u0000\u0000\u008d\u0094\u0006\u0003\uffff\uffff\u0000\u008e\u008f\u0005"+
		"\u0011\u0000\u0000\u008f\u0094\u0006\u0003\uffff\uffff\u0000\u0090\u0091"+
		"\u0005\u000f\u0000\u0000\u0091\u0092\u0006\u0003\uffff\uffff\u0000\u0092"+
		"\u0094\u0006\u0003\uffff\uffff\u0000\u0093\u0086\u0001\u0000\u0000\u0000"+
		"\u0093\u0088\u0001\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000"+
		"\u0093\u008c\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000"+
		"\u0093\u0090\u0001\u0000\u0000\u0000\u0094\u0007\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005B\u0000\u0000\u0096\u0097\u0006\u0004\uffff\uffff\u0000"+
		"\u0097\t\u0001\u0000\u0000\u0000\u0098\u0099\u0005B\u0000\u0000\u0099"+
		"\u00ab\u0006\u0005\uffff\uffff\u0000\u009a\u009b\u0005B\u0000\u0000\u009b"+
		"\u009c\u0006\u0005\uffff\uffff\u0000\u009c\u009e\u0005\u0017\u0000\u0000"+
		"\u009d\u009f\u0003\f\u0006\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0018\u0000\u0000\u00a1\u00ab\u0006\u0005\uffff\uffff\u0000"+
		"\u00a2\u00a3\u0005B\u0000\u0000\u00a3\u00a4\u0006\u0005\uffff\uffff\u0000"+
		"\u00a4\u00a6\u0005\u0019\u0000\u0000\u00a5\u00a7\u0005C\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u001a\u0000\u0000\u00a9"+
		"\u00ab\u0006\u0005\uffff\uffff\u0000\u00aa\u0098\u0001\u0000\u0000\u0000"+
		"\u00aa\u009a\u0001\u0000\u0000\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000"+
		"\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac\u00b1\u0003\u000e\u0007\u0000"+
		"\u00ad\u00ae\u0005\u001f\u0000\u0000\u00ae\u00b0\u0003\u000e\u0007\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0006\u0006\uffff\uffff\u0000\u00b5\r\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0003\u0006\u0003\u0000\u00b7\u00b9\u0005+\u0000\u0000\u00b8"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005B\u0000\u0000\u00bb\u00bc"+
		"\u0006\u0007\uffff\uffff\u0000\u00bc\u00c5\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0003\u0006\u0003\u0000\u00be\u00bf\u0005B\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0019\u0000\u0000\u00c0\u00c1\u0005C\u0000\u0000\u00c1\u00c2\u0005"+
		"\u001a\u0000\u0000\u00c2\u00c3\u0006\u0007\uffff\uffff\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4\u00b6\u0001\u0000\u0000\u0000\u00c4\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c5\u000f\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0003\u0006\u0003\u0000\u00c7\u00c8\u0005B\u0000\u0000\u00c8\u00c9\u0006"+
		"\b\uffff\uffff\u0000\u00c9\u00cb\u0005\u0017\u0000\u0000\u00ca\u00cc\u0003"+
		"\f\u0006\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0018"+
		"\u0000\u0000\u00ce\u00cf\u0003\u0012\t\u0000\u00cf\u00d0\u0006\b\uffff"+
		"\uffff\u0000\u00d0\u0011\u0001\u0000\u0000\u0000\u00d1\u00d5\u0005\u001b"+
		"\u0000\u0000\u00d2\u00d4\u0003\u0014\n\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u001c\u0000"+
		"\u0000\u00d9\u00da\u0006\t\uffff\uffff\u0000\u00da\u0013\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0003\u0012\t\u0000\u00dc\u00dd\u0006\n\uffff\uffff"+
		"\u0000\u00dd\u00fa\u0001\u0000\u0000\u0000\u00de\u00df\u0003\u0002\u0001"+
		"\u0000\u00df\u00e0\u0006\n\uffff\uffff\u0000\u00e0\u00fa\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0003:\u001d\u0000\u00e2\u00e3\u0005\u001e\u0000\u0000"+
		"\u00e3\u00e4\u0006\n\uffff\uffff\u0000\u00e4\u00fa\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0003<\u001e\u0000\u00e6\u00e7\u0006\n\uffff\uffff\u0000"+
		"\u00e7\u00fa\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003B!\u0000\u00e9\u00ea"+
		"\u0006\n\uffff\uffff\u0000\u00ea\u00fa\u0001\u0000\u0000\u0000\u00eb\u00f2"+
		"\u0005\u0001\u0000\u0000\u00ec\u00f2\u0005\u0005\u0000\u0000\u00ed\u00ef"+
		"\u0005\u000e\u0000\u0000\u00ee\u00f0\u0003:\u001d\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f1\u00eb\u0001\u0000\u0000\u0000\u00f1\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0005\u001e\u0000\u0000\u00f4\u00fa\u0006"+
		"\n\uffff\uffff\u0000\u00f5\u00f6\u0003H$\u0000\u00f6\u00f7\u0005\u001e"+
		"\u0000\u0000\u00f7\u00f8\u0006\n\uffff\uffff\u0000\u00f8\u00fa\u0001\u0000"+
		"\u0000\u0000\u00f9\u00db\u0001\u0000\u0000\u0000\u00f9\u00de\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e1\u0001\u0000\u0000\u0000\u00f9\u00e5\u0001\u0000"+
		"\u0000\u0000\u00f9\u00e8\u0001\u0000\u0000\u0000\u00f9\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa\u0015\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0005C\u0000\u0000\u00fc\u0104\u0006\u000b\uffff"+
		"\uffff\u0000\u00fd\u00fe\u0005D\u0000\u0000\u00fe\u0104\u0006\u000b\uffff"+
		"\uffff\u0000\u00ff\u0100\u0005E\u0000\u0000\u0100\u0104\u0006\u000b\uffff"+
		"\uffff\u0000\u0101\u0102\u0005F\u0000\u0000\u0102\u0104\u0006\u000b\uffff"+
		"\uffff\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u00fd\u0001\u0000"+
		"\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u0017\u0001\u0000\u0000\u0000\u0105\u0106\u0005B\u0000"+
		"\u0000\u0106\u0112\u0006\f\uffff\uffff\u0000\u0107\u0108\u0003\u0016\u000b"+
		"\u0000\u0108\u0109\u0006\f\uffff\uffff\u0000\u0109\u0112\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0005G\u0000\u0000\u010b\u0112\u0006\f\uffff\uffff"+
		"\u0000\u010c\u010d\u0005\u0017\u0000\u0000\u010d\u010e\u0003:\u001d\u0000"+
		"\u010e\u010f\u0005\u0018\u0000\u0000\u010f\u0110\u0006\f\uffff\uffff\u0000"+
		"\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u0105\u0001\u0000\u0000\u0000"+
		"\u0111\u0107\u0001\u0000\u0000\u0000\u0111\u010a\u0001\u0000\u0000\u0000"+
		"\u0111\u010c\u0001\u0000\u0000\u0000\u0112\u0019\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0003\u0018\f\u0000\u0114\u011e\u0006\r\uffff\uffff\u0000"+
		"\u0115\u0116\u0005(\u0000\u0000\u0116\u011f\u0006\r\uffff\uffff\u0000"+
		"\u0117\u0118\u0005*\u0000\u0000\u0118\u011f\u0006\r\uffff\uffff\u0000"+
		"\u0119\u011a\u0005\u0019\u0000\u0000\u011a\u011b\u0003:\u001d\u0000\u011b"+
		"\u011c\u0005\u001a\u0000\u0000\u011c\u011d\u0006\r\uffff\uffff\u0000\u011d"+
		"\u011f\u0001\u0000\u0000\u0000\u011e\u0115\u0001\u0000\u0000\u0000\u011e"+
		"\u0117\u0001\u0000\u0000\u0000\u011e\u0119\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0006\r\uffff\uffff\u0000\u0121\u001b\u0001\u0000\u0000\u0000\u0122"+
		"\u0124\u0007\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0003\u001a\r\u0000\u0126\u0127\u0006\u000e\uffff\uffff\u0000\u0127"+
		"\u012c\u0001\u0000\u0000\u0000\u0128\u0129\u0003 \u0010\u0000\u0129\u012a"+
		"\u0006\u000e\uffff\uffff\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"+
		"\u0123\u0001\u0000\u0000\u0000\u012b\u0128\u0001\u0000\u0000\u0000\u012c"+
		"\u001d\u0001\u0000\u0000\u0000\u012d\u0133\u0005\'\u0000\u0000\u012e\u0133"+
		"\u0005)\u0000\u0000\u012f\u0133\u00054\u0000\u0000\u0130\u0131\u00053"+
		"\u0000\u0000\u0131\u0133\u0006\u000f\uffff\uffff\u0000\u0132\u012d\u0001"+
		"\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132\u012f\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u001f\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005.\u0000\u0000\u0135\u0136\u0003\u001a"+
		"\r\u0000\u0136\u0137\u0006\u0010\uffff\uffff\u0000\u0137\u0142\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005+\u0000\u0000\u0139\u013a\u0003\u001a\r"+
		"\u0000\u013a\u013b\u0006\u0010\uffff\uffff\u0000\u013b\u0142\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0003\u001e\u000f\u0000\u013d\u013e\u0003\u001a"+
		"\r\u0000\u013e\u013f\u0006\u0010\uffff\uffff\u0000\u013f\u0140\u0006\u0010"+
		"\uffff\uffff\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0134\u0001"+
		"\u0000\u0000\u0000\u0141\u0138\u0001\u0000\u0000\u0000\u0141\u013c\u0001"+
		"\u0000\u0000\u0000\u0142!\u0001\u0000\u0000\u0000\u0143\u0144\u0003\u001c"+
		"\u000e\u0000\u0144\u014b\u0006\u0011\uffff\uffff\u0000\u0145\u0146\u0007"+
		"\u0001\u0000\u0000\u0146\u0147\u0003\u001c\u000e\u0000\u0147\u0148\u0006"+
		"\u0011\uffff\uffff\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0145"+
		"\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0006\u0011\uffff\uffff\u0000\u014f#\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0003\"\u0011\u0000\u0151\u0158\u0006\u0012\uffff\uffff\u0000\u0152\u0153"+
		"\u0007\u0002\u0000\u0000\u0153\u0154\u0003\"\u0011\u0000\u0154\u0155\u0006"+
		"\u0012\uffff\uffff\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0152"+
		"\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b"+
		"\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0006\u0012\uffff\uffff\u0000\u015c%\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0003$\u0012\u0000\u015e\u0165\u0006\u0013\uffff\uffff\u0000\u015f\u0160"+
		"\u0007\u0003\u0000\u0000\u0160\u0161\u0003$\u0012\u0000\u0161\u0162\u0006"+
		"\u0013\uffff\uffff\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u015f"+
		"\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0006\u0013\uffff\uffff\u0000\u0169\'\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0003&\u0013\u0000\u016b\u0172\u0006\u0014\uffff\uffff\u0000\u016c\u016d"+
		"\u0007\u0004\u0000\u0000\u016d\u016e\u0003&\u0013\u0000\u016e\u016f\u0006"+
		"\u0014\uffff\uffff\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016c"+
		"\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0175"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0006\u0014\uffff\uffff\u0000\u0176)\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0003(\u0014\u0000\u0178\u017f\u0006\u0015\uffff\uffff\u0000\u0179\u017a"+
		"\u0007\u0005\u0000\u0000\u017a\u017b\u0003(\u0014\u0000\u017b\u017c\u0006"+
		"\u0015\uffff\uffff\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u0179"+
		"\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0182"+
		"\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0006\u0015\uffff\uffff\u0000\u0183+\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0003*\u0015\u0000\u0185\u018c\u0006\u0016\uffff\uffff\u0000\u0186\u0187"+
		"\u0005.\u0000\u0000\u0187\u0188\u0003*\u0015\u0000\u0188\u0189\u0006\u0016"+
		"\uffff\uffff\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u0186\u0001"+
		"\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001"+
		"\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0006"+
		"\u0016\uffff\uffff\u0000\u0190-\u0001\u0000\u0000\u0000\u0191\u0192\u0003"+
		",\u0016\u0000\u0192\u0199\u0006\u0017\uffff\uffff\u0000\u0193\u0194\u0005"+
		"2\u0000\u0000\u0194\u0195\u0003,\u0016\u0000\u0195\u0196\u0006\u0017\uffff"+
		"\uffff\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0193\u0001\u0000"+
		"\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019d\u0006\u0017"+
		"\uffff\uffff\u0000\u019d/\u0001\u0000\u0000\u0000\u019e\u019f\u0003.\u0017"+
		"\u0000\u019f\u01a6\u0006\u0018\uffff\uffff\u0000\u01a0\u01a1\u0005/\u0000"+
		"\u0000\u01a1\u01a2\u0003.\u0017\u0000\u01a2\u01a3\u0006\u0018\uffff\uffff"+
		"\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0006\u0018\uffff"+
		"\uffff\u0000\u01aa1\u0001\u0000\u0000\u0000\u01ab\u01ac\u00030\u0018\u0000"+
		"\u01ac\u01b3\u0006\u0019\uffff\uffff\u0000\u01ad\u01ae\u00050\u0000\u0000"+
		"\u01ae\u01af\u00030\u0018\u0000\u01af\u01b0\u0006\u0019\uffff\uffff\u0000"+
		"\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b7\u0006\u0019\uffff\uffff"+
		"\u0000\u01b73\u0001\u0000\u0000\u0000\u01b8\u01b9\u00032\u0019\u0000\u01b9"+
		"\u01c0\u0006\u001a\uffff\uffff\u0000\u01ba\u01bb\u00051\u0000\u0000\u01bb"+
		"\u01bc\u00032\u0019\u0000\u01bc\u01bd\u0006\u001a\uffff\uffff\u0000\u01bd"+
		"\u01bf\u0001\u0000\u0000\u0000\u01be\u01ba\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c4\u0006\u001a\uffff\uffff\u0000"+
		"\u01c45\u0001\u0000\u0000\u0000\u01c5\u01c6\u00034\u001a\u0000\u01c6\u01c7"+
		"\u0006\u001b\uffff\uffff\u0000\u01c7\u01ce\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0003\u001c\u000e\u0000\u01c9\u01ca\u00038\u001c\u0000\u01ca\u01cb"+
		"\u00034\u001a\u0000\u01cb\u01cc\u0006\u001b\uffff\uffff\u0000\u01cc\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cd\u01c5\u0001\u0000\u0000\u0000\u01cd\u01c8"+
		"\u0001\u0000\u0000\u0000\u01ce7\u0001\u0000\u0000\u0000\u01cf\u01dc\u0005"+
		"6\u0000\u0000\u01d0\u01dc\u00057\u0000\u0000\u01d1\u01dc\u00058\u0000"+
		"\u0000\u01d2\u01dc\u00059\u0000\u0000\u01d3\u01dc\u0005:\u0000\u0000\u01d4"+
		"\u01dc\u0005;\u0000\u0000\u01d5\u01dc\u0005<\u0000\u0000\u01d6\u01dc\u0005"+
		"=\u0000\u0000\u01d7\u01dc\u0005>\u0000\u0000\u01d8\u01dc\u0005?\u0000"+
		"\u0000\u01d9\u01da\u00055\u0000\u0000\u01da\u01dc\u0006\u001c\uffff\uffff"+
		"\u0000\u01db\u01cf\u0001\u0000\u0000\u0000\u01db\u01d0\u0001\u0000\u0000"+
		"\u0000\u01db\u01d1\u0001\u0000\u0000\u0000\u01db\u01d2\u0001\u0000\u0000"+
		"\u0000\u01db\u01d3\u0001\u0000\u0000\u0000\u01db\u01d4\u0001\u0000\u0000"+
		"\u0000\u01db\u01d5\u0001\u0000\u0000\u0000\u01db\u01d6\u0001\u0000\u0000"+
		"\u0000\u01db\u01d7\u0001\u0000\u0000\u0000\u01db\u01d8\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01dc9\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u00036\u001b\u0000\u01de\u01e5\u0006\u001d\uffff\uffff\u0000"+
		"\u01df\u01e0\u0005\u001f\u0000\u0000\u01e0\u01e1\u00036\u001b\u0000\u01e1"+
		"\u01e2\u0006\u001d\uffff\uffff\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e3\u01df\u0001\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0006\u001d\uffff\uffff\u0000\u01e9;\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0005\f\u0000\u0000\u01eb\u01ec\u0005\u0017\u0000\u0000\u01ec"+
		"\u01ed\u0003:\u001d\u0000\u01ed\u01ee\u0006\u001e\uffff\uffff\u0000\u01ee"+
		"\u01ef\u0005\u0018\u0000\u0000\u01ef\u01f2\u0003\u0014\n\u0000\u01f0\u01f1"+
		"\u0005\t\u0000\u0000\u01f1\u01f3\u0003\u0014\n\u0000\u01f2\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0006\u001e\uffff\uffff\u0000\u01f5\u0208"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u0010\u0000\u0000\u01f7\u01f8"+
		"\u0005\u0017\u0000\u0000\u01f8\u01f9\u0003:\u001d\u0000\u01f9\u01fa\u0005"+
		"\u0018\u0000\u0000\u01fa\u01fe\u0005\u001b\u0000\u0000\u01fb\u01fd\u0003"+
		">\u001f\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000"+
		"\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000"+
		"\u0000\u0000\u0201\u0203\u0003@ \u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0005\u001c\u0000\u0000\u0205\u0206\u0006\u001e\uffff\uffff"+
		"\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u01ea\u0001\u0000\u0000"+
		"\u0000\u0207\u01f6\u0001\u0000\u0000\u0000\u0208=\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0005\u0002\u0000\u0000\u020a\u020b\u0003\u0016\u000b\u0000"+
		"\u020b\u020f\u0005 \u0000\u0000\u020c\u020e\u0003\u0014\n\u0000\u020d"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		"\u0212\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0006\u001f\uffff\uffff\u0000\u0213?\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0005\u0006\u0000\u0000\u0215\u0216\u0005 \u0000\u0000\u0216\u0217"+
		"\u0003\u0014\n\u0000\u0217\u0218\u0006 \uffff\uffff\u0000\u0218A\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0005\u0012\u0000\u0000\u021a\u021b\u0005"+
		"\u0017\u0000\u0000\u021b\u021c\u0003:\u001d\u0000\u021c\u021d\u0006!\uffff"+
		"\uffff\u0000\u021d\u021e\u0005\u0018\u0000\u0000\u021e\u021f\u0003\u0014"+
		"\n\u0000\u021f\u0220\u0006!\uffff\uffff\u0000\u0220\u0234\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0005\u0007\u0000\u0000\u0222\u0223\u0003\u0014"+
		"\n\u0000\u0223\u0224\u0005\u0012\u0000\u0000\u0224\u0225\u0005\u0017\u0000"+
		"\u0000\u0225\u0226\u0003:\u001d\u0000\u0226\u0227\u0006!\uffff\uffff\u0000"+
		"\u0227\u0228\u0005\u0018\u0000\u0000\u0228\u0229\u0005\u001e\u0000\u0000"+
		"\u0229\u022a\u0006!\uffff\uffff\u0000\u022a\u0234\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0005\u000b\u0000\u0000\u022c\u022d\u0005\u0017\u0000\u0000"+
		"\u022d\u022e\u0006!\uffff\uffff\u0000\u022e\u022f\u0003D\"\u0000\u022f"+
		"\u0230\u0005\u0018\u0000\u0000\u0230\u0231\u0003\u0014\n\u0000\u0231\u0232"+
		"\u0006!\uffff\uffff\u0000\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u0219"+
		"\u0001\u0000\u0000\u0000\u0233\u0221\u0001\u0000\u0000\u0000\u0233\u022b"+
		"\u0001\u0000\u0000\u0000\u0234C\u0001\u0000\u0000\u0000\u0235\u023a\u0003"+
		"F#\u0000\u0236\u0238\u0003:\u001d\u0000\u0237\u0236\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u023a\u0001\u0000\u0000"+
		"\u0000\u0239\u0235\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023d\u0005\u001e\u0000"+
		"\u0000\u023c\u023e\u0003:\u001d\u0000\u023d\u023c\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0006\"\uffff\uffff\u0000\u0240\u0242\u0005\u001e\u0000\u0000"+
		"\u0241\u0243\u0003:\u001d\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0006\"\uffff\uffff\u0000\u0245E\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0003\u0006\u0003\u0000\u0247\u0248\u0005+\u0000\u0000\u0248\u024a"+
		"\u0003\b\u0004\u0000\u0249\u024b\u0003\u0004\u0002\u0000\u024a\u0249\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u0254\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0003\u0006\u0003\u0000\u024d\u024f\u0003"+
		"\n\u0005\u0000\u024e\u0250\u0003\u0004\u0002\u0000\u024f\u024e\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0006#\uffff\uffff\u0000\u0252\u0254\u0001\u0000"+
		"\u0000\u0000\u0253\u0246\u0001\u0000\u0000\u0000\u0253\u024c\u0001\u0000"+
		"\u0000\u0000\u0254G\u0001\u0000\u0000\u0000\u0255\u0256\u0003J%\u0000"+
		"\u0256\u0257\u0006$\uffff\uffff\u0000\u0257\u0265\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0003L&\u0000\u0259\u025a\u0006$\uffff\uffff\u0000\u025a"+
		"\u0265\u0001\u0000\u0000\u0000\u025b\u025c\u0003N\'\u0000\u025c\u025d"+
		"\u0006$\uffff\uffff\u0000\u025d\u0265\u0001\u0000\u0000\u0000\u025e\u025f"+
		"\u0003P(\u0000\u025f\u0260\u0006$\uffff\uffff\u0000\u0260\u0265\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0003R)\u0000\u0262\u0263\u0006$\uffff"+
		"\uffff\u0000\u0263\u0265\u0001\u0000\u0000\u0000\u0264\u0255\u0001\u0000"+
		"\u0000\u0000\u0264\u0258\u0001\u0000\u0000\u0000\u0264\u025b\u0001\u0000"+
		"\u0000\u0000\u0264\u025e\u0001\u0000\u0000\u0000\u0264\u0261\u0001\u0000"+
		"\u0000\u0000\u0265I\u0001\u0000\u0000\u0000\u0266\u0267\u0005\u0013\u0000"+
		"\u0000\u0267\u0268\u0005\u0017\u0000\u0000\u0268\u026c\u0005G\u0000\u0000"+
		"\u0269\u026b\u0003T*\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026e"+
		"\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0001\u0000\u0000\u0000\u026d\u026f\u0001\u0000\u0000\u0000\u026e\u026c"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\u0005\u0018\u0000\u0000\u0270\u0271"+
		"\u0006%\uffff\uffff\u0000\u0271K\u0001\u0000\u0000\u0000\u0272\u0273\u0005"+
		"\u0014\u0000\u0000\u0273\u0274\u0005\u0017\u0000\u0000\u0274\u0278\u0005"+
		"G\u0000\u0000\u0275\u0277\u0003T*\u0000\u0276\u0275\u0001\u0000\u0000"+
		"\u0000\u0277\u027a\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027b\u0001\u0000\u0000"+
		"\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027c\u0005\u0018\u0000"+
		"\u0000\u027c\u027d\u0006&\uffff\uffff\u0000\u027dM\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0005\u0015\u0000\u0000\u027f\u0280\u0005\u0017\u0000\u0000"+
		"\u0280\u0281\u0003:\u001d\u0000\u0281\u0282\u0005\u0018\u0000\u0000\u0282"+
		"\u0283\u0006\'\uffff\uffff\u0000\u0283O\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0005\u0016\u0000\u0000\u0285\u0286\u0005\u0017\u0000\u0000\u0286"+
		"\u0287\u0003:\u001d\u0000\u0287\u0288\u0005\u0018\u0000\u0000\u0288\u0289"+
		"\u0006(\uffff\uffff\u0000\u0289Q\u0001\u0000\u0000\u0000\u028a\u028b\u0005"+
		"B\u0000\u0000\u028b\u028d\u0005\u0017\u0000\u0000\u028c\u028e\u0003V+"+
		"\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0005\u0018\u0000"+
		"\u0000\u0290\u0291\u0006)\uffff\uffff\u0000\u0291S\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0005\u001f\u0000\u0000\u0293\u0294\u0003:\u001d\u0000\u0294"+
		"\u0295\u0006*\uffff\uffff\u0000\u0295U\u0001\u0000\u0000\u0000\u0296\u029a"+
		"\u0003:\u001d\u0000\u0297\u0299\u0003T*\u0000\u0298\u0297\u0001\u0000"+
		"\u0000\u0000\u0299\u029c\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000"+
		"\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029d\u0001\u0000"+
		"\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u029e\u0006+\uffff"+
		"\uffff\u0000\u029eW\u0001\u0000\u0000\u0000:[]djoty\u0082\u0093\u009e"+
		"\u00a6\u00aa\u00b1\u00b8\u00c4\u00cb\u00d5\u00ef\u00f1\u00f9\u0103\u0111"+
		"\u011e\u0123\u012b\u0132\u0141\u014b\u0158\u0165\u0172\u017f\u018c\u0199"+
		"\u01a6\u01b3\u01c0\u01cd\u01db\u01e5\u01f2\u01fe\u0202\u0207\u020f\u0233"+
		"\u0237\u0239\u023d\u0242\u024a\u024f\u0253\u0264\u026c\u0278\u028d\u029a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}