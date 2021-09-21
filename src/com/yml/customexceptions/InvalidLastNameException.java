package com.yml.customexceptions;

public class InvalidLastNameException extends Exception{
    public InvalidLastNameException(String msg) {
        super(msg);
    }
}
