/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.resumoprovateste;

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
        //números positivos
       assertEquals(8, calculadora.potencia(2, 3));
       
       //números netativos
       assertEquals(0.02040816326530612, calculadora.potencia(7, -2));
       assertEquals(-64, calculadora.potencia(-4, 3));
       
       //zero
       assertEquals(1, calculadora.potencia(2, 0));
       assertEquals(0, calculadora.potencia(0, 3));
 
    }

    @Test
    public void testRaizQuadrada() {
        //número positivo
        assertEquals(2, calculadora.raizQuadrada(4));
        
        //número negativo
        try{
            calculadora.raizQuadrada(-4);
        }catch(IllegalArgumentException e){
            assertEquals("Não existe raiz quadrada com número negativo:", e.getMessage());
        }
   
        //zero
        assertEquals(0, calculadora.raizQuadrada(0));
        
    }

    @Test
    public void testLogaritmoNatural() {
        //número positivo
        assertEquals(2.302585092994046, calculadora.logaritmoNatural(10));
        
        //número negativo
        try{
            calculadora.logaritmoNatural(-7);
        }catch(IllegalArgumentException e){
            assertEquals("Não existe logaritmo natural com número negativo.", e.getMessage());
        }
        
        //zero
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.logaritmoNatural(0));
    }
    
}
