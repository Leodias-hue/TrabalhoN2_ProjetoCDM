package com.example.trabalhogrupon2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Categorias {

    String nome;
    Drawable img_url;

    public Categorias() {
    }

    public Categorias(String nome) {
        this.nome = nome;
        //this.img_url = img_url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    public Drawable getImg_url() {
        return img_url;
    }

    public void setImg_url(Drawable img_url) {
        this.img_url = img_url;
    }
*/
}
