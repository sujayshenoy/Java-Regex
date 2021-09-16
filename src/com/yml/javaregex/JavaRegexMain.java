package com.yml.javaregex;

import java.io.PrintWriter;
import java.util.regex.Pattern;

public class JavaRegexMain {
    public static void main(String args[]) {
        PrintWriter out = new PrintWriter(System.out, true);

        //Use Case 1 - First Name Matcher
        String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
        out.println(Pattern.matches(firstNamePattern, "Sujay")); // True Case
        out.println(Pattern.matches(firstNamePattern, "1Abc"));  // False Case

        out.close();
    }
}
