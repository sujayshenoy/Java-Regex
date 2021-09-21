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

        String emailPattern = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
		System.out.println("Please enter your email");
		String email = in.nextLine();
		matcher(emailPattern,email);

        out.println("Enter Mobile Number");
        String phone = in.nextLine();
        String phonePattern = "^[0-9]{2}[\\s][0-9]{10}";
        matcher(phonePattern, phone);

        out.println("Enter Password");
        String password = in.nextLine();
        String passwordPattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&!]).{8,}";
        matcher(passwordPattern, password);

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
