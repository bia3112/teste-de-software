/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.lista1.testes.software;

import br.unipar.lista1.testes.software.model.Conta;
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
public class GerenciadorDeContasTest {
    
    private GerenciadorDeContas gerenciador;
    
    public GerenciadorDeContasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorDeContas();
    }
    
    @AfterEach
    public void tearDown() {  
    }

    @Test
    public void testAdicionarConta() {
        Conta conta = new Conta(1, "Beatriz", 234.50);
        gerenciador.adicionarConta(conta);
        
        Conta contaAdicionada = gerenciador.buscarContaPorNumero(1);
        assertEquals(1, contaAdicionada.getNumero());
    }

    @Test
    public void testBuscarContaPorNumero() {
        Conta conta = new Conta(2, "Wagner", 1589.45);
        gerenciador.adicionarConta(conta);
        
        Conta contaAdicionada = gerenciador.buscarContaPorNumero(2);
        assertEquals(2, contaAdicionada.getNumero());
    }

    @Test
    public void testTransferirSaldoSuficiente() {
        Conta contaOrigem = new Conta(1, "João", 1000.0);
        Conta contaDestino = new Conta(2, "Maria", 500.0);
        gerenciador.adicionarConta(contaOrigem);
        gerenciador.adicionarConta(contaDestino);

        gerenciador.transferir(1, 2, 300.0);

        assertEquals(700.0, contaOrigem.getSaldo());
        assertEquals(800.0, contaDestino.getSaldo());
    }
    
    @Test
    public void testTransferirSaldoInsuficiente() {
        Conta contaOrigem = new Conta(1, "João", 100.0);
        Conta contaDestino = new Conta(2, "Maria", 500.0);
        gerenciador.adicionarConta(contaOrigem);
        gerenciador.adicionarConta(contaDestino);

        gerenciador.transferir(1, 2, 200.0);

        assertEquals(100.0, contaOrigem.getSaldo());
        assertEquals(500.0, contaDestino.getSaldo());
    }
    
    @Test
    public void testTranferirEntreContasInexistente() {
        gerenciador.transferir(3, 4, 100.0);
        
        assertNull(gerenciador.buscarContaPorNumero(3));
        assertNull(gerenciador.buscarContaPorNumero(4));   
    }
    
}
