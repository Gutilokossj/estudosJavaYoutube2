import br.com.gustavofernandes.lugares.Biblioteca;

public class Teste {
    public static void main(String[] args) {

        /* Piscina piscina   -> Aqui foi um teste se conseguia acessar a classe "Default"
        
        
        /*Eu consigo acessar a classe Biblioteca por ela ser pública
         * mesmo que ela esteja dentro de outro pacote, todos conseguem acessa-la.
         */
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.banheiro); //Consigo acessar o atributo por ser publico
    }
}
