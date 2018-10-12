/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modele.Macedoine;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author qb503660
 */
public class testMacedoine {
    Macedoine mock1 = mock(Macedoine.class);
        
    public testMacedoine() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        when(mock1.getPrix()).thenReturn(2.0);
        when(mock1.getSize()).thenReturn(2);
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testPrixMacedoine(){
        assertTrue(mock1.getPrix()==2.0);
        assertFalse(mock1.getPrix()!=2.0);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
