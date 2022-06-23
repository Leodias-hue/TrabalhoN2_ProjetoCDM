package com.example.trabalhogrupon2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class AdapterRVCategorias extends RecyclerView.Adapter<AdapterRVCategorias.ViewHolder> {

    Context context;
    List<Categorias> categoriasList;

    public AdapterRVCategorias(Context context, List<Categorias> categoriasList) {
        this.context = context;
        this.categoriasList = categoriasList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.categorias_main, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(categoriasList.get(position).getImg_url()).into(holder.catImg);
        holder.nome.setText(categoriasList.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return categoriasList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView catImg;
        TextView nome;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            catImg = itemView.findViewById(R.id.cat_img);
            nome = itemView.findViewById(R.id.cat_nome);
        }
    }
}
