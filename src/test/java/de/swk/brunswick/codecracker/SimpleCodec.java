package de.swk.brunswick.codecracker;

import java.util.HashMap;
import java.util.Map;

public class SimpleCodec implements Codec {

    @Override
    public Map<Character, Character> getCodingMap() {

        char[] org = "a b c d e f g h i j k l m n o p q r s t u v w x y z".toCharArray();
        char[] enc = "! ) \" ( £ * % & > < @ a b c d e f g h i j k l m n o".toCharArray();

        Map<Character, Character> codeMap = new HashMap<Character, Character>();

        for (int i = 0; i < org.length; i++) {
            codeMap.put(org[i], enc[i]);
        }

        return codeMap;
    }
}
