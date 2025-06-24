public class Conta {
    static double saldoContaConjunta;
        /*Saldo compartilhado por todos os objetos/instancias
        *Ao depositar saldo na conta do Joao, ele vai pra da maria também!
        *Saldo conjunto mesmo no exemplo acima 
        */
    double saldoIndividual;
    /* Já este seria acima o saldo da conta de cada pessoa */

    final static double TAXA_SERVICOS = 10.5; // Snake Case, nome constantes
    /*
     * Na declaração do atributo, temos o final pra ele ser constante
     * E o static pra ele ser compartilhado
     */

    static void depositarContaConjunta(double valor) {
        saldoContaConjunta += valor;
    }

    void depositarConta(double valor) {
        saldoIndividual += valor;
    }
}
