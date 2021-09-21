package com.yml.javaregex;
import java.util.regex.*;

public class JavaRegex {
    public boolean validateFirstName(String firstName)
    {
        String pattern = "^[A-Z][a-zA-Z]{2,}";
        return Pattern.matches(pattern, firstName);
    }

    public boolean validateLastName(String lastName)
    {
        String pattern = "^[A-Z][a-zA-Z]{2,}";
        return Pattern.matches(pattern, lastName);
    }

    public boolean validateEmail(String email)
    {
        String pattern = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
        return Pattern.matches(pattern, email);
    }

    public boolean validateMobile(String mobile)
    {
        String pattern = "^[0-9]{2}[\\s][0-9]{10}";
        return Pattern.matches(pattern, mobile);
    }

    public boolean validatePassword(String pass)
    {
    	String pattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&!]).{8,}";
        return Pattern.matches(pattern, pass);    		
    }
}
