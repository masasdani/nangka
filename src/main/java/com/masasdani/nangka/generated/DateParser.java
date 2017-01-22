// Generated from Date.g4 by ANTLR 4.5.3

    package com.masasdani.nangka.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, UTC=3, EST=4, PST=5, CST=6, MST=7, AKST=8, HAST=9, WIB=10, 
		WIT=11, WITA=12, AM=13, PM=14, JANUARY=15, FEBRUARY=16, MARCH=17, APRIL=18, 
		MAY=19, JUNE=20, JULY=21, AUGUST=22, SEPTEMBER=23, OCTOBER=24, NOVEMBER=25, 
		DECEMBER=26, SUNDAY=27, MONDAY=28, TUESDAY=29, WEDNESDAY=30, THURSDAY=31, 
		FRIDAY=32, SATURDAY=33, YEAR=34, MONTH=35, WEEK=36, DAY=37, HOUR=38, MINUTE=39, 
		MIDNIGHT=40, NOON=41, MORNING=42, EVENING=43, NIGHT=44, DATE_PREFIX=45, 
		TODAY=46, TOMORROW=47, TONIGHT=48, YESTERDAY=49, FUTURE_PREFIX=50, FUTURE_SUFFIX=51, 
		CURRENT=52, CURRENT_PREFIX=53, CURRENT_SUFFIX=54, PAST_PREFIX=55, PAST_SUFFIX=56, 
		AFTER_TOMORROW=57, T=58, ST=59, ND=60, RD=61, TH=62, WINTER=63, FALL=64, 
		AUTUMN=65, SPRING=66, SUMMER=67, RAIN=68, INT_0=69, INT_1=70, INT_2=71, 
		INT_3=72, INT_4=73, INT_5=74, INT_6=75, INT_7=76, INT_8=77, INT_9=78, 
		INT_00=79, INT_01=80, INT_02=81, INT_03=82, INT_04=83, INT_05=84, INT_06=85, 
		INT_07=86, INT_08=87, INT_09=88, INT_10=89, INT_11=90, INT_12=91, INT_13=92, 
		INT_14=93, INT_15=94, INT_16=95, INT_17=96, INT_18=97, INT_19=98, INT_20=99, 
		INT_21=100, INT_22=101, INT_23=102, INT_24=103, INT_25=104, INT_26=105, 
		INT_27=106, INT_28=107, INT_29=108, INT_30=109, INT_31=110, INT_32=111, 
		INT_33=112, INT_34=113, INT_35=114, INT_36=115, INT_37=116, INT_38=117, 
		INT_39=118, INT_40=119, INT_41=120, INT_42=121, INT_43=122, INT_44=123, 
		INT_45=124, INT_46=125, INT_47=126, INT_48=127, INT_49=128, INT_50=129, 
		INT_51=130, INT_52=131, INT_53=132, INT_54=133, INT_55=134, INT_56=135, 
		INT_57=136, INT_58=137, INT_59=138, INT_60=139, INT_61=140, INT_62=141, 
		INT_63=142, INT_64=143, INT_65=144, INT_66=145, INT_67=146, INT_68=147, 
		INT_69=148, INT_70=149, INT_71=150, INT_72=151, INT_73=152, INT_74=153, 
		INT_75=154, INT_76=155, INT_77=156, INT_78=157, INT_79=158, INT_80=159, 
		INT_81=160, INT_82=161, INT_83=162, INT_84=163, INT_85=164, INT_86=165, 
		INT_87=166, INT_88=167, INT_89=168, INT_90=169, INT_91=170, INT_92=171, 
		INT_93=172, INT_94=173, INT_95=174, INT_96=175, INT_97=176, INT_98=177, 
		INT_99=178, ONE=179, TWO=180, THREE=181, FOUR=182, FIVE=183, SIX=184, 
		SEVEN=185, EIGHT=186, NINE=187, TEN=188, ELEVEN=189, TWELVE=190, THIRTEEN=191, 
		FOURTEEN=192, FIFTEEN=193, SIXTEEN=194, SEVENTEEN=195, EIGHTEEN=196, NINETEEN=197, 
		TWENTY=198, THIRTY=199, FIRST=200, SECOND=201, THIRD=202, FOURTH=203, 
		FIFTH=204, SIXTH=205, SEVENTH=206, EIGHTH=207, NINTH=208, TENTH=209, ELEVENTH=210, 
		TWELFTH=211, THIRTEENTH=212, FOURTEENTH=213, FIFTEENTH=214, SIXTEENTH=215, 
		SEVENTEENTH=216, EIGHTEENTH=217, NINETEENTH=218, TWENTIETH=219, THIRTIETH=220, 
		COLON=221, SEMICOLON=222, COMMA=223, DOT=224, DASH=225, SLASH=226, BACK_SLASH=227, 
		PLUS=228, OPEN_PARENTESES=229, CLOSE_PARENTESES=230, SINGLE_QUOTE=231, 
		DOUBLE_QUOTE=232, OPEN_TAG=233, CLOSE_TAG=234, EQUAL=235, PIPE=236, UNDERSCORE=237, 
		ASTERISK=238, AT_SIGN=239, QUESTION_MARK=240, EXCLAMATION_MARK=241, DOLLAR=242, 
		PERCENT=243, NEGATION=244, FOUR_DIGIT=245, TWO_DIGIT=246, INT=247, DIGIT=248, 
		ALPHABET=249, ALPHANUMERIC=250, TEXT=251, GENERAL_SYMBOL=252, WS=253;
	public static final int
		RULE_parse = 0, RULE_formal_date_time = 1, RULE_formal_date = 2, RULE_natural_date = 3, 
		RULE_relative_date = 4, RULE_relative_date_past = 5, RULE_relative_date_future = 6, 
		RULE_week_of_month = 7, RULE_week = 8, RULE_day_of_week = 9, RULE_year_month_day = 10, 
		RULE_day_month_year = 11, RULE_month_day_year = 12, RULE_day_month = 13, 
		RULE_month_day = 14, RULE_month_year = 15, RULE_day_of_month = 16, RULE_time = 17, 
		RULE_hour_minute = 18, RULE_month = 19, RULE_vocal_month = 20, RULE_year = 21, 
		RULE_am_pm = 22, RULE_timezone = 23, RULE_timezone_plus_offset = 24, RULE_time_zone_offset = 25, 
		RULE_timezone_abbeviation = 26, RULE_date_separator = 27, RULE_spelling_week = 28, 
		RULE_spelling_date = 29, RULE_interval = 30, RULE_numeric_week = 31, RULE_numeric_month = 32, 
		RULE_numeric_day = 33, RULE_numeric_hour = 34, RULE_numeric_minute = 35, 
		RULE_numeric_year = 36;
	public static final String[] ruleNames = {
		"parse", "formal_date_time", "formal_date", "natural_date", "relative_date", 
		"relative_date_past", "relative_date_future", "week_of_month", "week", 
		"day_of_week", "year_month_day", "day_month_year", "month_day_year", "day_month", 
		"month_day", "month_year", "day_of_month", "time", "hour_minute", "month", 
		"vocal_month", "year", "am_pm", "timezone", "timezone_plus_offset", "time_zone_offset", 
		"timezone_abbeviation", "date_separator", "spelling_week", "spelling_date", 
		"interval", "numeric_week", "numeric_month", "numeric_day", "numeric_hour", 
		"numeric_minute", "numeric_year"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'a'", "'an'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'ini'", null, null, "'lusa'", "'t'", 
		"'st'", "'nd'", "'rd'", "'th'", null, null, null, null, null, null, "'0'", 
		"'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'00'", 
		"'01'", "'02'", "'03'", "'04'", "'05'", "'06'", "'07'", "'08'", "'09'", 
		"'10'", "'11'", "'12'", "'13'", "'14'", "'15'", "'16'", "'17'", "'18'", 
		"'19'", "'20'", "'21'", "'22'", "'23'", "'24'", "'25'", "'26'", "'27'", 
		"'28'", "'29'", "'30'", "'31'", "'32'", "'33'", "'34'", "'35'", "'36'", 
		"'37'", "'38'", "'39'", "'40'", "'41'", "'42'", "'43'", "'44'", "'45'", 
		"'46'", "'47'", "'48'", "'49'", "'50'", "'51'", "'52'", "'53'", "'54'", 
		"'55'", "'56'", "'57'", "'58'", "'59'", "'60'", "'61'", "'62'", "'63'", 
		"'64'", "'65'", "'66'", "'67'", "'68'", "'69'", "'70'", "'71'", "'72'", 
		"'73'", "'74'", "'75'", "'76'", "'77'", "'78'", "'79'", "'80'", "'81'", 
		"'82'", "'83'", "'84'", "'85'", "'86'", "'87'", "'88'", "'89'", "'90'", 
		"'91'", "'92'", "'93'", "'94'", "'95'", "'96'", "'97'", "'98'", "'99'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "':'", "';'", "','", "'.'", "'-'", 
		"'/'", "'\\'", "'+'", "'('", "')'", "'''", "'\"'", "'<'", "'>'", "'='", 
		"'|'", "'_'", "'*'", "'@'", "'?'", "'!'", "'$'", "'%'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "UTC", "EST", "PST", "CST", "MST", "AKST", "HAST", "WIB", 
		"WIT", "WITA", "AM", "PM", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", 
		"JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", 
		"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", 
		"YEAR", "MONTH", "WEEK", "DAY", "HOUR", "MINUTE", "MIDNIGHT", "NOON", 
		"MORNING", "EVENING", "NIGHT", "DATE_PREFIX", "TODAY", "TOMORROW", "TONIGHT", 
		"YESTERDAY", "FUTURE_PREFIX", "FUTURE_SUFFIX", "CURRENT", "CURRENT_PREFIX", 
		"CURRENT_SUFFIX", "PAST_PREFIX", "PAST_SUFFIX", "AFTER_TOMORROW", "T", 
		"ST", "ND", "RD", "TH", "WINTER", "FALL", "AUTUMN", "SPRING", "SUMMER", 
		"RAIN", "INT_0", "INT_1", "INT_2", "INT_3", "INT_4", "INT_5", "INT_6", 
		"INT_7", "INT_8", "INT_9", "INT_00", "INT_01", "INT_02", "INT_03", "INT_04", 
		"INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "INT_10", "INT_11", 
		"INT_12", "INT_13", "INT_14", "INT_15", "INT_16", "INT_17", "INT_18", 
		"INT_19", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", 
		"INT_26", "INT_27", "INT_28", "INT_29", "INT_30", "INT_31", "INT_32", 
		"INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", 
		"INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", 
		"INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", 
		"INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_60", 
		"INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", 
		"INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", 
		"INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", 
		"INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", 
		"INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", 
		"INT_96", "INT_97", "INT_98", "INT_99", "ONE", "TWO", "THREE", "FOUR", 
		"FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", 
		"FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", 
		"TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", 
		"SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", 
		"FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", 
		"TWENTIETH", "THIRTIETH", "COLON", "SEMICOLON", "COMMA", "DOT", "DASH", 
		"SLASH", "BACK_SLASH", "PLUS", "OPEN_PARENTESES", "CLOSE_PARENTESES", 
		"SINGLE_QUOTE", "DOUBLE_QUOTE", "OPEN_TAG", "CLOSE_TAG", "EQUAL", "PIPE", 
		"UNDERSCORE", "ASTERISK", "AT_SIGN", "QUESTION_MARK", "EXCLAMATION_MARK", 
		"DOLLAR", "PERCENT", "NEGATION", "FOUR_DIGIT", "TWO_DIGIT", "INT", "DIGIT", 
		"ALPHABET", "ALPHANUMERIC", "TEXT", "GENERAL_SYMBOL", "WS"
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
	public String getGrammarFileName() { return "Date.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public List<Formal_date_timeContext> formal_date_time() {
			return getRuleContexts(Formal_date_timeContext.class);
		}
		public Formal_date_timeContext formal_date_time(int i) {
			return getRuleContext(Formal_date_timeContext.class,i);
		}
		public List<Formal_dateContext> formal_date() {
			return getRuleContexts(Formal_dateContext.class);
		}
		public Formal_dateContext formal_date(int i) {
			return getRuleContext(Formal_dateContext.class,i);
		}
		public List<Natural_dateContext> natural_date() {
			return getRuleContexts(Natural_dateContext.class);
		}
		public Natural_dateContext natural_date(int i) {
			return getRuleContext(Natural_dateContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(74);
						matchWildcard();
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(80);
					formal_date_time();
					}
					break;
				case 2:
					{
					setState(81);
					formal_date();
					}
					break;
				case 3:
					{
					setState(82);
					natural_date();
					}
					break;
				}
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << UTC) | (1L << EST) | (1L << PST) | (1L << CST) | (1L << MST) | (1L << AKST) | (1L << HAST) | (1L << WIB) | (1L << WIT) | (1L << WITA) | (1L << AM) | (1L << PM) | (1L << JANUARY) | (1L << FEBRUARY) | (1L << MARCH) | (1L << APRIL) | (1L << MAY) | (1L << JUNE) | (1L << JULY) | (1L << AUGUST) | (1L << SEPTEMBER) | (1L << OCTOBER) | (1L << NOVEMBER) | (1L << DECEMBER) | (1L << SUNDAY) | (1L << MONDAY) | (1L << TUESDAY) | (1L << WEDNESDAY) | (1L << THURSDAY) | (1L << FRIDAY) | (1L << SATURDAY) | (1L << YEAR) | (1L << MONTH) | (1L << WEEK) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << MIDNIGHT) | (1L << NOON) | (1L << MORNING) | (1L << EVENING) | (1L << NIGHT) | (1L << DATE_PREFIX) | (1L << TODAY) | (1L << TOMORROW) | (1L << TONIGHT) | (1L << YESTERDAY) | (1L << FUTURE_PREFIX) | (1L << FUTURE_SUFFIX) | (1L << CURRENT) | (1L << CURRENT_PREFIX) | (1L << CURRENT_SUFFIX) | (1L << PAST_PREFIX) | (1L << PAST_SUFFIX) | (1L << AFTER_TOMORROW) | (1L << T) | (1L << ST) | (1L << ND) | (1L << RD) | (1L << TH) | (1L << WINTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FALL - 64)) | (1L << (AUTUMN - 64)) | (1L << (SPRING - 64)) | (1L << (SUMMER - 64)) | (1L << (RAIN - 64)) | (1L << (INT_0 - 64)) | (1L << (INT_1 - 64)) | (1L << (INT_2 - 64)) | (1L << (INT_3 - 64)) | (1L << (INT_4 - 64)) | (1L << (INT_5 - 64)) | (1L << (INT_6 - 64)) | (1L << (INT_7 - 64)) | (1L << (INT_8 - 64)) | (1L << (INT_9 - 64)) | (1L << (INT_00 - 64)) | (1L << (INT_01 - 64)) | (1L << (INT_02 - 64)) | (1L << (INT_03 - 64)) | (1L << (INT_04 - 64)) | (1L << (INT_05 - 64)) | (1L << (INT_06 - 64)) | (1L << (INT_07 - 64)) | (1L << (INT_08 - 64)) | (1L << (INT_09 - 64)) | (1L << (INT_10 - 64)) | (1L << (INT_11 - 64)) | (1L << (INT_12 - 64)) | (1L << (INT_13 - 64)) | (1L << (INT_14 - 64)) | (1L << (INT_15 - 64)) | (1L << (INT_16 - 64)) | (1L << (INT_17 - 64)) | (1L << (INT_18 - 64)) | (1L << (INT_19 - 64)) | (1L << (INT_20 - 64)) | (1L << (INT_21 - 64)) | (1L << (INT_22 - 64)) | (1L << (INT_23 - 64)) | (1L << (INT_24 - 64)) | (1L << (INT_25 - 64)) | (1L << (INT_26 - 64)) | (1L << (INT_27 - 64)) | (1L << (INT_28 - 64)) | (1L << (INT_29 - 64)) | (1L << (INT_30 - 64)) | (1L << (INT_31 - 64)) | (1L << (INT_32 - 64)) | (1L << (INT_33 - 64)) | (1L << (INT_34 - 64)) | (1L << (INT_35 - 64)) | (1L << (INT_36 - 64)) | (1L << (INT_37 - 64)) | (1L << (INT_38 - 64)) | (1L << (INT_39 - 64)) | (1L << (INT_40 - 64)) | (1L << (INT_41 - 64)) | (1L << (INT_42 - 64)) | (1L << (INT_43 - 64)) | (1L << (INT_44 - 64)) | (1L << (INT_45 - 64)) | (1L << (INT_46 - 64)) | (1L << (INT_47 - 64)) | (1L << (INT_48 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (INT_49 - 128)) | (1L << (INT_50 - 128)) | (1L << (INT_51 - 128)) | (1L << (INT_52 - 128)) | (1L << (INT_53 - 128)) | (1L << (INT_54 - 128)) | (1L << (INT_55 - 128)) | (1L << (INT_56 - 128)) | (1L << (INT_57 - 128)) | (1L << (INT_58 - 128)) | (1L << (INT_59 - 128)) | (1L << (INT_60 - 128)) | (1L << (INT_61 - 128)) | (1L << (INT_62 - 128)) | (1L << (INT_63 - 128)) | (1L << (INT_64 - 128)) | (1L << (INT_65 - 128)) | (1L << (INT_66 - 128)) | (1L << (INT_67 - 128)) | (1L << (INT_68 - 128)) | (1L << (INT_69 - 128)) | (1L << (INT_70 - 128)) | (1L << (INT_71 - 128)) | (1L << (INT_72 - 128)) | (1L << (INT_73 - 128)) | (1L << (INT_74 - 128)) | (1L << (INT_75 - 128)) | (1L << (INT_76 - 128)) | (1L << (INT_77 - 128)) | (1L << (INT_78 - 128)) | (1L << (INT_79 - 128)) | (1L << (INT_80 - 128)) | (1L << (INT_81 - 128)) | (1L << (INT_82 - 128)) | (1L << (INT_83 - 128)) | (1L << (INT_84 - 128)) | (1L << (INT_85 - 128)) | (1L << (INT_86 - 128)) | (1L << (INT_87 - 128)) | (1L << (INT_88 - 128)) | (1L << (INT_89 - 128)) | (1L << (INT_90 - 128)) | (1L << (INT_91 - 128)) | (1L << (INT_92 - 128)) | (1L << (INT_93 - 128)) | (1L << (INT_94 - 128)) | (1L << (INT_95 - 128)) | (1L << (INT_96 - 128)) | (1L << (INT_97 - 128)) | (1L << (INT_98 - 128)) | (1L << (INT_99 - 128)) | (1L << (ONE - 128)) | (1L << (TWO - 128)) | (1L << (THREE - 128)) | (1L << (FOUR - 128)) | (1L << (FIVE - 128)) | (1L << (SIX - 128)) | (1L << (SEVEN - 128)) | (1L << (EIGHT - 128)) | (1L << (NINE - 128)) | (1L << (TEN - 128)) | (1L << (ELEVEN - 128)) | (1L << (TWELVE - 128)) | (1L << (THIRTEEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (FOURTEEN - 192)) | (1L << (FIFTEEN - 192)) | (1L << (SIXTEEN - 192)) | (1L << (SEVENTEEN - 192)) | (1L << (EIGHTEEN - 192)) | (1L << (NINETEEN - 192)) | (1L << (TWENTY - 192)) | (1L << (THIRTY - 192)) | (1L << (FIRST - 192)) | (1L << (SECOND - 192)) | (1L << (THIRD - 192)) | (1L << (FOURTH - 192)) | (1L << (FIFTH - 192)) | (1L << (SIXTH - 192)) | (1L << (SEVENTH - 192)) | (1L << (EIGHTH - 192)) | (1L << (NINTH - 192)) | (1L << (TENTH - 192)) | (1L << (ELEVENTH - 192)) | (1L << (TWELFTH - 192)) | (1L << (THIRTEENTH - 192)) | (1L << (FOURTEENTH - 192)) | (1L << (FIFTEENTH - 192)) | (1L << (SIXTEENTH - 192)) | (1L << (SEVENTEENTH - 192)) | (1L << (EIGHTEENTH - 192)) | (1L << (NINETEENTH - 192)) | (1L << (TWENTIETH - 192)) | (1L << (THIRTIETH - 192)) | (1L << (COLON - 192)) | (1L << (SEMICOLON - 192)) | (1L << (COMMA - 192)) | (1L << (DOT - 192)) | (1L << (DASH - 192)) | (1L << (SLASH - 192)) | (1L << (BACK_SLASH - 192)) | (1L << (PLUS - 192)) | (1L << (OPEN_PARENTESES - 192)) | (1L << (CLOSE_PARENTESES - 192)) | (1L << (SINGLE_QUOTE - 192)) | (1L << (DOUBLE_QUOTE - 192)) | (1L << (OPEN_TAG - 192)) | (1L << (CLOSE_TAG - 192)) | (1L << (EQUAL - 192)) | (1L << (PIPE - 192)) | (1L << (UNDERSCORE - 192)) | (1L << (ASTERISK - 192)) | (1L << (AT_SIGN - 192)) | (1L << (QUESTION_MARK - 192)) | (1L << (EXCLAMATION_MARK - 192)) | (1L << (DOLLAR - 192)) | (1L << (PERCENT - 192)) | (1L << (NEGATION - 192)) | (1L << (FOUR_DIGIT - 192)) | (1L << (TWO_DIGIT - 192)) | (1L << (INT - 192)) | (1L << (DIGIT - 192)) | (1L << (ALPHABET - 192)) | (1L << (ALPHANUMERIC - 192)) | (1L << (TEXT - 192)) | (1L << (GENERAL_SYMBOL - 192)) | (1L << (WS - 192)))) != 0) );
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

	public static class Formal_date_timeContext extends ParserRuleContext {
		public Formal_dateContext formal_date() {
			return getRuleContext(Formal_dateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Formal_date_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_date_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterFormal_date_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitFormal_date_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitFormal_date_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_date_timeContext formal_date_time() throws RecognitionException {
		Formal_date_timeContext _localctx = new Formal_date_timeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formal_date_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			formal_date();
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(90);
				matchWildcard();
				}
				break;
			}
			setState(93);
			time();
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

	public static class Formal_dateContext extends ParserRuleContext {
		public Year_month_dayContext year_month_day() {
			return getRuleContext(Year_month_dayContext.class,0);
		}
		public Month_day_yearContext month_day_year() {
			return getRuleContext(Month_day_yearContext.class,0);
		}
		public Day_month_yearContext day_month_year() {
			return getRuleContext(Day_month_yearContext.class,0);
		}
		public Day_monthContext day_month() {
			return getRuleContext(Day_monthContext.class,0);
		}
		public Month_dayContext month_day() {
			return getRuleContext(Month_dayContext.class,0);
		}
		public Formal_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterFormal_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitFormal_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitFormal_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_dateContext formal_date() throws RecognitionException {
		Formal_dateContext _localctx = new Formal_dateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal_date);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				year_month_day();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				month_day_year();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				day_month_year();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				day_month();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				month_day();
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

	public static class Natural_dateContext extends ParserRuleContext {
		public Relative_dateContext relative_date() {
			return getRuleContext(Relative_dateContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(DateParser.CURRENT, 0); }
		public TerminalNode TODAY() { return getToken(DateParser.TODAY, 0); }
		public TerminalNode TOMORROW() { return getToken(DateParser.TOMORROW, 0); }
		public TerminalNode TONIGHT() { return getToken(DateParser.TONIGHT, 0); }
		public TerminalNode AFTER_TOMORROW() { return getToken(DateParser.AFTER_TOMORROW, 0); }
		public TerminalNode YESTERDAY() { return getToken(DateParser.YESTERDAY, 0); }
		public Natural_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterNatural_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitNatural_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitNatural_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Natural_dateContext natural_date() throws RecognitionException {
		Natural_dateContext _localctx = new Natural_dateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_natural_date);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case JANUARY:
			case FEBRUARY:
			case MARCH:
			case APRIL:
			case MAY:
			case JUNE:
			case JULY:
			case AUGUST:
			case SEPTEMBER:
			case OCTOBER:
			case NOVEMBER:
			case DECEMBER:
			case SUNDAY:
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
			case SATURDAY:
			case YEAR:
			case MONTH:
			case WEEK:
			case FUTURE_PREFIX:
			case PAST_PREFIX:
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
			case INT_00:
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
			case INT_32:
			case INT_33:
			case INT_34:
			case INT_35:
			case INT_36:
			case INT_37:
			case INT_38:
			case INT_39:
			case INT_40:
			case INT_41:
			case INT_42:
			case INT_43:
			case INT_44:
			case INT_45:
			case INT_46:
			case INT_47:
			case INT_48:
			case INT_49:
			case INT_50:
			case INT_51:
			case INT_52:
			case INT_53:
			case INT_54:
			case INT_55:
			case INT_56:
			case INT_57:
			case INT_58:
			case INT_59:
			case INT_60:
			case INT_61:
			case INT_62:
			case INT_63:
			case INT_64:
			case INT_65:
			case INT_66:
			case INT_67:
			case INT_68:
			case INT_69:
			case INT_70:
			case INT_71:
			case INT_72:
			case INT_73:
			case INT_74:
			case INT_75:
			case INT_76:
			case INT_77:
			case INT_78:
			case INT_79:
			case INT_80:
			case INT_81:
			case INT_82:
			case INT_83:
			case INT_84:
			case INT_85:
			case INT_86:
			case INT_87:
			case INT_88:
			case INT_89:
			case INT_90:
			case INT_91:
			case INT_92:
			case INT_93:
			case INT_94:
			case INT_95:
			case INT_96:
			case INT_97:
			case INT_98:
			case INT_99:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
			case ELEVEN:
			case TWELVE:
			case THIRTEEN:
			case FOURTEEN:
			case FIFTEEN:
			case SIXTEEN:
			case SEVENTEEN:
			case EIGHTEEN:
			case NINETEEN:
			case TWENTY:
			case THIRTY:
			case FIRST:
			case SECOND:
			case THIRD:
			case FOURTH:
			case FIFTH:
			case SIXTH:
			case SEVENTH:
			case EIGHTH:
			case NINTH:
			case TENTH:
			case ELEVENTH:
			case TWELFTH:
			case THIRTEENTH:
			case FOURTEENTH:
			case FIFTEENTH:
			case SIXTEENTH:
			case SEVENTEENTH:
			case EIGHTEENTH:
			case NINETEENTH:
			case TWENTIETH:
			case THIRTIETH:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				relative_date();
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(CURRENT);
				}
				break;
			case TODAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(TODAY);
				}
				break;
			case TOMORROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(TOMORROW);
				}
				break;
			case TONIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(TONIGHT);
				}
				break;
			case AFTER_TOMORROW:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(AFTER_TOMORROW);
				}
				break;
			case YESTERDAY:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				match(YESTERDAY);
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

	public static class Relative_dateContext extends ParserRuleContext {
		public Relative_date_pastContext relative_date_past() {
			return getRuleContext(Relative_date_pastContext.class,0);
		}
		public Relative_date_futureContext relative_date_future() {
			return getRuleContext(Relative_date_futureContext.class,0);
		}
		public Week_of_monthContext week_of_month() {
			return getRuleContext(Week_of_monthContext.class,0);
		}
		public Month_yearContext month_year() {
			return getRuleContext(Month_yearContext.class,0);
		}
		public TerminalNode MONTH() { return getToken(DateParser.MONTH, 0); }
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public TerminalNode YEAR() { return getToken(DateParser.YEAR, 0); }
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Relative_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterRelative_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitRelative_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitRelative_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relative_dateContext relative_date() throws RecognitionException {
		Relative_dateContext _localctx = new Relative_dateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relative_date);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				relative_date_past();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				relative_date_future();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				week_of_month();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				month_year();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(MONTH);
				setState(116);
				month();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(YEAR);
				setState(118);
				year();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				time();
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

	public static class Relative_date_pastContext extends ParserRuleContext {
		public TerminalNode PAST_PREFIX() { return getToken(DateParser.PAST_PREFIX, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode YEAR() { return getToken(DateParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DateParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(DateParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(DateParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DateParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DateParser.MINUTE, 0); }
		public TerminalNode PAST_SUFFIX() { return getToken(DateParser.PAST_SUFFIX, 0); }
		public Relative_date_pastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_date_past; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterRelative_date_past(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitRelative_date_past(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitRelative_date_past(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relative_date_pastContext relative_date_past() throws RecognitionException {
		Relative_date_pastContext _localctx = new Relative_date_pastContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relative_date_past);
		int _la;
		try {
			int _alt;
			setState(142);
			switch (_input.LA(1)) {
			case PAST_PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(PAST_PREFIX);
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(123);
						matchWildcard();
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(129);
				interval();
				setState(130);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << WEEK) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__0:
			case T__1:
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
			case INT_00:
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
			case INT_32:
			case INT_33:
			case INT_34:
			case INT_35:
			case INT_36:
			case INT_37:
			case INT_38:
			case INT_39:
			case INT_40:
			case INT_41:
			case INT_42:
			case INT_43:
			case INT_44:
			case INT_45:
			case INT_46:
			case INT_47:
			case INT_48:
			case INT_49:
			case INT_50:
			case INT_51:
			case INT_52:
			case INT_53:
			case INT_54:
			case INT_55:
			case INT_56:
			case INT_57:
			case INT_58:
			case INT_59:
			case INT_60:
			case INT_61:
			case INT_62:
			case INT_63:
			case INT_64:
			case INT_65:
			case INT_66:
			case INT_67:
			case INT_68:
			case INT_69:
			case INT_70:
			case INT_71:
			case INT_72:
			case INT_73:
			case INT_74:
			case INT_75:
			case INT_76:
			case INT_77:
			case INT_78:
			case INT_79:
			case INT_80:
			case INT_81:
			case INT_82:
			case INT_83:
			case INT_84:
			case INT_85:
			case INT_86:
			case INT_87:
			case INT_88:
			case INT_89:
			case INT_90:
			case INT_91:
			case INT_92:
			case INT_93:
			case INT_94:
			case INT_95:
			case INT_96:
			case INT_97:
			case INT_98:
			case INT_99:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
			case ELEVEN:
			case TWELVE:
			case THIRTEEN:
			case FOURTEEN:
			case FIFTEEN:
			case SIXTEEN:
			case SEVENTEEN:
			case EIGHTEEN:
			case NINETEEN:
			case TWENTY:
			case THIRTY:
			case FIRST:
			case SECOND:
			case THIRD:
			case FOURTH:
			case FIFTH:
			case SIXTH:
			case SEVENTH:
			case EIGHTH:
			case NINTH:
			case TENTH:
			case ELEVENTH:
			case TWELFTH:
			case THIRTEENTH:
			case FOURTEENTH:
			case FIFTEENTH:
			case SIXTEENTH:
			case SEVENTEENTH:
			case EIGHTEENTH:
			case NINETEENTH:
			case TWENTIETH:
			case THIRTIETH:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				interval();
				setState(133);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << WEEK) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(134);
						matchWildcard();
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(140);
				match(PAST_SUFFIX);
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

	public static class Relative_date_futureContext extends ParserRuleContext {
		public TerminalNode FUTURE_PREFIX() { return getToken(DateParser.FUTURE_PREFIX, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode YEAR() { return getToken(DateParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DateParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(DateParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(DateParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DateParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DateParser.MINUTE, 0); }
		public TerminalNode FUTURE_SUFFIX() { return getToken(DateParser.FUTURE_SUFFIX, 0); }
		public Relative_date_futureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative_date_future; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterRelative_date_future(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitRelative_date_future(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitRelative_date_future(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relative_date_futureContext relative_date_future() throws RecognitionException {
		Relative_date_futureContext _localctx = new Relative_date_futureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relative_date_future);
		int _la;
		try {
			int _alt;
			setState(164);
			switch (_input.LA(1)) {
			case FUTURE_PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(FUTURE_PREFIX);
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(145);
						matchWildcard();
						}
						} 
					}
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(151);
				interval();
				setState(152);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << WEEK) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__0:
			case T__1:
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
			case INT_00:
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
			case INT_32:
			case INT_33:
			case INT_34:
			case INT_35:
			case INT_36:
			case INT_37:
			case INT_38:
			case INT_39:
			case INT_40:
			case INT_41:
			case INT_42:
			case INT_43:
			case INT_44:
			case INT_45:
			case INT_46:
			case INT_47:
			case INT_48:
			case INT_49:
			case INT_50:
			case INT_51:
			case INT_52:
			case INT_53:
			case INT_54:
			case INT_55:
			case INT_56:
			case INT_57:
			case INT_58:
			case INT_59:
			case INT_60:
			case INT_61:
			case INT_62:
			case INT_63:
			case INT_64:
			case INT_65:
			case INT_66:
			case INT_67:
			case INT_68:
			case INT_69:
			case INT_70:
			case INT_71:
			case INT_72:
			case INT_73:
			case INT_74:
			case INT_75:
			case INT_76:
			case INT_77:
			case INT_78:
			case INT_79:
			case INT_80:
			case INT_81:
			case INT_82:
			case INT_83:
			case INT_84:
			case INT_85:
			case INT_86:
			case INT_87:
			case INT_88:
			case INT_89:
			case INT_90:
			case INT_91:
			case INT_92:
			case INT_93:
			case INT_94:
			case INT_95:
			case INT_96:
			case INT_97:
			case INT_98:
			case INT_99:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
			case ELEVEN:
			case TWELVE:
			case THIRTEEN:
			case FOURTEEN:
			case FIFTEEN:
			case SIXTEEN:
			case SEVENTEEN:
			case EIGHTEEN:
			case NINETEEN:
			case TWENTY:
			case THIRTY:
			case FIRST:
			case SECOND:
			case THIRD:
			case FOURTH:
			case FIFTH:
			case SIXTH:
			case SEVENTH:
			case EIGHTH:
			case NINTH:
			case TENTH:
			case ELEVENTH:
			case TWELFTH:
			case THIRTEENTH:
			case FOURTEENTH:
			case FIFTEENTH:
			case SIXTEENTH:
			case SEVENTEENTH:
			case EIGHTEENTH:
			case NINETEENTH:
			case TWENTIETH:
			case THIRTIETH:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				interval();
				setState(155);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << WEEK) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(156);
						matchWildcard();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(162);
				match(FUTURE_SUFFIX);
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

	public static class Week_of_monthContext extends ParserRuleContext {
		public Day_of_weekContext day_of_week() {
			return getRuleContext(Day_of_weekContext.class,0);
		}
		public WeekContext week() {
			return getRuleContext(WeekContext.class,0);
		}
		public TerminalNode WEEK() { return getToken(DateParser.WEEK, 0); }
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public TerminalNode MONTH() { return getToken(DateParser.MONTH, 0); }
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public TerminalNode YEAR() { return getToken(DateParser.YEAR, 0); }
		public Week_of_monthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_week_of_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterWeek_of_month(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitWeek_of_month(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitWeek_of_month(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Week_of_monthContext week_of_month() throws RecognitionException {
		Week_of_monthContext _localctx = new Week_of_monthContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_week_of_month);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				day_of_week();
				setState(167);
				week();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUNDAY) | (1L << MONDAY) | (1L << TUESDAY) | (1L << WEDNESDAY) | (1L << THURSDAY) | (1L << FRIDAY) | (1L << SATURDAY))) != 0)) {
					{
					setState(169);
					day_of_week();
					}
				}

				setState(172);
				week();
				setState(173);
				match(WEEK);
				setState(175);
				_la = _input.LA(1);
				if (_la==MONTH) {
					{
					setState(174);
					match(MONTH);
					}
				}

				setState(177);
				month();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUNDAY) | (1L << MONDAY) | (1L << TUESDAY) | (1L << WEDNESDAY) | (1L << THURSDAY) | (1L << FRIDAY) | (1L << SATURDAY))) != 0)) {
					{
					setState(179);
					day_of_week();
					}
				}

				setState(182);
				match(WEEK);
				setState(183);
				week();
				setState(185);
				_la = _input.LA(1);
				if (_la==MONTH) {
					{
					setState(184);
					match(MONTH);
					}
				}

				setState(187);
				month();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUNDAY) | (1L << MONDAY) | (1L << TUESDAY) | (1L << WEDNESDAY) | (1L << THURSDAY) | (1L << FRIDAY) | (1L << SATURDAY))) != 0)) {
					{
					setState(189);
					day_of_week();
					}
				}

				setState(192);
				week();
				setState(193);
				match(WEEK);
				setState(195);
				_la = _input.LA(1);
				if (_la==YEAR) {
					{
					setState(194);
					match(YEAR);
					}
				}

				setState(197);
				year();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUNDAY) | (1L << MONDAY) | (1L << TUESDAY) | (1L << WEDNESDAY) | (1L << THURSDAY) | (1L << FRIDAY) | (1L << SATURDAY))) != 0)) {
					{
					setState(199);
					day_of_week();
					}
				}

				setState(202);
				match(WEEK);
				setState(203);
				week();
				setState(205);
				_la = _input.LA(1);
				if (_la==YEAR) {
					{
					setState(204);
					match(YEAR);
					}
				}

				setState(207);
				year();
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

	public static class WeekContext extends ParserRuleContext {
		public String w;
		public Spelling_weekContext spelling_week;
		public Numeric_weekContext numeric_week;
		public Spelling_weekContext spelling_week() {
			return getRuleContext(Spelling_weekContext.class,0);
		}
		public Numeric_weekContext numeric_week() {
			return getRuleContext(Numeric_weekContext.class,0);
		}
		public WeekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_week; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterWeek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitWeek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitWeek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeekContext week() throws RecognitionException {
		WeekContext _localctx = new WeekContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_week);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case FIRST:
			case SECOND:
			case THIRD:
			case FOURTH:
			case FIFTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((WeekContext)_localctx).spelling_week = spelling_week();
				((WeekContext)_localctx).w =  ((WeekContext)_localctx).spelling_week.num;
				}
				break;
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((WeekContext)_localctx).numeric_week = numeric_week();
				((WeekContext)_localctx).w =  (((WeekContext)_localctx).numeric_week!=null?_input.getText(((WeekContext)_localctx).numeric_week.start,((WeekContext)_localctx).numeric_week.stop):null);
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

	public static class Day_of_weekContext extends ParserRuleContext {
		public int d;
		public TerminalNode MONDAY() { return getToken(DateParser.MONDAY, 0); }
		public TerminalNode TUESDAY() { return getToken(DateParser.TUESDAY, 0); }
		public TerminalNode WEDNESDAY() { return getToken(DateParser.WEDNESDAY, 0); }
		public TerminalNode THURSDAY() { return getToken(DateParser.THURSDAY, 0); }
		public TerminalNode FRIDAY() { return getToken(DateParser.FRIDAY, 0); }
		public TerminalNode SATURDAY() { return getToken(DateParser.SATURDAY, 0); }
		public TerminalNode SUNDAY() { return getToken(DateParser.SUNDAY, 0); }
		public Day_of_weekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_of_week; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterDay_of_week(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitDay_of_week(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitDay_of_week(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Day_of_weekContext day_of_week() throws RecognitionException {
		Day_of_weekContext _localctx = new Day_of_weekContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_day_of_week);
		try {
			setState(233);
			switch (_input.LA(1)) {
			case MONDAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(MONDAY);
				((Day_of_weekContext)_localctx).d = 1;
				}
				break;
			case TUESDAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(TUESDAY);
				((Day_of_weekContext)_localctx).d = 2;
				}
				break;
			case WEDNESDAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(WEDNESDAY);
				((Day_of_weekContext)_localctx).d = 3;
				}
				break;
			case THURSDAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(THURSDAY);
				((Day_of_weekContext)_localctx).d = 4;
				}
				break;
			case FRIDAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(FRIDAY);
				((Day_of_weekContext)_localctx).d = 5;
				}
				break;
			case SATURDAY:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				match(SATURDAY);
				((Day_of_weekContext)_localctx).d = 6;
				}
				break;
			case SUNDAY:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				match(SUNDAY);
				((Day_of_weekContext)_localctx).d = 7;
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

	public static class Year_month_dayContext extends ParserRuleContext {
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public Month_dayContext month_day() {
			return getRuleContext(Month_dayContext.class,0);
		}
		public Date_separatorContext date_separator() {
			return getRuleContext(Date_separatorContext.class,0);
		}
		public Year_month_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year_month_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterYear_month_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitYear_month_day(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitYear_month_day(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Year_month_dayContext year_month_day() throws RecognitionException {
		Year_month_dayContext _localctx = new Year_month_dayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_year_month_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			year();
			setState(237);
			_la = _input.LA(1);
			if (((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (COLON - 221)) | (1L << (COMMA - 221)) | (1L << (DOT - 221)) | (1L << (DASH - 221)) | (1L << (SLASH - 221)))) != 0)) {
				{
				setState(236);
				date_separator();
				}
			}

			setState(239);
			month_day();
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

	public static class Day_month_yearContext extends ParserRuleContext {
		public Day_monthContext day_month() {
			return getRuleContext(Day_monthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public Date_separatorContext date_separator() {
			return getRuleContext(Date_separatorContext.class,0);
		}
		public Day_month_yearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_month_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterDay_month_year(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitDay_month_year(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitDay_month_year(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Day_month_yearContext day_month_year() throws RecognitionException {
		Day_month_yearContext _localctx = new Day_month_yearContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_day_month_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			day_month();
			setState(243);
			_la = _input.LA(1);
			if (((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (COLON - 221)) | (1L << (COMMA - 221)) | (1L << (DOT - 221)) | (1L << (DASH - 221)) | (1L << (SLASH - 221)))) != 0)) {
				{
				setState(242);
				date_separator();
				}
			}

			setState(245);
			year();
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

	public static class Month_day_yearContext extends ParserRuleContext {
		public Month_dayContext month_day() {
			return getRuleContext(Month_dayContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public Date_separatorContext date_separator() {
			return getRuleContext(Date_separatorContext.class,0);
		}
		public Month_day_yearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month_day_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterMonth_day_year(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitMonth_day_year(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitMonth_day_year(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Month_day_yearContext month_day_year() throws RecognitionException {
		Month_day_yearContext _localctx = new Month_day_yearContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_month_day_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			month_day();
			setState(249);
			_la = _input.LA(1);
			if (((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (COLON - 221)) | (1L << (COMMA - 221)) | (1L << (DOT - 221)) | (1L << (DASH - 221)) | (1L << (SLASH - 221)))) != 0)) {
				{
				setState(248);
				date_separator();
				}
			}

			setState(251);
			year();
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

	public static class Day_monthContext extends ParserRuleContext {
		public Day_of_monthContext day_of_month() {
			return getRuleContext(Day_of_monthContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public Date_separatorContext date_separator() {
			return getRuleContext(Date_separatorContext.class,0);
		}
		public Day_monthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterDay_month(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitDay_month(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitDay_month(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Day_monthContext day_month() throws RecognitionException {
		Day_monthContext _localctx = new Day_monthContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_day_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			day_of_month();
			setState(255);
			_la = _input.LA(1);
			if (((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (COLON - 221)) | (1L << (COMMA - 221)) | (1L << (DOT - 221)) | (1L << (DASH - 221)) | (1L << (SLASH - 221)))) != 0)) {
				{
				setState(254);
				date_separator();
				}
			}

			setState(257);
			month();
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

	public static class Month_dayContext extends ParserRuleContext {
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public Day_of_monthContext day_of_month() {
			return getRuleContext(Day_of_monthContext.class,0);
		}
		public Date_separatorContext date_separator() {
			return getRuleContext(Date_separatorContext.class,0);
		}
		public Month_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterMonth_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitMonth_day(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitMonth_day(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Month_dayContext month_day() throws RecognitionException {
		Month_dayContext _localctx = new Month_dayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_month_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			month();
			setState(261);
			_la = _input.LA(1);
			if (((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (COLON - 221)) | (1L << (COMMA - 221)) | (1L << (DOT - 221)) | (1L << (DASH - 221)) | (1L << (SLASH - 221)))) != 0)) {
				{
				setState(260);
				date_separator();
				}
			}

			setState(263);
			day_of_month();
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

	public static class Month_yearContext extends ParserRuleContext {
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public Date_separatorContext date_separator() {
			return getRuleContext(Date_separatorContext.class,0);
		}
		public Month_yearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterMonth_year(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitMonth_year(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitMonth_year(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Month_yearContext month_year() throws RecognitionException {
		Month_yearContext _localctx = new Month_yearContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_month_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			month();
			setState(267);
			_la = _input.LA(1);
			if (((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (COLON - 221)) | (1L << (COMMA - 221)) | (1L << (DOT - 221)) | (1L << (DASH - 221)) | (1L << (SLASH - 221)))) != 0)) {
				{
				setState(266);
				date_separator();
				}
			}

			setState(269);
			year();
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

	public static class Day_of_monthContext extends ParserRuleContext {
		public String day;
		public Numeric_dayContext numeric_day;
		public Spelling_dateContext spelling_date;
		public Numeric_dayContext numeric_day() {
			return getRuleContext(Numeric_dayContext.class,0);
		}
		public Spelling_dateContext spelling_date() {
			return getRuleContext(Spelling_dateContext.class,0);
		}
		public Day_of_monthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_of_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterDay_of_month(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitDay_of_month(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitDay_of_month(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Day_of_monthContext day_of_month() throws RecognitionException {
		Day_of_monthContext _localctx = new Day_of_monthContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_day_of_month);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((Day_of_monthContext)_localctx).numeric_day = numeric_day();
				((Day_of_monthContext)_localctx).day =  (((Day_of_monthContext)_localctx).numeric_day!=null?_input.getText(((Day_of_monthContext)_localctx).numeric_day.start,((Day_of_monthContext)_localctx).numeric_day.stop):null);
				}
				break;
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
			case ELEVEN:
			case TWELVE:
			case THIRTEEN:
			case FOURTEEN:
			case FIFTEEN:
			case SIXTEEN:
			case SEVENTEEN:
			case EIGHTEEN:
			case NINETEEN:
			case TWENTY:
			case THIRTY:
			case FIRST:
			case SECOND:
			case THIRD:
			case FOURTH:
			case FIFTH:
			case SIXTH:
			case SEVENTH:
			case EIGHTH:
			case NINTH:
			case TENTH:
			case ELEVENTH:
			case TWELFTH:
			case THIRTEENTH:
			case FOURTEENTH:
			case FIFTEENTH:
			case SIXTEENTH:
			case SEVENTEENTH:
			case EIGHTEENTH:
			case NINETEENTH:
			case TWENTIETH:
			case THIRTIETH:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				((Day_of_monthContext)_localctx).spelling_date = spelling_date();
				((Day_of_monthContext)_localctx).day =  ((Day_of_monthContext)_localctx).spelling_date.num;
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

	public static class TimeContext extends ParserRuleContext {
		public Hour_minuteContext hour_minute() {
			return getRuleContext(Hour_minuteContext.class,0);
		}
		public Am_pmContext am_pm() {
			return getRuleContext(Am_pmContext.class,0);
		}
		public TimezoneContext timezone() {
			return getRuleContext(TimezoneContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_time);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				hour_minute();
				setState(280);
				am_pm();
				setState(281);
				timezone();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				hour_minute();
				setState(284);
				am_pm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				hour_minute();
				setState(287);
				timezone();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				hour_minute();
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

	public static class Hour_minuteContext extends ParserRuleContext {
		public Numeric_hourContext numeric_hour() {
			return getRuleContext(Numeric_hourContext.class,0);
		}
		public Date_separatorContext date_separator() {
			return getRuleContext(Date_separatorContext.class,0);
		}
		public Numeric_minuteContext numeric_minute() {
			return getRuleContext(Numeric_minuteContext.class,0);
		}
		public Hour_minuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterHour_minute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitHour_minute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitHour_minute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hour_minuteContext hour_minute() throws RecognitionException {
		Hour_minuteContext _localctx = new Hour_minuteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_hour_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			numeric_hour();
			setState(293);
			date_separator();
			setState(294);
			numeric_minute();
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

	public static class MonthContext extends ParserRuleContext {
		public String mm;
		public Vocal_monthContext vocal_month;
		public Numeric_monthContext numeric_month;
		public Vocal_monthContext vocal_month() {
			return getRuleContext(Vocal_monthContext.class,0);
		}
		public Numeric_monthContext numeric_month() {
			return getRuleContext(Numeric_monthContext.class,0);
		}
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_month);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case JANUARY:
			case FEBRUARY:
			case MARCH:
			case APRIL:
			case MAY:
			case JUNE:
			case JULY:
			case AUGUST:
			case SEPTEMBER:
			case OCTOBER:
			case NOVEMBER:
			case DECEMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				((MonthContext)_localctx).vocal_month = vocal_month();
				((MonthContext)_localctx).mm =  ((MonthContext)_localctx).vocal_month.num;
				}
				break;
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				((MonthContext)_localctx).numeric_month = numeric_month();
				((MonthContext)_localctx).mm =  (((MonthContext)_localctx).numeric_month!=null?_input.getText(((MonthContext)_localctx).numeric_month.start,((MonthContext)_localctx).numeric_month.stop):null);
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

	public static class Vocal_monthContext extends ParserRuleContext {
		public String num;
		public TerminalNode JANUARY() { return getToken(DateParser.JANUARY, 0); }
		public TerminalNode FEBRUARY() { return getToken(DateParser.FEBRUARY, 0); }
		public TerminalNode MARCH() { return getToken(DateParser.MARCH, 0); }
		public TerminalNode APRIL() { return getToken(DateParser.APRIL, 0); }
		public TerminalNode MAY() { return getToken(DateParser.MAY, 0); }
		public TerminalNode JUNE() { return getToken(DateParser.JUNE, 0); }
		public TerminalNode JULY() { return getToken(DateParser.JULY, 0); }
		public TerminalNode AUGUST() { return getToken(DateParser.AUGUST, 0); }
		public TerminalNode SEPTEMBER() { return getToken(DateParser.SEPTEMBER, 0); }
		public TerminalNode OCTOBER() { return getToken(DateParser.OCTOBER, 0); }
		public TerminalNode NOVEMBER() { return getToken(DateParser.NOVEMBER, 0); }
		public TerminalNode DECEMBER() { return getToken(DateParser.DECEMBER, 0); }
		public Vocal_monthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vocal_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterVocal_month(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitVocal_month(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitVocal_month(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vocal_monthContext vocal_month() throws RecognitionException {
		Vocal_monthContext _localctx = new Vocal_monthContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vocal_month);
		try {
			setState(328);
			switch (_input.LA(1)) {
			case JANUARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(JANUARY);
				((Vocal_monthContext)_localctx).num =  "1";
				}
				break;
			case FEBRUARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(FEBRUARY);
				((Vocal_monthContext)_localctx).num =  "2";
				}
				break;
			case MARCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(MARCH);
				((Vocal_monthContext)_localctx).num =  "3";
				}
				break;
			case APRIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(APRIL);
				((Vocal_monthContext)_localctx).num =  "4";
				}
				break;
			case MAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				match(MAY);
				((Vocal_monthContext)_localctx).num =  "5";
				}
				break;
			case JUNE:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				match(JUNE);
				((Vocal_monthContext)_localctx).num =  "6";
				}
				break;
			case JULY:
				enterOuterAlt(_localctx, 7);
				{
				setState(316);
				match(JULY);
				((Vocal_monthContext)_localctx).num =  "7";
				}
				break;
			case AUGUST:
				enterOuterAlt(_localctx, 8);
				{
				setState(318);
				match(AUGUST);
				((Vocal_monthContext)_localctx).num =  "8";
				}
				break;
			case SEPTEMBER:
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				match(SEPTEMBER);
				((Vocal_monthContext)_localctx).num =  "9";
				}
				break;
			case OCTOBER:
				enterOuterAlt(_localctx, 10);
				{
				setState(322);
				match(OCTOBER);
				((Vocal_monthContext)_localctx).num =  "10";
				}
				break;
			case NOVEMBER:
				enterOuterAlt(_localctx, 11);
				{
				setState(324);
				match(NOVEMBER);
				((Vocal_monthContext)_localctx).num =  "11";
				}
				break;
			case DECEMBER:
				enterOuterAlt(_localctx, 12);
				{
				setState(326);
				match(DECEMBER);
				((Vocal_monthContext)_localctx).num =  "12";
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

	public static class YearContext extends ParserRuleContext {
		public TerminalNode FOUR_DIGIT() { return getToken(DateParser.FOUR_DIGIT, 0); }
		public Numeric_yearContext numeric_year() {
			return getRuleContext(Numeric_yearContext.class,0);
		}
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_year);
		try {
			setState(332);
			switch (_input.LA(1)) {
			case FOUR_DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(FOUR_DIGIT);
				}
				break;
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
			case INT_00:
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
			case INT_32:
			case INT_33:
			case INT_34:
			case INT_35:
			case INT_36:
			case INT_37:
			case INT_38:
			case INT_39:
			case INT_40:
			case INT_41:
			case INT_42:
			case INT_43:
			case INT_44:
			case INT_45:
			case INT_46:
			case INT_47:
			case INT_48:
			case INT_49:
			case INT_50:
			case INT_51:
			case INT_52:
			case INT_53:
			case INT_54:
			case INT_55:
			case INT_56:
			case INT_57:
			case INT_58:
			case INT_59:
			case INT_60:
			case INT_61:
			case INT_62:
			case INT_63:
			case INT_64:
			case INT_65:
			case INT_66:
			case INT_67:
			case INT_68:
			case INT_69:
			case INT_70:
			case INT_71:
			case INT_72:
			case INT_73:
			case INT_74:
			case INT_75:
			case INT_76:
			case INT_77:
			case INT_78:
			case INT_79:
			case INT_80:
			case INT_81:
			case INT_82:
			case INT_83:
			case INT_84:
			case INT_85:
			case INT_86:
			case INT_87:
			case INT_88:
			case INT_89:
			case INT_90:
			case INT_91:
			case INT_92:
			case INT_93:
			case INT_94:
			case INT_95:
			case INT_96:
			case INT_97:
			case INT_98:
			case INT_99:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				numeric_year();
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

	public static class Am_pmContext extends ParserRuleContext {
		public String ampm;
		public TerminalNode AM() { return getToken(DateParser.AM, 0); }
		public TerminalNode PM() { return getToken(DateParser.PM, 0); }
		public Am_pmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_am_pm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterAm_pm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitAm_pm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitAm_pm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Am_pmContext am_pm() throws RecognitionException {
		Am_pmContext _localctx = new Am_pmContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_am_pm);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case AM:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(AM);
				((Am_pmContext)_localctx).ampm =  "AM";
				}
				break;
			case PM:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(PM);
				((Am_pmContext)_localctx).ampm =  "PM";
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

	public static class TimezoneContext extends ParserRuleContext {
		public String tz;
		public Timezone_plus_offsetContext timezone_plus_offset;
		public Timezone_abbeviationContext timezone_abbeviation;
		public Timezone_plus_offsetContext timezone_plus_offset() {
			return getRuleContext(Timezone_plus_offsetContext.class,0);
		}
		public Timezone_abbeviationContext timezone_abbeviation() {
			return getRuleContext(Timezone_abbeviationContext.class,0);
		}
		public TimezoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timezone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterTimezone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitTimezone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitTimezone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimezoneContext timezone() throws RecognitionException {
		TimezoneContext _localctx = new TimezoneContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_timezone);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				((TimezoneContext)_localctx).timezone_plus_offset = timezone_plus_offset();
				((TimezoneContext)_localctx).tz =  (((TimezoneContext)_localctx).timezone_plus_offset!=null?_input.getText(((TimezoneContext)_localctx).timezone_plus_offset.start,((TimezoneContext)_localctx).timezone_plus_offset.stop):null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				((TimezoneContext)_localctx).timezone_abbeviation = timezone_abbeviation();
				((TimezoneContext)_localctx).tz =  ((TimezoneContext)_localctx).timezone_abbeviation.tz;
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

	public static class Timezone_plus_offsetContext extends ParserRuleContext {
		public Time_zone_offsetContext time_zone_offset() {
			return getRuleContext(Time_zone_offsetContext.class,0);
		}
		public TerminalNode UTC() { return getToken(DateParser.UTC, 0); }
		public Timezone_plus_offsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timezone_plus_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterTimezone_plus_offset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitTimezone_plus_offset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitTimezone_plus_offset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timezone_plus_offsetContext timezone_plus_offset() throws RecognitionException {
		Timezone_plus_offsetContext _localctx = new Timezone_plus_offsetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_timezone_plus_offset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if (_la==UTC) {
				{
				setState(348);
				match(UTC);
				}
			}

			setState(351);
			time_zone_offset();
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

	public static class Time_zone_offsetContext extends ParserRuleContext {
		public Hour_minuteContext hour_minute() {
			return getRuleContext(Hour_minuteContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DateParser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(DateParser.DASH, 0); }
		public Time_zone_offsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_zone_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterTime_zone_offset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitTime_zone_offset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitTime_zone_offset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_zone_offsetContext time_zone_offset() throws RecognitionException {
		Time_zone_offsetContext _localctx = new Time_zone_offsetContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_time_zone_offset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==DASH || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(354);
			hour_minute();
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

	public static class Timezone_abbeviationContext extends ParserRuleContext {
		public String tz;
		public TerminalNode UTC() { return getToken(DateParser.UTC, 0); }
		public TerminalNode MST() { return getToken(DateParser.MST, 0); }
		public TerminalNode EST() { return getToken(DateParser.EST, 0); }
		public TerminalNode PST() { return getToken(DateParser.PST, 0); }
		public TerminalNode CST() { return getToken(DateParser.CST, 0); }
		public TerminalNode AKST() { return getToken(DateParser.AKST, 0); }
		public TerminalNode HAST() { return getToken(DateParser.HAST, 0); }
		public TerminalNode WIB() { return getToken(DateParser.WIB, 0); }
		public TerminalNode WITA() { return getToken(DateParser.WITA, 0); }
		public TerminalNode WIT() { return getToken(DateParser.WIT, 0); }
		public Timezone_abbeviationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timezone_abbeviation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterTimezone_abbeviation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitTimezone_abbeviation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitTimezone_abbeviation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timezone_abbeviationContext timezone_abbeviation() throws RecognitionException {
		Timezone_abbeviationContext _localctx = new Timezone_abbeviationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_timezone_abbeviation);
		try {
			setState(376);
			switch (_input.LA(1)) {
			case UTC:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(UTC);
				((Timezone_abbeviationContext)_localctx).tz = "UTC";
				}
				break;
			case MST:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(MST);
				((Timezone_abbeviationContext)_localctx).tz = "MST";
				}
				break;
			case EST:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(EST);
				((Timezone_abbeviationContext)_localctx).tz = "EST";
				}
				break;
			case PST:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(PST);
				((Timezone_abbeviationContext)_localctx).tz = "PST8PDT";
				}
				break;
			case CST:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				match(CST);
				((Timezone_abbeviationContext)_localctx).tz = "CST6CDT";
				}
				break;
			case AKST:
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
				match(AKST);
				((Timezone_abbeviationContext)_localctx).tz = "America/Anchorage";
				}
				break;
			case HAST:
				enterOuterAlt(_localctx, 7);
				{
				setState(368);
				match(HAST);
				((Timezone_abbeviationContext)_localctx).tz = "Pacific/Honolulu";
				}
				break;
			case WIB:
				enterOuterAlt(_localctx, 8);
				{
				setState(370);
				match(WIB);
				((Timezone_abbeviationContext)_localctx).tz = "Asia/Jakarta";
				}
				break;
			case WITA:
				enterOuterAlt(_localctx, 9);
				{
				setState(372);
				match(WITA);
				((Timezone_abbeviationContext)_localctx).tz = "Asia/Makassar";
				}
				break;
			case WIT:
				enterOuterAlt(_localctx, 10);
				{
				setState(374);
				match(WIT);
				((Timezone_abbeviationContext)_localctx).tz = "Asia/Jayapura";
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

	public static class Date_separatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DateParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(DateParser.DOT, 0); }
		public TerminalNode COLON() { return getToken(DateParser.COLON, 0); }
		public TerminalNode SLASH() { return getToken(DateParser.SLASH, 0); }
		public TerminalNode DASH() { return getToken(DateParser.DASH, 0); }
		public Date_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterDate_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitDate_separator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitDate_separator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_separatorContext date_separator() throws RecognitionException {
		Date_separatorContext _localctx = new Date_separatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_date_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (COLON - 221)) | (1L << (COMMA - 221)) | (1L << (DOT - 221)) | (1L << (DASH - 221)) | (1L << (SLASH - 221)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Spelling_weekContext extends ParserRuleContext {
		public String num;
		public TerminalNode ONE() { return getToken(DateParser.ONE, 0); }
		public TerminalNode FIRST() { return getToken(DateParser.FIRST, 0); }
		public TerminalNode TWO() { return getToken(DateParser.TWO, 0); }
		public TerminalNode SECOND() { return getToken(DateParser.SECOND, 0); }
		public TerminalNode THREE() { return getToken(DateParser.THREE, 0); }
		public TerminalNode THIRD() { return getToken(DateParser.THIRD, 0); }
		public TerminalNode FOUR() { return getToken(DateParser.FOUR, 0); }
		public TerminalNode FOURTH() { return getToken(DateParser.FOURTH, 0); }
		public TerminalNode FIVE() { return getToken(DateParser.FIVE, 0); }
		public TerminalNode FIFTH() { return getToken(DateParser.FIFTH, 0); }
		public Spelling_weekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spelling_week; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterSpelling_week(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitSpelling_week(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitSpelling_week(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spelling_weekContext spelling_week() throws RecognitionException {
		Spelling_weekContext _localctx = new Spelling_weekContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_spelling_week);
		int _la;
		try {
			setState(390);
			switch (_input.LA(1)) {
			case ONE:
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==FIRST) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_weekContext)_localctx).num =  "1";
				}
				break;
			case TWO:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==TWO || _la==SECOND) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_weekContext)_localctx).num =  "2";
				}
				break;
			case THREE:
			case THIRD:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				_la = _input.LA(1);
				if ( !(_la==THREE || _la==THIRD) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_weekContext)_localctx).num =  "3";
				}
				break;
			case FOUR:
			case FOURTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				_la = _input.LA(1);
				if ( !(_la==FOUR || _la==FOURTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_weekContext)_localctx).num =  "4";
				}
				break;
			case FIVE:
			case FIFTH:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==FIVE || _la==FIFTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_weekContext)_localctx).num =  "5";
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

	public static class Spelling_dateContext extends ParserRuleContext {
		public String num;
		public TerminalNode ONE() { return getToken(DateParser.ONE, 0); }
		public TerminalNode FIRST() { return getToken(DateParser.FIRST, 0); }
		public TerminalNode TWO() { return getToken(DateParser.TWO, 0); }
		public TerminalNode SECOND() { return getToken(DateParser.SECOND, 0); }
		public TerminalNode THREE() { return getToken(DateParser.THREE, 0); }
		public TerminalNode THIRD() { return getToken(DateParser.THIRD, 0); }
		public TerminalNode FOUR() { return getToken(DateParser.FOUR, 0); }
		public TerminalNode FOURTH() { return getToken(DateParser.FOURTH, 0); }
		public TerminalNode FIVE() { return getToken(DateParser.FIVE, 0); }
		public TerminalNode FIFTH() { return getToken(DateParser.FIFTH, 0); }
		public TerminalNode SIX() { return getToken(DateParser.SIX, 0); }
		public TerminalNode SIXTH() { return getToken(DateParser.SIXTH, 0); }
		public TerminalNode SEVEN() { return getToken(DateParser.SEVEN, 0); }
		public TerminalNode SEVENTH() { return getToken(DateParser.SEVENTH, 0); }
		public TerminalNode EIGHT() { return getToken(DateParser.EIGHT, 0); }
		public TerminalNode EIGHTH() { return getToken(DateParser.EIGHTH, 0); }
		public TerminalNode NINE() { return getToken(DateParser.NINE, 0); }
		public TerminalNode NINTH() { return getToken(DateParser.NINTH, 0); }
		public TerminalNode TEN() { return getToken(DateParser.TEN, 0); }
		public TerminalNode TENTH() { return getToken(DateParser.TENTH, 0); }
		public TerminalNode ELEVEN() { return getToken(DateParser.ELEVEN, 0); }
		public TerminalNode ELEVENTH() { return getToken(DateParser.ELEVENTH, 0); }
		public TerminalNode TWELVE() { return getToken(DateParser.TWELVE, 0); }
		public TerminalNode TWELFTH() { return getToken(DateParser.TWELFTH, 0); }
		public TerminalNode THIRTEEN() { return getToken(DateParser.THIRTEEN, 0); }
		public TerminalNode THIRTEENTH() { return getToken(DateParser.THIRTEENTH, 0); }
		public TerminalNode FOURTEEN() { return getToken(DateParser.FOURTEEN, 0); }
		public TerminalNode FOURTEENTH() { return getToken(DateParser.FOURTEENTH, 0); }
		public TerminalNode FIFTEEN() { return getToken(DateParser.FIFTEEN, 0); }
		public TerminalNode FIFTEENTH() { return getToken(DateParser.FIFTEENTH, 0); }
		public TerminalNode SIXTEEN() { return getToken(DateParser.SIXTEEN, 0); }
		public TerminalNode SIXTEENTH() { return getToken(DateParser.SIXTEENTH, 0); }
		public TerminalNode SEVENTEEN() { return getToken(DateParser.SEVENTEEN, 0); }
		public TerminalNode SEVENTEENTH() { return getToken(DateParser.SEVENTEENTH, 0); }
		public TerminalNode EIGHTEEN() { return getToken(DateParser.EIGHTEEN, 0); }
		public TerminalNode EIGHTEENTH() { return getToken(DateParser.EIGHTEENTH, 0); }
		public TerminalNode NINETEEN() { return getToken(DateParser.NINETEEN, 0); }
		public TerminalNode NINETEENTH() { return getToken(DateParser.NINETEENTH, 0); }
		public TerminalNode TWENTY() { return getToken(DateParser.TWENTY, 0); }
		public TerminalNode TWENTIETH() { return getToken(DateParser.TWENTIETH, 0); }
		public TerminalNode THIRTY() { return getToken(DateParser.THIRTY, 0); }
		public TerminalNode THIRTIETH() { return getToken(DateParser.THIRTIETH, 0); }
		public Spelling_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spelling_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterSpelling_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitSpelling_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitSpelling_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spelling_dateContext spelling_date() throws RecognitionException {
		Spelling_dateContext _localctx = new Spelling_dateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_spelling_date);
		int _la;
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==FIRST) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "1";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				_la = _input.LA(1);
				if ( !(_la==TWO || _la==SECOND) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "2";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==THREE || _la==THIRD) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "3";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				_la = _input.LA(1);
				if ( !(_la==FOUR || _la==FOURTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "4";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				_la = _input.LA(1);
				if ( !(_la==FIVE || _la==FIFTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "5";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
				_la = _input.LA(1);
				if ( !(_la==SIX || _la==SIXTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "6";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==SEVEN || _la==SEVENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "7";
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==EIGHT || _la==EIGHTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "8";
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(_la==NINE || _la==NINTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "9";
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==TEN || _la==TENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "10";
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==ELEVEN || _la==ELEVENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "11";
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==TWELVE || _la==TWELFTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "12";
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(416);
				_la = _input.LA(1);
				if ( !(_la==THIRTEEN || _la==THIRTEENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "13";
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(418);
				_la = _input.LA(1);
				if ( !(_la==FOURTEEN || _la==FOURTEENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "14";
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(420);
				_la = _input.LA(1);
				if ( !(_la==FIFTEEN || _la==FIFTEENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "15";
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(422);
				_la = _input.LA(1);
				if ( !(_la==SIXTEEN || _la==SIXTEENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "16";
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(424);
				_la = _input.LA(1);
				if ( !(_la==SEVENTEEN || _la==SEVENTEENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "17";
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(426);
				_la = _input.LA(1);
				if ( !(_la==EIGHTEEN || _la==EIGHTEENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "18";
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==NINETEEN || _la==NINETEENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "19";
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(430);
				_la = _input.LA(1);
				if ( !(_la==TWENTY || _la==TWENTIETH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "20";
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(432);
				match(TWENTY);
				setState(433);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==FIRST) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "21";
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(435);
				match(TWENTY);
				setState(436);
				_la = _input.LA(1);
				if ( !(_la==TWO || _la==SECOND) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "22";
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(438);
				match(TWENTY);
				setState(439);
				_la = _input.LA(1);
				if ( !(_la==THREE || _la==THIRD) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "23";
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(441);
				match(TWENTY);
				setState(442);
				_la = _input.LA(1);
				if ( !(_la==FOUR || _la==FOURTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "24";
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(444);
				match(TWENTY);
				setState(445);
				_la = _input.LA(1);
				if ( !(_la==FIVE || _la==FIFTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "25";
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(447);
				match(TWENTY);
				setState(448);
				_la = _input.LA(1);
				if ( !(_la==SIX || _la==SIXTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "26";
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(450);
				match(TWENTY);
				setState(451);
				_la = _input.LA(1);
				if ( !(_la==SEVEN || _la==SEVENTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "27";
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(453);
				match(TWENTY);
				setState(454);
				_la = _input.LA(1);
				if ( !(_la==EIGHT || _la==EIGHTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "28";
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(456);
				match(TWENTY);
				setState(457);
				_la = _input.LA(1);
				if ( !(_la==NINE || _la==NINTH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "29";
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(459);
				_la = _input.LA(1);
				if ( !(_la==THIRTY || _la==THIRTIETH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "30";
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(461);
				match(THIRTY);
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==FIRST) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((Spelling_dateContext)_localctx).num =  "31";
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

	public static class IntervalContext extends ParserRuleContext {
		public int i;
		public Numeric_yearContext numeric_year;
		public Spelling_dateContext spelling_date;
		public Numeric_yearContext numeric_year() {
			return getRuleContext(Numeric_yearContext.class,0);
		}
		public Spelling_dateContext spelling_date() {
			return getRuleContext(Spelling_dateContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interval);
		int _la;
		try {
			setState(474);
			switch (_input.LA(1)) {
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
			case INT_00:
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
			case INT_32:
			case INT_33:
			case INT_34:
			case INT_35:
			case INT_36:
			case INT_37:
			case INT_38:
			case INT_39:
			case INT_40:
			case INT_41:
			case INT_42:
			case INT_43:
			case INT_44:
			case INT_45:
			case INT_46:
			case INT_47:
			case INT_48:
			case INT_49:
			case INT_50:
			case INT_51:
			case INT_52:
			case INT_53:
			case INT_54:
			case INT_55:
			case INT_56:
			case INT_57:
			case INT_58:
			case INT_59:
			case INT_60:
			case INT_61:
			case INT_62:
			case INT_63:
			case INT_64:
			case INT_65:
			case INT_66:
			case INT_67:
			case INT_68:
			case INT_69:
			case INT_70:
			case INT_71:
			case INT_72:
			case INT_73:
			case INT_74:
			case INT_75:
			case INT_76:
			case INT_77:
			case INT_78:
			case INT_79:
			case INT_80:
			case INT_81:
			case INT_82:
			case INT_83:
			case INT_84:
			case INT_85:
			case INT_86:
			case INT_87:
			case INT_88:
			case INT_89:
			case INT_90:
			case INT_91:
			case INT_92:
			case INT_93:
			case INT_94:
			case INT_95:
			case INT_96:
			case INT_97:
			case INT_98:
			case INT_99:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				((IntervalContext)_localctx).numeric_year = numeric_year();
				((IntervalContext)_localctx).i =  Integer.valueOf((((IntervalContext)_localctx).numeric_year!=null?_input.getText(((IntervalContext)_localctx).numeric_year.start,((IntervalContext)_localctx).numeric_year.stop):null));
				}
				break;
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
			case ELEVEN:
			case TWELVE:
			case THIRTEEN:
			case FOURTEEN:
			case FIFTEEN:
			case SIXTEEN:
			case SEVENTEEN:
			case EIGHTEEN:
			case NINETEEN:
			case TWENTY:
			case THIRTY:
			case FIRST:
			case SECOND:
			case THIRD:
			case FOURTH:
			case FIFTH:
			case SIXTH:
			case SEVENTH:
			case EIGHTH:
			case NINTH:
			case TENTH:
			case ELEVENTH:
			case TWELFTH:
			case THIRTEENTH:
			case FOURTEENTH:
			case FIFTEENTH:
			case SIXTEENTH:
			case SEVENTEENTH:
			case EIGHTEENTH:
			case NINETEENTH:
			case TWENTIETH:
			case THIRTIETH:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				((IntervalContext)_localctx).spelling_date = spelling_date();
				((IntervalContext)_localctx).i =  Integer.valueOf(((IntervalContext)_localctx).spelling_date.num);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				((IntervalContext)_localctx).i =  1;
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

	public static class Numeric_weekContext extends ParserRuleContext {
		public TerminalNode INT_1() { return getToken(DateParser.INT_1, 0); }
		public TerminalNode ST() { return getToken(DateParser.ST, 0); }
		public TerminalNode INT_2() { return getToken(DateParser.INT_2, 0); }
		public TerminalNode ND() { return getToken(DateParser.ND, 0); }
		public TerminalNode INT_3() { return getToken(DateParser.INT_3, 0); }
		public TerminalNode RD() { return getToken(DateParser.RD, 0); }
		public TerminalNode INT_4() { return getToken(DateParser.INT_4, 0); }
		public TerminalNode TH() { return getToken(DateParser.TH, 0); }
		public TerminalNode INT_5() { return getToken(DateParser.INT_5, 0); }
		public Numeric_weekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_week; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterNumeric_week(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitNumeric_week(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitNumeric_week(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_weekContext numeric_week() throws RecognitionException {
		Numeric_weekContext _localctx = new Numeric_weekContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numeric_week);
		try {
			setState(486);
			switch (_input.LA(1)) {
			case INT_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(INT_1);
				setState(477);
				match(ST);
				}
				break;
			case INT_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(INT_2);
				setState(479);
				match(ND);
				}
				break;
			case INT_3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				match(INT_3);
				setState(481);
				match(RD);
				}
				break;
			case INT_4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				match(INT_4);
				setState(483);
				match(TH);
				}
				break;
			case INT_5:
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				match(INT_5);
				setState(485);
				match(TH);
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

	public static class Numeric_monthContext extends ParserRuleContext {
		public TerminalNode INT_1() { return getToken(DateParser.INT_1, 0); }
		public TerminalNode INT_2() { return getToken(DateParser.INT_2, 0); }
		public TerminalNode INT_3() { return getToken(DateParser.INT_3, 0); }
		public TerminalNode INT_4() { return getToken(DateParser.INT_4, 0); }
		public TerminalNode INT_5() { return getToken(DateParser.INT_5, 0); }
		public TerminalNode INT_6() { return getToken(DateParser.INT_6, 0); }
		public TerminalNode INT_7() { return getToken(DateParser.INT_7, 0); }
		public TerminalNode INT_8() { return getToken(DateParser.INT_8, 0); }
		public TerminalNode INT_9() { return getToken(DateParser.INT_9, 0); }
		public TerminalNode INT_01() { return getToken(DateParser.INT_01, 0); }
		public TerminalNode INT_02() { return getToken(DateParser.INT_02, 0); }
		public TerminalNode INT_03() { return getToken(DateParser.INT_03, 0); }
		public TerminalNode INT_04() { return getToken(DateParser.INT_04, 0); }
		public TerminalNode INT_05() { return getToken(DateParser.INT_05, 0); }
		public TerminalNode INT_06() { return getToken(DateParser.INT_06, 0); }
		public TerminalNode INT_07() { return getToken(DateParser.INT_07, 0); }
		public TerminalNode INT_08() { return getToken(DateParser.INT_08, 0); }
		public TerminalNode INT_09() { return getToken(DateParser.INT_09, 0); }
		public TerminalNode INT_10() { return getToken(DateParser.INT_10, 0); }
		public TerminalNode INT_11() { return getToken(DateParser.INT_11, 0); }
		public TerminalNode INT_12() { return getToken(DateParser.INT_12, 0); }
		public Numeric_monthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterNumeric_month(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitNumeric_month(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitNumeric_month(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_monthContext numeric_month() throws RecognitionException {
		Numeric_monthContext _localctx = new Numeric_monthContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numeric_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT_1 - 70)) | (1L << (INT_2 - 70)) | (1L << (INT_3 - 70)) | (1L << (INT_4 - 70)) | (1L << (INT_5 - 70)) | (1L << (INT_6 - 70)) | (1L << (INT_7 - 70)) | (1L << (INT_8 - 70)) | (1L << (INT_9 - 70)) | (1L << (INT_01 - 70)) | (1L << (INT_02 - 70)) | (1L << (INT_03 - 70)) | (1L << (INT_04 - 70)) | (1L << (INT_05 - 70)) | (1L << (INT_06 - 70)) | (1L << (INT_07 - 70)) | (1L << (INT_08 - 70)) | (1L << (INT_09 - 70)) | (1L << (INT_10 - 70)) | (1L << (INT_11 - 70)) | (1L << (INT_12 - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Numeric_dayContext extends ParserRuleContext {
		public TerminalNode INT_1() { return getToken(DateParser.INT_1, 0); }
		public TerminalNode INT_2() { return getToken(DateParser.INT_2, 0); }
		public TerminalNode INT_3() { return getToken(DateParser.INT_3, 0); }
		public TerminalNode INT_4() { return getToken(DateParser.INT_4, 0); }
		public TerminalNode INT_5() { return getToken(DateParser.INT_5, 0); }
		public TerminalNode INT_6() { return getToken(DateParser.INT_6, 0); }
		public TerminalNode INT_7() { return getToken(DateParser.INT_7, 0); }
		public TerminalNode INT_8() { return getToken(DateParser.INT_8, 0); }
		public TerminalNode INT_9() { return getToken(DateParser.INT_9, 0); }
		public TerminalNode INT_01() { return getToken(DateParser.INT_01, 0); }
		public TerminalNode INT_02() { return getToken(DateParser.INT_02, 0); }
		public TerminalNode INT_03() { return getToken(DateParser.INT_03, 0); }
		public TerminalNode INT_04() { return getToken(DateParser.INT_04, 0); }
		public TerminalNode INT_05() { return getToken(DateParser.INT_05, 0); }
		public TerminalNode INT_06() { return getToken(DateParser.INT_06, 0); }
		public TerminalNode INT_07() { return getToken(DateParser.INT_07, 0); }
		public TerminalNode INT_08() { return getToken(DateParser.INT_08, 0); }
		public TerminalNode INT_09() { return getToken(DateParser.INT_09, 0); }
		public TerminalNode INT_10() { return getToken(DateParser.INT_10, 0); }
		public TerminalNode INT_11() { return getToken(DateParser.INT_11, 0); }
		public TerminalNode INT_12() { return getToken(DateParser.INT_12, 0); }
		public TerminalNode INT_13() { return getToken(DateParser.INT_13, 0); }
		public TerminalNode INT_14() { return getToken(DateParser.INT_14, 0); }
		public TerminalNode INT_15() { return getToken(DateParser.INT_15, 0); }
		public TerminalNode INT_16() { return getToken(DateParser.INT_16, 0); }
		public TerminalNode INT_17() { return getToken(DateParser.INT_17, 0); }
		public TerminalNode INT_18() { return getToken(DateParser.INT_18, 0); }
		public TerminalNode INT_19() { return getToken(DateParser.INT_19, 0); }
		public TerminalNode INT_20() { return getToken(DateParser.INT_20, 0); }
		public TerminalNode INT_21() { return getToken(DateParser.INT_21, 0); }
		public TerminalNode INT_22() { return getToken(DateParser.INT_22, 0); }
		public TerminalNode INT_23() { return getToken(DateParser.INT_23, 0); }
		public TerminalNode INT_24() { return getToken(DateParser.INT_24, 0); }
		public TerminalNode INT_25() { return getToken(DateParser.INT_25, 0); }
		public TerminalNode INT_26() { return getToken(DateParser.INT_26, 0); }
		public TerminalNode INT_27() { return getToken(DateParser.INT_27, 0); }
		public TerminalNode INT_28() { return getToken(DateParser.INT_28, 0); }
		public TerminalNode INT_29() { return getToken(DateParser.INT_29, 0); }
		public TerminalNode INT_30() { return getToken(DateParser.INT_30, 0); }
		public TerminalNode INT_31() { return getToken(DateParser.INT_31, 0); }
		public Numeric_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterNumeric_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitNumeric_day(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitNumeric_day(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_dayContext numeric_day() throws RecognitionException {
		Numeric_dayContext _localctx = new Numeric_dayContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numeric_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT_1 - 70)) | (1L << (INT_2 - 70)) | (1L << (INT_3 - 70)) | (1L << (INT_4 - 70)) | (1L << (INT_5 - 70)) | (1L << (INT_6 - 70)) | (1L << (INT_7 - 70)) | (1L << (INT_8 - 70)) | (1L << (INT_9 - 70)) | (1L << (INT_01 - 70)) | (1L << (INT_02 - 70)) | (1L << (INT_03 - 70)) | (1L << (INT_04 - 70)) | (1L << (INT_05 - 70)) | (1L << (INT_06 - 70)) | (1L << (INT_07 - 70)) | (1L << (INT_08 - 70)) | (1L << (INT_09 - 70)) | (1L << (INT_10 - 70)) | (1L << (INT_11 - 70)) | (1L << (INT_12 - 70)) | (1L << (INT_13 - 70)) | (1L << (INT_14 - 70)) | (1L << (INT_15 - 70)) | (1L << (INT_16 - 70)) | (1L << (INT_17 - 70)) | (1L << (INT_18 - 70)) | (1L << (INT_19 - 70)) | (1L << (INT_20 - 70)) | (1L << (INT_21 - 70)) | (1L << (INT_22 - 70)) | (1L << (INT_23 - 70)) | (1L << (INT_24 - 70)) | (1L << (INT_25 - 70)) | (1L << (INT_26 - 70)) | (1L << (INT_27 - 70)) | (1L << (INT_28 - 70)) | (1L << (INT_29 - 70)) | (1L << (INT_30 - 70)) | (1L << (INT_31 - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Numeric_hourContext extends ParserRuleContext {
		public TerminalNode INT_01() { return getToken(DateParser.INT_01, 0); }
		public TerminalNode INT_02() { return getToken(DateParser.INT_02, 0); }
		public TerminalNode INT_03() { return getToken(DateParser.INT_03, 0); }
		public TerminalNode INT_04() { return getToken(DateParser.INT_04, 0); }
		public TerminalNode INT_05() { return getToken(DateParser.INT_05, 0); }
		public TerminalNode INT_06() { return getToken(DateParser.INT_06, 0); }
		public TerminalNode INT_07() { return getToken(DateParser.INT_07, 0); }
		public TerminalNode INT_08() { return getToken(DateParser.INT_08, 0); }
		public TerminalNode INT_09() { return getToken(DateParser.INT_09, 0); }
		public TerminalNode INT_10() { return getToken(DateParser.INT_10, 0); }
		public TerminalNode INT_11() { return getToken(DateParser.INT_11, 0); }
		public TerminalNode INT_12() { return getToken(DateParser.INT_12, 0); }
		public TerminalNode INT_13() { return getToken(DateParser.INT_13, 0); }
		public TerminalNode INT_14() { return getToken(DateParser.INT_14, 0); }
		public TerminalNode INT_15() { return getToken(DateParser.INT_15, 0); }
		public TerminalNode INT_16() { return getToken(DateParser.INT_16, 0); }
		public TerminalNode INT_17() { return getToken(DateParser.INT_17, 0); }
		public TerminalNode INT_18() { return getToken(DateParser.INT_18, 0); }
		public TerminalNode INT_19() { return getToken(DateParser.INT_19, 0); }
		public TerminalNode INT_20() { return getToken(DateParser.INT_20, 0); }
		public TerminalNode INT_21() { return getToken(DateParser.INT_21, 0); }
		public TerminalNode INT_22() { return getToken(DateParser.INT_22, 0); }
		public TerminalNode INT_23() { return getToken(DateParser.INT_23, 0); }
		public TerminalNode INT_24() { return getToken(DateParser.INT_24, 0); }
		public TerminalNode INT_00() { return getToken(DateParser.INT_00, 0); }
		public Numeric_hourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterNumeric_hour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitNumeric_hour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitNumeric_hour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_hourContext numeric_hour() throws RecognitionException {
		Numeric_hourContext _localctx = new Numeric_hourContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numeric_hour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INT_00 - 79)) | (1L << (INT_01 - 79)) | (1L << (INT_02 - 79)) | (1L << (INT_03 - 79)) | (1L << (INT_04 - 79)) | (1L << (INT_05 - 79)) | (1L << (INT_06 - 79)) | (1L << (INT_07 - 79)) | (1L << (INT_08 - 79)) | (1L << (INT_09 - 79)) | (1L << (INT_10 - 79)) | (1L << (INT_11 - 79)) | (1L << (INT_12 - 79)) | (1L << (INT_13 - 79)) | (1L << (INT_14 - 79)) | (1L << (INT_15 - 79)) | (1L << (INT_16 - 79)) | (1L << (INT_17 - 79)) | (1L << (INT_18 - 79)) | (1L << (INT_19 - 79)) | (1L << (INT_20 - 79)) | (1L << (INT_21 - 79)) | (1L << (INT_22 - 79)) | (1L << (INT_23 - 79)) | (1L << (INT_24 - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Numeric_minuteContext extends ParserRuleContext {
		public TerminalNode INT_01() { return getToken(DateParser.INT_01, 0); }
		public TerminalNode INT_02() { return getToken(DateParser.INT_02, 0); }
		public TerminalNode INT_03() { return getToken(DateParser.INT_03, 0); }
		public TerminalNode INT_04() { return getToken(DateParser.INT_04, 0); }
		public TerminalNode INT_05() { return getToken(DateParser.INT_05, 0); }
		public TerminalNode INT_06() { return getToken(DateParser.INT_06, 0); }
		public TerminalNode INT_07() { return getToken(DateParser.INT_07, 0); }
		public TerminalNode INT_08() { return getToken(DateParser.INT_08, 0); }
		public TerminalNode INT_09() { return getToken(DateParser.INT_09, 0); }
		public TerminalNode INT_10() { return getToken(DateParser.INT_10, 0); }
		public TerminalNode INT_11() { return getToken(DateParser.INT_11, 0); }
		public TerminalNode INT_12() { return getToken(DateParser.INT_12, 0); }
		public TerminalNode INT_13() { return getToken(DateParser.INT_13, 0); }
		public TerminalNode INT_14() { return getToken(DateParser.INT_14, 0); }
		public TerminalNode INT_15() { return getToken(DateParser.INT_15, 0); }
		public TerminalNode INT_16() { return getToken(DateParser.INT_16, 0); }
		public TerminalNode INT_17() { return getToken(DateParser.INT_17, 0); }
		public TerminalNode INT_18() { return getToken(DateParser.INT_18, 0); }
		public TerminalNode INT_19() { return getToken(DateParser.INT_19, 0); }
		public TerminalNode INT_20() { return getToken(DateParser.INT_20, 0); }
		public TerminalNode INT_21() { return getToken(DateParser.INT_21, 0); }
		public TerminalNode INT_22() { return getToken(DateParser.INT_22, 0); }
		public TerminalNode INT_23() { return getToken(DateParser.INT_23, 0); }
		public TerminalNode INT_24() { return getToken(DateParser.INT_24, 0); }
		public TerminalNode INT_25() { return getToken(DateParser.INT_25, 0); }
		public TerminalNode INT_26() { return getToken(DateParser.INT_26, 0); }
		public TerminalNode INT_27() { return getToken(DateParser.INT_27, 0); }
		public TerminalNode INT_28() { return getToken(DateParser.INT_28, 0); }
		public TerminalNode INT_29() { return getToken(DateParser.INT_29, 0); }
		public TerminalNode INT_30() { return getToken(DateParser.INT_30, 0); }
		public TerminalNode INT_31() { return getToken(DateParser.INT_31, 0); }
		public TerminalNode INT_32() { return getToken(DateParser.INT_32, 0); }
		public TerminalNode INT_33() { return getToken(DateParser.INT_33, 0); }
		public TerminalNode INT_34() { return getToken(DateParser.INT_34, 0); }
		public TerminalNode INT_35() { return getToken(DateParser.INT_35, 0); }
		public TerminalNode INT_36() { return getToken(DateParser.INT_36, 0); }
		public TerminalNode INT_37() { return getToken(DateParser.INT_37, 0); }
		public TerminalNode INT_38() { return getToken(DateParser.INT_38, 0); }
		public TerminalNode INT_39() { return getToken(DateParser.INT_39, 0); }
		public TerminalNode INT_40() { return getToken(DateParser.INT_40, 0); }
		public TerminalNode INT_41() { return getToken(DateParser.INT_41, 0); }
		public TerminalNode INT_42() { return getToken(DateParser.INT_42, 0); }
		public TerminalNode INT_43() { return getToken(DateParser.INT_43, 0); }
		public TerminalNode INT_44() { return getToken(DateParser.INT_44, 0); }
		public TerminalNode INT_45() { return getToken(DateParser.INT_45, 0); }
		public TerminalNode INT_46() { return getToken(DateParser.INT_46, 0); }
		public TerminalNode INT_47() { return getToken(DateParser.INT_47, 0); }
		public TerminalNode INT_48() { return getToken(DateParser.INT_48, 0); }
		public TerminalNode INT_49() { return getToken(DateParser.INT_49, 0); }
		public TerminalNode INT_50() { return getToken(DateParser.INT_50, 0); }
		public TerminalNode INT_51() { return getToken(DateParser.INT_51, 0); }
		public TerminalNode INT_52() { return getToken(DateParser.INT_52, 0); }
		public TerminalNode INT_53() { return getToken(DateParser.INT_53, 0); }
		public TerminalNode INT_54() { return getToken(DateParser.INT_54, 0); }
		public TerminalNode INT_55() { return getToken(DateParser.INT_55, 0); }
		public TerminalNode INT_56() { return getToken(DateParser.INT_56, 0); }
		public TerminalNode INT_57() { return getToken(DateParser.INT_57, 0); }
		public TerminalNode INT_58() { return getToken(DateParser.INT_58, 0); }
		public TerminalNode INT_59() { return getToken(DateParser.INT_59, 0); }
		public TerminalNode INT_00() { return getToken(DateParser.INT_00, 0); }
		public Numeric_minuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterNumeric_minute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitNumeric_minute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitNumeric_minute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_minuteContext numeric_minute() throws RecognitionException {
		Numeric_minuteContext _localctx = new Numeric_minuteContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numeric_minute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INT_00 - 79)) | (1L << (INT_01 - 79)) | (1L << (INT_02 - 79)) | (1L << (INT_03 - 79)) | (1L << (INT_04 - 79)) | (1L << (INT_05 - 79)) | (1L << (INT_06 - 79)) | (1L << (INT_07 - 79)) | (1L << (INT_08 - 79)) | (1L << (INT_09 - 79)) | (1L << (INT_10 - 79)) | (1L << (INT_11 - 79)) | (1L << (INT_12 - 79)) | (1L << (INT_13 - 79)) | (1L << (INT_14 - 79)) | (1L << (INT_15 - 79)) | (1L << (INT_16 - 79)) | (1L << (INT_17 - 79)) | (1L << (INT_18 - 79)) | (1L << (INT_19 - 79)) | (1L << (INT_20 - 79)) | (1L << (INT_21 - 79)) | (1L << (INT_22 - 79)) | (1L << (INT_23 - 79)) | (1L << (INT_24 - 79)) | (1L << (INT_25 - 79)) | (1L << (INT_26 - 79)) | (1L << (INT_27 - 79)) | (1L << (INT_28 - 79)) | (1L << (INT_29 - 79)) | (1L << (INT_30 - 79)) | (1L << (INT_31 - 79)) | (1L << (INT_32 - 79)) | (1L << (INT_33 - 79)) | (1L << (INT_34 - 79)) | (1L << (INT_35 - 79)) | (1L << (INT_36 - 79)) | (1L << (INT_37 - 79)) | (1L << (INT_38 - 79)) | (1L << (INT_39 - 79)) | (1L << (INT_40 - 79)) | (1L << (INT_41 - 79)) | (1L << (INT_42 - 79)) | (1L << (INT_43 - 79)) | (1L << (INT_44 - 79)) | (1L << (INT_45 - 79)) | (1L << (INT_46 - 79)) | (1L << (INT_47 - 79)) | (1L << (INT_48 - 79)) | (1L << (INT_49 - 79)) | (1L << (INT_50 - 79)) | (1L << (INT_51 - 79)) | (1L << (INT_52 - 79)) | (1L << (INT_53 - 79)) | (1L << (INT_54 - 79)) | (1L << (INT_55 - 79)) | (1L << (INT_56 - 79)) | (1L << (INT_57 - 79)) | (1L << (INT_58 - 79)) | (1L << (INT_59 - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Numeric_yearContext extends ParserRuleContext {
		public TerminalNode INT_1() { return getToken(DateParser.INT_1, 0); }
		public TerminalNode INT_2() { return getToken(DateParser.INT_2, 0); }
		public TerminalNode INT_3() { return getToken(DateParser.INT_3, 0); }
		public TerminalNode INT_4() { return getToken(DateParser.INT_4, 0); }
		public TerminalNode INT_5() { return getToken(DateParser.INT_5, 0); }
		public TerminalNode INT_6() { return getToken(DateParser.INT_6, 0); }
		public TerminalNode INT_7() { return getToken(DateParser.INT_7, 0); }
		public TerminalNode INT_8() { return getToken(DateParser.INT_8, 0); }
		public TerminalNode INT_9() { return getToken(DateParser.INT_9, 0); }
		public TerminalNode INT_01() { return getToken(DateParser.INT_01, 0); }
		public TerminalNode INT_02() { return getToken(DateParser.INT_02, 0); }
		public TerminalNode INT_03() { return getToken(DateParser.INT_03, 0); }
		public TerminalNode INT_04() { return getToken(DateParser.INT_04, 0); }
		public TerminalNode INT_05() { return getToken(DateParser.INT_05, 0); }
		public TerminalNode INT_06() { return getToken(DateParser.INT_06, 0); }
		public TerminalNode INT_07() { return getToken(DateParser.INT_07, 0); }
		public TerminalNode INT_08() { return getToken(DateParser.INT_08, 0); }
		public TerminalNode INT_09() { return getToken(DateParser.INT_09, 0); }
		public TerminalNode INT_10() { return getToken(DateParser.INT_10, 0); }
		public TerminalNode INT_11() { return getToken(DateParser.INT_11, 0); }
		public TerminalNode INT_12() { return getToken(DateParser.INT_12, 0); }
		public TerminalNode INT_13() { return getToken(DateParser.INT_13, 0); }
		public TerminalNode INT_14() { return getToken(DateParser.INT_14, 0); }
		public TerminalNode INT_15() { return getToken(DateParser.INT_15, 0); }
		public TerminalNode INT_16() { return getToken(DateParser.INT_16, 0); }
		public TerminalNode INT_17() { return getToken(DateParser.INT_17, 0); }
		public TerminalNode INT_18() { return getToken(DateParser.INT_18, 0); }
		public TerminalNode INT_19() { return getToken(DateParser.INT_19, 0); }
		public TerminalNode INT_20() { return getToken(DateParser.INT_20, 0); }
		public TerminalNode INT_21() { return getToken(DateParser.INT_21, 0); }
		public TerminalNode INT_22() { return getToken(DateParser.INT_22, 0); }
		public TerminalNode INT_23() { return getToken(DateParser.INT_23, 0); }
		public TerminalNode INT_24() { return getToken(DateParser.INT_24, 0); }
		public TerminalNode INT_25() { return getToken(DateParser.INT_25, 0); }
		public TerminalNode INT_26() { return getToken(DateParser.INT_26, 0); }
		public TerminalNode INT_27() { return getToken(DateParser.INT_27, 0); }
		public TerminalNode INT_28() { return getToken(DateParser.INT_28, 0); }
		public TerminalNode INT_29() { return getToken(DateParser.INT_29, 0); }
		public TerminalNode INT_30() { return getToken(DateParser.INT_30, 0); }
		public TerminalNode INT_31() { return getToken(DateParser.INT_31, 0); }
		public TerminalNode INT_32() { return getToken(DateParser.INT_32, 0); }
		public TerminalNode INT_33() { return getToken(DateParser.INT_33, 0); }
		public TerminalNode INT_34() { return getToken(DateParser.INT_34, 0); }
		public TerminalNode INT_35() { return getToken(DateParser.INT_35, 0); }
		public TerminalNode INT_36() { return getToken(DateParser.INT_36, 0); }
		public TerminalNode INT_37() { return getToken(DateParser.INT_37, 0); }
		public TerminalNode INT_38() { return getToken(DateParser.INT_38, 0); }
		public TerminalNode INT_39() { return getToken(DateParser.INT_39, 0); }
		public TerminalNode INT_40() { return getToken(DateParser.INT_40, 0); }
		public TerminalNode INT_41() { return getToken(DateParser.INT_41, 0); }
		public TerminalNode INT_42() { return getToken(DateParser.INT_42, 0); }
		public TerminalNode INT_43() { return getToken(DateParser.INT_43, 0); }
		public TerminalNode INT_44() { return getToken(DateParser.INT_44, 0); }
		public TerminalNode INT_45() { return getToken(DateParser.INT_45, 0); }
		public TerminalNode INT_46() { return getToken(DateParser.INT_46, 0); }
		public TerminalNode INT_47() { return getToken(DateParser.INT_47, 0); }
		public TerminalNode INT_48() { return getToken(DateParser.INT_48, 0); }
		public TerminalNode INT_49() { return getToken(DateParser.INT_49, 0); }
		public TerminalNode INT_50() { return getToken(DateParser.INT_50, 0); }
		public TerminalNode INT_51() { return getToken(DateParser.INT_51, 0); }
		public TerminalNode INT_52() { return getToken(DateParser.INT_52, 0); }
		public TerminalNode INT_53() { return getToken(DateParser.INT_53, 0); }
		public TerminalNode INT_54() { return getToken(DateParser.INT_54, 0); }
		public TerminalNode INT_55() { return getToken(DateParser.INT_55, 0); }
		public TerminalNode INT_56() { return getToken(DateParser.INT_56, 0); }
		public TerminalNode INT_57() { return getToken(DateParser.INT_57, 0); }
		public TerminalNode INT_58() { return getToken(DateParser.INT_58, 0); }
		public TerminalNode INT_59() { return getToken(DateParser.INT_59, 0); }
		public TerminalNode INT_60() { return getToken(DateParser.INT_60, 0); }
		public TerminalNode INT_61() { return getToken(DateParser.INT_61, 0); }
		public TerminalNode INT_62() { return getToken(DateParser.INT_62, 0); }
		public TerminalNode INT_63() { return getToken(DateParser.INT_63, 0); }
		public TerminalNode INT_64() { return getToken(DateParser.INT_64, 0); }
		public TerminalNode INT_65() { return getToken(DateParser.INT_65, 0); }
		public TerminalNode INT_66() { return getToken(DateParser.INT_66, 0); }
		public TerminalNode INT_67() { return getToken(DateParser.INT_67, 0); }
		public TerminalNode INT_68() { return getToken(DateParser.INT_68, 0); }
		public TerminalNode INT_69() { return getToken(DateParser.INT_69, 0); }
		public TerminalNode INT_70() { return getToken(DateParser.INT_70, 0); }
		public TerminalNode INT_71() { return getToken(DateParser.INT_71, 0); }
		public TerminalNode INT_72() { return getToken(DateParser.INT_72, 0); }
		public TerminalNode INT_73() { return getToken(DateParser.INT_73, 0); }
		public TerminalNode INT_74() { return getToken(DateParser.INT_74, 0); }
		public TerminalNode INT_75() { return getToken(DateParser.INT_75, 0); }
		public TerminalNode INT_76() { return getToken(DateParser.INT_76, 0); }
		public TerminalNode INT_77() { return getToken(DateParser.INT_77, 0); }
		public TerminalNode INT_78() { return getToken(DateParser.INT_78, 0); }
		public TerminalNode INT_79() { return getToken(DateParser.INT_79, 0); }
		public TerminalNode INT_80() { return getToken(DateParser.INT_80, 0); }
		public TerminalNode INT_81() { return getToken(DateParser.INT_81, 0); }
		public TerminalNode INT_82() { return getToken(DateParser.INT_82, 0); }
		public TerminalNode INT_83() { return getToken(DateParser.INT_83, 0); }
		public TerminalNode INT_84() { return getToken(DateParser.INT_84, 0); }
		public TerminalNode INT_85() { return getToken(DateParser.INT_85, 0); }
		public TerminalNode INT_86() { return getToken(DateParser.INT_86, 0); }
		public TerminalNode INT_87() { return getToken(DateParser.INT_87, 0); }
		public TerminalNode INT_88() { return getToken(DateParser.INT_88, 0); }
		public TerminalNode INT_89() { return getToken(DateParser.INT_89, 0); }
		public TerminalNode INT_90() { return getToken(DateParser.INT_90, 0); }
		public TerminalNode INT_91() { return getToken(DateParser.INT_91, 0); }
		public TerminalNode INT_92() { return getToken(DateParser.INT_92, 0); }
		public TerminalNode INT_93() { return getToken(DateParser.INT_93, 0); }
		public TerminalNode INT_94() { return getToken(DateParser.INT_94, 0); }
		public TerminalNode INT_95() { return getToken(DateParser.INT_95, 0); }
		public TerminalNode INT_96() { return getToken(DateParser.INT_96, 0); }
		public TerminalNode INT_97() { return getToken(DateParser.INT_97, 0); }
		public TerminalNode INT_98() { return getToken(DateParser.INT_98, 0); }
		public TerminalNode INT_99() { return getToken(DateParser.INT_99, 0); }
		public TerminalNode INT_00() { return getToken(DateParser.INT_00, 0); }
		public Numeric_yearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).enterNumeric_year(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateListener ) ((DateListener)listener).exitNumeric_year(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateVisitor ) return ((DateVisitor<? extends T>)visitor).visitNumeric_year(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_yearContext numeric_year() throws RecognitionException {
		Numeric_yearContext _localctx = new Numeric_yearContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_numeric_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INT_1 - 70)) | (1L << (INT_2 - 70)) | (1L << (INT_3 - 70)) | (1L << (INT_4 - 70)) | (1L << (INT_5 - 70)) | (1L << (INT_6 - 70)) | (1L << (INT_7 - 70)) | (1L << (INT_8 - 70)) | (1L << (INT_9 - 70)) | (1L << (INT_00 - 70)) | (1L << (INT_01 - 70)) | (1L << (INT_02 - 70)) | (1L << (INT_03 - 70)) | (1L << (INT_04 - 70)) | (1L << (INT_05 - 70)) | (1L << (INT_06 - 70)) | (1L << (INT_07 - 70)) | (1L << (INT_08 - 70)) | (1L << (INT_09 - 70)) | (1L << (INT_10 - 70)) | (1L << (INT_11 - 70)) | (1L << (INT_12 - 70)) | (1L << (INT_13 - 70)) | (1L << (INT_14 - 70)) | (1L << (INT_15 - 70)) | (1L << (INT_16 - 70)) | (1L << (INT_17 - 70)) | (1L << (INT_18 - 70)) | (1L << (INT_19 - 70)) | (1L << (INT_20 - 70)) | (1L << (INT_21 - 70)) | (1L << (INT_22 - 70)) | (1L << (INT_23 - 70)) | (1L << (INT_24 - 70)) | (1L << (INT_25 - 70)) | (1L << (INT_26 - 70)) | (1L << (INT_27 - 70)) | (1L << (INT_28 - 70)) | (1L << (INT_29 - 70)) | (1L << (INT_30 - 70)) | (1L << (INT_31 - 70)) | (1L << (INT_32 - 70)) | (1L << (INT_33 - 70)) | (1L << (INT_34 - 70)) | (1L << (INT_35 - 70)) | (1L << (INT_36 - 70)) | (1L << (INT_37 - 70)) | (1L << (INT_38 - 70)) | (1L << (INT_39 - 70)) | (1L << (INT_40 - 70)) | (1L << (INT_41 - 70)) | (1L << (INT_42 - 70)) | (1L << (INT_43 - 70)) | (1L << (INT_44 - 70)) | (1L << (INT_45 - 70)) | (1L << (INT_46 - 70)) | (1L << (INT_47 - 70)) | (1L << (INT_48 - 70)) | (1L << (INT_49 - 70)) | (1L << (INT_50 - 70)) | (1L << (INT_51 - 70)) | (1L << (INT_52 - 70)) | (1L << (INT_53 - 70)) | (1L << (INT_54 - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (INT_55 - 134)) | (1L << (INT_56 - 134)) | (1L << (INT_57 - 134)) | (1L << (INT_58 - 134)) | (1L << (INT_59 - 134)) | (1L << (INT_60 - 134)) | (1L << (INT_61 - 134)) | (1L << (INT_62 - 134)) | (1L << (INT_63 - 134)) | (1L << (INT_64 - 134)) | (1L << (INT_65 - 134)) | (1L << (INT_66 - 134)) | (1L << (INT_67 - 134)) | (1L << (INT_68 - 134)) | (1L << (INT_69 - 134)) | (1L << (INT_70 - 134)) | (1L << (INT_71 - 134)) | (1L << (INT_72 - 134)) | (1L << (INT_73 - 134)) | (1L << (INT_74 - 134)) | (1L << (INT_75 - 134)) | (1L << (INT_76 - 134)) | (1L << (INT_77 - 134)) | (1L << (INT_78 - 134)) | (1L << (INT_79 - 134)) | (1L << (INT_80 - 134)) | (1L << (INT_81 - 134)) | (1L << (INT_82 - 134)) | (1L << (INT_83 - 134)) | (1L << (INT_84 - 134)) | (1L << (INT_85 - 134)) | (1L << (INT_86 - 134)) | (1L << (INT_87 - 134)) | (1L << (INT_88 - 134)) | (1L << (INT_89 - 134)) | (1L << (INT_90 - 134)) | (1L << (INT_91 - 134)) | (1L << (INT_92 - 134)) | (1L << (INT_93 - 134)) | (1L << (INT_94 - 134)) | (1L << (INT_95 - 134)) | (1L << (INT_96 - 134)) | (1L << (INT_97 - 134)) | (1L << (INT_98 - 134)) | (1L << (INT_99 - 134)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00ff\u01f5\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\3\2\5\2V\n\2\6\2X\n\2\r\2\16\2Y\3\3\3\3\5\3^\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\5\4g\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\7\3\7\5"+
		"\7\u0091\n\7\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00a0\n\b\f\b\16\b\u00a3\13\b\3\b\3\b\5\b\u00a7\n\b\3\t\3"+
		"\t\3\t\3\t\5\t\u00ad\n\t\3\t\3\t\3\t\5\t\u00b2\n\t\3\t\3\t\3\t\5\t\u00b7"+
		"\n\t\3\t\3\t\3\t\5\t\u00bc\n\t\3\t\3\t\3\t\5\t\u00c1\n\t\3\t\3\t\3\t\5"+
		"\t\u00c6\n\t\3\t\3\t\3\t\5\t\u00cb\n\t\3\t\3\t\3\t\5\t\u00d0\n\t\3\t\3"+
		"\t\5\t\u00d4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00dc\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ec\n\13"+
		"\3\f\3\f\5\f\u00f0\n\f\3\f\3\f\3\r\3\r\5\r\u00f6\n\r\3\r\3\r\3\16\3\16"+
		"\5\16\u00fc\n\16\3\16\3\16\3\17\3\17\5\17\u0102\n\17\3\17\3\17\3\20\3"+
		"\20\5\20\u0108\n\20\3\20\3\20\3\21\3\21\5\21\u010e\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0118\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0125\n\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0131\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u014b\n\26\3\27\3\27\5\27\u014f\n\27\3\30\3\30\3"+
		"\30\3\30\5\30\u0155\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u015d\n\31"+
		"\3\32\5\32\u0160\n\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u017b\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0189\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01d3\n\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \5 \u01dd\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01e9\n!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3&\7O\u0080\u008b\u0096\u00a1\2\'\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2 \3\2$)\4\2\u00e3"+
		"\u00e3\u00e6\u00e6\4\2\u00df\u00df\u00e1\u00e4\4\2\u00b5\u00b5\u00ca\u00ca"+
		"\4\2\u00b6\u00b6\u00cb\u00cb\4\2\u00b7\u00b7\u00cc\u00cc\4\2\u00b8\u00b8"+
		"\u00cd\u00cd\4\2\u00b9\u00b9\u00ce\u00ce\4\2\u00ba\u00ba\u00cf\u00cf\4"+
		"\2\u00bb\u00bb\u00d0\u00d0\4\2\u00bc\u00bc\u00d1\u00d1\4\2\u00bd\u00bd"+
		"\u00d2\u00d2\4\2\u00be\u00be\u00d3\u00d3\4\2\u00bf\u00bf\u00d4\u00d4\4"+
		"\2\u00c0\u00c0\u00d5\u00d5\4\2\u00c1\u00c1\u00d6\u00d6\4\2\u00c2\u00c2"+
		"\u00d7\u00d7\4\2\u00c3\u00c3\u00d8\u00d8\4\2\u00c4\u00c4\u00d9\u00d9\4"+
		"\2\u00c5\u00c5\u00da\u00da\4\2\u00c6\u00c6\u00db\u00db\4\2\u00c7\u00c7"+
		"\u00dc\u00dc\4\2\u00c8\u00c8\u00dd\u00dd\4\2\u00c9\u00c9\u00de\u00de\3"+
		"\2\3\4\4\2HPR]\4\2HPRp\3\2Qi\3\2Q\u008c\3\2H\u00b4\u0248\2W\3\2\2\2\4"+
		"[\3\2\2\2\6f\3\2\2\2\bo\3\2\2\2\nz\3\2\2\2\f\u0090\3\2\2\2\16\u00a6\3"+
		"\2\2\2\20\u00d3\3\2\2\2\22\u00db\3\2\2\2\24\u00eb\3\2\2\2\26\u00ed\3\2"+
		"\2\2\30\u00f3\3\2\2\2\32\u00f9\3\2\2\2\34\u00ff\3\2\2\2\36\u0105\3\2\2"+
		"\2 \u010b\3\2\2\2\"\u0117\3\2\2\2$\u0124\3\2\2\2&\u0126\3\2\2\2(\u0130"+
		"\3\2\2\2*\u014a\3\2\2\2,\u014e\3\2\2\2.\u0154\3\2\2\2\60\u015c\3\2\2\2"+
		"\62\u015f\3\2\2\2\64\u0163\3\2\2\2\66\u017a\3\2\2\28\u017c\3\2\2\2:\u0188"+
		"\3\2\2\2<\u01d2\3\2\2\2>\u01dc\3\2\2\2@\u01e8\3\2\2\2B\u01ea\3\2\2\2D"+
		"\u01ec\3\2\2\2F\u01ee\3\2\2\2H\u01f0\3\2\2\2J\u01f2\3\2\2\2LN\13\2\2\2"+
		"ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM\3\2\2\2PU\3\2\2\2QO\3\2\2\2RV\5\4\3\2"+
		"SV\5\6\4\2TV\5\b\5\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2VX\3\2\2\2WO\3\2\2\2"+
		"XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\3\3\2\2\2[]\5\6\4\2\\^\13\2\2\2]\\\3\2"+
		"\2\2]^\3\2\2\2^_\3\2\2\2_`\5$\23\2`\5\3\2\2\2ag\5\26\f\2bg\5\32\16\2c"+
		"g\5\30\r\2dg\5\34\17\2eg\5\36\20\2fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2"+
		"\2\2fe\3\2\2\2g\7\3\2\2\2hp\5\n\6\2ip\7\66\2\2jp\7\60\2\2kp\7\61\2\2l"+
		"p\7\62\2\2mp\7;\2\2np\7\63\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2"+
		"ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\t\3\2\2\2q{\5\f\7\2r{\5\16\b\2s{\5\20"+
		"\t\2t{\5 \21\2uv\7%\2\2v{\5(\25\2wx\7$\2\2x{\5,\27\2y{\5$\23\2zq\3\2\2"+
		"\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2zu\3\2\2\2zw\3\2\2\2zy\3\2\2\2{\13\3\2"+
		"\2\2|\u0080\79\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\5> \2\u0084\u0085\t\2\2\2\u0085\u0091\3\2\2\2\u0086\u0087\5> \2"+
		"\u0087\u008b\t\2\2\2\u0088\u008a\13\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\7:\2\2\u008f\u0091\3\2\2\2\u0090|\3\2\2\2\u0090"+
		"\u0086\3\2\2\2\u0091\r\3\2\2\2\u0092\u0096\7\64\2\2\u0093\u0095\13\2\2"+
		"\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\5> \2\u009a"+
		"\u009b\t\2\2\2\u009b\u00a7\3\2\2\2\u009c\u009d\5> \2\u009d\u00a1\t\2\2"+
		"\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\7\65\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0092\3\2\2\2\u00a6"+
		"\u009c\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\5\24\13\2\u00a9\u00aa\5\22"+
		"\n\2\u00aa\u00d4\3\2\2\2\u00ab\u00ad\5\24\13\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\22\n\2\u00af\u00b1\7"+
		"&\2\2\u00b0\u00b2\7%\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\5(\25\2\u00b4\u00d4\3\2\2\2\u00b5\u00b7\5\24"+
		"\13\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\7&\2\2\u00b9\u00bb\5\22\n\2\u00ba\u00bc\7%\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\5(\25\2\u00be"+
		"\u00d4\3\2\2\2\u00bf\u00c1\5\24\13\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\5\22\n\2\u00c3\u00c5\7&\2\2\u00c4"+
		"\u00c6\7$\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\5,\27\2\u00c8\u00d4\3\2\2\2\u00c9\u00cb\5\24\13\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7&"+
		"\2\2\u00cd\u00cf\5\22\n\2\u00ce\u00d0\7$\2\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00a8\3\2\2\2\u00d3\u00ac\3\2\2\2\u00d3\u00b6\3\2\2\2\u00d3"+
		"\u00c0\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d4\21\3\2\2\2\u00d5\u00d6\5:\36"+
		"\2\u00d6\u00d7\b\n\1\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9\5@!\2\u00d9\u00da"+
		"\b\n\1\2\u00da\u00dc\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc"+
		"\23\3\2\2\2\u00dd\u00de\7\36\2\2\u00de\u00ec\b\13\1\2\u00df\u00e0\7\37"+
		"\2\2\u00e0\u00ec\b\13\1\2\u00e1\u00e2\7 \2\2\u00e2\u00ec\b\13\1\2\u00e3"+
		"\u00e4\7!\2\2\u00e4\u00ec\b\13\1\2\u00e5\u00e6\7\"\2\2\u00e6\u00ec\b\13"+
		"\1\2\u00e7\u00e8\7#\2\2\u00e8\u00ec\b\13\1\2\u00e9\u00ea\7\35\2\2\u00ea"+
		"\u00ec\b\13\1\2\u00eb\u00dd\3\2\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e1\3"+
		"\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\25\3\2\2\2\u00ed\u00ef\5,\27\2\u00ee\u00f0\58\35"+
		"\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2"+
		"\5\36\20\2\u00f2\27\3\2\2\2\u00f3\u00f5\5\34\17\2\u00f4\u00f6\58\35\2"+
		"\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\5,\27\2\u00f8\31\3\2\2\2\u00f9\u00fb\5\36\20\2\u00fa\u00fc\58\35\2\u00fb"+
		"\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\5,"+
		"\27\2\u00fe\33\3\2\2\2\u00ff\u0101\5\"\22\2\u0100\u0102\58\35\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5("+
		"\25\2\u0104\35\3\2\2\2\u0105\u0107\5(\25\2\u0106\u0108\58\35\2\u0107\u0106"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\5\"\22\2"+
		"\u010a\37\3\2\2\2\u010b\u010d\5(\25\2\u010c\u010e\58\35\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5,\27\2\u0110"+
		"!\3\2\2\2\u0111\u0112\5D#\2\u0112\u0113\b\22\1\2\u0113\u0118\3\2\2\2\u0114"+
		"\u0115\5<\37\2\u0115\u0116\b\22\1\2\u0116\u0118\3\2\2\2\u0117\u0111\3"+
		"\2\2\2\u0117\u0114\3\2\2\2\u0118#\3\2\2\2\u0119\u011a\5&\24\2\u011a\u011b"+
		"\5.\30\2\u011b\u011c\5\60\31\2\u011c\u0125\3\2\2\2\u011d\u011e\5&\24\2"+
		"\u011e\u011f\5.\30\2\u011f\u0125\3\2\2\2\u0120\u0121\5&\24\2\u0121\u0122"+
		"\5\60\31\2\u0122\u0125\3\2\2\2\u0123\u0125\5&\24\2\u0124\u0119\3\2\2\2"+
		"\u0124\u011d\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0123\3\2\2\2\u0125%\3"+
		"\2\2\2\u0126\u0127\5F$\2\u0127\u0128\58\35\2\u0128\u0129\5H%\2\u0129\'"+
		"\3\2\2\2\u012a\u012b\5*\26\2\u012b\u012c\b\25\1\2\u012c\u0131\3\2\2\2"+
		"\u012d\u012e\5B\"\2\u012e\u012f\b\25\1\2\u012f\u0131\3\2\2\2\u0130\u012a"+
		"\3\2\2\2\u0130\u012d\3\2\2\2\u0131)\3\2\2\2\u0132\u0133\7\21\2\2\u0133"+
		"\u014b\b\26\1\2\u0134\u0135\7\22\2\2\u0135\u014b\b\26\1\2\u0136\u0137"+
		"\7\23\2\2\u0137\u014b\b\26\1\2\u0138\u0139\7\24\2\2\u0139\u014b\b\26\1"+
		"\2\u013a\u013b\7\25\2\2\u013b\u014b\b\26\1\2\u013c\u013d\7\26\2\2\u013d"+
		"\u014b\b\26\1\2\u013e\u013f\7\27\2\2\u013f\u014b\b\26\1\2\u0140\u0141"+
		"\7\30\2\2\u0141\u014b\b\26\1\2\u0142\u0143\7\31\2\2\u0143\u014b\b\26\1"+
		"\2\u0144\u0145\7\32\2\2\u0145\u014b\b\26\1\2\u0146\u0147\7\33\2\2\u0147"+
		"\u014b\b\26\1\2\u0148\u0149\7\34\2\2\u0149\u014b\b\26\1\2\u014a\u0132"+
		"\3\2\2\2\u014a\u0134\3\2\2\2\u014a\u0136\3\2\2\2\u014a\u0138\3\2\2\2\u014a"+
		"\u013a\3\2\2\2\u014a\u013c\3\2\2\2\u014a\u013e\3\2\2\2\u014a\u0140\3\2"+
		"\2\2\u014a\u0142\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0146\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b+\3\2\2\2\u014c\u014f\7\u00f7\2\2\u014d\u014f\5J&"+
		"\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f-\3\2\2\2\u0150\u0151"+
		"\7\17\2\2\u0151\u0155\b\30\1\2\u0152\u0153\7\20\2\2\u0153\u0155\b\30\1"+
		"\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2\2\2\u0155/\3\2\2\2\u0156\u0157"+
		"\5\62\32\2\u0157\u0158\b\31\1\2\u0158\u015d\3\2\2\2\u0159\u015a\5\66\34"+
		"\2\u015a\u015b\b\31\1\2\u015b\u015d\3\2\2\2\u015c\u0156\3\2\2\2\u015c"+
		"\u0159\3\2\2\2\u015d\61\3\2\2\2\u015e\u0160\7\5\2\2\u015f\u015e\3\2\2"+
		"\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\5\64\33\2\u0162"+
		"\63\3\2\2\2\u0163\u0164\t\3\2\2\u0164\u0165\5&\24\2\u0165\65\3\2\2\2\u0166"+
		"\u0167\7\5\2\2\u0167\u017b\b\34\1\2\u0168\u0169\7\t\2\2\u0169\u017b\b"+
		"\34\1\2\u016a\u016b\7\6\2\2\u016b\u017b\b\34\1\2\u016c\u016d\7\7\2\2\u016d"+
		"\u017b\b\34\1\2\u016e\u016f\7\b\2\2\u016f\u017b\b\34\1\2\u0170\u0171\7"+
		"\n\2\2\u0171\u017b\b\34\1\2\u0172\u0173\7\13\2\2\u0173\u017b\b\34\1\2"+
		"\u0174\u0175\7\f\2\2\u0175\u017b\b\34\1\2\u0176\u0177\7\16\2\2\u0177\u017b"+
		"\b\34\1\2\u0178\u0179\7\r\2\2\u0179\u017b\b\34\1\2\u017a\u0166\3\2\2\2"+
		"\u017a\u0168\3\2\2\2\u017a\u016a\3\2\2\2\u017a\u016c\3\2\2\2\u017a\u016e"+
		"\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0172\3\2\2\2\u017a\u0174\3\2\2\2\u017a"+
		"\u0176\3\2\2\2\u017a\u0178\3\2\2\2\u017b\67\3\2\2\2\u017c\u017d\t\4\2"+
		"\2\u017d9\3\2\2\2\u017e\u017f\t\5\2\2\u017f\u0189\b\36\1\2\u0180\u0181"+
		"\t\6\2\2\u0181\u0189\b\36\1\2\u0182\u0183\t\7\2\2\u0183\u0189\b\36\1\2"+
		"\u0184\u0185\t\b\2\2\u0185\u0189\b\36\1\2\u0186\u0187\t\t\2\2\u0187\u0189"+
		"\b\36\1\2\u0188\u017e\3\2\2\2\u0188\u0180\3\2\2\2\u0188\u0182\3\2\2\2"+
		"\u0188\u0184\3\2\2\2\u0188\u0186\3\2\2\2\u0189;\3\2\2\2\u018a\u018b\t"+
		"\5\2\2\u018b\u01d3\b\37\1\2\u018c\u018d\t\6\2\2\u018d\u01d3\b\37\1\2\u018e"+
		"\u018f\t\7\2\2\u018f\u01d3\b\37\1\2\u0190\u0191\t\b\2\2\u0191\u01d3\b"+
		"\37\1\2\u0192\u0193\t\t\2\2\u0193\u01d3\b\37\1\2\u0194\u0195\t\n\2\2\u0195"+
		"\u01d3\b\37\1\2\u0196\u0197\t\13\2\2\u0197\u01d3\b\37\1\2\u0198\u0199"+
		"\t\f\2\2\u0199\u01d3\b\37\1\2\u019a\u019b\t\r\2\2\u019b\u01d3\b\37\1\2"+
		"\u019c\u019d\t\16\2\2\u019d\u01d3\b\37\1\2\u019e\u019f\t\17\2\2\u019f"+
		"\u01d3\b\37\1\2\u01a0\u01a1\t\20\2\2\u01a1\u01d3\b\37\1\2\u01a2\u01a3"+
		"\t\21\2\2\u01a3\u01d3\b\37\1\2\u01a4\u01a5\t\22\2\2\u01a5\u01d3\b\37\1"+
		"\2\u01a6\u01a7\t\23\2\2\u01a7\u01d3\b\37\1\2\u01a8\u01a9\t\24\2\2\u01a9"+
		"\u01d3\b\37\1\2\u01aa\u01ab\t\25\2\2\u01ab\u01d3\b\37\1\2\u01ac\u01ad"+
		"\t\26\2\2\u01ad\u01d3\b\37\1\2\u01ae\u01af\t\27\2\2\u01af\u01d3\b\37\1"+
		"\2\u01b0\u01b1\t\30\2\2\u01b1\u01d3\b\37\1\2\u01b2\u01b3\7\u00c8\2\2\u01b3"+
		"\u01b4\t\5\2\2\u01b4\u01d3\b\37\1\2\u01b5\u01b6\7\u00c8\2\2\u01b6\u01b7"+
		"\t\6\2\2\u01b7\u01d3\b\37\1\2\u01b8\u01b9\7\u00c8\2\2\u01b9\u01ba\t\7"+
		"\2\2\u01ba\u01d3\b\37\1\2\u01bb\u01bc\7\u00c8\2\2\u01bc\u01bd\t\b\2\2"+
		"\u01bd\u01d3\b\37\1\2\u01be\u01bf\7\u00c8\2\2\u01bf\u01c0\t\t\2\2\u01c0"+
		"\u01d3\b\37\1\2\u01c1\u01c2\7\u00c8\2\2\u01c2\u01c3\t\n\2\2\u01c3\u01d3"+
		"\b\37\1\2\u01c4\u01c5\7\u00c8\2\2\u01c5\u01c6\t\13\2\2\u01c6\u01d3\b\37"+
		"\1\2\u01c7\u01c8\7\u00c8\2\2\u01c8\u01c9\t\f\2\2\u01c9\u01d3\b\37\1\2"+
		"\u01ca\u01cb\7\u00c8\2\2\u01cb\u01cc\t\r\2\2\u01cc\u01d3\b\37\1\2\u01cd"+
		"\u01ce\t\31\2\2\u01ce\u01d3\b\37\1\2\u01cf\u01d0\7\u00c9\2\2\u01d0\u01d1"+
		"\t\5\2\2\u01d1\u01d3\b\37\1\2\u01d2\u018a\3\2\2\2\u01d2\u018c\3\2\2\2"+
		"\u01d2\u018e\3\2\2\2\u01d2\u0190\3\2\2\2\u01d2\u0192\3\2\2\2\u01d2\u0194"+
		"\3\2\2\2\u01d2\u0196\3\2\2\2\u01d2\u0198\3\2\2\2\u01d2\u019a\3\2\2\2\u01d2"+
		"\u019c\3\2\2\2\u01d2\u019e\3\2\2\2\u01d2\u01a0\3\2\2\2\u01d2\u01a2\3\2"+
		"\2\2\u01d2\u01a4\3\2\2\2\u01d2\u01a6\3\2\2\2\u01d2\u01a8\3\2\2\2\u01d2"+
		"\u01aa\3\2\2\2\u01d2\u01ac\3\2\2\2\u01d2\u01ae\3\2\2\2\u01d2\u01b0\3\2"+
		"\2\2\u01d2\u01b2\3\2\2\2\u01d2\u01b5\3\2\2\2\u01d2\u01b8\3\2\2\2\u01d2"+
		"\u01bb\3\2\2\2\u01d2\u01be\3\2\2\2\u01d2\u01c1\3\2\2\2\u01d2\u01c4\3\2"+
		"\2\2\u01d2\u01c7\3\2\2\2\u01d2\u01ca\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2"+
		"\u01cf\3\2\2\2\u01d3=\3\2\2\2\u01d4\u01d5\5J&\2\u01d5\u01d6\b \1\2\u01d6"+
		"\u01dd\3\2\2\2\u01d7\u01d8\5<\37\2\u01d8\u01d9\b \1\2\u01d9\u01dd\3\2"+
		"\2\2\u01da\u01db\t\32\2\2\u01db\u01dd\b \1\2\u01dc\u01d4\3\2\2\2\u01dc"+
		"\u01d7\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd?\3\2\2\2\u01de\u01df\7H\2\2\u01df"+
		"\u01e9\7=\2\2\u01e0\u01e1\7I\2\2\u01e1\u01e9\7>\2\2\u01e2\u01e3\7J\2\2"+
		"\u01e3\u01e9\7?\2\2\u01e4\u01e5\7K\2\2\u01e5\u01e9\7@\2\2\u01e6\u01e7"+
		"\7L\2\2\u01e7\u01e9\7@\2\2\u01e8\u01de\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e8"+
		"\u01e2\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9A\3\2\2\2"+
		"\u01ea\u01eb\t\33\2\2\u01ebC\3\2\2\2\u01ec\u01ed\t\34\2\2\u01edE\3\2\2"+
		"\2\u01ee\u01ef\t\35\2\2\u01efG\3\2\2\2\u01f0\u01f1\t\36\2\2\u01f1I\3\2"+
		"\2\2\u01f2\u01f3\t\37\2\2\u01f3K\3\2\2\2-OUY]foz\u0080\u008b\u0090\u0096"+
		"\u00a1\u00a6\u00ac\u00b1\u00b6\u00bb\u00c0\u00c5\u00ca\u00cf\u00d3\u00db"+
		"\u00eb\u00ef\u00f5\u00fb\u0101\u0107\u010d\u0117\u0124\u0130\u014a\u014e"+
		"\u0154\u015c\u015f\u017a\u0188\u01d2\u01dc\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}