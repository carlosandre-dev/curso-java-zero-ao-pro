package com.mentorama.handson.models;

public class Admin extends Usuario {

    public Admin(String nome) {
        super(nome, TipoUsuario.ADMIN);
    }
}
