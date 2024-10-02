/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.resumoprovateste;

import java.util.Collections;
import java.util.List;

/**
5 - Implemente uma classe EstatisticasDeLista que realiza operações
estatísticas em uma lista de números.
Métodos sugeridos:
● double calcularMedia(List<Double> numeros): Calcula a média dos
números na lista.
● double calcularMediana(List<Double> numeros): Calcula a mediana
dos números na lista.
● double calcularDesvioPadrao(List<Double> numeros): Calcula o
desvio padrão dos números na lista.
Testes Unitários:
● Teste o cálculo da média de uma lista de números.
● Teste o cálculo da mediana para listas com tamanho par e ímpar.
● Teste o cálculo do desvio padrão para uma lista de números.
● Verifique o comportamento com listas vazias ou contendo valores nulos.
 */
public class EstatisticasDeLista {
    
    public double calcularMedia(List<Double> numeros) {
        if(numeros == null || numeros.size() < 2){
            throw new IllegalArgumentException("A lista deve conter pelo menos dois números.");
        }
        
        double totalNumero = 0;
        
        for(Double numero : numeros) {
            totalNumero += numero;
        }
        
        double media = totalNumero/numeros.size();
        return media; 
    }
    
    public double calcularMediana(List<Double> numeros) {
        if(numeros == null || numeros.size() < 2){
            throw new IllegalArgumentException("A lista deve conter pelo menos dois números.");
        }
        
        Collections.sort(numeros);
        int tamanho = numeros.size();
        
        if(tamanho % 2 == 0) {
            double meio1 = numeros.get(tamanho / 2 - 1);
            double meio2 = numeros.get(tamanho / 2);
            return (meio1 + meio2) / 2.0;
        }else{
            return numeros.get(tamanho / 2);
        }   
    }
    
    public double calcularDesvioPadrao(List<Double> numeros) {
        if (numeros == null || numeros.size() < 2) {
            throw new IllegalArgumentException("A lista deve conter pelo menos dois números.");
        }
        
        Double media = calcularMedia(numeros);
        double somaQuadrados = 0.0;

        for (double valor : numeros) {
            double diferenca = valor - media;
            somaQuadrados += diferenca * diferenca;
        }

        return Math.sqrt(somaQuadrados / (numeros.size() - 1));
    }
    
}
