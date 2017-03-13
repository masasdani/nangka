package com.masasdani.nangka;

import java.util.Date;
import java.util.List;

/**
 * Result of the date parsing will be stored here
 *
 * @author masasdani
 */
public class DateUnit {

    private Date unit;
    private Date start;
    private Date end;
    private List<Date> relatedDates;

    public DateUnit() {

    }

    public Date getUnit() {
        return unit;
    }

    public void setUnit(Date unit) {
        this.unit = unit;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public List<Date> getRelatedDates() {
        return relatedDates;
    }

    public void setRelatedDates(List<Date> relatedDates) {
        this.relatedDates = relatedDates;
    }
}
