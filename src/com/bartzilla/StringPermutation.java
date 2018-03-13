package com.bartzilla;

import java.util.Arrays;

public class StringPermutation {

    public static void main(String[] args) {
        System.out.println(StringPermutation.isPermutation("abc", "cbf"));
    }

    static boolean isPermutation(final String a, final String b) {

        if (a.length() != b.length()) {
            return false;
        }

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        for (int i = 0; i < aChars.length; i++) {
            if (aChars[i] != bChars[i]) {
                return false;
            }
        }

        return true;
    }
}
