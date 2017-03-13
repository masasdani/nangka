package com.masasdani.nangka;

import com.masasdani.nangka.generated.DateLexer;
import com.masasdani.nangka.generated.DateParser;
import com.masasdani.nangka.processor.DateVisitor;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * Guesses the DateUnit containing dates of the input String
 *
 * @author masasdani
 */
public class Nangka {

    /**
     * @param text
     * @return
     * @throws ParseException
     */
    public DateUnit parse(String text) throws ParseException {
        try {
            ANTLRNoCaseInputStream stream = new ANTLRNoCaseInputStream(
                    new ByteArrayInputStream(text.getBytes()));
            DateLexer lexer = new DateLexer(stream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            DateParser parser = new DateParser(tokenStream);
            ParseTree parseTree = parser.parse();
            DateVisitor visitor = new DateVisitor();
            visitor.visit(parseTree);
            return visitor.getResult();
        } catch (IOException e) {
            throw new ParseException();
        }
    }

}
