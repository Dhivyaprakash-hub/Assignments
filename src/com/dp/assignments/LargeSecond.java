package com.dp.assignments;

import java.util.Arrays;

public class LargeSecond {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34};
        Arrays.sort(numbers);
        System.out.println("Second largest: " + numbers[numbers.length - 2]);
    }
}
