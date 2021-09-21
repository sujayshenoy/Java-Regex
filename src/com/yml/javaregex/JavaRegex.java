package com.yml.javaregex;
import java.util.regex.*;

import com.yml.customexceptions.InvalidEmailException;
import com.yml.customexceptions.InvalidFirstNameException;
import com.yml.customexceptions.InvalidLastNameException;
import com.yml.customexceptions.InvalidMobileException;
import com.yml.customexceptions.InvalidPasswordException;

public class JavaRegex {
    public boolean validateFirstName(String firstName) throws InvalidFirstNameException
    {
        String pattern = "^[A-Z][a-zA-Z]{2,}";
        boolean res = Pattern.matches(pattern, firstName);
        if (res) {
            return true;
        }
        else {
            throw new InvalidFirstNameException("Invalid First Name");
        }
    }

    public boolean validateLastName(String lastName) throws InvalidLastNameException
    {
        String pattern = "^[A-Z][a-zA-Z]{2,}";
        boolean res = Pattern.matches(pattern, lastName);
        if (res) {
            return true;
        }
        else {
            throw new InvalidLastNameException("Invalid Last Name");
        }
    }

    public boolean validateEmail(String email) throws InvalidEmailException
    {
        String pattern = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
        boolean res = Pattern.matches(pattern, email);
        if (res) {
            return true;
        }
        else {
            throw new InvalidEmailException("Invalid Email");
        }
    }

    public boolean validateMobile(String mobile) throws InvalidMobileException
    {
        String pattern = "^[0-9]{2}[\\s][0-9]{10}";
        boolean res = Pattern.matches(pattern, mobile);
        if (res) {
            return true;
        }
        else {
            throw new InvalidMobileException("Invalid Mobile Number");
        }
    }

    public boolean validatePassword(String pass) throws InvalidPasswordException
    {
    	String pattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&!]).{8,}";
        boolean res = Pattern.matches(pattern, pass);
        if (res) {
            return true;
        }
        else {
            throw new InvalidPasswordException("Invalid Password");
        }    		
    }
}
