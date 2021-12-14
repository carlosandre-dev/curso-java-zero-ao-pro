package com.mentorama.classes.enums;

public enum Marca {
    FIAT("Fiat"),
    WOLKSWAGEM("Wolkswagem"),
    CHEVROLET("Chevrolet"),
    FORD("Ford");

    Marca(String descricao) {
        this.descricao = descricao;
    }

    private final String descricao;
}
