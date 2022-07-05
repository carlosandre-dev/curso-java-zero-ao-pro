package com.mentorama.handson.models;

public class Cliente extends Usuario {

    public Cliente(String nome) {
        super(nome, TipoUsuario.CLIENTE);
    }
}
