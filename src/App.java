public class App {
    public static void main(String[] args) {
        //Tipos numéricos inteiros - byte, short, int, long

        // int numero1 = 1;
        // int numero2 = 2;

        // int soma = numero1 + numero2;
        // System.out.println(soma);

        //Tipo decimais - float, double
        // double numero1 = 1.5;
        // double numero2 = 1.5;
        //Operadores aritiméticos:
        //1 - Adição : +
        //2 - Subtração: -
        //3 - Multiplicação: *
        //4 - Divisão: /
        // double soma = numero1 / numero2;
        // System.out.println(soma);

        // Char e boolean
        // char operador = '+';
        
        // double numero1 = 1.5;
        // double numero2 = 2.5;
        // double resultado = soma(numero1, numero2);
        // System.out.println(operador + ": " + resultado);
        // boolean ehIgual = numero1 < numero2;
        // System.out.println(ehIgual);

        //Tipos primitivos:
        //Valores padrão:
        //int = 0
        //double = 0.0
        //float = 0.0f
        //char = '\u0000'
        //boolean = false

        /*
         * Tipos de referência:
         * <TipoDaClasse> identificador = new TipoDaClasse();
         *  valor padrão: null
         */
        Calculadora calculadora1 = new Calculadora(1.5,3.5);
         Calculadora calculadora2 = new Calculadora(1.5,3.5);
        System.out.println(calculadora1 == calculadora2); //Ele da false, porquê eles nao apontam para o mesmo endereço de memória
        System.out.println(calculadora1.numero1 == calculadora2.numero1); //Também da false, porquê os objetos também tem endereços de memória diferentes
        System.out.println(calculadora1.numero1.equals(calculadora2.numero1)); //Ele da true, porquê ele verifica se o valor armazenado no número1 é igual em ambas calculadoras
    }

    static double soma(double numero1, double numero2){ 
        return numero1 + numero2;
    }
}
