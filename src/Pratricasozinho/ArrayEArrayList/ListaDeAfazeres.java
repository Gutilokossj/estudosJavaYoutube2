package Pratricasozinho.ArrayEArrayList;

/*
 * 🧪 Desafio 2 – Lista de Afazeres com Remoção
Objetivo: Simular uma lista de tarefas diárias.

Regras:

Crie um ArrayList<String> com pelo menos 3 tarefas.

Depois, remova a segunda tarefa com .remove(1).

Exiba a lista final com System.out.println(lista).

💡 Assim você treina a manipulação e remoção.
 */

import java.util.ArrayList;

public class ListaDeAfazeres {
    ArrayList<String> afazeres = new ArrayList<>();

    public void adicionarAfazer(String item) {
        this.afazeres.add(item);
    }

    // public void removerAfazer(String item) {
    //     if (this.afazeres.isEmpty()) {
    //         System.out.println("Nenhum afazeres para remover");
    //     }
    //     this.afazeres.remove(item);
    // } 
    //            AQUI FOI COMO EU FIZ INICIALMENTE, REMOVENDO PELO NOME, MAS A TAREFA PEDE PELO INDICE, A POSIÇÃO DA LISTA
    //  ASSIM FOI FEITO NO MÉTODO ABAIXO

    public void removerAfazer(int indice) {
        if (this.afazeres.isEmpty()) {
            System.out.println("Nenhum afazeres para remover");
        } else {
            this.afazeres.remove(indice);
        }
    }


    public void exibirAfazeres() {
        System.out.println(this.afazeres);
    }

    public static void main(String[] args) {

        ListaDeAfazeres listaDeAfazeresGus = new ListaDeAfazeres();
        listaDeAfazeresGus.adicionarAfazer("Ir ao mercado");
        listaDeAfazeresGus.adicionarAfazer("Fazer exercícios");
        listaDeAfazeresGus.adicionarAfazer("Estudar Java");

        listaDeAfazeresGus.removerAfazer(1);

        listaDeAfazeresGus.exibirAfazeres();
        
    }
}
