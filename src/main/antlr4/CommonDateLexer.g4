lexer grammar CommonDateLexer;
import NumericLexer;

// **** Formal Rule *****

JANUARY
    : 'january' | 'jan'
    // ID
    | 'januari'
    ;

FEBRUARY
    : 'february' | 'feb'
    // ID
    | 'februari'
    ;

MARCH
    : 'march' | 'mar'
    // ID
    | 'maret'
    ;

APRIL
    : 'april' | 'apr'
    ;

MAY : 'may'
    // ID
    | 'mei'
    ;

JUNE
    : 'june' | 'jun'
    // ID
    | 'juni'
    ;

JULY
    : 'july' | 'jul'
    // ID
    | 'juli'
    ;

AUGUST
    : 'august' | 'aug'
    // ID
    | 'agustus' | 'agu'
    ;

SEPTEMBER
    : 'september'
    | 'sep'
    | 'sept'
    ;

OCTOBER
    : 'october'
    | 'oct'
    // ID
    | 'oktober'
    | 'oct'
    ;

NOVEMBER
    : 'november' | 'nov'
    // ID
    | 'nopember' | 'nop'
    ;

DECEMBER
    : 'december' | 'dec'
    // ID
    | 'desember' | 'des'
    ;

SUNDAY
    : 'sunday' | 'sun' | 'suns'
    // ID
    | 'minggu' | 'min' | 'ahad'
    ;

MONDAY
    : 'monday' | 'mon' | 'mons'
    // ID
    | 'senin' | 'sen'
    ;

TUESDAY
    : 'tuesday' | 'tues' | 'tue'
    // ID
    | 'selasa' | 'sel'
    ;

WEDNESDAY
    : 'wednesday' | 'wed' | 'weds'
    // ID
    | 'rabu' | 'rab'
    ;

THURSDAY
    : 'thursday' | 'thur' | 'thu' | 'thus' | 'thurs'
    // ID
    | 'kamis' | 'kemis' | 'kam'
    ;

FRIDAY
    : 'friday' | 'fri' | 'fris'
    // ID
    | 'jumat' | 'jum\'at' | 'jum'
    ;

SATURDAY
    : 'saturday' | 'sat' | 'sats' | 'weekend'
    // ID
    | 'sabtu' | 'sabt' | 'sab' | 'ahir pekan'
    ;

// **** lexical rule ****

YEAR
    : 'year' | 'year' '\'' 's' | 'yrs'
    // ID
    | 'tahun' | 'thn'
    ;

MONTH
    : 'month' | 'months'
    // ID
    | 'bulan' | 'bln'
    ;

WEEK
    : 'week' | 'weeks' | 'wks'
    // ID
    | 'pekan' | 'minggu'
    ;

DAY : 'day' | 'days'
    // ID
    | 'hari'
    ;

HOUR
    : 'hour' | 'hours' | 'hr' | 'hrs'
    // ID
    | 'jam' | 'pukul' | 'pkl'
    ;

MINUTE
    : 'minute' | 'minutes' | 'min' | 'mins'
    // ID
    | 'menit' | 'mnt'
    ;

// **** relative rule ****

MIDNIGHT
    : 'midnight' | 'mid-night'
    // ID
    | 'tengah malam'
    ;

NOON
    : 'noon' | 'afternoon' | 'after-noon'
    // ID
    | 'siang' | 'dhuhur'
    ;

MORNING
    : 'morning'
    // ID
    | 'pagi' | 'subuh' | 'terbit' | 'dluha' | 'dhuha'
    ;

EVENING
    : 'evening' | 'eve'
    // ID
    | 'sore' | 'asar' | 'ashar' | 'magrib' | 'petang'
    ;

NIGHT
    : 'night'
    // ID
    | 'malam' | 'isya'
    ;

// **** reverence *****

DATE_PREFIX
    : 'on' | 'at' | '@'
    // ID
    | 'pada'
    ;

TODAY
    : 'today'
    // ID
    | 'hari ini'
    ;

TOMORROW
    : 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' | 'tmr'
    // ID
    | 'besok' | 'bsk'
    ;

TONIGHT
    : 'tonight'
    // ID
    | 'nanti'? 'malam' 'ini'?
    ;

YESTERDAY
    : 'yesterday'
    // ID
    | 'kemaren' | 'kemarin'
    ;

FUTURE_PREFIX
    : 'next' | 'upcoming' | 'for' | 'to' | 'by' | 'after'
    // ID
    | 'setelah' | 'abis' | 'ba\'da' | 'nanti'
    ;

FUTURE_SUFFIX
    : 'later'
    // ID
    | 'kemudian' | 'kedepan' | 'setelahnya' | 'selanjutnya' | 'depan'
    ;

CURRENT
    : 'today' | 'now' | 'present' | 'current'
    // ID
    | 'sekarang'
    ;

CURRENT_PREFIX
    : 'this' | 'on'
    // ID
    | 'sedang'
    ;

CURRENT_SUFFIX
    : 'ini'
    ;

PAST_PREFIX
    : 'through' | 'last' | 'from'
    // ID
    | 'tadi' | 'dulu' | 'sebelum'
    ;

PAST_SUFFIX
    : 'ago'
    // ID
    | 'lalu'
    ;

AFTER_TOMORROW
    : 'lusa'
    ;

T   : 't' ;

// ********** suffixes **********

ST : 'st';
ND : 'nd';
RD : 'rd';
TH : 'th';

// ********** season specific **********

WINTER  : 'winter' 's'? ;

FALL    : 'fall'   's'? ;

AUTUMN  : 'autumn' 's'? ;

SPRING  : 'spring' 's'? ;

SUMMER  : 'summer' 's'?
        // ID
        | 'panas' | 'kemarau' ;

RAIN    : 'hujan' | 'penghujan' ;