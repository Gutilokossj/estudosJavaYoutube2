package Pratricasozinho.ModificadoresDeAcesso.br.com.gustavofernandes.clube;

/*
 * Objetivo: Praticar o uso de modificadores public, private e default.

Situação:
Você está modelando um clube, onde:

A classe Clube é pública.

Dentro do clube, há uma Sala VIP (SalaVip) que só pode ser acessada por quem está dentro do mesmo pacote.

Dentro da sala VIP, há um cofre secreto (cofre) que só pode ser acessado pela própria sala VIP.

Crie métodos públicos e privados para lidar com o cofre.

Regras:
Crie o pacote br.com.gustavofernandes.clube.

A classe Clube deve estar pública, com um método entrarNoClube().

A classe SalaVip deve ser default (sem modificador).

Atributo String cofre deve ser private.

Crie método abrirSalaVip() em Clube que instancia a SalaVip.

Crie método público usarCofre() na SalaVip que internamente acessa o cofre via método privado.
 */

public class Clube {

    public void entrarNoClube(){
        System.out.println("Você entrou no clube!");
    }

   public void abrirSalaVip(){
    SalaVip salaVip = new SalaVip();
    System.out.println(salaVip.usarCofre());
   }
}
