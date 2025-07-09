package Pratricasozinho.ModificadoresDeAcesso.br.com.gustavofernandes;
import Pratricasozinho.ModificadoresDeAcesso.br.com.gustavofernandes.clube.Biblioteca;

public class principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro("Livro incrível sobre o Goku");
        biblioteca.adicionarLivro("Livro 2 incrível sobre o Goku");
        biblioteca.adicionarLivro("Livro do RIU");

        System.out.println("Quantidade de livros: " + biblioteca.getQuantidadeLivros());

        biblioteca.emprestarLivro();

        System.out.println("Quantidade de livros após emprestar: " + biblioteca.getQuantidadeLivros());
    }
}

/*
 * APESAR DE NÃO TER APRENDIDO AINDA AQUI, O CHAT JÁ ME DEU EXEMPLO DE ARRAY LIST
 */