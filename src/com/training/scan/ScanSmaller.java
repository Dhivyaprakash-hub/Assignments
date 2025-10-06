package com.training.scan;

import java.util.Scanner;

public class ScanSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Using short-circuit AND to find smallest
        int smallest = a;
        if (b < smallest && (smallest = b) == b);
        if (c < smallest && (smallest = c) == c);
        System.out.println("Smallest number is " + smallest);
        sc.close();
    }
}
