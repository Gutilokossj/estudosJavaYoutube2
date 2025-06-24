public class ModificadorStatic {
    public static void main(String[] args) {
        // Static: 
        // 1. quando não precisamos de objetos para acessar o atributo
        // 2. Constantes
        // 3. CLasses utilitárias, igual usamos a Math.round ali!

        //Conta contaJoao = new Conta();
        //Conta contaMaria = new Conta();

        Conta.depositarContaConjunta(100.0);
        //contaMaria.depositarConta(100.0);

        System.out.println(Conta.saldoContaConjunta);
        //Assim os valore pertecem a classe e não ao objeto!!
        //System.out.println(contaJoao.saldoIndividual);
        //System.out.println(contaMaria.saldoIndividual);

        System.out.println(Conta.TAXA_SERVICOS);
        Conta contaJoao = new Conta();
        contaJoao.depositarConta(1.455);
        System.out.println(Math.round(contaJoao.saldoIndividual));
    }
}
