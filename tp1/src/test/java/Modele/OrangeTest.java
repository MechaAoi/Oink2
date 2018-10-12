/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vn934281
 */
public class OrangeTest {
    
    public OrangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    @org.junit.Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange(0.60, "TAMERE");
        double expResult = 0.60;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Orange.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Orange o = new Orange(0.60, "FR");
        Orange instance = new Orange(0.60, "FR");
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @org.junit.Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange(0.60, "FR");
        String expResult = "FR";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Orange.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange(0.60, "FR");
        String expResult = "Prix: " + "0.6" + "€  Origine: " + "FR" + "\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
