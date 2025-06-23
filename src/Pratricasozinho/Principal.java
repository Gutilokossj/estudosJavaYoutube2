package Pratricasozinho;

public class Principal {
    public static void main(String[] args) {

        Lampada lampadaL1 = new Lampada();
        lampadaL1.ligar();
        lampadaL1.desligar();

        System.out.println("Estado final da lâmpada: " + lampadaL1.estaLigada);
    }
}
