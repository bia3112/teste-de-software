/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.resumoprovateste;

import br.unipar.resumoprovateste.models.Conta;
import java.util.ArrayList;
import java.util.List;

/**
2 - Implemente uma classe GerenciadorDeContas que gerencia uma lista de contas
bancárias. Cada conta deve ter número, saldo, e nome do titular.
Métodos sugeridos:
● void adicionarConta(Conta conta): Adiciona uma nova conta.
● Conta buscarContaPorNumero(int numero): Retorna a conta com o
número especificado.
● void transferir(int numeroContaOrigem, int
numeroContaDestino, double valor): Transfere o valor entre contas.
Testes Unitários:
● Teste a adição de uma nova conta.
● Teste a busca de uma conta existente pelo número.
● Teste a transferência entre contas com saldo suficiente e insuficiente.
● Teste transferência entre contas inexistentes (tratamento de exceções).
 */
public class GerenciadorDeContas {
    
    private List<Conta> listaContas;

    public GerenciadorDeContas() {
        this.listaContas = new ArrayList<>();
    }
    
    public void adicionarConta(Conta conta) {
        listaContas.add(conta);
    }
    
    public Conta buscarContaPorNumero(int numero) {
        for(Conta conta : listaContas) {
            if(conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
    
    public void transferir(int numeroContaOrigem, int numeroContaDestino,
            double valor) {
        Conta contaOrigem = buscarContaPorNumero(numeroContaOrigem); 
        if (contaOrigem == null) {
            throw new IllegalArgumentException("Conta origem não encontrada.");
        }

        Conta contaDestino = buscarContaPorNumero(numeroContaDestino);
        if (contaDestino == null) {
            throw new IllegalArgumentException("Conta destino não encontrada.");
        }
        
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da transferência deve ser positivo.");
        }

        if (contaOrigem.getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência.");
        }
        
        contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        
        System.out.println("Transferência realizada com sucesso."); 
    }
    
}
