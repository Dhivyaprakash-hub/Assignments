package com.training.scan;

import java.util.Scanner;
import java.util.ArrayList;

public class TwoDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();
        sc.nextLine(); // consume newline
        String[][] names = new String[rows][cols];
        System.out.println("Enter names:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                names[i][j] = sc.nextLine();
            }
        }
        ArrayList<String> sNames = new ArrayList<>();
        for (String[] row : names) {
            for (String name : row) {
                if (name.toLowerCase().startsWith("s")) {
                    sNames.add(name);
                }
            }
        }
        System.out.println("Names starting with 's':");
        for (String name : sNames) {
            System.out.println(name);
        }
        sc.close();
    }
}
