package Pratricasozinho.String;

public class SubstituirVogais {
    public String retornaNomeCodificado(String palavra) {
        palavra = palavra.replaceAll("[aA]", "4");
        palavra = palavra.replaceAll("[eE]", "3");
        palavra = palavra.replaceAll("[iI]", "1");
        palavra = palavra.replaceAll("[oO]", "0");
        palavra = palavra.replaceAll("[uU]", "_");
        return "Nome códificado: " + palavra;
    }

    public String retornaNomeOriginal(String palavra) {
        return "Nome original: " + palavra;
    }

    public static void main(String[] args) {

        SubstituirVogais substituirVogais = new SubstituirVogais();
        System.out.println(substituirVogais.retornaNomeOriginal("Gustavo Fernandes"));
        System.out.println(substituirVogais.retornaNomeCodificado("Gustavo Fernandes"));
    }
}
