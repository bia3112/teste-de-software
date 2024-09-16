/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.lista1.testes.software;

import java.util.ArrayList;
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
    
    private EstatisticasDeLista estatistica;
    
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
        estatistica = new EstatisticasDeLista();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalcularMedia() {
        List<Double> valores = new ArrayList<>();
        Collections.addAll(valores, 3.0, 7.0, 3.6, 4.2, 8.0);
        assertEquals(5.16, estatistica.calcularMedia(valores), 0.001);
    }
    
    @Test
    public void testCalcularMediaValorNula() {
        List<Double> numeros = Arrays.asList(5.5, 10.2, 14.0, null);
        assertThrows(NullPointerException.class, () -> estatistica.calcularMedia(numeros));
    }
    
    @Test
    public void testCalcularMediaListaVazia() {
//        List<Double> numeros = Collections.emptyList();
//        assertThrows(ArithmeticException.class, () -> estatistica.calcularMedia(numeros));
    }

    @Test
    public void testCalcularMedianaPar() {
        List<Double> valores = new ArrayList<>();
        Collections.addAll(valores, 3.0, 7.0, 3.6, 4.2);
        assertEquals(3.9, estatistica.calcularMediana(valores), 0.001);
    }
    
    @Test
    public void testCalcularMedianaImpar() {
        List<Double> valores = new ArrayList<>();
        Collections.addAll(valores, 3.0, 7.0, 3.6, 4.2, 5.0);
        assertEquals(4.2, estatistica.calcularMediana(valores), 0.001);
    }
    
    @Test
    public void testCalcularMedianaListaVazia() {
//        List<Double> numeros = Collections.emptyList();
//        assertThrows(ArithmeticException.class, () -> estatistica.calcularMediana(numeros));
    }

    @Test
    public void testCalcularDesvioPadrao() {
        List<Double> valor = new ArrayList<>();
        valor.add(13.0);
        valor.add(23.0);
        valor.add(4.0);
        valor.add(2.0);
        valor.add(11.0);
        valor.add(12.0);

        assertEquals(7.467708, estatistica.calcularDesvioPadrao(valor), 0.0001);
    }
    
    @Test
    public void testCalcularDesvioPadraoListaNula() {
        List<Double> numeros = Arrays.asList(1.0, 2.0, null, 4.0);
        assertThrows(NullPointerException.class, () -> estatistica.calcularDesvioPadrao(numeros));
    }
    
    @Test
    public void testCalcularDesvioPadraoVazia() {
//        List<Double> numeros = Collections.emptyList();
//        assertThrows(ArithmeticException.class, () -> estatistica.calcularDesvioPadrao(numeros));
    }
    
}
