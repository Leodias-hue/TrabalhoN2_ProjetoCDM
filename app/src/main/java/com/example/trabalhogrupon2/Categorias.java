package com.example.trabalhogrupon2;

public class Categorias {

    String nome;
    String img_url;
    String tipo;

    public Categorias() {
    }

    public Categorias(String nome, String img_url, String tipo) {
        this.nome = nome;
        this.img_url = img_url;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
