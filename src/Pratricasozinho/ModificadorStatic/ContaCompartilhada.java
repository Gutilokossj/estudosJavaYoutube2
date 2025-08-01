package Pratricasozinho.ModificadorStatic;

/*
Desafio 3: Banco com saldo compartilhado (estilo PicPay em grupo)
Objetivo: Criar uma simulação de uma conta bancária compartilhada entre amigos.


 * No main:
João deposita 100

Maria saca 30

Exibir o saldo final com ContaCompartilhada.exibirSaldo();

Dicas rápidas:
static = pertence à classe, e não ao objeto.

static final = constante global

Pode usar Math.round() ou Math.ceil() se quiser brincar com arredondamento nos valores.
 */
public class ContaCompartilhada {
    static double saldoTotal = 0;

    void depositar(double valor) {
       saldoTotal += valor;
    }

    void sacar(double valor) {
        saldoTotal -= valor;
    }

    static void exibirSaldo() {
        System.out.println("Saldo total: " + Math.round(saldoTotal) + " (R$)");
    }
}
