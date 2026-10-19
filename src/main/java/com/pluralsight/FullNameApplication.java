package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Please enter your name.");

        System.out.println("First name:");
        String firstName = nameScanner(nameScanner);

        System.out.println("Middle name:");
        String middleName = nameScanner(nameScanner);

        System.out.println("Last name:");
        String lastNmae = nameScanner(nameScanner);

        System.out.println("Suffix:");
        String suffix = nameScanner(nameScanner);


        nameScanner.close();
    }
    public static String nameScanner(Scanner nameScanner){
        return nameScanner.nextLine().trim();
    }
}
