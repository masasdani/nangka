package com.masasdani.nangka;

import com.masasdani.nangka.generated.DateLexer;
import com.masasdani.nangka.generated.DateParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Created by masasdani on 8/4/16.
 */
public class NangkaTest {

    String exprEn = "a month later, 20-11-90";

    @Test
    public void test1(){
        try {
            ANTLRNoCaseInputStream stream = new ANTLRNoCaseInputStream(
                    new ByteArrayInputStream(exprEn.getBytes()));
            DateLexer lexer = new DateLexer(stream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            DateParser parser = new DateParser(tokenStream);
            ParseTree parseTree = parser.parse();
            System.out.println(parseTree.toStringTree(parser));
        } catch (IOException e) {

        }
    }

    @Test
    public void test2(){
        Nangka nangka = new Nangka();
        try {
            DateUnit dateUnit = nangka.parse(exprEn);
            for(Date date : dateUnit.getRelatedDates()){
                System.out.println(date);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
