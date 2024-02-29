package com.ada.luizera.jtwo.controller;

public class People {

    public String nome;
    public String ocupacao;

    public People(String nome, String ocupacao) {
        this.nome = nome;
        this.ocupacao = ocupacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
}
