package Pratricasozinho.ModificadorStatic;

public class Principal {
    public static void main(String[] args) {
        Guerreiro guerreiro1 = new Guerreiro("Gustavo");
        Guerreiro guerreiro2 = new Guerreiro("Guilherme");
        Guerreiro guerreiro3 = new Guerreiro("Paulo");

        System.out.println("Total de guerreiros: " + Guerreiro.totalGuerreiros);
    }
}
