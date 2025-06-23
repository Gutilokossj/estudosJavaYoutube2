package Pratricasozinho;

public class Principal {
    public static void main(String[] args) {

        Lampada lampadaOnlyNet = new Lampada();
        lampadaOnlyNet.ligar();
        lampadaOnlyNet.desligar();

        System.out.println("Estado final da lâmpada: " + lampadaOnlyNet.ligada);
    }
}
