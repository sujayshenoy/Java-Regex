package com.yml.javaregex;

@FunctionalInterface
public interface ValidationInterface {
    public void validate(String firstName, String lastName, String email, String mobile, String password);
}
