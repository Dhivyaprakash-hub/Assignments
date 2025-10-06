package com.dp.assignments;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num, sum = 0;
        int digits = String.valueOf(num).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == num) System.out.println(num + " is an Armstrong number");
        else System.out.println(num + " is not an Armstrong number");
    }
}
