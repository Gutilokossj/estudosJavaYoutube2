package Pratricasozinho.TipoReferencia;

/**
 * Os desafios estão distribuidos em cada classe, Lampada, Pessoa, etc...
 */

public class Principal {
    public static void main(String[] args) {

        Lampada lampadaL1 = new Lampada();
        lampadaL1.ligar();
        lampadaL1.desligar();

        System.out.println("Estado final da lâmpada: " + lampadaL1.estaLigada);

        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 25;

        Pessoa p2 = new Pessoa();
        p2.nome = "Carlos";
        p2.idade = 30;

        p1.exibirInfo();
        p2.exibirInfo();

        Conta conta1 = new Conta();
        conta1.saldo = 100.0;
        conta1.depositar( 50.0);

        conta1.mostrarSaldo();
    }
}
