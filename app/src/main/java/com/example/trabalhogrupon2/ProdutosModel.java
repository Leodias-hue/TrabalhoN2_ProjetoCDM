package com.example.trabalhogrupon2;

public class ProdutosModel {
    String tituloProduto;
    String precoProduto;
    int imagensProduto;


    public ProdutosModel(String tituloProduto, String precoProduto, int imagensProduto) {
        this.tituloProduto = tituloProduto;
        this.precoProduto = precoProduto;
        this.imagensProduto = imagensProduto;
    }

    public String getTituloProduto() {
        return tituloProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public int getImagemProduto() {
        return imagensProduto;
    }
}
