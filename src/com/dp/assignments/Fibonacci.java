package com.dp.assignments;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to 100: ");
        while (b <= 100) {
            System.out.print(b + " ");
            int temp = b;
            b = a + b;
            a = temp;
        }
    }
}
