package com.training.scan;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String[] users = {"alice", "bob", "charlie"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username to login:");
        String name = sc.nextLine();
        boolean exists = false;
        for (String user : users) {
            if (user.equalsIgnoreCase(name)) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("You are logged in successfully.");
        } else {
            System.out.println("Invalid username");
        }
        sc.close();
    }
}
