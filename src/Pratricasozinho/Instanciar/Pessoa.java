package Pratricasozinho.Instanciar;

/*
 * Desafio 2: Dois objetos da mesma classe com valores diferentes
Objetivo: Entender que cada objeto tem sua própria cópia dos atributos.

Desafio:
Na classe Principal, crie:

Um objeto p1 com nome "Ana" e idade 25

Um objeto p2 com nome "Carlos" e idade 30

Imprima os dados de cada um no console
 */

public class Pessoa {
    String nome;
    int idade;

    public void exibirInfo() {
    System.out.println("Nome: " + nome + ", Idade: " + idade);
}

    
}
