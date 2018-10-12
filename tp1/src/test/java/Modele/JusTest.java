/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


/**
 *
 * @author vn934281
 */
public class JusTest {
    private ArrayList<IFruit> i1,i2;
    Jus j1,j2;
    Orange o1,o2, omock1, omock2;
    
    public JusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     o1 = new Orange(2, "OUI");
     o2 = new Orange(1, "NON");
     when(omock1.getPrix()).thenReturn(1.0);
     when(omock2.getPrix()).thenReturn(0.5);
    i1.add((IFruit) o2);
    i2.add((IFruit) omock1);
    i2.add((IFruit) omock2);
    Jus j1 = new Jus(i1);
    Jus j2 = new Jus(i2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isSeedLess method, of class Jus.
     */
    @Test
    public void testIsSeedLess() {
        System.out.println("isSeedLess");
        boolean expResult = false;
        boolean result = j1.isSeedLess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Jus.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        double expResult = 1.5;
        double result = j2.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Jus.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        String expResult = "";
        String result = j2.getOrigine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Equals method, of class Jus.
     */
    @Test
    public void testEquals() {
        System.out.println("Equals");
        IFruit f1 = null;
        //boolean expResult = false;
        //boolean result = instance.Equals(f1);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Jus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
      //  Jus instance = new Jus();
        String expResult = "";
       // String result = instance.toString();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
