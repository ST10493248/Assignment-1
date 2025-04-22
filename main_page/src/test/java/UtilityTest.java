/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class UtilityTest {
    
    public UtilityTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testGetfirstName() {
        System.out.println("getfirstName");
        Utility instance = null;
        String expResult = "";
        String result = instance.getfirstName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetlastName() {
        System.out.println("getlastName");
        Utility instance = null;
        String expResult = "";
        String result = instance.getlastName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetusername() {
        System.out.println("getusername");
        Utility instance = null;
        String expResult = "";
        String result = instance.getusername();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetfirstName() {
        System.out.println("setfirstName");
        String firstName = "";
        Utility instance = null;
        instance.setfirstName(firstName);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetlastName() {
        System.out.println("setlastName");
        String lastName = "";
        Utility instance = null;
        instance.setlastName(lastName);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetusername() {
        System.out.println("setusername");
        String username = "";
        Utility instance = null;
        instance.setusername(username);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGreetfirstName() {
        System.out.println("greetfirstName");
        String firstName = "";
        Utility instance = null;
        String expResult = "";
        String result = instance.greetfirstName(firstName);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGreetlastName() {
        System.out.println("greetlastName");
        String lastName = "";
        Utility instance = null;
        String expResult = "";
        String result = instance.greetlastName(lastName);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGreetusername() {
        System.out.println("greetusername");
        String username = "";
        Utility instance = null;
        String expResult = "";
        String result = instance.greetusername(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
