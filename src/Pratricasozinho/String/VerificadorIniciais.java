package Pratricasozinho.String;

public class VerificadorIniciais {
    String nome;

        //Construtor do nome, para inicializar com parâmetro

        public VerificadorIniciais(String nome){
            this.nome = nome;
        }

        String compararIniciais(VerificadorIniciais outroNome){
            char inicial1 = this.nome.charAt(0);
            char sobrenome1 = this.nome.charAt(this.nome.indexOf(" ") + 1);

            char inicial2 = outroNome.nome.charAt(0);
            char sobrenome2 = outroNome.nome.charAt(outroNome.nome.indexOf(" ") + 1);

            if ((inicial1 == inicial2 && sobrenome1 == sobrenome2)) {
               return "As iniciais de ambos os nomes são iguais: " + this.nome + ", e também: " + outroNome.nome;
            } else {
                return "O nome: " + this.nome + ", tem iniciais diferentes de " + outroNome.nome;
            }
        }

    public static void main(String[] args) {

        VerificadorIniciais nome1 = new VerificadorIniciais("Gustavo Fernandes");
        VerificadorIniciais nome2 = new VerificadorIniciais("Peter Parker");
        VerificadorIniciais nome3 = new VerificadorIniciais("Peter Pan");

        String compararNomes = nome1.compararIniciais(nome3);
        System.out.println(compararNomes);

        compararNomes = nome2.compararIniciais(nome3);
        System.out.println(compararNomes);

        compararNomes = nome1.compararIniciais(nome2);
        System.out.println(compararNomes);
    }
}
