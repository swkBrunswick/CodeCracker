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
        Assert.assertEquals("!", decode('a').toString());
    }

    @Test
    public void isLetterBDecodedToExclaimationMark() {
        Assert.assertEquals(")", decode('b').toString());
    }

    private Character decode(Character toDecodeCharacter) {
        Map<Character, Character> codeMap = new HashMap<>();
        codeMap.put('a', '!');
        codeMap.put('b', ')');
        return codeMap.get(toDecodeCharacter);
    }
}
