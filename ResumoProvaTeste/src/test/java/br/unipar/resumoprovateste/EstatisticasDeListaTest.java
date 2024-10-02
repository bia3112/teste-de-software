/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.resumoprovateste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
public class EstatisticasDeListaTest {
    
    private EstatisticasDeLista calculo;
    private List<Double> numeros;
    private List<Double> numerosVazio = Collections.emptyList();
    private List<Double> numerosNulos;
    
    public EstatisticasDeListaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        calculo = new EstatisticasDeLista();
        numeros = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        numerosVazio = Arrays.asList();
        numerosNulos = Arrays.asList(1.0, null, 3.0);
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalcularMedia() {
        assertEquals(3.0, calculo.calcularMedia(numeros), 0.01);
    }
    
    @Test
    public void testCalcularMediaVazia() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculo.calcularMedia(numerosVazio);
        });
    }
    
    @Test
    public void testCalcularMediaNula() {
        assertThrows(NullPointerException.class, () -> {
            calculo.calcularMedia(numerosNulos);
        });
    }

    @Test
    public void testCalcularMedianaImpar() {
        assertEquals(3.0, calculo.calcularMediana(numeros), 0.01);
    }
    
    @Test
    public void testCalcularMedianaPar() {
        List<Double> numeros1 = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(2.5, calculo.calcularMediana(numeros1), 0.01);
    }
    
    @Test
    public void testCalcularMedianaVazia() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculo.calcularMediana(numerosVazio);
        });
    }
    
    @Test
    public void testCalcularMedianaNula() {
        assertThrows(NullPointerException.class, () -> {
            calculo.calcularMediana(numerosNulos);
        });
    }
    
    @Test
    public void testCalcularDesvioPadrao() {
        assertEquals(1.58, calculo.calcularDesvioPadrao(numeros), 0.01);
    }
    
    @Test
    public void testCalcularDesvioPadraoVazia() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculo.calcularDesvioPadrao(numerosVazio);
        });
    }
    
    @Test
    public void testCalcularDesvioPadraoComValoresNulos() {
        assertThrows(NullPointerException.class, () -> {
            calculo.calcularDesvioPadrao(numerosNulos);
        });
    }
    
}
