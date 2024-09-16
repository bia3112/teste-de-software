/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.exemplotesteunitario;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Beatr
 */
public class CalcularTest {
    
    private Calcular calc;
    
    public CalcularTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        calc = new Calcular();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of somarValores method, of class Calcular.
     */
    @Test
    public void testSomarValores() {
        assertEquals(4, calc.somarValores(2, 2));
    }

    @Test
    public void testSubtracao() {
        assertEquals(4, calc.subtracao(4, 4));
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(4, calc.multiplicacao(2, 2));
    }

    @Test
    public void testDivisao() {
        assertEquals(4, calc.divisao(8, 2));
        
    }
    
}
