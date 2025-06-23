package Pratricasozinho;

/*
 *  Desafio 1: Criar um objeto e acessar métodos
Objetivo: Praticar como instanciar uma classe e usar seus métodos.

Desafio:
Crie uma classe Principal com o main e faça:

Criar uma lâmpada (Lampada l1)

Ligar e depois desligar ela

Exibir no console o estado final (true ou false)

 */

public class Lampada {
 boolean ligada = false;

    void ligar() {
        ligada = true;
        System.out.println("Lâmpada ligada.");
    }

    void desligar() {
        ligada = false;
        System.out.println("Lâmpada desligada.");
    }
}
