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
        Assert.assertEquals("", encode());
    }

    private String encode() {
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
        Assert.assertEquals(expected, encode("abc"));
    }

    private String encode(String word) {
        final StringBuilder builder = new StringBuilder();
        for (Character character : word.toCharArray()) {
            builder.append(encode(character));
        }
        return builder.toString();
    }

    private void testALetter(String s, char c) {
        Assert.assertEquals(s, encode(c).toString());
    }

    private Character encode(Character toDecodeCharacter) {
        Map<Character, Character> codeMap = getCodingMap();
        return codeMap.get(toDecodeCharacter);
    }

    private Map<Character, Character> getCodingMap() {
        Map<Character, Character> codeMap = new HashMap<>();
        codeMap.put('a', '!');
        codeMap.put('b', ')');
        codeMap.put('c', '\"');
        return codeMap;
    }
}
