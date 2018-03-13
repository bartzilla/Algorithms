package com.bartzilla;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("anna"));
    }

    static boolean isPalindrome(final String value) {

        final String reversedValue = new StringBuilder(value).reverse().toString();

        return reversedValue.equals(value);
    }
}
