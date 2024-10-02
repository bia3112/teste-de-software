/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.resumoprovateste;

import br.unipar.resumoprovateste.models.Conta;
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
        
        gerenciador.adicionarConta(new Conta(1, 100.00, "Mario"));
        gerenciador.adicionarConta(new Conta(2, 50.00, "Jorge"));
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdicionarConta() {
      Conta conta = new Conta(3, 125.50, "Beatriz");
      gerenciador.adicionarConta(conta);
      
      Conta contaAdicionada = gerenciador.buscarContaPorNumero(3);
      assertEquals(3, contaAdicionada.getNumero());
    }

    @Test
    public void testBuscarContaPorNumero() {
        Conta conta = gerenciador.buscarContaPorNumero(2);
        assertEquals(2, conta.getNumero());
        assertEquals(50.00, conta.getSaldo());
        assertEquals("Jorge", conta.getNomeTitular());
    }

    @Test
    public void testTransferirSaldoSuficiente() {
      gerenciador.transferir(1, 2, 20.00);
      assertEquals(80.00, gerenciador.buscarContaPorNumero(1).getSaldo());
      assertEquals(70.00, gerenciador.buscarContaPorNumero(2).getSaldo());
    }
    
    @Test
    public void testTransferirSaldoInsuficiente() {
        
        if(gerenciador.buscarContaPorNumero(2).getSaldo() > 100.00){
            try{
                gerenciador.transferir(2, 1, 100.00);
            }catch(IllegalArgumentException e) {
                assertEquals("Saldo insuficiente", e.getMessage());
            }
        }
    }
    
    @Test
    public void transferirParaContaInexistente() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        gerenciador.transferir(1, 5, 20.50);
        });
        assertEquals("Conta destino não encontrada.", exception.getMessage());
    }
    
}
