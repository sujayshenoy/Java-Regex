package com.yml.customexceptions;

public class InvalidFirstNameException extends Exception{
    public InvalidFirstNameException(String msg) {
        super(msg);
    }
}
