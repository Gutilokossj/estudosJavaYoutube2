package Pratricasozinho.ArrayEArrayList;

/*
 * 🧪 Desafio 1 – Lista de Compras Simples
Objetivo: Criar e manipular uma lista de compras.

Regras:

Crie uma classe ListaDeCompras com um ArrayList<String> chamado itens.

Adicione pelo menos 5 itens.

Exiba o tamanho da lista com size().

Mostre o primeiro item da lista com get(0).

💡 Dica: Tudo dentro do main() é suficiente aqui.

 */

import java.util.ArrayList;

public class ListaDeCompras {
    ArrayList<String> listaDeCompras = new ArrayList<>();

    public void adicionarItem(String item) {
        listaDeCompras.add(item);
    }

    public int getQuantidadeItens() {
        return listaDeCompras.size();
    }

    public String getPrimeiroItem() {
        return listaDeCompras.get(0);
    }
    
    public static void main(String[] args) {

        ListaDeCompras listaDeComprasDoGus = new ListaDeCompras();
        listaDeComprasDoGus.adicionarItem("Placa de vídeo RTX 5070 TI");
        listaDeComprasDoGus.adicionarItem("Monitor FULL 4K");
        listaDeComprasDoGus.adicionarItem("Um garra de água");
        listaDeComprasDoGus.adicionarItem("Goku SH FIGUARTS SSJ4");
        listaDeComprasDoGus.adicionarItem("Um ominitrix do ben 10");

        System.out.println("Minha lista de compras tem: " + listaDeComprasDoGus.getQuantidadeItens() + " itens.");
        System.out.println("Primeiro item da lista é: " + listaDeComprasDoGus.getPrimeiroItem());
        
    }
}
