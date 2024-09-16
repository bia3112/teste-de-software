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
public class ProcessadorDeTextoTest {
    
    private ProcessadorDeTexto processador;
    
    public ProcessadorDeTextoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        processador = new ProcessadorDeTexto();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testInverterPalavras() {
        String invertida = processador.inverterPalavras("um gato preto");
        assertEquals("oterp otag mu", invertida);
    }

    @Test
    public void testSubstituirPalavras() {
        String fraseNova = processador.substituirPalavras("O cachorro está fugindo", "cachorro", "gato");
        assertEquals("O gato está fugindo", fraseNova);
    }

    @Test
    public void testContarOcorrenciasDePalavra() {
        int frequencia = processador.contarOcorrenciasDePalavra(
                "Hoje vi um gato preto e um cachorro preto", "preto");
        assertEquals(2, frequencia);
    }
    
    @Test
    public void testContarOcorrenciasDePalavraQuandoNaoExiste(){
        int frequencia = processador.contarOcorrenciasDePalavra(
                "Hoje vi um gato preto e um cachorro preto", "amarelo");
        assertEquals(0, frequencia);
    }
    
    @Test 
    public void testContarOcorrenciasDePalavraVazia() {
        int frequencia = processador.contarOcorrenciasDePalavra(
                "", "amarelo");
        assertEquals(0, frequencia);
    }
    
}
