package com.mentorama.introducao;

import java.util.Scanner;

public class Endereco {
    public static void main(String[] args) {
        System.out.println("---------CADASTRO DE USUÁRIOS---------");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scan.nextLine();

        System.out.print("Informe o nome da rua: ");
        String rua = scan.nextLine();

        System.out.print("Qual número da casa?: ");
        String numero = scan.nextLine();

        System.out.print("Qual o bairro: ");
        String bairro = scan.nextLine();

        System.out.print("Qual a sua cidade: ");
        String cidade = scan.nextLine();

        System.out.print("Qual o estado: ");
        String estado = scan.nextLine();

        System.out.print("Informe seu Cep: ");
        String cep = scan.nextLine();

        System.out.println("---------Exibindo informações---------");
        System.out.println();

        System.out.println("Nome Completo: " + nome);
        System.out.println("Endereço: " + rua + ", " + numero + "-" + bairro + ", " + cidade + ", " + estado + "-CEP: " + cep);

    }
}
