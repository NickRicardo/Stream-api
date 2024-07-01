package functionalInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano
 * (verdadeiro ou falso). É comumente usada para filtrar os elementos do Stream com base
 * em alguma condição.
 */
public class PredicateExemplo {

    public static void main(String[] args) {
        //Criando uma Lista de palavras;
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");

        // Cria um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usa o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filto

        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);
    }
}
