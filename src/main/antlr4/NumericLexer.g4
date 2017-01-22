lexer grammar NumericLexer;
import CommonLexer;

// ******* Numeric Rule *************

INT_0  : '0';
INT_1  : '1';
INT_2  : '2';
INT_3  : '3';
INT_4  : '4';
INT_5  : '5';
INT_6  : '6';
INT_7  : '7';
INT_8  : '8';
INT_9  : '9';
INT_00 : '00';
INT_01 : '01';
INT_02 : '02';
INT_03 : '03';
INT_04 : '04';
INT_05 : '05';
INT_06 : '06';
INT_07 : '07';
INT_08 : '08';
INT_09 : '09';
INT_10 : '10';
INT_11 : '11';
INT_12 : '12';
INT_13 : '13';
INT_14 : '14';
INT_15 : '15';
INT_16 : '16';
INT_17 : '17';
INT_18 : '18';
INT_19 : '19';
INT_20 : '20';
INT_21 : '21';
INT_22 : '22';
INT_23 : '23';
INT_24 : '24';
INT_25 : '25';
INT_26 : '26';
INT_27 : '27';
INT_28 : '28';
INT_29 : '29';
INT_30 : '30';
INT_31 : '31';
INT_32 : '32';
INT_33 : '33';
INT_34 : '34';
INT_35 : '35';
INT_36 : '36';
INT_37 : '37';
INT_38 : '38';
INT_39 : '39';
INT_40 : '40';
INT_41 : '41';
INT_42 : '42';
INT_43 : '43';
INT_44 : '44';
INT_45 : '45';
INT_46 : '46';
INT_47 : '47';
INT_48 : '48';
INT_49 : '49';
INT_50 : '50';
INT_51 : '51';
INT_52 : '52';
INT_53 : '53';
INT_54 : '54';
INT_55 : '55';
INT_56 : '56';
INT_57 : '57';
INT_58 : '58';
INT_59 : '59';
INT_60 : '60';
INT_61 : '61';
INT_62 : '62';
INT_63 : '63';
INT_64 : '64';
INT_65 : '65';
INT_66 : '66';
INT_67 : '67';
INT_68 : '68';
INT_69 : '69';
INT_70 : '70';
INT_71 : '71';
INT_72 : '72';
INT_73 : '73';
INT_74 : '74';
INT_75 : '75';
INT_76 : '76';
INT_77 : '77';
INT_78 : '78';
INT_79 : '79';
INT_80 : '80';
INT_81 : '81';
INT_82 : '82';
INT_83 : '83';
INT_84 : '84';
INT_85 : '85';
INT_86 : '86';
INT_87 : '87';
INT_88 : '88';
INT_89 : '89';
INT_90 : '90';
INT_91 : '91';
INT_92 : '92';
INT_93 : '93';
INT_94 : '94';
INT_95 : '95';
INT_96 : '96';
INT_97 : '97';
INT_98 : '98';
INT_99 : '99';

// ******** Numerical *********

ONE : 'one'
    // ID
    | 'satu'
    ;
TWO : 'two'
    // ID
    | 'dua'
    ;
THREE
    : 'three'
    // ID
    | 'tiga'
    ;
FOUR
    : 'four'
    // ID
    | 'empat'
    ;
FIVE
    : 'five'
    // ID
    | 'lima'
    ;
SIX
    : 'six'
    // ID
    | 'enam'
    ;
SEVEN
    : 'seven'
    // ID
    | 'tuju'  | 'tujuh'
    ;
EIGHT
    : 'eight'
    // ID
    | 'delapan' | 'lapan'
    ;
NINE
    : 'nine'
    // ID
    | 'sembilan'
    ;
TEN : 'ten'
    // ID
    | 'sepuluh'
    ;
ELEVEN
    : 'eleven'
    // ID
    | 'sebelas'
    ;
TWELVE
    : 'twelve'
    // ID
    | 'dua belas'
    ;
THIRTEEN
    : 'thirteen'
    // ID
    | 'tiga belas'
    ;
FOURTEEN
    : 'fourteen'
    // ID
    | 'empat belas'
    ;
FIFTEEN
    : 'fifteen'
    // ID
    | 'lima belas'
    ;
SIXTEEN
    : 'sixteen'
    // ID
    | 'enam belas'
    ;
SEVENTEEN
    : 'seventeen'
    // ID
    | 'tujuh belas'  | 'tuju belas'
    ;
EIGHTEEN
    : 'eighteen' | 'eightteen'
    // ID
    | 'delapan belas' | 'lapan belas'
    ;
NINETEEN
    : 'nineteen'
    // ID
    | 'sembilan belas'
    ;
TWENTY
    : 'twenty'
    | 'dua puluh'
    ;
THIRTY
    : 'thirty'
    // ID
    | 'tiga puluh'
    ;

// ***** Sequence ******

FIRST
    : 'first'
    // ID
    | 'pertama'
    ;

SECOND
    : 'second' | 'seconds' | 'sec' | 'secs'
    // ID
    | 'kedua'
    ;

THIRD
    : 'third'
    // ID
    | 'ketiga'
    ;

FOURTH
    : 'fourth'
    // ID
    | 'keempat'
    ;

FIFTH
    : 'fifth'
    // ID
    | 'kelima'
    ;

SIXTH
    : 'sixth'
    // ID
    | 'keenam'
    ;

SEVENTH
    : 'seventh'
    // ID
    | 'ketujuh' | 'ketuju'
    ;

EIGHTH
    : 'eighth'
    // ID
    | 'kedelapan' | 'kelapan'
    ;

NINTH
    : 'ninth'
    // ID
    | 'kesembilan'
    ;

TENTH
    : 'tenth'
    // ID
    | 'kesepuluh'
    ;

ELEVENTH
    : 'eleventh'
    // ID
    | 'kesebelas'
    ;

TWELFTH
    : 'twelfth'
    // ID
    | 'kedua belas'
    ;

THIRTEENTH
    : 'thirteenth'
    // ID
    | 'ketiga belas'
    ;

FOURTEENTH
    : 'fourteenth'
    // ID
    | 'keempat belas'
    ;

FIFTEENTH
    : 'fifteenth'
    // ID
    | 'kelima belas'
    ;

SIXTEENTH
    : 'sixteenth'
    // ID
    | 'keenam belas'
    ;

SEVENTEENTH
    : 'seventeenth'
    // ID
    | 'ketujuh belas' | 'ketuju belas'
    ;

EIGHTEENTH
    : 'eighteenth'
    // ID
    | 'kedelapan belas' | 'kelapan belas'
    ;

NINETEENTH
    : 'nineteenth'
    // ID
    | 'kesembilan belas' | 'kesembilan belas'
    ;

TWENTIETH
    : 'twentieth'
    // ID
    | 'kedua puluh'
    ;

THIRTIETH
    : 'thirtieth'
    // ID
    | 'ketiga puluh'
    ;
