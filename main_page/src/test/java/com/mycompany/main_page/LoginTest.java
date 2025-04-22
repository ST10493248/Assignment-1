/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.main_page;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeEach
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckpasswordComplexity() {
        System.out.println("CheckpasswordComplexity");
        String Password = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.CheckpasswordComplexity(Password);
        assertEquals(expResult, result);
        fail("Password is not completely formatted , please ensure that the password contains atleast eight characters , a captial letter , a number and a special character.");
    }

    @Test
    public void testCheckcellPhoneNumber() {
        System.out.println("CheckcellPhoneNumber");
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.CheckcellPhoneNumber();
        assertEquals(expResult, result);
        fail("Cell number is incorrectly formatted or does not contain an international code , please correct the number and try again");
    }

    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        boolean CheckUserName = false;
        boolean CheckpasswordComplexity = false;
        Login instance = null;
        String expResult = "";
        String result = instance.registerUser(CheckUserName, CheckpasswordComplexity);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String Password = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.loginUser(username, Password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginResults = false;
        Login instance = null;
        String expResult = "";
        String result = instance.returnLoginStatus(loginResults);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
