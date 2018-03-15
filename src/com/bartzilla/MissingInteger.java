package com.bartzilla;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static void main(String[] args) {
        System.out.println(MissingInteger.getMissingInteger(new int[]{1, 3, 2, 6, 5}));
    }

    static public int getMissingInteger(int[] A) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        for(int i = 0; i < A.length; i++) {
            if(!set.contains(i + 1)) {
                return i + 1;
            }
        }

        return A.length + 1;
    }
}
