package com.mentorama.primitivos;

public enum Cores {
    VERMELHO("Vermelho"),
    AZUL("Azul"),
    VERDE("Verde"),
    PRETO("Preto");

    private final String descricao;

    Cores(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
