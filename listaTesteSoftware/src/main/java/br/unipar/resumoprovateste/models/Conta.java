/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.resumoprovateste.models;

/**
 *
 * @author Beatr
 */
public class Conta {
    
    private int numero;
    private double saldo;
    private String nomeTitular;

    public Conta() {
    }

    public Conta(int numero, double saldo, String nomeTitular) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
}
