/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.lista1.testes.software;

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
public class CalculadoraAvancadaTest {
    
    private CalculadoraAvancada calculadora;
    
    public CalculadoraAvancadaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        calculadora = new CalculadoraAvancada();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testPotencia() {
        assertEquals(4, calculadora.potencia(2,2));
    }
    
     @Test
    public void testPotenciaBaseZeroExpoentePositivo() {
        assertEquals(0, calculadora.potencia(0, 3));
    }

    @Test
    public void testPotenciaBasePositivaExpoenteZero() {
        assertEquals(1, calculadora.potencia(5, 0));
    }

    @Test
    public void testRaizQuadrada() {
        assertEquals(3, calculadora.raizQuadrada(9));
    }
    
    @Test
    public void testRaizQuadradaNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.raizQuadrada(-9);
        });
    }

    @Test
    public void testLogaritmoNatural() {
        assertEquals(1.7918, calculadora.logaritmoNatural(6), 0.01);
    }
    
    @Test
    public void testLogaritmoNatural_Zero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.logaritmoNatural(0);
        });
    }

    @Test
    public void testLogaritmoNatural_NegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.logaritmoNatural(-1);
        });
    }
    
}
