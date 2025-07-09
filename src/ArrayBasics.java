import java.util.ArrayList;
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
      /*
       * SINTAXE DO ARRAY
       * 
       * <tipo> [] identificador = {valores aqui dentro}
       * 
       */

      //Aqui foi um exemplo de como declarar um array e já inicializa-lo

       //String[] tarefas = {"Dar like no vídeo", "Se inscrever no canal", 
       //"Ativar as notificações", "Compartilhar com os amigos"};

       //Aqui foi um exemplo de como declarar um array e iniciar os valores depois
      //O problema aqui é que o espaço já foi definido, como 4, no exemplo, assim não é posivel mudar o espaço alocado
      //Pois ele já foi definido e isso é uma grande limitação, e se aparecer mais tarefas?

       //String [] tarefas = new String[4];
       //tarefas[0] = "Dar like no vídeo";
       //tarefas[1] = "Se inscrever no canal";
       //tarefas[2] = "Ativar as notificações";
       //tarefas[3] = "Compartilhar com os amigos";

       //Por causa dessa limitação, no java temos outro tipo de dados, o array list
       //O array list é uma estrutura de dados dinâmica, ou seja, ele pode crescer ou diminuir
       //Basicamente é o ArraList em todos os casos, pra trabalhar no dia a dia, não usamos muitos exemplos acima.

       //System.out.println(tarefas[0]); //Imprimo a posição 0 do array
       //System.out.println("Tenho " + tarefas.length + " tarefas"); //Imprimo o tamanho do array
       //System.out.println(Arrays.toString(tarefas)); //Checa cada item dentro do array e retorna a representação textual do array

       //length é um atributo do objeto array e não um método, por isso não fizemos tarefas.lenght() e sim tarefas.lenght

       ArrayList<String> tarefas = new ArrayList<>();
       tarefas.add("Dar like no vídeo");
       tarefas.add("Se inscrever no canal");
       tarefas.add("Ativar as notificações");
       tarefas.add("Compartilhar com os amigos");

       //Aqui utilizamos métodos para manipular o array list
       System.out.println(tarefas); //Já imprime o array certinho, não pega o endereço de memória, por usarmos a classe utilitária
       System.out.println(tarefas.get(0)); //Imprime a posição 0 do array
       System.out.println(tarefas.size()); //Imprime o tamanho do array

       /*A vantagem de usar o tipo especial ArrayList, comparado ao array 
       primitivo, é que ele permite adicionar e remover elementos dinamicamente */

    }
}
