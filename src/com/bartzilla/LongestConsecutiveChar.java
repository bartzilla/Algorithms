package com.bartzilla;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveChar {

    public static void main(String[] args) {

        System.out.println(LongestConsecutiveChar.getLongestConsecutiveChar("AAAAAABBBBCDEAA"));
    }

    static Map<Character, Integer> getLongestConsecutiveChar(String value) {
        int maxCount = 1;
        char maxChar = value.charAt(0);
        char currentChar = value.charAt(0);
        int counter = 1;

        for (int i = 1; i < value.length(); i++) {

            if (currentChar == value.charAt(i)) {
                counter++;

                if (counter > maxCount) {
                    maxCount = counter;
                    maxChar = currentChar;
                }

            } else {
                counter = 1;
            }

            currentChar = value.charAt(i);
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put(maxChar, maxCount);

        return map;
    }
}
