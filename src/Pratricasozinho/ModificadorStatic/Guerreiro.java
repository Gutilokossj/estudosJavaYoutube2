package Pratricasozinho.ModificadorStatic;

/*
 *  Desafio 1: Contador de instâncias criadas
Objetivo: Usar um atributo static para contar quantos objetos foram criados de uma classe.

No main (Principal):
Crie 3 guerreiros com nomes diferentes.

Mostre quantos guerreiros foram criados usando:
System.out.println("Total de guerreiros: " + Guerreiro.totalGuerreiros);

Dicas rápidas:
static = pertence à classe, e não ao objeto.

static final = constante global

Pode usar Math.round() ou Math.ceil() se quiser brincar com arredondamento nos valores.
 */

public class Guerreiro {
    static int totalGuerreiros = 0;  // contador compartilhado
    String nome;

    public Guerreiro(String nome) { //Construtor sempre tem o mesmo nome da classe
        this.nome = nome;
        totalGuerreiros++;
        //Classe.contador++ é a forma de registrar algo compartilhado
    }
}

