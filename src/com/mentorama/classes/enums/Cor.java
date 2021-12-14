package com.mentorama.classes.enums;

public enum Cor {
    VERMELHO("Vermelho"),
    AZUL("Azul"),
    PRETO("Preto"),
    PRATA("Prata");

    Cor(String descricao) {
        this.descricao = descricao;
    }
    private final String descricao;
}
