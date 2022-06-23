package com.example.trabalhogrupon2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaProduto extends AppCompatActivity {

    ImageView imageProd;
    TextView tituloProd, precoProd;
    //TextView descProd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageProd = (ImageView)findViewById(R.id.imageProd);
        tituloProd = (TextView) findViewById(R.id.tituloProd);
        precoProd = (TextView)findViewById(R.id.precoProd);

        imageProd.setImageResource(getIntent().getIntExtra("imageprod", 0));
        tituloProd.setText(getIntent().getStringExtra("tituloprod"));
        precoProd.setText(getIntent().getStringExtra("precoprod"));



    }
}