package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        String fullName;
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Please enter your name.");

        System.out.println("First name:");
        String firstName = nameScanner(nameScanner);

        System.out.println("Middle name:");
        String middleName = nameScanner(nameScanner);
        boolean noMiddleName = middleName.isEmpty();
        System.out.println(noMiddleName);

        System.out.println("Last name:");
        String lastName = nameScanner(nameScanner);

        System.out.println("Suffix:");
        String suffix = nameScanner(nameScanner);
        boolean noSuffix = suffix.isEmpty();

        if (!noMiddleName) {
            fullName = (firstName + " " + middleName + " " + lastName);
        }
        else {
            fullName = (firstName + " " + lastName);
        }
        if (!noSuffix) {
            fullName = (fullName + ", " + suffix);
        }
        System.out.println(fullName);
        nameScanner.close();
    }
    public static String nameScanner(Scanner nameScanner){
        return nameScanner.nextLine().trim();
    }
}
