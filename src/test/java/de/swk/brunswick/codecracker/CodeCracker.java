package de.swk.brunswick.codecracker;

import java.util.HashMap;
import java.util.Map;

public class CodeCracker {

    String encode() {
        return "";
    }

    String encode(String word) {
        final StringBuilder builder = new StringBuilder();
        for (Character character : word.toCharArray()) {
            builder.append(encode(character));
        }
        return builder.toString();
    }

    Character encode(Character toDecodeCharacter) {
        Map<Character, Character> codeMap = getCodingMap();
        return codeMap.get(toDecodeCharacter);
    }

    Map<Character, Character> getCodingMap() {
        Map<Character, Character> codeMap = new HashMap<Character, Character>();
        codeMap.put('a', '!');
        codeMap.put('b', ')');
        codeMap.put('c', '\"');
        return codeMap;
    }
}
