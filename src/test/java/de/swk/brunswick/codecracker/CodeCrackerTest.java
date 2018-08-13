package de.swk.brunswick.codecracker;

import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 * CodeCrackerTest
 */
public class CodeCrackerTest {

    private final CodeCracker codeCracker = new CodeCracker();

    @Test
    public void doesThisWork() {
        Assert.assertNotNull(new Object());
    }

    @Test
    public void emptyStringDeliversemptyRsult() {
        Assert.assertEquals("", codeCracker.encode());
    }

    private String encode() {
        return codeCracker.encode();
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

    private String encode(String word) {
        return codeCracker.encode(word);
    }

    private void testALetter(String s, char c) {
        codeCracker.testALetter(s, c);
    }

    private Character encode(Character toDecodeCharacter) {
        return codeCracker.encode(toDecodeCharacter);
    }

    private Map<Character, Character> getCodingMap() {
        return codeCracker.getCodingMap();
    }
}
