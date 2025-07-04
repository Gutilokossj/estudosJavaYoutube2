package br.com.gustavofernandes.condominio;

public class Teste {
    public static void main(String[] args) {

        //Testando modificadores de acesso para classes
        //Ambas são do tipo "default" só consigo acessar por estarem no mesmo pacote
        Piscina piscina = new Piscina();
        Apartamento apartamento = new Apartamento();
        System.out.println(piscina.getBoia()); //Chamo pelo método get
        piscina.setBoia("Nova boia"); // Chama o método set

        /*
         * Simples, quem esta dentro do condominio, tem acesso a piscina e ao atributo boia
         */
    }
}