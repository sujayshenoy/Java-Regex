package com.yml.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;

import com.yml.javaregex.JavaRegex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JunitRegexTest {
    private String email;
    private JavaRegex javaRegex;

    
    public JunitRegexTest(String email) {
        this.email = email;
    }
    
    @Before
    public void initialize() {
        javaRegex = new JavaRegex();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(
                new Object[][] {
                { "abc@yahoo.com" },
                { "abc-100@yahoo.com" },
                { "abc.100@yahoo.com" },
                { "abc111@yahoo.com" },
                
                { "abc@.com" }, 
                { "abc123@.com.com" }, 
                { "abc@abc@gmail.com" }, 
                { "abc@gmail.com.1a" }, 
     });
    }

    @Test
    public void javaRegexTest() {
        printCurrentInput();
        assertTrue(javaRegex.validateEmail(this.email));
    }
    
    private void printCurrentInput() {
        System.out.println("Email: " + email);
        System.out.println();
    }

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
