package com.mentorama.heranca;

public class TestConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1155, 15573,"Santander", 1000.00, 500.00);
        contaCorrente.sacar(1500.00);
        contaCorrente.depositar(800.00);
        System.out.println("Saldo da Conta Corrente R$ " + contaCorrente.getSaldo());
        System.out.println("======================================================");

        ContaPoupanca contaPoupanca = new ContaPoupanca(2238, 27580,"Caixa Econômica",850.00,20,0.10);
        contaPoupanca.sacar(800.00);
        System.out.println("Saldo da Conta Poupança R$ " + contaPoupanca.getSaldo());
        System.out.println("======================================================");

        ContaSalario contaSalario = new ContaSalario(5511,71256,"Bradesco",700,3);
        contaSalario.sacar(500);
        contaSalario.sacar(200);
        contaSalario.sacar(100);

    }
}
