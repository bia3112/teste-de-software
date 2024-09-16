
package br.unipar.exemplotesteunitario;

/**Calculadora
Crie uma classe Calculadora com métodos básicos de operações matemáticas:
soma(int a, int b), subtracao(int a, int b), multiplicacao(int a, int b), e divisao(int a,
int b). Escreva testes unitários para cada um desses métodos, incluindo casos para
operações básicas e para erros esperados, como divisão por zero.
* */

public class Calcular {
    
    public int somarValores(int valor1, int valor2){
        return valor1 + valor2;
    }
    
    public int subtracao(int a, int b) {
        return a - b;
    }
    
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    
    public double divisao(int a, int b) {
        return a / b;
    }
    
}
