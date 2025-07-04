package br.com.gustavofernandes.condominio;

//Usando o modificador "default", por não colocar nada na frente
class Piscina {
   private String boia;  //Default, só as pessoas dentro do condominio e tem acesso a piscina

   // getters e setters

   /*
    * Costuma-se colocar o atributo privado (esconde ele), mas para podermos usa-lo
    para expor pro "mundo exterior" é pelos getters e setters

    EXEMPLO ABAIXO:
    */

    public String getBoia(){
        registrarEmprestimo();
        return boia;
    }

    public void setBoia(String boia){ //Quando não usamos o this, é o parâmetro do método
        // Verificar sa boia não esta furada (exemplo)
        this.boia = boia;  //Usamos o this para referir-se ao atributo da classe
    }

    private void registrarEmprestimo(){

    }
}
