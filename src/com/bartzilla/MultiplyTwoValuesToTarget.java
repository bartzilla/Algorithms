package com.bartzilla;

import java.util.HashSet;
import java.util.Set;

public class MultiplyTwoValuesToTarget {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 6};
        int target = 18;
        int[] pairMultipliesToTarget = MultiplyTwoValuesToTarget.getPairMultipliesToTarget(array, target);

        for (int val : pairMultipliesToTarget) {
            System.out.println(val);
        }


    }

    static int[] getPairMultipliesToTarget(int[] array, int target) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (target % array[i] == 0) {
                int intToFind = target / array[i];

                if (set.contains(intToFind)) {
                    return new int[]{intToFind, array[i]};
                }

                set.add(array[i]);
            }
        }

        return new int[]{};
    }
}
