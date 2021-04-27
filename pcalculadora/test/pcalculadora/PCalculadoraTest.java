/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcalculadora;

import pcalculadorafracao.PCalculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author john
 */
public class PCalculadoraTest {
    
    public PCalculadoraTest() {
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
     * Test of somar method, of class PCalculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int a = 5;
        int b = 5;
        PCalculadora instance = new PCalculadora();
        double expResult = 10.0;
        double result = instance.somar(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtrair method, of class PCalculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int a = 0;
        int b = 0;
        PCalculadora instance = new PCalculadora();
        double expResult = 0.0;
        double result = instance.subtrair(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class PCalculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 0;
        int b = 0;
        PCalculadora instance = new PCalculadora();
        double expResult = 0.0;
        double result = instance.multiplicar(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class PCalculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 0;
        int b = 0;
        PCalculadora instance = new PCalculadora();
        double expResult = 0.0;
        double result = instance.dividir(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
