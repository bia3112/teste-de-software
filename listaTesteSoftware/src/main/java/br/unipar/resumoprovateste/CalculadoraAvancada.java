/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.resumoprovateste;

/**
1 - Implemente uma classe CalculadoraAvancada com os seguintes métodos:
● double potencia(double base, double expoente): Calcula a
potência de um número.
● double raizQuadrada(double numero): Retorna a raiz quadrada de um
número.
● double logaritmoNatural(double numero): Retorna o logaritmo
natural (base e) de um número.
Testes Unitários:
● Teste da potência com base e expoente positivos.
● Teste da raiz quadrada de um número positivo.
● Teste do logaritmo natural de um número positivo.
● Verifique o comportamento com números negativos e zero (exceções devem
ser tratadas).
 */
public class CalculadoraAvancada {
    
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    
    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }
    
    public double logaritmoNatural(double numero){
        return Math.log(numero);
    }
    
}
