/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.resumoprovateste;

/**
3 - Implemente uma classe ProcessadorDeTexto que contenha métodos para
manipulação de strings.
Métodos sugeridos:
● String inverterPalavras(String frase): Inverte as palavras em uma
frase.
● String substituirPalavras(String frase, String
palavraAntiga, String palavraNova): Substitui todas as ocorrências
de uma palavra por outra.
● int contarOcorrenciasDePalavra(String frase, String
palavra): Conta o número de ocorrências de uma palavra em uma frase.
Testes Unitários:
● Teste para inverter as palavras em uma frase normal.
● Teste para substituir uma palavra em uma frase.
● Teste para contar ocorrências de uma palavra em uma frase.
● Verifique o comportamento com strings vazias ou nulas.
 */
public class ProcessadorDeTexto {
 
    public String inverterPalavras(String frase) {
         if (frase == null) {
            throw new IllegalArgumentException("A string fornecida é nula!");
        }
        
        String[] palavras = frase.split(" ");

        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]);
            if (i > 0) {
                fraseInvertida.append(" ");
            }
        }
        return fraseInvertida.toString();
    }
    
    public String substituirPalavras(String frase, String palavraAntiga, 
            String palavraNova){
        if (frase == null) {
            throw new IllegalArgumentException("A string fornecida é nula!");
        }
        if (palavraAntiga == null || palavraNova == null) {
            throw new IllegalArgumentException("As palavras fornecidas não podem ser nulas!");
        }
        return frase.replace(palavraAntiga, palavraNova);
    }
    
    public int contarOcorrenciasDePalavra(String frase, String palavra){
        
        if(frase == null){
            throw new IllegalArgumentException("A string fornecida é nula!");
        }
        
        int quant = 0;
	String [] arrayString = frase.split(" ");
        for (String arrayString1 : arrayString) {
            if (arrayString1.equals(palavra)) {
                quant++;
            }
        }
        return quant;	
    }
    
    
}
