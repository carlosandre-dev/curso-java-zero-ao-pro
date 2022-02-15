package com.mentorama.heranca;

public abstract class Conta {
    private int agencia;
    private int numero;
    private String nome;
    protected double saldo;

    public Conta(int agencia, int numero, String nome, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double sacar(double valorSaque);
    public abstract double depositar(double valorDeposito);

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}