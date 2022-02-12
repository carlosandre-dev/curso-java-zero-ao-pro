package com.mentorama.handson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DiarioClasseTest {
    static AlunosDB alunosDB = new AlunosDB();

    public static void main(String[] args) throws Exception{

        System.out.println("--- DIÁRIO DE CLASSE ---");

        int option;

        do {
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos Cadastrados");
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

                System.out.print("Informe o nome do aluno: ");
                String nome = scan.nextLine();

                System.out.print("Informe a matricula do aluno: ");
                int matricula = scan.nextInt();

                System.out.print("O aluno está presente?: ");
                String chamada = scan.next();

                System.out.print("Qual a série cursada?: ");
                int serie = scan.nextInt();

                System.out.print("Qual o dia da aula?: ");
                String dataString = scan.next();

                Date dataChamada = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Aluno novoAluno = new Aluno(matricula, nome, chamada, serie, dataChamada);

                alunosDB.addNovoAluno(novoAluno);

                break;

            }

            case 2: {
                List<Aluno> listaDeAlunos = alunosDB.getAlunosList();

                for (Aluno aluno : listaDeAlunos) {
                    System.out.println("-> Matrícula: " + aluno.getMatricula());
                    System.out.println("-- Nome: " + aluno.getNome());
                    System.out.println("-- Série: " + aluno.getSerie());
                    System.out.println("-- Data da Aula: " + aluno.getDataChamada());
                    System.out.println("-- Chamada: " + aluno.getChamada());
                    System.out.println("---------------------------------------------------");
                }
                break;
            }
        }
    }
}
