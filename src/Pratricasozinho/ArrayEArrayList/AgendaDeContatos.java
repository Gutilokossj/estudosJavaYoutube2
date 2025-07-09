package Pratricasozinho.ArrayEArrayList;

import java.util.ArrayList;

public class AgendaDeContatos {
    ArrayList<String> contatos = new ArrayList<>();

    public void adicionarContato(String contato) {
        this.contatos.add(contato);
    }

    public void exibirUltimaPosicao(){
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazio! vai fi, arruma amigos ai!");
        } else {
            System.out.println("Contato: " + this.contatos.get(this.contatos.size() - 1));
        }
    }
    
    public static void main(String[] args) {
        
        AgendaDeContatos agendaGus = new AgendaDeContatos();

        agendaGus.adicionarContato("Meu cute, meu amorzão");
        agendaGus.adicionarContato("Guilherme, me hermano");
        agendaGus.adicionarContato("Paulo San, lendário");
        agendaGus.adicionarContato("Ari chan, braba");

        agendaGus.exibirUltimaPosicao();
    }
}
