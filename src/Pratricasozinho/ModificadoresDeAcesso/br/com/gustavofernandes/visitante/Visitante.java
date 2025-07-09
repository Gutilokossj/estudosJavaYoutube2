package Pratricasozinho.ModificadoresDeAcesso.br.com.gustavofernandes.visitante;

/*
 * 🧪 Desafio 2 – Testando os Limites
 * 
 * Objetivo: Entender o que pode ou não ser acessado entre pacotes.

Situação:
Você vai tentar acessar classes e atributos com diferentes modificadores em pacotes diferentes.

Passos:
Crie um novo pacote chamado br.com.gustavofernandes.visitante.

Nessa pasta, crie a classe Visitante.

Tente acessar a classe SalaVip e o atributo cofre de fora do pacote.

Documente com comentários o que foi possível e o que foi bloqueado (e por quê).

💡 Dica: Use // NÃO COMPILA e explique com comentário.

 */

public class Visitante {
    
        // SalaVip teste = new SalaVip(); // NÃO COMPILA
        // Motivo: SalaVip tem acesso default (sem 'public') e está em outro pacote.

        // teste.cofre; // NÃO COMPILA
        // Motivo: Mesmo que SalaVip fosse acessível, o atributo 'cofre' é private.
}
