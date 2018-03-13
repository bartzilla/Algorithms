package com.bartzilla;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveChar {

    public static void main(String[] args) {

        System.out.println(LongestConsecutiveChar.getLongestConsecutiveChar("AAAAAABBBBCDEAAA"));
    }

    static Map<Character, Integer> getLongestConsecutiveChar(String value) {
        int maxCount = 1;
        int counter = 1;
        char currentChar = value.charAt(0);
        char maxChar = currentChar;

        for (int i = 1; i < value.length(); i++) {

            if (currentChar == value.charAt(i)) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > maxCount) {
                maxCount = counter;
                maxChar = currentChar;
            }

            currentChar = value.charAt(i);
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put(maxChar, maxCount);

        return map;
    }
}
