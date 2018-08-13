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
        Assert.assertEquals("!", decode("a"));
    }
    @Test
    public void isLetterBDecodedToExclaimationMark() {
        Assert.assertEquals(")", decode("b"));
    }

    private String decode(String a) {
        Map<Character, Character> codeMap =  new HashMap<>();
        codeMap.put('a', '!');
        codeMap.put('b', ')');
        return codeMap.get(a.charAt(0)).toString();
    }
}
