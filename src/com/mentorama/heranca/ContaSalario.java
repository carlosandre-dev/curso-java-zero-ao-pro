package com.mentorama.heranca;

public class ContaSalario extends Conta{
    private int quantidadeSaques;

    public ContaSalario(int agencia, int numero, String nome, double saldo, int quantidadeSaques) {
        super(agencia, numero, nome, saldo);
        this.quantidadeSaques = quantidadeSaques;
    }


    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public double sacar(double valorSaque) {
        if(quantidadeSaques > 0) {
            if(valorSaque <= this.getSaldo()) {
                this.saldo -= valorSaque;
                System.out.println("Saque de R$ " + valorSaque + " efetuado com sucesso!");
                quantidadeSaques--;
            } else {
                System.out.println("Saque não efetuado!");
            }
        } else {
            System.out.println("Saque não efetuado!. Limite de saque excedido!");
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
        return "ContaSalario{" +
                "saldo=" + saldo +
                '}';
    }
}