/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.palindromo.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnog
 */
public class PalindromoTest {
    
    public PalindromoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isPalindromo method, of class Palindromo.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        String phrase = "Sé verlas al revés.";
        boolean expResult = true;
        boolean result = Palindromo.isPalindromo(phrase);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of sumar method, of class Palindromo.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 20;
        int b = 3;
        Palindromo instance = new Palindromo();
        int expResult = 23;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        
    }
    
}
