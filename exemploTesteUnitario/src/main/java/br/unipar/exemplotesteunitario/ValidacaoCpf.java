
package br.unipar.exemplotesteunitario;

/**
Crie uma classe ValidadorCPF com um método boolean validarCPF(String cpf) que
valide se um CPF é válido ou não. Um CPF válido tem 11 dígitos e segue as regras de
validação padrão do CPF no Brasil. Escreva testes unitários para garantir que o
método validarCPF funciona corretamente para CPFs válidos, inválidos e para
entradas nulas ou com formato incorreto.
 */

public class ValidacaoCpf {
    
    public boolean validarCPF(String cpf) {
        if(cpf == null){
            return false;
        }
        if(cpf.length() != 11){
            return false;
        }
        if(!cpf.matches("[0-9]+")){
            return false;
        }
        return true;
    }
    
}
