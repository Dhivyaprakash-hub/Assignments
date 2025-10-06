package com.dp.assignments;

public class SmallSecond {
    public static void main(String[] args) {
        int arr[] = {10, 33, 5, 76, 12, 4};

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }

        System.out.println("The second smallest number in the array is: " + min2);
    }
}
