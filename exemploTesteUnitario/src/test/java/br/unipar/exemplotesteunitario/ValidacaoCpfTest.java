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
public class ValidacaoCpfTest {
    
    private ValidacaoCpf validar;
    
    public ValidacaoCpfTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        validar = new ValidacaoCpf();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testValidarCPF() {
        assertTrue(validar.validarCPF("12345678987"));//formato valido
        assertFalse(validar.validarCPF("123456789"));//formato invalido
        assertFalse(validar.validarCPF(null));//formato nulo
        assertFalse(validar.validarCPF("qwert123454"));//formato incorreto 
    }


    
}
