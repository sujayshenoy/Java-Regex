package com.yml.test;

import com.yml.javaregex.JavaRegex;
import org.junit.Assert;
import org.junit.Test;

public class JunitRegexTest {

    /**
     * Tests all positive cases
     * @throws Exception
     */
    @Test
    public void happyTest() throws Exception {
        JavaRegex javaRegex = new JavaRegex();

        String firstName = "Carl";
        String lastName = "Jones";
        String email = "abc.carl@gmail.com";
        String mobile = "91 8576321832";
        String password = "junitSecret@12";

        boolean firstNameRes = javaRegex.validateFirstName(firstName);
        boolean lastNameRes = javaRegex.validateFirstName(lastName);
        boolean emailRes = javaRegex.validateEmail(email);
        boolean mobileRes = javaRegex.validateMobile(mobile);
        boolean passwordRes = javaRegex.validatePassword(password);

        Assert.assertTrue(firstNameRes);
        Assert.assertTrue(lastNameRes);
        Assert.assertTrue(emailRes);
        Assert.assertTrue(mobileRes);
        Assert.assertTrue(passwordRes);
    }
    
    /**
     * Tests all negative cases
     * @throws Exception
     */
    @Test
    public void sadTest() throws Exception {
        JavaRegex javaRegex = new JavaRegex();

        String firstName = "carl";
        String lastName = "jones";
        String email = "12abc.carl@gmail.com";
        String mobile = "91 8576321832231213";
        String password = "password";

        boolean firstNameRes = javaRegex.validateFirstName(firstName);
        boolean lastNameRes = javaRegex.validateFirstName(lastName);
        boolean emailRes = javaRegex.validateEmail(email);
        boolean mobileRes = javaRegex.validateMobile(mobile);
        boolean passwordRes = javaRegex.validatePassword(password);

        Assert.assertTrue(firstNameRes);
        Assert.assertTrue(lastNameRes);
        Assert.assertTrue(emailRes);
        Assert.assertTrue(mobileRes);
        Assert.assertTrue(passwordRes);
    }
}
