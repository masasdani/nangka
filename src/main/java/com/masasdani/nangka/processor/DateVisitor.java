package com.masasdani.nangka.processor;

import com.masasdani.nangka.DateUnit;
import com.masasdani.nangka.generated.DateBaseVisitor;
import com.masasdani.nangka.generated.DateParser;
import org.joda.time.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by masasdani on 8/8/16.
 */
public class DateVisitor extends DateBaseVisitor {

    private DateTime reference;
    private List<Date> dates;
    private int offset = 0;

    public DateVisitor(){
        this.reference = DateTime.now();
        dates = new ArrayList<>();
        offset = reference.getZone().getOffset(reference.toDate().getTime());
    }

    public DateUnit getResult(){
        DateUnit dateUnit = new DateUnit();
        dateUnit.setUnit(reference.toDate());
        Collections.sort(dates);
        dateUnit.setRelatedDates(dates);
        if(dates.size() > 0){
            dateUnit.setStart(dates.get(0));
            dateUnit.setEnd(dates.get(dates.size() - 1));
        }
        return dateUnit;
    }

    @Override
    public DateTime visitFormal_date_time(DateParser.Formal_date_timeContext ctx) {
        DateTime dateTime = new DateTime();
        if(notNull(ctx.formal_date())){
            dateTime = visitFormal_date(ctx.formal_date());
        }
        if(notNull(ctx.time())){
            dateTime = dateTime.withTime(visitTime(ctx.time()));
        }
        reference = dateTime.plus(offset);
        dates.add(reference.toDate());
        return dateTime;
    }

    @Override
    public DateTime visitFormal_date(DateParser.Formal_dateContext ctx) {
        DateTime dateTime = reference;
        if(notNull(ctx.year_month_day())){
            dateTime = visitYear_month_day(ctx.year_month_day());
        }else if(notNull(ctx.month_day_year())){
            dateTime = visitMonth_day_year(ctx.month_day_year());
        }else if(notNull(ctx.day_month_year())){
            dateTime = visitDay_month_year(ctx.day_month_year());
        }else if(notNull(ctx.day_month())){
            dateTime = visitDay_month(ctx.day_month());
        }else if(notNull(ctx.month_day())){
            dateTime = visitMonth_day(ctx.month_day());
        }
        if(ctx.getParent().getRuleIndex() == DateParser.RULE_parse){
            dates.add(dateTime.plus(offset).toDate());
        }
        return dateTime;
    }

    @Override
    public LocalTime visitTime(DateParser.TimeContext ctx) {
        if(notNull(ctx.timezone())){
            int currentOffset = DateTimeZone.forID(ctx.timezone().timezone_abbeviation().tz)
                    .getOffset(reference.toDate().getTime());
            offset = offset - currentOffset;
        }else {
            offset = 0;
        }
        LocalTime localTime = new LocalTime(reference.getZone());
        if(notNull(ctx.am_pm())) {
            localTime = localTime.withField(DateTimeFieldType.halfdayOfDay(),
                    ctx.am_pm().ampm.equalsIgnoreCase("am") ? 0 : 1);
            localTime = localTime.withField(DateTimeFieldType.hourOfHalfday(),
                    Integer.valueOf(ctx.hour_minute().numeric_hour().getText()));
        }else{
            localTime = localTime.withHourOfDay(Integer.valueOf(ctx.hour_minute().numeric_hour().getText()));
        }
        localTime = localTime.withMinuteOfHour(Integer.valueOf(ctx.hour_minute().numeric_minute().getText()));
        return localTime;
    }

    @Override
    public DateTime visitDay_month_year(DateParser.Day_month_yearContext ctx) {
        return visitDay_month(ctx.day_month())
                .withYear(Integer.valueOf(ctx.year().getText()));
    }

    @Override
    public DateTime visitYear_month_day(DateParser.Year_month_dayContext ctx) {
        return visitMonth_day(ctx.month_day())
                .withYear(Integer.valueOf(ctx.year().getText()));
    }

    @Override
    public DateTime visitMonth_day_year(DateParser.Month_day_yearContext ctx) {
        return visitMonth_day(ctx.month_day())
                .withYear(Integer.valueOf(ctx.year().getText()));
    }

    @Override
    public DateTime visitDay_month(DateParser.Day_monthContext ctx) {
        return new DateTime(reference.getZone())
                .withDayOfMonth(Integer.valueOf(ctx.day_of_month().day))
                .withMonthOfYear(Integer.valueOf(ctx.month().mm));
    }

    @Override
    public DateTime visitMonth_day(DateParser.Month_dayContext ctx) {
        return reference.toDateTime()
                .withDayOfMonth(Integer.valueOf(ctx.day_of_month().day))
                .withMonthOfYear(Integer.valueOf(ctx.month().mm));
    }

