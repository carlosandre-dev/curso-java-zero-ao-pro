package com.mentorama.classes;

import java.time.LocalDate;

public class Carro {

    private String marca;
    private Double motor;
    private Integer ano;
    private Boolean arCondicionado = false;
    private Integer quantidadePortas;
    private String combustivel;

    public Carro(String marca, Double motor, Integer ano, Integer quantidadePortas) {
        this.marca = marca;
        this.motor = motor;
        this.ano = ano;
        this.quantidadePortas = quantidadePortas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(Boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Motor: " + getMotor());
        System.out.println("Ano: " + getAno());
        System.out.println("Quantidade de portas: " + getQuantidadePortas());
        System.out.println("Combustível: " + getCombustivel());
    }
}
