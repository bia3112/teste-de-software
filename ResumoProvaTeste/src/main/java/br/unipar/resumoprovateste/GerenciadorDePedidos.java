/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.resumoprovateste;

import br.unipar.resumoprovateste.models.Item;
import br.unipar.resumoprovateste.models.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
4 - Implemente uma classe GerenciadorDePedidos que gerencia pedidos de um
sistema de compras online.
Métodos sugeridos:
● void adicionarPedido(Pedido pedido): Adiciona um novo pedido.
● double calcularValorTotal(int idPedido): Calcula o valor total de
um pedido, considerando preço e quantidade de cada item.
● List<Pedido> listarPedidosPorCliente(String nomeCliente):
Retorna uma lista de pedidos feitos por um cliente específico.
Testes Unitários:
● Teste a adição de novos pedidos.
● Teste o cálculo do valor total de um pedido com diferentes itens.
● Teste a listagem de pedidos por cliente.
● Verifique o comportamento ao tentar acessar pedidos inexistentes.
 */
public class GerenciadorDePedidos {
    
    private List<Pedido> listaPedidos;

    public GerenciadorDePedidos() {
        listaPedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }
    
    public double calcularValorTotal(int idPedido) {
        if(idPedido <= 0){
            throw new IllegalArgumentException("O id fornecido é nulo!");
        }
        
        for (Pedido pedido : listaPedidos) {
            if (pedido.getId() == idPedido) {
                double valorTotal = 0;
                for (Item item : pedido.getListaItem()) {
                    valorTotal += item.getValor() * item.getQuantidade();
                }
                return valorTotal;
            }
        }
        return 0;
    }
    
    public List<Pedido> listarPedidosPorCliente(String nomeCliente) {
        List<Pedido> pedidosDoCliente = new ArrayList<>();
        for (Pedido pedido : listaPedidos) {
            if (pedido.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
                pedidosDoCliente.add(pedido);
            }
        }
        return pedidosDoCliente;
    }

}
