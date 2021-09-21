package com.yml.customexceptions;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(String msg) {
        super(msg);
    }
}
