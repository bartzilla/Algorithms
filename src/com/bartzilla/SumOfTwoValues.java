package com.bartzilla;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoValues {

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 4};
        int target = 8;

        System.out.println(SumOfTwoValues.containsTwoIntegersEqualTarget(array, target));
    }


    static boolean containsTwoIntegersEqualTarget(final int[] array, final int target) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            if (set.contains(target - array[i])) {
                return true;
            }

            set.add(array[i]);
        }

        return false;
    }
}
