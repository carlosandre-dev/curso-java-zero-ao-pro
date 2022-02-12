package com.mentorama.handson;

import java.util.Date;

public class Aluno {
    private int matricula;
    private String nome;
    private String chamada;
    private int serie;
    private Date dataChamada;

    public Aluno(int matricula, String nome, String chamada, int serie, Date dataChamada) {
        this.matricula = matricula;
        this.nome = nome;
        this.serie = serie;
        this.chamada = chamada;
        this.dataChamada = dataChamada;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChamada() {
        return chamada;
    }

    public void setChamada(String chamada) {
        this.chamada = chamada;
    }

    public Date getDataChamada() {
        return dataChamada;
    }

    public void setDataChamada(Date dataChamada) {
        this.dataChamada = dataChamada;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
