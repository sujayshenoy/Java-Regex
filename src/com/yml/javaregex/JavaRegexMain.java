package com.yml.javaregex;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaRegexMain {
    public static void main(String args[]) {
        PrintWriter out = new PrintWriter(System.out, true);
        Scanner in = new Scanner(System.in);

        out.println("Enter First Name");
        String firstName = in.nextLine();
        String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
        matcher(firstNamePattern, firstName);

        out.println("Enter Last Name");
        String lastName = in.nextLine();
        String lastNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
        matcher(lastNamePattern, lastName);

        out.close();
    }
    
    private static void matcher(String pattern, String string) {
        if (Pattern.matches(pattern, string)) {
            System.out.println(string + " matches the pattern "+pattern);
        }
        else {
            System.out.println(string + " does not match the pattern "+pattern);
        }
    }
}
