package br.com.gustavofernandes.condominio;

//Usando o modificador "default"
class Apartamento {
    private String cozinha; //Privada, só a pessoa que esta dentro do apartamento pode acessar!

    private void acessarCozinha(){

    }

    private void cozinhar(){
        acessarCozinha(); //Podemos acessar a cozinha, pois, estou dentro do apartamento e dentro da cozinha
    }
}
