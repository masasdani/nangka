grammar Date;

import CommonDateLexer;

@header {
    package com.masasdani.nangka.generated;
}

options {
    output = AST;
}

parse
    : (.*?
        ( formal_date_time
        | formal_date
        | natural_date
        ))+
    ;

formal_date_time
    : formal_date .? time
    ;

formal_date
    : year_month_day
    | month_day_year
    | day_month_year
    | day_month
    | month_day
    ;

natural_date
    : relative_date
    | CURRENT
    | TODAY
    | TOMORROW
    | TONIGHT
    | AFTER_TOMORROW
    | YESTERDAY
    ;

relative_date
    : relative_date_past
    | relative_date_future
    | week_of_month
    | month_year
    | MONTH month
    | YEAR year
    | time
    ;

relative_date_past
    : PAST_PREFIX .*? interval ( YEAR | MONTH | WEEK | DAY | HOUR | MINUTE )
    | interval ( YEAR | MONTH | WEEK | DAY | HOUR | MINUTE ) .*? PAST_SUFFIX
    ;

relative_date_future
    : FUTURE_PREFIX .*? interval ( YEAR | MONTH | WEEK | DAY | HOUR | MINUTE )
    | interval ( YEAR | MONTH | WEEK | DAY | HOUR | MINUTE ) .*? FUTURE_SUFFIX
    ;

week_of_month
    : day_of_week week
    | day_of_week? week WEEK MONTH? month
    | day_of_week? WEEK week MONTH? month
    | day_of_week? week WEEK YEAR? year
    | day_of_week? WEEK week YEAR? year
    ;

week
returns [String w]
    : spelling_week {$w = $spelling_week.num;}
    | numeric_week  {$w = $numeric_week.text;}
    ;

day_of_week
returns [int d]
    : MONDAY        {$d=1;}
    | TUESDAY       {$d=2;}
    | WEDNESDAY     {$d=3;}
    | THURSDAY      {$d=4;}
    | FRIDAY        {$d=5;}
    | SATURDAY      {$d=6;}
    | SUNDAY        {$d=7;}
    ;

year_month_day
    : year date_separator? month_day
    ;

day_month_year
    : day_month date_separator? year
    ;

month_day_year
    : month_day date_separator? year
    ;

day_month
    : day_of_month date_separator? month
    ;

month_day
    : month date_separator? day_of_month
    ;

month_year
    : month date_separator? year
    ;

day_of_month
returns [String day]
    : numeric_day   {$day = $numeric_day.text;}
    | spelling_date {$day = $spelling_date.num;}
    ;

time
    : hour_minute am_pm timezone
    | hour_minute am_pm
    | hour_minute timezone
    | hour_minute
    ;

hour_minute
    : numeric_hour date_separator numeric_minute
    ;

month
returns [String mm]
    : vocal_month   {$mm = $vocal_month.num;}
    | numeric_month {$mm = $numeric_month.text;}
    ;

vocal_month
returns [String num]
    : JANUARY       {$num = "1";}
    | FEBRUARY      {$num = "2";}
    | MARCH         {$num = "3";}
    | APRIL         {$num = "4";}
    | MAY           {$num = "5";}
    | JUNE          {$num = "6";}
    | JULY          {$num = "7";}
    | AUGUST        {$num = "8";}
    | SEPTEMBER     {$num = "9";}
    | OCTOBER       {$num = "10";}
    | NOVEMBER      {$num = "11";}
    | DECEMBER      {$num = "12";}
    ;

year
    : FOUR_DIGIT
    | numeric_year
    ;

am_pm
returns [String ampm]
    : AM            {$ampm = "AM";}
    | PM            {$ampm = "PM";}
    ;

timezone
returns [String tz]
    : timezone_plus_offset  {$tz = $timezone_plus_offset.text;}
    | timezone_abbeviation  {$tz = $timezone_abbeviation.tz;}
    ;

timezone_plus_offset
    : UTC? time_zone_offset;

time_zone_offset
    : (PLUS | DASH) hour_minute
    ;

timezone_abbeviation
returns [String tz]
    : UTC           {$tz="UTC";}
    | MST           {$tz="MST";}
    | EST           {$tz="EST";}
    | PST           {$tz="PST8PDT";}
    | CST           {$tz="CST6CDT";}
    | AKST          {$tz="America/Anchorage";}
    | HAST          {$tz="Pacific/Honolulu";}
    | WIB           {$tz="Asia/Jakarta";}
    | WITA          {$tz="Asia/Makassar";}
    | WIT           {$tz="Asia/Jayapura";}
    ;

date_separator
    : COMMA
    | DOT
    | COLON
    | SLASH
    | DASH
    ;

spelling_week
returns [String num]
    : ( ONE | FIRST)                {$num = "1";}
    | ( TWO | SECOND)               {$num = "2";}
    | ( THREE | THIRD)              {$num = "3";}
    | ( FOUR | FOURTH)              {$num = "4";}
    | ( FIVE | FIFTH)               {$num = "5";}
    ;

