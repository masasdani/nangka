// Generated from Date.g4 by ANTLR 4.5.3

    package com.masasdani.nangka.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DateParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DateParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#formal_date_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_date_time(DateParser.Formal_date_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#formal_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_date(DateParser.Formal_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#natural_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatural_date(DateParser.Natural_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#relative_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative_date(DateParser.Relative_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#relative_date_past}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative_date_past(DateParser.Relative_date_pastContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#relative_date_future}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative_date_future(DateParser.Relative_date_futureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#week_of_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeek_of_month(DateParser.Week_of_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#week}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeek(DateParser.WeekContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#day_of_week}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_of_week(DateParser.Day_of_weekContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#year_month_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear_month_day(DateParser.Year_month_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#day_month_year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_month_year(DateParser.Day_month_yearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#month_day_year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth_day_year(DateParser.Month_day_yearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#day_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_month(DateParser.Day_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#month_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth_day(DateParser.Month_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#month_year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth_year(DateParser.Month_yearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#day_of_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_of_month(DateParser.Day_of_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(DateParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#hour_minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour_minute(DateParser.Hour_minuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(DateParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#vocal_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVocal_month(DateParser.Vocal_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(DateParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#am_pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAm_pm(DateParser.Am_pmContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone(DateParser.TimezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#timezone_plus_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone_plus_offset(DateParser.Timezone_plus_offsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#time_zone_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone_offset(DateParser.Time_zone_offsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#timezone_abbeviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone_abbeviation(DateParser.Timezone_abbeviationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#date_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_separator(DateParser.Date_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#spelling_week}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpelling_week(DateParser.Spelling_weekContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#spelling_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpelling_date(DateParser.Spelling_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(DateParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#numeric_week}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_week(DateParser.Numeric_weekContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#numeric_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_month(DateParser.Numeric_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#numeric_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_day(DateParser.Numeric_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#numeric_hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_hour(DateParser.Numeric_hourContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#numeric_minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_minute(DateParser.Numeric_minuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#numeric_year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_year(DateParser.Numeric_yearContext ctx);
}