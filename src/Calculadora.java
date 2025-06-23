public class Calculadora {
    // wrappers - envelopadoras
    /*
     * mesma função do tipo primitivo
     * mas são tipo de referência, o valor padrão fica null
     */
    Double numero1;
    Double numero2;

    //Construtor com parâmetros! obriga informar valores dos operandos
    //Assim criamos o objeto e já inicializamos os atributos dele.
    public Calculadora(Double numero1, Double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    Double soma(){ 
        return numero1 + numero2;
    }
}

