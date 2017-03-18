Nangka Project
==============

This is a Natural Language Date Parser Library for Java, build using ANTLR4 Library. Currently support for Indonesian and English

It's now available in maven central. latest version: 0.0.6

Usage
=====

add this project as dependency of your project

	    <dependency>
            <groupId>com.masasdani</groupId>
            <artifactId>nangka</artifactId>
            <version>0.0.6</version>
        </dependency>

Sample usage :
        
        String exprEn = "a month later, 20-11-90";
        Nangka nangka = new Nangka();
        DateUnit dateUnit = nangka.parse(exprEn);
        for(Date date : dateUnit.getRelatedDates()){
            System.out.println(date);
        }
        
The DateUnit class contains 
* unit (the most relevant date from the text given)
* start (first of relevant date from the text)
* end (end od relevant date from the text)
* relatedDates (all the dates found from the text)