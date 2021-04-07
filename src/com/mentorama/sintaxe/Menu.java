package com.mentorama.sintaxe;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        System.out.println("\tCADASTRO DE CLIENTES");
        System.out.println("1. Inclui cliente");
        System.out.println("2. Alterar cadastro");
        System.out.println("3. Excluir cadastro");
        System.out.println("4. Consultar cliente");
        System.out.println("5. Encerrar");
        System.out.println("Opcao:");
    }

    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);

        do{
            try {
                menu();
                opcao = entrada.nextInt();

                switch(opcao){
                    case 1:
                        System.out.println("Você escolheu INCLUIR.");
                        break;

                    case 2:
                        System.out.println("Você escolheu ALTERAR.");
                        break;

                    case 3:
                        System.out.println("Você escolheu EXCLUIR");
                        break;

                    case 4:
                        System.out.println("Você escolheu CONSULTAR.");
                        break;

                    case 5:
                        System.out.println("Obrigado por utilizar o programa");
                        opcao = 0;
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } catch (Exception e) {
                System.out.println("Só é permitido números. Tente novamente");
                opcao = 0;
            }
        } while(opcao != 0);
    }
}