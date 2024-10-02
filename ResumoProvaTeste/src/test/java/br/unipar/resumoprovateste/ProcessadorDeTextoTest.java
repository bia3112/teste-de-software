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
        assertEquals("mercado. o para Vou", processador.inverterPalavras("Vou para o mercado."));
    }
    
    @Test
    public void testInverterPalavrasVazia() {
        if(processador.inverterPalavras("").equals("")){
            try{
                processador.inverterPalavras("");
            }catch(IllegalArgumentException e) {
                assertEquals("Frase está vazia.", e.getMessage());
            }
        }
    }
    
    @Test
    public void testInverterPalavrasNula() {
       IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
            () -> processador.inverterPalavras(null),
            "Esperava-se que uma IllegalArgumentException fosse lançada para uma string nula"
        );
        assertEquals("A string fornecida é nula!", thrown.getMessage());
    }
    

    @Test
    public void testSubstituirPalavras() {
        assertEquals("Adotei um gato", processador.substituirPalavras("Adotei um cachorro", "cachorro", "gato"));
    }
    
    @Test
    public void testSubstituirPalavrasVazia() {
        try{
            processador.substituirPalavras("", "cama", "sofá");
        }catch(IllegalArgumentException e) {
            assertEquals("Frase está vazia.", e.getMessage());
        }    
    }
    
    @Test
    public void testSubstituirPalavrasNula() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
            () -> processador.substituirPalavras(null, "casa", "apartamento"),
            "Esperava-se que uma IllegalArgumentException fosse lançada para uma string nula"
        );
        assertEquals("A string fornecida é nula!", thrown.getMessage());
    }
    

    @Test
    public void testContarOcorrenciasDePalavra() {
        assertEquals(2, processador.contarOcorrenciasDePalavra("fui ao banheiro e fui na cozinha.", "fui"));
    }
    
    @Test
    public void testContarOcorrenciasDePalavraVazia() {
        try{
            processador.contarOcorrenciasDePalavra("", "oi");
        }catch(IllegalArgumentException e) {
            assertEquals("Frase está vazia.", e.getMessage());
        }
    }
    
    @Test
    public void testContarOcorrenciasDePalavraNula() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
            () -> processador.contarOcorrenciasDePalavra(null, "apartamento"),
            "Esperava-se que uma IllegalArgumentException fosse lançada para uma string nula"
        );
        assertEquals("A string fornecida é nula!", thrown.getMessage());
    }
    
}
