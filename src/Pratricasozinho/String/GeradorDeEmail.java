package Pratricasozinho.String;

public class GeradorDeEmail {
    String nomeCompleto;

    public GeradorDeEmail(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String gerarEmail() {
        String email = nomeCompleto.charAt(0) + 
        nomeCompleto.substring(nomeCompleto.indexOf(" ") + 1) + "@empresa.com";
        
        return "Nome completo: " + nomeCompleto + "\nEmail gerado: " + email.toLowerCase();
    }

    public static void main(String[] args) {

        GeradorDeEmail nome1 = new GeradorDeEmail("Gustavo Fernandes");
        GeradorDeEmail nome2 = new GeradorDeEmail("Son Goku");
        GeradorDeEmail nome3 = new GeradorDeEmail("Peter Parker");
        GeradorDeEmail nome4 = new GeradorDeEmail("Clark Kent");
        System.out.println(nome1.gerarEmail());
        System.out.println(nome2.gerarEmail());
        System.out.println(nome3.gerarEmail());
        System.out.println(nome4.gerarEmail());
    }
}
