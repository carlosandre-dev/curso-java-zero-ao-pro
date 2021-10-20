package com.mentorama.sintaxe;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("---- CALCULDORA ----");
        int opcao;

        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Diminuir");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.print("O que deseja fazer? (0 - para sair): ");

            Scanner scan = new Scanner(System.in);
            opcao = scan.nextInt();
            processar(opcao);
        } while(opcao != 0);
    }

    public static void processar(int opcao) {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2, soma, subtracao, multiplicacao, divisao;

        switch (opcao){
            case 1:
                System.out.print("Digite o primeiro número: ");
                numero1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                numero2 = scan.nextInt();
                soma = numero1 + numero2;
                System.out.println("A soma dos 2 números é: " + soma);
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                numero1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                numero2 = scan.nextInt();
                subtracao = numero1 - numero2;
                System.out.println("A subtração dos 2 números é: " + subtracao);
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                numero1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                numero2 = scan.nextInt();
                multiplicacao = numero1 * numero2;
                System.out.println("A multiplicação dos 2 números é: " + multiplicacao);
                break;
            case 4:
                System.out.print("Digite o primeiro número: ");
                numero1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                numero2 = scan.nextInt();
                divisao = numero1 / numero2;
                System.out.println("A divisão dos 2 números é: " + divisao);
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }
}
