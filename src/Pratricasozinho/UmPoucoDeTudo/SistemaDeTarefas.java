package Pratricasozinho.UmPoucoDeTudo;

import java.util.ArrayList;

public class SistemaDeTarefas {
    private ArrayList<String> tarefas = new ArrayList<>();  //Private pra ficar encapsulado

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String tarefa){
        if (tarefas.isEmpty()) {
            System.out.println("Não foi possível remover tarefa, ainda não existe nenhuma tarefa");
        } else if (!tarefas.contains(tarefa)) 
            System.out.println("Tarefa não encontrada");
            else {
            tarefas.remove(tarefa);
        }
    }

    public void mostrarTodasAsTarefas(){
        if (tarefas.isEmpty()) {
            System.out.println("Ainda não existem tarefas a serem exibidas");
        } else {
            System.out.println("Tarefas cadastradas: " + tarefas);
        }
    }

    public void mostrarUltimaTarefa(){
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa aqui!");
        } else {
            System.out.println("Última tarefa adicionada: " + this.tarefas.get(this.tarefas.size() - 1));
        }
    }

    public void mostrarQuantidadeDeTarefas(){
        System.out.println("Quantidade de tarefas: " + this.tarefas.size());
    }
}
