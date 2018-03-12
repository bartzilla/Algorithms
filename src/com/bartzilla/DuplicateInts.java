package com.bartzilla;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DuplicateInts {

    public static void main(String[] args) {

        int[] array = {4, 5, 9, 5, 7, 7};


        System.out.println("This is the duplicate: " + DuplicateInts.allDuplicateInt(array));

    }

    // This method is O(n^2) which is not very nice
    static int firstDuplicateInt(final int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                }
            }
        }

        return -1;
    }

    // This method is O(n) which is good
    static int fastFirstDuplicateInt(final int[] array) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int counter = map.get(array[i]) + 1;
                map.put(array[i], counter);
            } else {
                map.put(array[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                return key;
            }
        }

        return -1;
    }

    // This method is O(n) which is good find all ints that repeat
    static List<Integer> allDuplicateInt(final int[] array) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> repeated = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int counter = map.get(array[i]) + 1;
                map.put(array[i], counter);
            } else {
                map.put(array[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                repeated.add(key);
            }
        }

        return repeated;
    }


}
