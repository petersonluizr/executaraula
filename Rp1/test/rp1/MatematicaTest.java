/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rp1;

import junit.framework.TestCase;

/**
 *
 * @author Peterson ES
 */
public class MatematicaTest extends TestCase {
    
    public MatematicaTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of soma method, of class Matematica.
     */
    public void testSoma() {
        System.out.println("soma");
        int num1 = 2;
        int num2 = 2;
        Matematica instance = new Matematica();
        int expResult = 4;
        int result = instance.soma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacao method, of class Matematica.
     */
    public void testMultiplicacao() {
        System.out.println("multiplicacao");
        int num1 = 0;
        int num2 = 0;
        Matematica instance = new Matematica();
        int expResult = 0;
        int result = instance.multiplicacao(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
}
