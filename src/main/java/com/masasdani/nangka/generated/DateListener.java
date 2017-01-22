// Generated from Date.g4 by ANTLR 4.5.3

    package com.masasdani.nangka.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DateParser}.
 */
public interface DateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DateParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DateParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DateParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#formal_date_time}.
	 * @param ctx the parse tree
	 */
	void enterFormal_date_time(DateParser.Formal_date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#formal_date_time}.
	 * @param ctx the parse tree
	 */
	void exitFormal_date_time(DateParser.Formal_date_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#formal_date}.
	 * @param ctx the parse tree
	 */
	void enterFormal_date(DateParser.Formal_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#formal_date}.
	 * @param ctx the parse tree
	 */
	void exitFormal_date(DateParser.Formal_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#natural_date}.
	 * @param ctx the parse tree
	 */
	void enterNatural_date(DateParser.Natural_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#natural_date}.
	 * @param ctx the parse tree
	 */
	void exitNatural_date(DateParser.Natural_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#relative_date}.
	 * @param ctx the parse tree
	 */
	void enterRelative_date(DateParser.Relative_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#relative_date}.
	 * @param ctx the parse tree
	 */
	void exitRelative_date(DateParser.Relative_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#relative_date_past}.
	 * @param ctx the parse tree
	 */
	void enterRelative_date_past(DateParser.Relative_date_pastContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#relative_date_past}.
	 * @param ctx the parse tree
	 */
	void exitRelative_date_past(DateParser.Relative_date_pastContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#relative_date_future}.
	 * @param ctx the parse tree
	 */
	void enterRelative_date_future(DateParser.Relative_date_futureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#relative_date_future}.
	 * @param ctx the parse tree
	 */
	void exitRelative_date_future(DateParser.Relative_date_futureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#week_of_month}.
	 * @param ctx the parse tree
	 */
	void enterWeek_of_month(DateParser.Week_of_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#week_of_month}.
	 * @param ctx the parse tree
	 */
	void exitWeek_of_month(DateParser.Week_of_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#week}.
	 * @param ctx the parse tree
	 */
	void enterWeek(DateParser.WeekContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#week}.
	 * @param ctx the parse tree
	 */
	void exitWeek(DateParser.WeekContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#day_of_week}.
	 * @param ctx the parse tree
	 */
	void enterDay_of_week(DateParser.Day_of_weekContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#day_of_week}.
	 * @param ctx the parse tree
	 */
	void exitDay_of_week(DateParser.Day_of_weekContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#year_month_day}.
	 * @param ctx the parse tree
	 */
	void enterYear_month_day(DateParser.Year_month_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#year_month_day}.
	 * @param ctx the parse tree
	 */
	void exitYear_month_day(DateParser.Year_month_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#day_month_year}.
	 * @param ctx the parse tree
	 */
	void enterDay_month_year(DateParser.Day_month_yearContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#day_month_year}.
	 * @param ctx the parse tree
	 */
	void exitDay_month_year(DateParser.Day_month_yearContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#month_day_year}.
	 * @param ctx the parse tree
	 */
	void enterMonth_day_year(DateParser.Month_day_yearContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#month_day_year}.
	 * @param ctx the parse tree
	 */
	void exitMonth_day_year(DateParser.Month_day_yearContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#day_month}.
	 * @param ctx the parse tree
	 */
	void enterDay_month(DateParser.Day_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#day_month}.
	 * @param ctx the parse tree
	 */
	void exitDay_month(DateParser.Day_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#month_day}.
	 * @param ctx the parse tree
	 */
	void enterMonth_day(DateParser.Month_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#month_day}.
	 * @param ctx the parse tree
	 */
	void exitMonth_day(DateParser.Month_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#month_year}.
	 * @param ctx the parse tree
	 */
	void enterMonth_year(DateParser.Month_yearContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#month_year}.
	 * @param ctx the parse tree
	 */
	void exitMonth_year(DateParser.Month_yearContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#day_of_month}.
	 * @param ctx the parse tree
	 */
	void enterDay_of_month(DateParser.Day_of_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#day_of_month}.
	 * @param ctx the parse tree
	 */
	void exitDay_of_month(DateParser.Day_of_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(DateParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(DateParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#hour_minute}.
	 * @param ctx the parse tree
	 */
	void enterHour_minute(DateParser.Hour_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#hour_minute}.
	 * @param ctx the parse tree
	 */
	void exitHour_minute(DateParser.Hour_minuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(DateParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(DateParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#vocal_month}.
	 * @param ctx the parse tree
	 */
	void enterVocal_month(DateParser.Vocal_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#vocal_month}.
	 * @param ctx the parse tree
	 */
	void exitVocal_month(DateParser.Vocal_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(DateParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(DateParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#am_pm}.
	 * @param ctx the parse tree
	 */
	void enterAm_pm(DateParser.Am_pmContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#am_pm}.
	 * @param ctx the parse tree
	 */
	void exitAm_pm(DateParser.Am_pmContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#timezone}.
	 * @param ctx the parse tree
	 */
	void enterTimezone(DateParser.TimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#timezone}.
	 * @param ctx the parse tree
	 */
	void exitTimezone(DateParser.TimezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#timezone_plus_offset}.
	 * @param ctx the parse tree
	 */
	void enterTimezone_plus_offset(DateParser.Timezone_plus_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#timezone_plus_offset}.
	 * @param ctx the parse tree
	 */
	void exitTimezone_plus_offset(DateParser.Timezone_plus_offsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#time_zone_offset}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone_offset(DateParser.Time_zone_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#time_zone_offset}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone_offset(DateParser.Time_zone_offsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#timezone_abbeviation}.
	 * @param ctx the parse tree
	 */
	void enterTimezone_abbeviation(DateParser.Timezone_abbeviationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#timezone_abbeviation}.
	 * @param ctx the parse tree
	 */
	void exitTimezone_abbeviation(DateParser.Timezone_abbeviationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#date_separator}.
	 * @param ctx the parse tree
	 */
	void enterDate_separator(DateParser.Date_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#date_separator}.
	 * @param ctx the parse tree
	 */
	void exitDate_separator(DateParser.Date_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#spelling_week}.
	 * @param ctx the parse tree
	 */
	void enterSpelling_week(DateParser.Spelling_weekContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#spelling_week}.
	 * @param ctx the parse tree
	 */
	void exitSpelling_week(DateParser.Spelling_weekContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#spelling_date}.
	 * @param ctx the parse tree
	 */
	void enterSpelling_date(DateParser.Spelling_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#spelling_date}.
	 * @param ctx the parse tree
	 */
	void exitSpelling_date(DateParser.Spelling_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(DateParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(DateParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#numeric_week}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_week(DateParser.Numeric_weekContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#numeric_week}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_week(DateParser.Numeric_weekContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#numeric_month}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_month(DateParser.Numeric_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#numeric_month}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_month(DateParser.Numeric_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#numeric_day}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_day(DateParser.Numeric_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#numeric_day}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_day(DateParser.Numeric_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#numeric_hour}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_hour(DateParser.Numeric_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#numeric_hour}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_hour(DateParser.Numeric_hourContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#numeric_minute}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_minute(DateParser.Numeric_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#numeric_minute}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_minute(DateParser.Numeric_minuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#numeric_year}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_year(DateParser.Numeric_yearContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#numeric_year}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_year(DateParser.Numeric_yearContext ctx);
}