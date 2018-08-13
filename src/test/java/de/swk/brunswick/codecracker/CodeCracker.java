package de.swk.brunswick.codecracker;

import java.util.Map;

public class CodeCracker {

    private final Codec codec = new SimpleCodec();


    public String encode(String word) {
        final StringBuilder builder = new StringBuilder();
        for (Character character : word.toCharArray()) {
            builder.append(encode(character));
        }
        return builder.toString();
    }

    Character encode(Character toDecodeCharacter) {
        Map<Character, Character> codeMap = codec.getCodeMap();
        return codeMap.get(toDecodeCharacter);
    }

}
