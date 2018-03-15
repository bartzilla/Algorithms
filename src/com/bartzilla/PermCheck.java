package com.bartzilla;

import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {
        System.out.println(PermCheck.checkPerm(new int[]{1, 2, 3, 4}));
    }

    static int checkPerm(int[] A) {
        Arrays.sort(A);

        for(int i = 0; i < A.length; i++) {
            if(A[i] != i + 1) {
                return 0;
            }
        }

        return 1;
    }
}
