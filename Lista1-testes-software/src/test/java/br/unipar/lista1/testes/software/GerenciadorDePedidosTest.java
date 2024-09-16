/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.lista1.testes.software;

import br.unipar.lista1.testes.software.model.Item;
import br.unipar.lista1.testes.software.model.Pedido;
import java.util.ArrayList;
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
public class GerenciadorDePedidosTest {
    
    private GerenciadorDePedidos gerenciador;
    
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
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdicionarPedido() {
        List<Item> itens = new ArrayList<>();
        itens.add(new Item("batata", 3, 1.5));
        
        Pedido pedido = new Pedido(1, "Beatriz", itens);
        gerenciador.adicionarPedido(pedido);
        
        assertEquals(1, gerenciador.listarPedidosPorCliente("Beatriz").size());
    }

    @Test
    public void testCalcularValorTotal() {
        List<Item> itens = new ArrayList<>();
        itens.add(new Item("batata", 3, 1.5));
        itens.add(new Item("manga", 7, 15));
        itens.add(new Item("morango", 2, 26));
        
        Pedido pedido = new Pedido(2, "Marcos", itens);
        gerenciador.adicionarPedido(pedido);
        
        double valorTotal = gerenciador.calcularValorTotal(2);       
        assertEquals(161.5, valorTotal);
    }

    @Test
    public void testListarPedidosPorCliente() {
        List<Item> itens1 = new ArrayList<>();
        itens1.add(new Item("alface", 4, 3.90));
        Pedido pedido1 = new Pedido(3, "Jorge", itens1);
        
        List<Item> itens2 = new ArrayList<>();
        itens2.add(new Item("tomate", 5, 1.54));
        Pedido pedido2 = new Pedido(3, "Jorge", itens2);
        
        gerenciador.adicionarPedido(pedido1);
        gerenciador.adicionarPedido(pedido2);
        
        List<Pedido> pedidosDoCliente = gerenciador.listarPedidosPorCliente("Jorge");

        assertEquals(2, pedidosDoCliente.size());       
    }
    
}