spelling_date
returns [String num]
    : ( ONE | FIRST)                {$num = "1";}
    | ( TWO | SECOND)               {$num = "2";}
    | ( THREE | THIRD)              {$num = "3";}
    | ( FOUR | FOURTH)              {$num = "4";}
    | ( FIVE | FIFTH)               {$num = "5";}
    | ( SIX | SIXTH)                {$num = "6";}
    | ( SEVEN | SEVENTH)            {$num = "7";}
    | ( EIGHT | EIGHTH)             {$num = "8";}
    | ( NINE | NINTH)               {$num = "9";}
    | ( TEN | TENTH)                {$num = "10";}
    | ( ELEVEN | ELEVENTH)          {$num = "11";}
    | ( TWELVE | TWELFTH)           {$num = "12";}
    | ( THIRTEEN | THIRTEENTH)      {$num = "13";}
    | ( FOURTEEN | FOURTEENTH)      {$num = "14";}
    | ( FIFTEEN | FIFTEENTH)        {$num = "15";}
    | ( SIXTEEN | SIXTEENTH)        {$num = "16";}
    | ( SEVENTEEN | SEVENTEENTH)    {$num = "17";}
    | ( EIGHTEEN | EIGHTEENTH)      {$num = "18";}
    | ( NINETEEN | NINETEENTH)      {$num = "19";}
    | ( TWENTY | TWENTIETH)         {$num = "20";}
    | TWENTY ( ONE | FIRST)         {$num = "21";}
    | TWENTY ( TWO | SECOND)        {$num = "22";}
    | TWENTY ( THREE | THIRD)       {$num = "23";}
    | TWENTY ( FOUR | FOURTH)       {$num = "24";}
    | TWENTY ( FIVE | FIFTH)        {$num = "25";}
    | TWENTY ( SIX | SIXTH)         {$num = "26";}
    | TWENTY ( SEVEN | SEVENTH)     {$num = "27";}
    | TWENTY ( EIGHT | EIGHTH)      {$num = "28";}
    | TWENTY ( NINE | NINTH)        {$num = "29";}
    | ( THIRTY | THIRTIETH)         {$num = "30";}
    | THIRTY ( ONE | FIRST)         {$num = "31";}
    ;

interval
returns [int i]
    : numeric_year  {$i = Integer.valueOf($numeric_year.text);}
    | spelling_date {$i = Integer.valueOf($spelling_date.num);}
    | ('a' | 'an')  {$i = 1;}
    ;

numeric_week
    : INT_1 ST  | INT_2 ND | INT_3 RD | INT_4 TH | INT_5 TH ;

numeric_month
    : INT_1  | INT_2  | INT_3  | INT_4  | INT_5  | INT_6  | INT_7  | INT_8  | INT_9
    | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09
    | INT_10 | INT_11 | INT_12
    ;

numeric_day
    : INT_1  | INT_2  | INT_3  | INT_4  | INT_5  | INT_6  | INT_7  | INT_8  | INT_9
    | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09
    | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18
    | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27
    | INT_28 | INT_29 | INT_30 | INT_31
    ;

numeric_hour
    : INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09
    | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18
    | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_00
    ;

numeric_minute
    : INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09
    | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18
    | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27
    | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36
    | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45
    | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54
    | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_00
    ;

numeric_year
    : INT_1  | INT_2  | INT_3  | INT_4  | INT_5  | INT_6  | INT_7  | INT_8  | INT_9
    | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09
    | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18
    | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27
    | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36
    | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45
    | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54
    | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63
    | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72
    | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81
    | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90
    | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99
    | INT_00
    ;

// ********* timezone *********

UTC : 'utc'
    | 'gmt'
    | 'z'
    ;

EST : 'est'
    | 'edt'
    | 'et'
    | 'eastern'
    ;

PST : 'pst'
    | 'pdt'
    | 'pt'
    | 'pacific'
    ;

CST : 'cst'
    | 'cdt'
    | 'ct'
    | 'central'
    ;

MST : 'mst'
    | 'mdt'
    | 'mt'
    | 'mountain'
    ;

AKST: 'akst'
    | 'akdt'
    | 'akt'
    | 'alaska'
    ;

HAST: 'hast'
    | 'hadt'
    | 'hat'
    | 'hst'
    | 'hawaii'
    ;

WIB : 'wib'
    | 'waktu indonesia' 'bagian'? 'barat'
    ;

WIT : 'wit'
    | 'waktu indonesia' 'bagian'? 'timur'
    ;

WITA: 'wita'
    | 'waktu indonesia' 'bagian'? 'tengah'
    ;

// **** half day rules ****

AM  : 'am' | 'a.m' | 'a_m' | 'a' ;

PM  : 'pm' | 'p.m' | 'p_m' | 'p' ;
