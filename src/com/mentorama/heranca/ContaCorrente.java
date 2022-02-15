package com.mentorama.heranca;

public class ContaCorrente extends Conta {
    private double limiteCheque;

    public ContaCorrente(int agencia, int numero, String nome, double saldo, double limiteCheque) {
        super(agencia, numero, nome, saldo);
        this.limiteCheque = limiteCheque;
    }

    @Override
    public double getSaldo() {
        return this.limiteCheque + this.saldo;
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
        return "ContaCorrente{" +
                ", limiteCheque=" + limiteCheque +
                '}';
    }
}
