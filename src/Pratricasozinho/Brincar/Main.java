package Pratricasozinho.Brincar;

public class Main {

    public static void main(String[] args) {

        Sayajin goku = new Sayajin("Goku", 90000);
        Sayajin vegeta = new Sayajin("Vegeta", 16000);

        goku.transformarSSJ();
        vegeta.transformarSSJ();

        goku.sentirPoderDeluta();
        vegeta.sentirPoderDeluta();
        
        Sayajin maisPoderoso = goku.compararCom(vegeta);
        System.out.println(maisPoderoso.nome + " venceu com " + maisPoderoso.poder + " de poder!");
        
    }
}
