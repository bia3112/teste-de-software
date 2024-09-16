
package br.unipar.lista1.testes.software;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    public String inverterPalavras(String frase){
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        return fraseInvertida;
    }
    
    public String substituirPalavras(String frase, String palavraAntiga, String palavraNova) {
        return frase.replace(palavraAntiga, palavraNova);
    }
    
    public int contarOcorrenciasDePalavra(String frase, String palavra){
	Map<String, Integer> mapPalavras = new HashMap<>(); // Mapa: Palavra -> Frequência
    
        String fraseMinuscula = frase.toLowerCase();
        Pattern p = Pattern.compile("(\\d+)|([a-záéíóúçãõôê]+)");
        Matcher m = p.matcher(fraseMinuscula);

        while (m.find()) {
            String token = m.group(); // Pega um token
            Integer freq = mapPalavras.get(token); // Verifica se o token já está no mapa

            if (freq != null) { // Se a palavra já existe, atualiza a frequência
                mapPalavras.put(token, freq + 1);
            } else { // Se a palavra não existe, insere com frequência = 1
                mapPalavras.put(token, 1);
            }
        }
        
        return mapPalavras.getOrDefault(palavra.toLowerCase(), 0);
    }
    
    
    
}
