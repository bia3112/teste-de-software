/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.resumoprovateste.models;

import java.util.List;

/**
 *
 * @author Beatr
 */
public class Pedido {
    
    private int id;
    private String nomeCliente;
    private List<Item> listaItem;

    public Pedido() {
    }

    public Pedido(int id, String nomeCliente, List<Item> listaItem) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.listaItem = listaItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Item> getListaItem() {
        return listaItem;
    }
 
    
}
