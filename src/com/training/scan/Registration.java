package com.training.scan;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String[] users = {"alice", "bob", "charlie"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to register:");
        String name = sc.nextLine();
        boolean exists = false;
        for (String user : users) {
            if (user.equalsIgnoreCase(name)) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("Name is not unique");
        } else {
            System.out.println("You are registered");
        }
        sc.close();
    }
}
