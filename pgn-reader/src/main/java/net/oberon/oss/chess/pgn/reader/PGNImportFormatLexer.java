// Generated from java-escape by ANTLR 4.11.1

package net.oberon.oss.chess.pgn.reader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PGNImportFormatLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[]{
			"BRACE_COMMENT", "REST_OF_LINE_COMMENT", "ESCAPE", "WHITE_WINS", "BLACK_WINS",
			"DRAWN_GAME", "SPACES", "STRING", "INTEGER", "PERIOD", "ELLIPSIS", "UNDECIDED_OR_UNKNOWN",
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS",
			"LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", "NUMERIC_ANNOTATION_GLYPH",
			"SYMBOL", "SUFFIX_ANNOTATION", "UNEXPECTED_CHAR"
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


	public PGNImportFormatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "PGNImportFormat.g4";
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
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	@Override
	public boolean sempred(
		RuleContext _localctx,
		int ruleIndex,
		int predIndex
	) {
		switch (ruleIndex) {
			case 2:
				return ESCAPE_sempred((RuleContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean ESCAPE_sempred(
		RuleContext _localctx,
		int predIndex
	) {
		switch (predIndex) {
			case 0:
				return getCharPositionInLine() == 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002" +
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002" +
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002" +
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002" +
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e" +
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011" +
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014" +
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0005\u00000\b\u0000" +
		"\n\u0000\f\u00003\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001" +
		"\u0005\u00019\b\u0001\n\u0001\f\u0001<\t\u0001\u0001\u0002\u0001\u0002" +
		"\u0001\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0001\u0003" +
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004" +
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006W\b\u0006" +
		"\u000b\u0006\f\u0006X\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007" +
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007c\b\u0007" +
		"\n\u0007\f\u0007f\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bk\b\b" +
		"\u000b\b\f\bl\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b" +
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001" +
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001" +
		"\u0012\u0001\u0012\u0004\u0012\u0085\b\u0012\u000b\u0012\f\u0012\u0086" +
		"\u0001\u0013\u0001\u0013\u0005\u0013\u008b\b\u0013\n\u0013\f\u0013\u008e" +
		"\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0092\b\u0014\u0001\u0015" +
		"\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007" +
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b" +
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013" +
		"\'\u0014)\u0015+\u0016\u0001\u0000\b\u0001\u0000}}\u0002\u0000\n\n\r\r" +
		"\u0003\u0000\t\n\r\r  \u0002\u0000\"\"\\\\\u0001\u000009\u0003\u00000" +
		"9AZaz\b\u0000##++--0:==AZ__az\u0002\u0000!!??\u009f\u0000\u0001\u0001" +
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001" +
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000" +
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000" +
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000" +
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000" +
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000" +
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000" +
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000" +
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'" +
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000" +
		"\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000" +
		"\u0005=\u0001\u0000\u0000\u0000\u0007E\u0001\u0000\u0000\u0000\tI\u0001" +
		"\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000" +
		"\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011j\u0001\u0000\u0000\u0000" +
		"\u0013n\u0001\u0000\u0000\u0000\u0015p\u0001\u0000\u0000\u0000\u0017t" +
		"\u0001\u0000\u0000\u0000\u0019v\u0001\u0000\u0000\u0000\u001bx\u0001\u0000" +
		"\u0000\u0000\u001dz\u0001\u0000\u0000\u0000\u001f|\u0001\u0000\u0000\u0000" +
		"!~\u0001\u0000\u0000\u0000#\u0080\u0001\u0000\u0000\u0000%\u0082\u0001" +
		"\u0000\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000)\u008f\u0001\u0000" +
		"\u0000\u0000+\u0093\u0001\u0000\u0000\u0000-1\u0005{\u0000\u0000.0\b\u0000" +
		"\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001" +
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u0000" +
		"31\u0001\u0000\u0000\u000045\u0005}\u0000\u00005\u0002\u0001\u0000\u0000" +
		"\u00006:\u0005;\u0000\u000079\b\u0001\u0000\u000087\u0001\u0000\u0000" +
		"\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000" +
		"\u0000\u0000;\u0004\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000" +
		"=>\u0004\u0002\u0000\u0000>B\u0005%\u0000\u0000?A\b\u0001\u0000\u0000" +
		"@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000" +
		"\u0000BC\u0001\u0000\u0000\u0000C\u0006\u0001\u0000\u0000\u0000DB\u0001" +
		"\u0000\u0000\u0000EF\u00051\u0000\u0000FG\u0005-\u0000\u0000GH\u00050" +
		"\u0000\u0000H\b\u0001\u0000\u0000\u0000IJ\u00050\u0000\u0000JK\u0005-" +
		"\u0000\u0000KL\u00051\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u00051" +
		"\u0000\u0000NO\u0005/\u0000\u0000OP\u00052\u0000\u0000PQ\u0005-\u0000" +
		"\u0000QR\u00051\u0000\u0000RS\u0005/\u0000\u0000ST\u00052\u0000\u0000" +
		"T\f\u0001\u0000\u0000\u0000UW\u0007\u0002\u0000\u0000VU\u0001\u0000\u0000" +
		"\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000" +
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0006\u0006\u0000\u0000[\u000e" +
		"\u0001\u0000\u0000\u0000\\d\u0005\"\u0000\u0000]^\u0005\\\u0000\u0000" +
		"^c\u0005\\\u0000\u0000_`\u0005\\\u0000\u0000`c\u0005\"\u0000\u0000ac\b" +
		"\u0003\u0000\u0000b]\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000" +
		"ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000" +
		"\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000" +
		"\u0000\u0000gh\u0005\"\u0000\u0000h\u0010\u0001\u0000\u0000\u0000ik\u0007" +
		"\u0004\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000" +
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0012\u0001\u0000" +
		"\u0000\u0000no\u0005.\u0000\u0000o\u0014\u0001\u0000\u0000\u0000pq\u0005" +
		".\u0000\u0000qr\u0005.\u0000\u0000rs\u0005.\u0000\u0000s\u0016\u0001\u0000" +
		"\u0000\u0000tu\u0005*\u0000\u0000u\u0018\u0001\u0000\u0000\u0000vw\u0005" +
		"[\u0000\u0000w\u001a\u0001\u0000\u0000\u0000xy\u0005]\u0000\u0000y\u001c" +
		"\u0001\u0000\u0000\u0000z{\u0005(\u0000\u0000{\u001e\u0001\u0000\u0000" +
		"\u0000|}\u0005)\u0000\u0000} \u0001\u0000\u0000\u0000~\u007f\u0005<\u0000" +
		"\u0000\u007f\"\u0001\u0000\u0000\u0000\u0080\u0081\u0005>\u0000\u0000" +
		"\u0081$\u0001\u0000\u0000\u0000\u0082\u0084\u0005$\u0000\u0000\u0083\u0085" +
		"\u0007\u0004\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086" +
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087" +
		"\u0001\u0000\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u008c\u0007" +
		"\u0005\u0000\u0000\u0089\u008b\u0007\u0006\u0000\u0000\u008a\u0089\u0001" +
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001" +
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d(\u0001\u0000" +
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0091\u0007\u0007" +
		"\u0000\u0000\u0090\u0092\u0007\u0007\u0000\u0000\u0091\u0090\u0001\u0000" +
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092*\u0001\u0000\u0000" +
		"\u0000\u0093\u0094\t\u0000\u0000\u0000\u0094,\u0001\u0000\u0000\u0000" +
		"\u000b\u00001:BXbdl\u0086\u008c\u0091\u0001\u0006\u0000\u0000";
	public static final ATN    _ATN           =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}