package com.codingjava;

import java.util.Scanner;

public class reading_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);;
    }
}

// in this program we are requesting the user to input his name and we are using the method scanner next line to select the name and the method trim to delete blank spaces before and after the response of user.