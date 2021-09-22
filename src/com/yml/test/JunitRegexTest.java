package com.yml.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import com.yml.customexceptions.InvalidEmailException;
import com.yml.customexceptions.InvalidFirstNameException;
import com.yml.customexceptions.InvalidLastNameException;
import com.yml.customexceptions.InvalidMobileException;
import com.yml.customexceptions.InvalidPasswordException;
import com.yml.javaregex.JavaRegex;
import com.yml.javaregex.ValidationInterface;

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
        try{
            assertTrue(javaRegex.validateEmail(this.email));
        } catch (InvalidEmailException ie) {
            ie.printStackTrace();
        }
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

        ValidationInterface validator = (fName, lName, mail, phone, pword) -> {
            try {
                Assert.assertTrue(javaRegex.validateFirstName(fName));
                Assert.assertTrue(javaRegex.validateLastName(lName));
                Assert.assertTrue(javaRegex.validateEmail(mail));
                Assert.assertTrue(javaRegex.validateMobile(phone));
                Assert.assertTrue(javaRegex.validatePassword(pword));
            } catch (InvalidFirstNameException ifn) {
                ifn.printStackTrace();
            }catch (InvalidLastNameException iln) {
                iln.printStackTrace();
            }catch (InvalidEmailException ie) {
                ie.printStackTrace();
            }catch (InvalidMobileException im) {
                im.printStackTrace();
            }catch (InvalidPasswordException ip) {
                ip.printStackTrace();
            } 
        };

        validator.validate(firstName, lastName, email, mobile, password);
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

        ValidationInterface validator = (fName, lName, mail, phone, pword) -> {
            try {
                Assert.assertTrue(javaRegex.validateFirstName(fName));
                Assert.assertTrue(javaRegex.validateLastName(lName));
                Assert.assertTrue(javaRegex.validateEmail(mail));
                Assert.assertTrue(javaRegex.validateMobile(phone));
                Assert.assertTrue(javaRegex.validatePassword(pword));
            } catch (InvalidFirstNameException ifn) {
                ifn.printStackTrace();
            }catch (InvalidLastNameException iln) {
                iln.printStackTrace();
            }catch (InvalidEmailException ie) {
                ie.printStackTrace();
            }catch (InvalidMobileException im) {
                im.printStackTrace();
            }catch (InvalidPasswordException ip) {
                ip.printStackTrace();
            } 
        };

        validator.validate(firstName, lastName, email, mobile, password);
    }
}
