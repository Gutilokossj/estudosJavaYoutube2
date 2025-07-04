package Pratricasozinho.ModificadoresDeAcesso.br.com.gustavofernandes.clube;

class SalaVip {
    private String cofre = "Segredo guardado no cofre!";

    public String usarCofre(){
        return acessarCofre();
    }

    private String acessarCofre(){
        return "Acessando o cofre: " + cofre;
    }
}

/*
 * 💡 Dicas Práticas:
Lê bem o enunciado e anota os verbos-chave como "pública", "instancia", "privado". Ajuda a estruturar melhor o código.

Use sempre um método intermediário público para acessar atributos privados.

Quando não definir um modificador de acesso em classes, elas são default e só acessíveis dentro do mesmo pacote.

Você pode usar um main() em uma classe de teste no mesmo pacote pra ver isso tudo funcionando.
 */
