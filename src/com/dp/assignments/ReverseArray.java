package com.dp.assignments;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) reversed[index++] = numbers[i];
        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }
}
