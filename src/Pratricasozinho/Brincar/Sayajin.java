package Pratricasozinho.Brincar;

public class Sayajin {
    String nome;
    double poder;
    int vida = 100;
    boolean superSayajin = false;

    //Construtor que obriga a instaciar o objeto com parâmetros!!
    //Todo sayajin tem que ter nome, poder e dizer se vira ou não SSJ!!

    public Sayajin (String nome, double poder) {
        this.nome = nome;
        this.poder = poder;
    }

    void sentirPoderDeluta(){
        if (superSayajin) {
            System.out.println("Caramba, " + nome + " transformou? Seu poder é de: " + poder);
        } else {
            System.out.println("Poder de luta base do " + nome + ", é de: " + poder);}
    }

    void transformarSSJ(){
        if (!superSayajin) {
            superSayajin = true;
            poder *= 50;
        } else {
            System.out.println(nome + ", já esta transformado!");
        }
    }

    String apresentar(){
        if (superSayajin) {
            return "Sou " + nome + ", estou transformado em SSJ e meu poder é de: " + poder;
        } else {
            return "Sou " + nome + ", meu poder de luta base é: " + poder;
        }
    }

    Sayajin compararCom(Sayajin outroSayajin) {
        if (this.poder > outroSayajin.poder) {
            return this;
        } else {
            return outroSayajin;
        }
    }
}
