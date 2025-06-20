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
        char operador = '+';
        
        double numero1 = 1.5;
        double numero2 = 2.5;
        double resultado = soma(numero1, numero2);
        System.out.println(operador + ": " + resultado);
        boolean ehIgual = numero1 < numero2;
        System.out.println(ehIgual);
    }

    static double soma(double numero1, double numero2){ 
        return numero1 + numero2;
    }
}
