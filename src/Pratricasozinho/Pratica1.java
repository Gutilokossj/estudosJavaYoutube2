package Pratricasozinho;

/*
 * Desafio 1 — Conversão de tipos (casting)
Enunciado:
Crie uma variável do tipo double com o valor 5.9 e converta (cast) esse valor para um int. Em seguida, 
imprima os dois valores.

Objetivo: Aprender a converter tipos manualmente (casting) e ver que há perda de informação.

📌 Dica: int resultado = (int) valorDouble;
 */

public class Pratica1 {

    public static void main(String[] args) {
        double numero1 = 5.9;
        int resultado = (int) numero1;

        System.out.println("Original (double): " + numero1);
        System.out.println("Convertido (int): " + resultado);
    }
    
}
