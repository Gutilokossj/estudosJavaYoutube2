package Pratricasozinho.TipoReferencia;

/*
 * Desafio 3: Alterar objeto via método
Objetivo: Praticar passagem de objetos como referência.

Desafio:

Crie uma função depositar(Conta c, double valor) que adicione o valor ao saldo.

No main, crie uma conta com saldo 100.

Chame o método para depositar 50.

Mostre o saldo atualizado (deve ser 150).


 */

public class Conta {
    double saldo;

    void depositar(double valor) {
        saldo += valor; // Isso seria c.saldo = c.saldo + valor
    }

    void mostrarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