    @Override
    public DateTime visitNatural_date(DateParser.Natural_dateContext ctx) {
        DateTime dateTime = reference;
        if(notNull(ctx.CURRENT())){
            dateTime = DateTime.now();
        }else if(notNull(ctx.TOMORROW())){
            dateTime = dateTime.plusDays(1);
        }else if(notNull(ctx.AFTER_TOMORROW())){
            dateTime = dateTime.plusDays(2);
        }else if(notNull(ctx.TODAY())){
            dateTime = dateTime.withTimeAtStartOfDay();
        }else if(notNull(ctx.YESTERDAY())){
            dateTime = dateTime.minusDays(1);
        }else if(notNull(ctx.TONIGHT())){
            dateTime = dateTime.withTimeAtStartOfDay().plusHours(18);
        }else if(notNull(ctx.relative_date())){
            Object o = visitRelative_date(ctx.relative_date());
            if(o instanceof DateTime){
                dateTime = (DateTime) o;
            }
            if(o instanceof LocalTime){
                dateTime = dateTime.withTime((LocalTime) o);
            }
        }
        dates.add(dateTime.toDate());
        return dateTime;
    }

    @Override
    public DateTime visitRelative_date_future(DateParser.Relative_date_futureContext ctx) {
        DateTime dateTime = reference;
        int interval = 1;
        if(notNull(ctx.interval())){
            interval = ctx.interval().i;
        }
        if(notNull(ctx.YEAR())){
            dateTime = dateTime.plusYears(interval);
        }else if(notNull(ctx.MONTH())){
            dateTime = dateTime.plusMonths(interval);
        }else if(notNull(ctx.WEEK())){
            dateTime = dateTime.plusWeeks(interval);
        }else if(notNull(ctx.DAY())){
            dateTime = dateTime.plusDays(interval);
        }else if(notNull(ctx.HOUR())){
            dateTime = dateTime.plusHours(interval);
        }else if(notNull(ctx.MINUTE())){
            dateTime = dateTime.plusMinutes(interval);
        }
        return dateTime;
    }

    @Override
    public Object visitRelative_date_past(DateParser.Relative_date_pastContext ctx) {
        DateTime dateTime = reference;
        int interval = ctx.interval().i ;
        if(notNull(ctx.YEAR())){
            dateTime = dateTime.minusYears(interval);
        }else if(notNull(ctx.MONTH())){
            dateTime = dateTime.minusMonths(interval);
        }else if(notNull(ctx.WEEK())){
            dateTime = dateTime.minusWeeks(interval);
        }else if(notNull(ctx.DAY())){
            dateTime = dateTime.minusDays(interval);
        }else if(notNull(ctx.HOUR())){
            dateTime = dateTime.minusHours(interval);
        }else if(notNull(ctx.MINUTE())){
            dateTime = dateTime.minusMinutes(interval);
        }
        return dateTime;
    }

    @Override
    public Object visitRelative_date(DateParser.Relative_dateContext ctx) {
        if(notNull(ctx.time())){
            return visitTime(ctx.time());
        }
        if(notNull(ctx.week_of_month())){
            return visitWeek_of_month(ctx.week_of_month());
        }
        if(notNull(ctx.month_year())){
            return visitMonth_year(ctx.month_year());
        }
        if(notNull(ctx.year())){
            return reference.toDateTime()
                    .withYear(Integer.valueOf(ctx.year().getText()))
                    .withDayOfYear(0);
        }
        if(notNull(ctx.relative_date_past())){
            return visitRelative_date_past(ctx.relative_date_past());
        }
        if(notNull(ctx.relative_date_future())){
            return visitRelative_date_future(ctx.relative_date_future());
        }
        return null;
    }

    @Override
    public DateTime visitMonth_year(DateParser.Month_yearContext ctx) {
        return reference
                .withMonthOfYear(Integer.valueOf(ctx.month().mm))
                .withYear(Integer.valueOf(ctx.year().getText()))
                .withTimeAtStartOfDay();
    }

    @Override
    public DateTime visitWeek_of_month(DateParser.Week_of_monthContext ctx) {
        DateTime dateTime = reference;
        if(notNull(ctx.year())){
            dateTime = dateTime.withYear(Integer.valueOf(ctx.year().getText()));
        }
        if(notNull(ctx.month())){
            dateTime = dateTime.withMonthOfYear(Integer.valueOf(ctx.month().mm));
        }
        if(notNull(ctx.week())){
            int week = Integer.valueOf(ctx.week().w);
            dateTime = dateTime.withDayOfMonth((week - 1) * 7);
        }
        if(notNull(ctx.day_of_week())){
            dateTime = dateTime.withDayOfWeek(ctx.day_of_week().d);
        }
        return dateTime;
    }

    private boolean notNull(Object o){
        return o != null;
    }

}
