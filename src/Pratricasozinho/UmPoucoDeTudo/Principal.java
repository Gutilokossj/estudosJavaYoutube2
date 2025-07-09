package Pratricasozinho.UmPoucoDeTudo;

public class Principal {
    public static void main(String[] args) {
        SistemaDeTarefas sistemaDeTarefasDoGus = new SistemaDeTarefas();

        sistemaDeTarefasDoGus.adicionarTarefa("Rezar mais!");
        sistemaDeTarefasDoGus.adicionarTarefa("Ficar com meu cute");
        sistemaDeTarefasDoGus.adicionarTarefa("Estudar java");
        sistemaDeTarefasDoGus.adicionarTarefa("Treinar muito");
        sistemaDeTarefasDoGus.adicionarTarefa("Jogar com meus amigos");

        sistemaDeTarefasDoGus.removerTarefa("Jogar com meus amigos");

        sistemaDeTarefasDoGus.mostrarTodasAsTarefas();
        sistemaDeTarefasDoGus.mostrarQuantidadeDeTarefas();
        sistemaDeTarefasDoGus.mostrarUltimaTarefa();
    }
}
