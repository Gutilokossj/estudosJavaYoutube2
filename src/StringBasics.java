public class StringBasics {
    public static void main(String[] args) {
        //String str1 = new String("Java s2");
        //String str2 = new String("Java s2");

        //False = estamos comparando o endereço de memória, por isso são diferentes!
        //System.out.println(str1 ==  str2);

        //String str1 = "Java s2"; //Ele consulta o valor no pull de Strings, não encontra e cria ela!
        //String str2 = "Java s2"; //Ele tenta encontrar, encontra, ao em vez de criar outro registro, aponta pro mesmo lugar

        //True = quando não usamos "new", estamos colocando cada valor num pull diferente, ambas apontam para o mesmo endereço de memória
        //System.out.println(str1 == str2);

        // Caracteres especiais, \n, ele é usado para caracteres especiais, ele interpreta e neste exemplo
        // Foi uma quebra de linha!
        //System.out.println("\nJava s2");
        
        //Aqui é um "tab", dando espaçamento!, quando usamos \ é um caractere especial
        //System.out.println("\nJava\ts2");


        //Lembre-se a String é uma cadeia de caracteres, representada pelo tipo primitivo char
        //String é um array de char, por isso conseguimos referenciar com charAt, neste exemplo usamos 0
        //Para simular a primeira posição! muito bom!!

        String nome = "Gustavo Fernandes";
        //System.out.println("Primeira letra do nome: " + nome.charAt(0));

        //Posição de um caractere, serve para construir checagens sofisticadas!
        //Usamos indexOF para identificar a posição de cada letra, do array
        System.out.println("Posição da letra G no nome: " + nome.indexOf("G"));

        //Exemplo de uso comum:

        //Sobrenome da pessoa, pegamos a posição do espaço em branco + 1 para pegar o começo
        //Do sobrenome
        int posicaoSobrenome = nome.indexOf(" ") + 1;

        //Utilizando o método substring, pegamos um pedaço da String original
        //Falamos assim: "temos uma String nome, quero que obtenha uma nova String a partir nome, começando pela posição do sobrenome"
        //System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome));

        //Se quiser só a primeira letra do sobrenome
        //System.out.println("Primeira letra do sobrenome: " + nome.substring(posicaoSobrenome, posicaoSobrenome + 1));

        //Obter o tamanho do array aqui com o método length
        //Essa contagem considera os espaços em branco também!
        //System.out.println("Número de caracteres no nome: " + nome.length());

        //Aqui tiramos 1 para não incluir o caracter de espaço, temos que colocar tudo sobre parêntese
        //Para conseguir dentro da concatenação, operações aritiméticas, igual na matemática

        //System.out.println("Número de caracteres no nome: " + (nome.length() - 1));

        //Substituição de caracteres, exemplo de operação que substitui todos os caracteres da letra n
        //Pelo caracter do número 1
        //System.out.println(nome.replaceAll("n", "1"));

        //Apenas testando, a String original não foi alterada, pois, estamos trabalhando com o Pull de String
        //Mas a String é imutável, ao em vez de alterar a String original, ele retorna uma String nova quando faço um replace
        //Por exemplo

        //System.out.println(nome);

        //Método mais comum de todos, concatenação, é usado com muita frequência
        String primeiroNome = "Gustavo";
        String sobrenome = "Fernandes";
        System.out.println(primeiroNome + " " + sobrenome);

        //Ele simplesmente junta String!
    }
}
