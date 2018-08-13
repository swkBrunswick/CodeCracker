package de.swk.brunswick.codecracker;

import org.junit.Assert;
import org.junit.Test;

/**
 * CodeCrackerTest
 */
public class CodeCrackerTest {

    private final CodeCracker codeCracker = new CodeCracker();
    
    @Test
    public void emptyStringDeliversemptyRsult() {
        Assert.assertEquals("", codeCracker.encode());
    }

    @Test
    public void isLetterADecodedToExclaimationMark() {
        codeCracker.testALetter("!", 'a');
    }

    @Test
    public void isLetterBDecodedToExclaimationMark() {
        codeCracker.testALetter(")", 'b');
    }

    @Test
    public void isLetterCDecodedToExclaimationMark() {
        codeCracker.testALetter("\"", 'c');
    }

    @Test
    public void isWordAbcDecoded() {
        final String expected = "!)\"";
        Assert.assertEquals(expected, codeCracker.encode("abc"));
    }

}
