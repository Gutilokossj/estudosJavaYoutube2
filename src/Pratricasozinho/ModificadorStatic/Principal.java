package Pratricasozinho.ModificadorStatic;

public class Principal {
    public static void main(String[] args) {

        // DESAFIO 1
        Guerreiro guerreiro1 = new Guerreiro("Gustavo");
        Guerreiro guerreiro2 = new Guerreiro("Guilherme");
        Guerreiro guerreiro3 = new Guerreiro("Paulo");

        System.out.println("Total de guerreiros: " + Guerreiro.totalGuerreiros);
        System.out.println("Nome dos guerreiros: \n"  + guerreiro1.nome + ", " + guerreiro2.nome + ", " + guerreiro3.nome);

        // DESAFIO 2

        System.out.println("Peso na lua: " + Fisica.calcularPesoNaLua(70) + " Newtons");

        // DESAFIO 3

        ContaCompartilhada contaJoao = new ContaCompartilhada();
        ContaCompartilhada contaMaria = new ContaCompartilhada();

        contaJoao.depositar(100.0);
        contaMaria.sacar(30.0); //método "comum", chamado direto pelo objeto.

        ContaCompartilhada.exibirSaldo(); //método static, chamado direto pela classe.
    }
}
