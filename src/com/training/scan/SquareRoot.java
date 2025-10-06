package com.training.scan;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        double[] roots = new double[n];
        int index = 0;
        for (int num : numbers) {
            roots[index++] = Math.sqrt(num);
        }
        System.out.println("Square roots:");
        for (double root : roots) {
            System.out.println(root);
        }
        sc.close();
    }
}
