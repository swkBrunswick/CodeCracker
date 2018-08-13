package de.swk.brunswick.codecracker;

import org.junit.Assert;
import org.junit.Test;

/**
 * CodeCrackerTest
 */
public class CodeCrackerTest {

    private final CodeCracker codeCracker = new CodeCracker();

    private void testALetter(String expected, char given) {
        Assert.assertEquals(expected, codeCracker.encode(given).toString());
    }

    @Test
    public void emptyStringDeliversemptyRsult() {
        Assert.assertEquals("", codeCracker.encode(""));
    }

    @Test
    public void isLetterADecodedToExclaimationMark() {
        testALetter("!", 'a');
    }

    @Test
    public void isLetterBDecodedToExclaimationMark() {
        testALetter(")", 'b');
    }

    @Test
    public void isLetterCDecodedToExclaimationMark() {
        testALetter("\"", 'c');
    }

    @Test
    public void isWordAbcDecoded() {
        final String expected = "!)\"";
        Assert.assertEquals(expected, codeCracker.encode("abc"));
    }

    @Test
    public void isThisSpecialWordEncoded() {
        final String expected   = "! ) \" ( £ * % & > < @ a b c d e f g h i j k l m n o";
        final String given      = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        Assert.assertEquals(expected, codeCracker.encode(given));
    }

}
