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
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 *
 * @author vn934281
 */
public class PanierTest 
{
    private Panier pvide, p1, p2, pplein; 
    private Orange omock1, omock2, o1, o2, o3;
    
    public PanierTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp() 
    { 
        pvide = new Panier(4);
        p1 = new Panier(4);
        p2 = new Panier(4);
        pplein = new Panier(4);
        omock1 = omock2 = mock(Orange.class);
        o1 = new Orange(0.5, "ESP");
        o2 = new Orange(1.0, "FR");
        o3 = new Orange(0.75, "ESP");
        when(omock1.getPrix()).thenReturn(1.0);
        when(omock2.getPrix()).thenReturn(0.5);
        p1.Ajoute(omock1);
        p1.Ajoute(omock2);
        p2.Ajoute(o1);
        p2.Ajoute(o2);
        p2.Ajoute(o3);
        pplein.Ajoute(omock1);
        pplein.Ajoute(omock2);
        pplein.Ajoute(omock1);
        pplein.Ajoute(omock2);
    }
    
    @After
    public void tearDown() 
    {
    }

    /**
     * Test of getSize method, of class Panier.
     */
    @Test
    public void testGetSize()
    {
        System.out.println("getSize");
        int expResult = 2;
        int result = p1.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() 
    {
        System.out.println("estVide");
        boolean expResult = true;
        boolean result = pvide.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() 
    {
        System.out.println("estPlein");
        boolean expResult = true;
        boolean result = pplein.estPlein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Ajoute method, of class Panier.
     */
    @Test
    public void testAjoute() 
    {
        System.out.println("Ajoute");
        Orange o = null;
        p1.Ajoute(o);
        int expResult = 3;
        assertEquals(expResult, p1.getSize());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOrange method, of class Panier.
     */
    @Test
    public void testGetOrange() 
    {
        System.out.println("getOrange");
        Orange result = p2.getOrange(0);
        assertEquals(omock1, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retire method, of class Panier.
     */
    @Test
    public void testRetire() 
    {
        System.out.println("retire");
        int expResult = 1;
        p1.retire();
        assertEquals(expResult, p1.getSize());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() 
    {
        System.out.println("getPrix");
        double expResult = 3.0;
        double result = pplein.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BoycotteOrigine method, of class Panier.
     */
    @Test
    public void testBoycotteOrigine() 
    {
        System.out.println("BoycotteOrigine");
        String ori = "ESP";
        p2.BoycotteOrigine(ori);
        int expResult = 1;
        assertEquals(expResult, p2.getSize());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() 
    {
        System.out.println("equals");
        
        boolean expResult = false;
        boolean result = p1.equals(p2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() 
    {
        System.out.println("toString");
        String expResult = "Prix: " + "2.25" + "€  Origine: " + "FR" + "\n";
        String result = p2.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
