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
public class ConversorDeTemperaturaTest {
    
    private ConversorDeTemperatura conversor;
    
    public ConversorDeTemperaturaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        conversor = new ConversorDeTemperatura();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32, conversor.celsiusParaFahrenheit(0), 0.01);
        assertEquals(-128.56, conversor.celsiusParaFahrenheit(-89.2), 0.01);
        assertEquals(-459.67, conversor.celsiusParaFahrenheit(-273.15), 0.01);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(-40.0, conversor.fahrenheitParaCelsius(-40), 0.01);
        assertEquals(-273.15, conversor.fahrenheitParaCelsius(-459.67), 0.01);
    }

    @Test
    public void testCelsiusParaKelvin() {
        assertEquals(373.15, conversor.celsiusParaKelvin(100.0), 0.01);
        assertEquals(16209.63, conversor.celsiusParaKelvin(15936.48), 0.01);
        assertEquals(0.0, conversor.celsiusParaKelvin(-273.15), 0.01);
    }
    
}
