package Pratricasozinho.TipoPrimitivos;

/*
 *  Desafio 2 — Operações com tipos diferentes
Enunciado:
Crie 3 variáveis:

int idade = 30;

double peso = 80.5;

float altura = 1.75f;

Calcule e imprima o IMC (peso / (altura * altura)) com o resultado sendo um double.

Objetivo: Praticar operações com diferentes tipos primitivos e entender como o Java trata isso.
 */

public class Pratica2 {
    public static void main(String[] args) {
        int idade = 24;
        double peso = 78.5;
        float altura = 1.71f;

        double icm = calcularICM(peso, altura);

        System.out.println("Idade: " + idade);
        System.out.println("ICM: " + icm);
    }

    static double calcularICM(double peso, float altura){
        return peso / (altura *altura);
    }
    
}
