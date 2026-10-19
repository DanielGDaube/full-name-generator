package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Please enter your name.");

        System.out.println("First name:");
        nameScanner(nameScanner);

        System.out.println("Middle name:");
        nameScanner(nameScanner);

        System.out.println("Last name:");
        nameScanner(nameScanner);

        System.out.println("Suffix:");
        nameScanner(nameScanner);


        nameScanner.close();
    }
    public static void nameScanner(Scanner nameScanner){
        nameScanner.nextLine();
    }
}
