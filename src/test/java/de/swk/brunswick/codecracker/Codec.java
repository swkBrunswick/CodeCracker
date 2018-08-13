/*
 * Copyright (C) 2018 Volkswagen AG, All rights reserved.
 */
package de.swk.brunswick.codecracker;

import java.util.Map;

/**
 * Codec
 * <p>
 * - What represents this Class?
 * - What is the main goal of this Class?
 * - What does this class do?
 * - Provide an example how a client (java application, thinking on "public static void main(String[] args) { ... } applications) to use this class?
 */
public interface Codec {

    Map<Character, Character> getCodingMap();
}
