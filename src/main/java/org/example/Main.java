package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=hEfRXKTOcYM&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=18
 * @author Farida Fatali
 */

// Find all powers of the first number entered by the user until the last number he entered

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the last number: ");
        int lastNumber = sc.nextInt();

        for (int i = 1; i <= lastNumber; i *= number) {
            System.out.println(i);
        }

    }
}