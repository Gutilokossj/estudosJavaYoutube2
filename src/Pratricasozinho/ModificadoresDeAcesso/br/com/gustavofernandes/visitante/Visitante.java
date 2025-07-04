package Pratricasozinho.ModificadoresDeAcesso.br.com.gustavofernandes.visitante;

public class Visitante {
    
        // SalaVip teste = new SalaVip(); // NÃO COMPILA
        // Motivo: SalaVip tem acesso default (sem 'public') e está em outro pacote.

        // teste.cofre; // NÃO COMPILA
        // Motivo: Mesmo que SalaVip fosse acessível, o atributo 'cofre' é private.
}
