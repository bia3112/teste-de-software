/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.resumoprovateste;

import br.unipar.resumoprovateste.models.Item;
import br.unipar.resumoprovateste.models.Pedido;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Beatr
 */
public class GerenciadorDePedidosTest {
    
    private GerenciadorDePedidos gerenciador;
    private Item batata, cenora, morango;
    
    public GerenciadorDePedidosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorDePedidos();
        
        batata = new Item("batata", 2, 10.0);
        morango = new Item("morango", 1, 15.0);
        cenora = new Item("cenora", 3, 5.0); 
        
        gerenciador.adicionarPedido(new Pedido(1, "Maria", List.of(batata, morango)));
        gerenciador.adicionarPedido(new Pedido(2, "Jorge", List.of(cenora)));
        gerenciador.adicionarPedido(new Pedido(3, "Maria", List.of(morango, cenora)));
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdicionarPedido() {        
        gerenciador.adicionarPedido(new Pedido(1, "Beatriz", List.of(cenora, batata)));        
        assertEquals(1, gerenciador.listarPedidosPorCliente("Beatriz").size());
    }

    @Test
    public void testCalcularValorTotal() {      
        double valorTotal = gerenciador.calcularValorTotal(1);       
        assertEquals(35.00, valorTotal);
    }

    @Test
    public void testListarPedidosPorCliente() {        
        List<Pedido> pedidosDoCliente = gerenciador.listarPedidosPorCliente("Maria");
        assertEquals(2, pedidosDoCliente.size()); 
    }
    
    @Test
    public void testAcessarPedidosInexistente() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
            () -> gerenciador.calcularValorTotal(0),
            "Esperava-se que uma IllegalArgumentException fosse lançada para um id nulo"
        );
        assertEquals("O id fornecido é nulo!", thrown.getMessage());
    }
    
}
