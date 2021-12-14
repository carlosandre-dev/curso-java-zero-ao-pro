package com.mentorama.classes;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", 1.0, 2008, 4 );
        carro1.setCombustivel("Álcool");
        carro1.setArCondicionado(true);

        carro1.exibirInformacoes();
    }
}
