package com.dp.assignments;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 56};
        int sum = 0, count = 0;
        for (int num : numbers) {
            int temp = num;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("Sum of digits: " + sum);
        System.out.println("Average of digits: " + avg);
    }
}
