// Generated from java-escape by ANTLR 4.11.1

package net.oberon.oss.chess.pgn.reader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PGNImportFormatParser extends Parser {
	static {RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);}

	protected static final DFA[]                  _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final    int
	                                              BRACE_COMMENT       = 1, REST_OF_LINE_COMMENT = 2, ESCAPE = 3, WHITE_WINS = 4,
		BLACK_WINS                                                    =
			5,
		DRAWN_GAME                                                    = 6, SPACES = 7, STRING = 8, INTEGER = 9, PERIOD = 10,
		ELLIPSIS                                                      =
			11, UNDECIDED_OR_UNKNOWN                                  = 12,
		LEFT_BRACKET                                                  = 13, RIGHT_BRACKET = 14, LEFT_PARENTHESIS = 15,
		RIGHT_PARENTHESIS                                             =
			16,
		LEFT_ANGLE_BRACKET                                            = 17, RIGHT_ANGLE_BRACKET = 18, NUMERIC_ANNOTATION_GLYPH = 19,
		SYMBOL                                                        = 20, SUFFIX_ANNOTATION = 21, UNEXPECTED_CHAR = 22;
	public static final int
		RULE_parse            = 0, RULE_pgn_database = 1, RULE_pgn_game = 2, RULE_tag_section = 3,
		RULE_tag_pair         = 4, RULE_tag_name = 5, RULE_tag_value = 6, RULE_movetext_section = 7,
		RULE_element_sequence = 8, RULE_element = 9, RULE_move_number_indication = 10,
		RULE_san_move         = 11, RULE_recursive_variation = 12, RULE_move_comment = 13,
		RULE_nag              = 14, RULE_rest_of_line_comment = 15, RULE_processing_instruction = 16,
		RULE_game_termination = 17;

	private static String[] makeRuleNames() {
		return new String[]{
			"parse", "pgn_database", "pgn_game", "tag_section", "tag_pair", "tag_name",
			"tag_value", "movetext_section", "element_sequence", "element", "move_number_indication",
			"san_move", "recursive_variation", "move_comment", "nag", "rest_of_line_comment",
			"processing_instruction", "game_termination"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
			null, null, null, null, "'1-0'", "'0-1'", "'1/2-1/2'", null, null, null,
			"'.'", "'...'", "'*'", "'['", "']'", "'('", "')'", "'<'", "'>'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[]{
			null, "BRACE_COMMENT", "REST_OF_LINE_COMMENT", "ESCAPE", "WHITE_WINS",
			"BLACK_WINS", "DRAWN_GAME", "SPACES", "STRING", "INTEGER", "PERIOD",
			"ELLIPSIS", "UNDECIDED_OR_UNKNOWN", "LEFT_BRACKET", "RIGHT_BRACKET",
			"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET",
			"NUMERIC_ANNOTATION_GLYPH", "SYMBOL", "SUFFIX_ANNOTATION", "UNEXPECTED_CHAR"
		};
	}

	private static final String[]   _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final  Vocabulary VOCABULARY      = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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
	public String getGrammarFileName() {
		return "java-escape";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public PGNImportFormatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public Pgn_databaseContext pgn_database() {
			return getRuleContext(Pgn_databaseContext.class, 0);
		}

		public TerminalNode EOF() {
			return getToken(PGNImportFormatParser.EOF, 0);
		}

		public ParseContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parse;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterParse(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitParse(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(36);
				pgn_database();
				setState(37);
				match(EOF);
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
	public static class Pgn_databaseContext extends ParserRuleContext {
		public List<Pgn_gameContext> pgn_game() {
			return getRuleContexts(Pgn_gameContext.class);
		}

		public Pgn_gameContext pgn_game(int i) {
			return getRuleContext(Pgn_gameContext.class, i);
		}

		public Pgn_databaseContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pgn_database;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterPgn_database(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitPgn_database(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitPgn_database(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pgn_databaseContext pgn_database() throws RecognitionException {
		Pgn_databaseContext _localctx = new Pgn_databaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pgn_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1618558L) != 0) {
					{
						{
							setState(39);
							pgn_game();
						}
					}
					setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pgn_gameContext extends ParserRuleContext {
		public Tag_sectionContext tag_section() {
			return getRuleContext(Tag_sectionContext.class, 0);
		}

		public Movetext_sectionContext movetext_section() {
			return getRuleContext(Movetext_sectionContext.class, 0);
		}

		public Game_terminationContext game_termination() {
			return getRuleContext(Game_terminationContext.class, 0);
		}

		public Pgn_gameContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pgn_game;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterPgn_game(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitPgn_game(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitPgn_game(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pgn_gameContext pgn_game() throws RecognitionException {
		Pgn_gameContext _localctx = new Pgn_gameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgn_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(45);
				tag_section();
				setState(46);
				movetext_section();
				setState(47);
				game_termination();
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
	public static class Tag_sectionContext extends ParserRuleContext {
		public List<Tag_pairContext> tag_pair() {
			return getRuleContexts(Tag_pairContext.class);
		}

		public Tag_pairContext tag_pair(int i) {
			return getRuleContext(Tag_pairContext.class, i);
		}

		public Tag_sectionContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tag_section;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterTag_section(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitTag_section(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitTag_section(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_sectionContext tag_section() throws RecognitionException {
		Tag_sectionContext _localctx = new Tag_sectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LEFT_BRACKET) {
					{
						{
							setState(49);
							tag_pair();
						}
					}
					setState(54);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_pairContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() {
			return getToken(PGNImportFormatParser.LEFT_BRACKET, 0);
		}

		public Tag_nameContext tag_name() {
			return getRuleContext(Tag_nameContext.class, 0);
		}

		public Tag_valueContext tag_value() {
			return getRuleContext(Tag_valueContext.class, 0);
		}

		public TerminalNode RIGHT_BRACKET() {
			return getToken(PGNImportFormatParser.RIGHT_BRACKET, 0);
		}

		public Tag_pairContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tag_pair;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterTag_pair(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitTag_pair(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitTag_pair(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_pairContext tag_pair() throws RecognitionException {
		Tag_pairContext _localctx = new Tag_pairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tag_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(55);
				match(LEFT_BRACKET);
				setState(56);
				tag_name();
				setState(57);
				tag_value();
				setState(58);
				match(RIGHT_BRACKET);
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
	public static class Tag_nameContext extends ParserRuleContext {
		public TerminalNode SYMBOL() {
			return getToken(PGNImportFormatParser.SYMBOL, 0);
		}

		public Tag_nameContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tag_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterTag_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitTag_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitTag_name(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_nameContext tag_name() throws RecognitionException {
		Tag_nameContext _localctx = new Tag_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(60);
				match(SYMBOL);
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
	public static class Tag_valueContext extends ParserRuleContext {
		public TerminalNode STRING() {
			return getToken(PGNImportFormatParser.STRING, 0);
		}

		public Tag_valueContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tag_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterTag_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitTag_value(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitTag_value(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_valueContext tag_value() throws RecognitionException {
		Tag_valueContext _localctx = new Tag_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tag_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(62);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Movetext_sectionContext extends ParserRuleContext {
		public Element_sequenceContext element_sequence() {
			return getRuleContext(Element_sequenceContext.class, 0);
		}

		public Movetext_sectionContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_movetext_section;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterMovetext_section(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitMovetext_section(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor)
				return ((PGNImportFormatVisitor<? extends T>) visitor).visitMovetext_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Movetext_sectionContext movetext_section() throws RecognitionException {
		Movetext_sectionContext _localctx = new Movetext_sectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_movetext_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(64);
				element_sequence();
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
	public static class Element_sequenceContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}

		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class, i);
		}

		public List<Recursive_variationContext> recursive_variation() {
			return getRuleContexts(Recursive_variationContext.class);
		}

		public Recursive_variationContext recursive_variation(int i) {
			return getRuleContext(Recursive_variationContext.class, i);
		}

		public Element_sequenceContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_element_sequence;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterElement_sequence(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitElement_sequence(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor)
				return ((PGNImportFormatVisitor<? extends T>) visitor).visitElement_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_sequenceContext element_sequence() throws RecognitionException {
		Element_sequenceContext _localctx = new Element_sequenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_element_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1606158L) != 0) {
					{
						setState(68);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case BRACE_COMMENT:
							case REST_OF_LINE_COMMENT:
							case ESCAPE:
							case INTEGER:
							case NUMERIC_ANNOTATION_GLYPH:
							case SYMBOL: {
								setState(66);
								element();
							}
							break;
							case LEFT_PARENTHESIS: {
								setState(67);
								recursive_variation();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(72);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public Processing_instructionContext processing_instruction() {
			return getRuleContext(Processing_instructionContext.class, 0);
		}

		public Rest_of_line_commentContext rest_of_line_comment() {
			return getRuleContext(Rest_of_line_commentContext.class, 0);
		}

		public Move_number_indicationContext move_number_indication() {
			return getRuleContext(Move_number_indicationContext.class, 0);
		}

		public San_moveContext san_move() {
			return getRuleContext(San_moveContext.class, 0);
		}

		public Move_commentContext move_comment() {
			return getRuleContext(Move_commentContext.class, 0);
		}

		public NagContext nag() {
			return getRuleContext(NagContext.class, 0);
		}

		public ElementContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_element;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterElement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitElement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitElement(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_element);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ESCAPE:
					enterOuterAlt(_localctx, 1);
				{
					setState(73);
					processing_instruction();
				}
				break;
				case REST_OF_LINE_COMMENT:
					enterOuterAlt(_localctx, 2);
				{
					setState(74);
					rest_of_line_comment();
				}
				break;
				case INTEGER:
					enterOuterAlt(_localctx, 3);
				{
					setState(75);
					move_number_indication();
				}
				break;
				case SYMBOL:
					enterOuterAlt(_localctx, 4);
				{
					setState(76);
					san_move();
				}
				break;
				case BRACE_COMMENT:
					enterOuterAlt(_localctx, 5);
				{
					setState(77);
					move_comment();
				}
				break;
				case NUMERIC_ANNOTATION_GLYPH:
					enterOuterAlt(_localctx, 6);
				{
					setState(78);
					nag();
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
	public static class Move_number_indicationContext extends ParserRuleContext {
		public TerminalNode INTEGER() {
			return getToken(PGNImportFormatParser.INTEGER, 0);
		}

		public TerminalNode PERIOD() {
			return getToken(PGNImportFormatParser.PERIOD, 0);
		}

		public TerminalNode ELLIPSIS() {
			return getToken(PGNImportFormatParser.ELLIPSIS, 0);
		}

		public Move_number_indicationContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_move_number_indication;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterMove_number_indication(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitMove_number_indication(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor)
				return ((PGNImportFormatVisitor<? extends T>) visitor).visitMove_number_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_number_indicationContext move_number_indication() throws RecognitionException {
		Move_number_indicationContext _localctx = new Move_number_indicationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_move_number_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(81);
				match(INTEGER);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == PERIOD || _la == ELLIPSIS) {
					{
						setState(82);
						_la = _input.LA(1);
						if (!(_la == PERIOD || _la == ELLIPSIS)) {
							_errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class San_moveContext extends ParserRuleContext {
		public TerminalNode SYMBOL() {
			return getToken(PGNImportFormatParser.SYMBOL, 0);
		}

		public TerminalNode SUFFIX_ANNOTATION() {
			return getToken(PGNImportFormatParser.SUFFIX_ANNOTATION, 0);
		}

		public San_moveContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_san_move;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterSan_move(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitSan_move(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitSan_move(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final San_moveContext san_move() throws RecognitionException {
		San_moveContext _localctx = new San_moveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_san_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				match(SYMBOL);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == SUFFIX_ANNOTATION) {
					{
						setState(86);
						match(SUFFIX_ANNOTATION);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Recursive_variationContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() {
			return getToken(PGNImportFormatParser.LEFT_PARENTHESIS, 0);
		}

		public Element_sequenceContext element_sequence() {
			return getRuleContext(Element_sequenceContext.class, 0);
		}

		public TerminalNode RIGHT_PARENTHESIS() {
			return getToken(PGNImportFormatParser.RIGHT_PARENTHESIS, 0);
		}

		public Recursive_variationContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_recursive_variation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterRecursive_variation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitRecursive_variation(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor)
				return ((PGNImportFormatVisitor<? extends T>) visitor).visitRecursive_variation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recursive_variationContext recursive_variation() throws RecognitionException {
		Recursive_variationContext _localctx = new Recursive_variationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recursive_variation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(89);
				match(LEFT_PARENTHESIS);
				setState(90);
				element_sequence();
				setState(91);
				match(RIGHT_PARENTHESIS);
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
	public static class Move_commentContext extends ParserRuleContext {
		public TerminalNode BRACE_COMMENT() {
			return getToken(PGNImportFormatParser.BRACE_COMMENT, 0);
		}

		public Move_commentContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_move_comment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterMove_comment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitMove_comment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitMove_comment(
				this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_commentContext move_comment() throws RecognitionException {
		Move_commentContext _localctx = new Move_commentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_move_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(93);
				match(BRACE_COMMENT);
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
	public static class NagContext extends ParserRuleContext {
		public TerminalNode NUMERIC_ANNOTATION_GLYPH() {
			return getToken(PGNImportFormatParser.NUMERIC_ANNOTATION_GLYPH, 0);
		}

		public NagContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_nag;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterNag(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitNag(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor) return ((PGNImportFormatVisitor<? extends T>) visitor).visitNag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NagContext nag() throws RecognitionException {
		NagContext _localctx = new NagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nag);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(95);
				match(NUMERIC_ANNOTATION_GLYPH);
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
	public static class Rest_of_line_commentContext extends ParserRuleContext {
		public TerminalNode REST_OF_LINE_COMMENT() {
			return getToken(PGNImportFormatParser.REST_OF_LINE_COMMENT, 0);
		}

		public Rest_of_line_commentContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_rest_of_line_comment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterRest_of_line_comment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitRest_of_line_comment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor)
				return ((PGNImportFormatVisitor<? extends T>) visitor).visitRest_of_line_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rest_of_line_commentContext rest_of_line_comment() throws RecognitionException {
		Rest_of_line_commentContext _localctx = new Rest_of_line_commentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rest_of_line_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(97);
				match(REST_OF_LINE_COMMENT);
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
	public static class Processing_instructionContext extends ParserRuleContext {
		public TerminalNode ESCAPE() {
			return getToken(PGNImportFormatParser.ESCAPE, 0);
		}

		public Processing_instructionContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_processing_instruction;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterProcessing_instruction(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitProcessing_instruction(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor)
				return ((PGNImportFormatVisitor<? extends T>) visitor).visitProcessing_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Processing_instructionContext processing_instruction() throws RecognitionException {
		Processing_instructionContext _localctx = new Processing_instructionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_processing_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(99);
				match(ESCAPE);
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
	public static class Game_terminationContext extends ParserRuleContext {
		public TerminalNode WHITE_WINS() {
			return getToken(PGNImportFormatParser.WHITE_WINS, 0);
		}

		public TerminalNode BLACK_WINS() {
			return getToken(PGNImportFormatParser.BLACK_WINS, 0);
		}

		public TerminalNode DRAWN_GAME() {
			return getToken(PGNImportFormatParser.DRAWN_GAME, 0);
		}

		public TerminalNode UNDECIDED_OR_UNKNOWN() {
			return getToken(PGNImportFormatParser.UNDECIDED_OR_UNKNOWN, 0);
		}

		public Game_terminationContext(
			ParserRuleContext parent,
			int invokingState
		) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_game_termination;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).enterGame_termination(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PGNImportFormatListener) ((PGNImportFormatListener) listener).exitGame_termination(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PGNImportFormatVisitor)
				return ((PGNImportFormatVisitor<? extends T>) visitor).visitGame_termination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Game_terminationContext game_termination() throws RecognitionException {
		Game_terminationContext _localctx = new Game_terminationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_game_termination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(101);
				_la = _input.LA(1);
				if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 4208L) != 0)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016h\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000" +
		"\u0001\u0000\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001" +
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003" +
		"3\b\u0003\n\u0003\f\u00036\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004" +
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006" +
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bE\b\b\n\b\f\bH\t\b\u0001" +
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tP\b\t\u0001\n\u0001" +
		"\n\u0003\nT\b\n\u0001\u000b\u0001\u000b\u0003\u000bX\b\u000b\u0001\f\u0001" +
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f" +
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011" +
		"\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014" +
		"\u0016\u0018\u001a\u001c\u001e \"\u0000\u0002\u0001\u0000\n\u000b\u0002" +
		"\u0000\u0004\u0006\f\f`\u0000$\u0001\u0000\u0000\u0000\u0002*\u0001\u0000" +
		"\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000" +
		"\b7\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000\f>\u0001\u0000" +
		"\u0000\u0000\u000e@\u0001\u0000\u0000\u0000\u0010F\u0001\u0000\u0000\u0000" +
		"\u0012O\u0001\u0000\u0000\u0000\u0014Q\u0001\u0000\u0000\u0000\u0016U" +
		"\u0001\u0000\u0000\u0000\u0018Y\u0001\u0000\u0000\u0000\u001a]\u0001\u0000" +
		"\u0000\u0000\u001c_\u0001\u0000\u0000\u0000\u001ea\u0001\u0000\u0000\u0000" +
		" c\u0001\u0000\u0000\u0000\"e\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001" +
		"\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\')\u0003" +
		"\u0004\u0002\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000" +
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0003\u0001\u0000" +
		"\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0003" +
		"\u000e\u0007\u0000/0\u0003\"\u0011\u00000\u0005\u0001\u0000\u0000\u0000" +
		"13\u0003\b\u0004\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000" +
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0007\u0001\u0000" +
		"\u0000\u000064\u0001\u0000\u0000\u000078\u0005\r\u0000\u000089\u0003\n" +
		"\u0005\u00009:\u0003\f\u0006\u0000:;\u0005\u000e\u0000\u0000;\t\u0001" +
		"\u0000\u0000\u0000<=\u0005\u0014\u0000\u0000=\u000b\u0001\u0000\u0000" +
		"\u0000>?\u0005\b\u0000\u0000?\r\u0001\u0000\u0000\u0000@A\u0003\u0010" +
		"\b\u0000A\u000f\u0001\u0000\u0000\u0000BE\u0003\u0012\t\u0000CE\u0003" +
		"\u0018\f\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001" +
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000" +
		"G\u0011\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IP\u0003 \u0010" +
		"\u0000JP\u0003\u001e\u000f\u0000KP\u0003\u0014\n\u0000LP\u0003\u0016\u000b" +
		"\u0000MP\u0003\u001a\r\u0000NP\u0003\u001c\u000e\u0000OI\u0001\u0000\u0000" +
		"\u0000OJ\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000" +
		"\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0013" +
		"\u0001\u0000\u0000\u0000QS\u0005\t\u0000\u0000RT\u0007\u0000\u0000\u0000" +
		"SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0015\u0001\u0000" +
		"\u0000\u0000UW\u0005\u0014\u0000\u0000VX\u0005\u0015\u0000\u0000WV\u0001" +
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0017\u0001\u0000\u0000" +
		"\u0000YZ\u0005\u000f\u0000\u0000Z[\u0003\u0010\b\u0000[\\\u0005\u0010" +
		"\u0000\u0000\\\u0019\u0001\u0000\u0000\u0000]^\u0005\u0001\u0000\u0000" +
		"^\u001b\u0001\u0000\u0000\u0000_`\u0005\u0013\u0000\u0000`\u001d\u0001" +
		"\u0000\u0000\u0000ab\u0005\u0002\u0000\u0000b\u001f\u0001\u0000\u0000" +
		"\u0000cd\u0005\u0003\u0000\u0000d!\u0001\u0000\u0000\u0000ef\u0007\u0001" +
		"\u0000\u0000f#\u0001\u0000\u0000\u0000\u0007*4DFOSW";
	public static final ATN    _ATN           =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}