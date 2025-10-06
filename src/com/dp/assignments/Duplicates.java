package com.dp.assignments;

import java.util.HashMap;

public class Duplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : numbers) map.put(num, map.getOrDefault(num, 0) + 1);

        for (int key : map.keySet()) {
            if (map.get(key) > 1) System.out.println(key + " appears " + map.get(key) + " times");
        }
    }
}
