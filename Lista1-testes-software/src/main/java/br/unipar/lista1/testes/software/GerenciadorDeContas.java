
package br.unipar.lista1.testes.software;

import br.unipar.lista1.testes.software.model.Conta;
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
* 
Testes Unitários:
● Teste a adição de uma nova conta.
● Teste a busca de uma conta existente pelo número.
● Teste a transferência entre contas com saldo suficiente e insuficiente.
● Teste transferência entre contas inexistentes (tratamento de exceções).e
 */
public class GerenciadorDeContas {
    
    private List<Conta> contas;

    public GerenciadorDeContas() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    
    public Conta buscarContaPorNumero(int numero){
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;   
    }
    
    public void transferir(int numeroContaOrigem, int numeroContaDestino, 
            double valor){
        
        Conta contaOrigem = buscarContaPorNumero(numeroContaOrigem);
        Conta contaDestino = buscarContaPorNumero(numeroContaDestino);

        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.getSaldo() >= valor) {
                contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
                contaDestino.setSaldo(contaDestino.getSaldo() + valor);
                System.out.println("Transferência realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para a transferência.");
            }
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
 
    }
    
}
