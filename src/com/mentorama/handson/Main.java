package com.mentorama.handson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ProdutosDB produtosDB = new ProdutosDB();

    public static void main(String[] args) throws Exception{

        System.out.println("--- PEDIDO DE VENDAS ---");

        int option;

        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar Produtos Cadastrados");
            System.out.println("0 - Sair");

            Scanner scan = new Scanner(System.in);

            System.out.print("Qual operação você deseja realizar?: ");
            option = scan.nextInt();

            process(option);
        } while(option != 0);
    }

    public static void process(int option) throws Exception {
        switch(option) {
            case 1: {
                Scanner scan = new Scanner(System.in);

                System.out.print("Informe a descrição do produto: ");
                String descricao = scan.nextLine();

                System.out.print("Informe o ID do produto: ");
                int id = scan.nextInt();

                System.out.print("Qual preço do produto?: ");
                double preco = scan.nextDouble();

                System.out.print("Qual a data de validade do produto?: ");
                String dataString = scan.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produto novoProduto = new Produto(id, descricao, preco, dataValidade);

                produtosDB.addNovoProduto(novoProduto);

                break;

            }

            case 2: {
                List<Produto> listaDeProdutos = produtosDB.getProdutosList();

                for (Produto produto : listaDeProdutos) {
                    System.out.println("-> ID: " + produto.getId());
                    System.out.println("-- Descrição: " + produto.getDescricao());
                    System.out.println("-- Preço: " + produto.getPreco());
                    System.out.println("-- Data de validade: " + produto.getDataValidade());
                    System.out.println("---------------------------------------------------");
                }
                break;
            }
        }
    }
}
