package com.mentorama.heranca;

public class ContaPoupanca extends Conta {
    private int dayOff;
    private double taxaJuros;

    public ContaPoupanca(int agencia, int numero, String nome, double saldo, int dayOff, double taxaJuros) {
        super(agencia, numero, nome, saldo);
        this.dayOff = dayOff;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getSaldo() {
        return this.saldo + (this.taxaJuros * this.saldo);
    }

    @Override
    public double sacar(double valorSaque) {
        if(valorSaque <= this.getSaldo()) {
            this.saldo -= valorSaque;
            System.out.println("Saque de R$ " + valorSaque + " efetuado com sucesso!");
        } else {
            System.out.println("Saque não efetuado!");
        }
        return saldo;
    }

    @Override
    public double depositar(double valorDeposito) {
        System.out.println("Depósito de R$ " + valorDeposito + " efetuado com sucesso!");
        return this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "saldo=" + saldo +
                '}';
    }
}