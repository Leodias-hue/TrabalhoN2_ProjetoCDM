package com.example.trabalhogrupon2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;
import java.util.List;

public class AdapterRVCategorias extends RecyclerView.Adapter<AdapterRVCategorias.MyViewHolder>  {

    ArrayList<Categorias> list;
    Context context;

    public AdapterRVCategorias(Context context, ArrayList<Categorias> list){
        this.list = list;
        this.context = context;
    }

/*
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.categorias_main, parent, false);
        return new MyViewHolder(v);
    }*/

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view
                = LayoutInflater.from(context)
                .inflate(R.layout.categorias_main, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Categorias categorias = list.get(position);
        holder.nomeCategoria.setText(categorias.getNome());
        //holder.imgCategoria.setImageBitmap(categorias.getImg_url());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nomeCategoria;
        ImageView imgCategoria;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            nomeCategoria = itemView.findViewById(R.id.cat_nome);
            //imgCategoria = itemView.findViewById(R.id.cat_img);

        }
    }

}
