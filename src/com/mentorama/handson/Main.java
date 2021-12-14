package com.mentorama.handson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a descrição do produto: ");
        String descricao = scan.nextLine();

        System.out.print("Informe o ID do produto: ");
        int id = scan.nextInt();

        Produto produto = new Produto(id, descricao);

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("---- ID: " + produto.getId());
        System.out.println("---- Descrição: " + produto.getDescricao());
    }
}
