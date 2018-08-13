package de.swk.brunswick.codecracker;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 * CodeCrackerTest
 */
public class CodeCrackerTest {

    @Test
    public void doesThisWork() {
        Assert.assertNotNull(new Object());
    }

    @Test
    public void emptyStringDeliversemptyRsult() {
        Assert.assertEquals("", decode());
    }

    private String decode() {
        return "";
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
        Assert.assertEquals(expected, decode("abc"));
    }

    private String decode(String word) {
        final StringBuilder builder = new StringBuilder();
        for (Character character : word.toCharArray()) {
            builder.append(decode(character));
        }
        return builder.toString();
    }

    private void testALetter(String s, char c) {
        Assert.assertEquals(s, decode(c).toString());
    }

    private Character decode(Character toDecodeCharacter) {
        Map<Character, Character> codeMap = new HashMap<>();
        codeMap.put('a', '!');
        codeMap.put('b', ')');
        codeMap.put('c', '\"');
        return codeMap.get(toDecodeCharacter);
    }
}
