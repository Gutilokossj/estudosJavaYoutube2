package Pratricasozinho.TipoPrimitivos;

/*
 * Desafio 3 — Limites dos tipos
Enunciado:
Descubra e imprima o valor mínimo e máximo de:

byte

short

int

long

Objetivo: Conhecer os limites de cada tipo numérico e aprender a usar constantes da classe Wrapper, como Integer.MIN_VALUE.

📌 Dica: Use System.out.println(Byte.MIN_VALUE);

Porque:

byte (com minúsculo) é primitivo, não tem métodos.

Byte (com maiúsculo) é a classe Wrapper, que tem constantes e métodos.

MIN_VALUE está em caixa alta, pois é uma constante.


 */

public class Pratica3 {

    public static void main(String[] args) {

        System.out.println("byte: " + Byte.MIN_VALUE + " até " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " até " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " até " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " até " + Long.MAX_VALUE);
    }
    
}
