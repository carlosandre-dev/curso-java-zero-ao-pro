package com.mentorama.handson;

import com.mentorama.handson.db.UsuariosDB;
import com.mentorama.handson.models.Admin;
import com.mentorama.handson.models.Cliente;
import com.mentorama.handson.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuariosDB usuariosDB = new UsuariosDB();

    public static void main(String[] args) throws Exception{

        System.out.println("--- PEDIDO DE VENDAS ---");

        int option;

        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar Produtos Cadastrados");
            System.out.println("3 - Cadastrar usuário ADMINISTRADOR");
            System.out.println("4 - Cadastrar usuário CLIENTE");
            System.out.println("5 - Listar todos os usuários");
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

            case 3: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Qual o nome do usuário ADMINISTRADOR: ");
                String nome = scanner.nextLine();

                Admin novoAdmin = new Admin(nome);
                usuariosDB.addNovoUsuario(novoAdmin);
                break;
            }

            case 4: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Qual o nome do usuário CLIENTE: ");
                String nome = scanner.nextLine();

                Cliente novoCliente = new Cliente(nome);
                usuariosDB.addNovoUsuario(novoCliente);

                break;
            }

            case 5: {
                System.out.println("=================================================");
                System.out.println("========= LISTANDO USUÁRIOS CADASTRADOS =========");
                System.out.println("=================================================");
                for (Usuario usuario : usuariosDB.getUsuarioList()) {
                    System.out.println("ID:" + usuario.getId());
                    System.out.println("NOME:" + usuario.getNome());
                    System.out.println("TIPO DE USUÁRIO:" + usuario.getTipoUsuario());
                    System.out.println("-------------------------------------------------");
                }
                break;
            }
        }
    }
}
