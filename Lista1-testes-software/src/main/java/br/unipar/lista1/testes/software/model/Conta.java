/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.lista1.testes.software.model;

/**
 *
 * @author Beatr
 */
public class Conta {
    
    private int numero;
    private String nometitular;
    private double saldo;

    public Conta() {
    }

    public Conta(int numero, String nometitular, double saldo) {
        this.numero = numero;
        this.nometitular = nometitular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
