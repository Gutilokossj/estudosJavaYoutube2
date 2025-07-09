package Pratricasozinho.ModificadoresDeAcesso.br.com.gustavofernandes.clube;

import java.util.List;

/*🔐 Desafio 3 – Acesso via Getters/Setters
 * 
 * Objetivo: Expor atributos privados com segurança.

Situação:
Você vai criar uma classe Biblioteca com livros guardados em prateleiras (privadas). Crie um sistema para emprestar livros 
usando getters e setters, mas protegendo o acesso direto.

Regras:
A classe Biblioteca deve ter um atributo private List<String> livros.

Crie métodos:

adicionarLivro(String livro) → Adiciona livro.

emprestarLivro() → Remove e retorna o primeiro da lista.

getQuantidadeLivros() → Retorna o número de livros (não a lista).

Não crie um getLivros() que exponha a lista diretamente.

💡 Dica: Isso simula como esconder detalhes da implementação e só expor o que for necessário.
 */

public class Biblioteca {
    private List<String> livros = new java.util.ArrayList<>();
    

    public void adicionarLivro(String livro) {
        this.livros.add(livro);
    }

    /**
     * Empresta o primeiro livro da lista. Se a lista estiver vazia, retorna null.
     * @return O livro emprestado ou null.
     */

    public String emprestarLivro() {
        if (this.livros.isEmpty()) {
            return null;
        }
        return this.livros.remove(0);
    }

    public int getQuantidadeLivros() {
        return this.livros.size();
    }
}
