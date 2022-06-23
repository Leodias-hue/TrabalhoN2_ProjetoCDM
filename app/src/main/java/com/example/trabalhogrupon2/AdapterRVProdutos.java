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

import java.util.ArrayList;

public class AdapterRVProdutos extends RecyclerView.Adapter<AdapterRVProdutos.MyViewHolder> {

    Context context;
    ArrayList<ProdutosModel> produtosModels;

    public AdapterRVProdutos(Context context, ArrayList<ProdutosModel> produtosModels){
        this.context = context;
        this.produtosModels = produtosModels;
    }

    @NonNull
    @Override
    public AdapterRVProdutos.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new AdapterRVProdutos.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRVProdutos.MyViewHolder holder, int position) {

        final ProdutosModel temp = produtosModels.get(position);

        holder.tvNome.setText(produtosModels.get(position).getTituloProduto());
        holder.tvPreco.setText(produtosModels.get(position).getPrecoProduto());
        holder.imageView.setImageResource(produtosModels.get(position).getImagemProduto());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TelaProduto.class);
                intent.putExtra("imageprod", temp.getImagemProduto());
                intent.putExtra("tituloprod", temp.getTituloProduto());
                intent.putExtra("precoprod", temp.getPrecoProduto());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return produtosModels.size();
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvNome, tvPreco;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageProd);
            tvNome = itemView.findViewById(R.id.tituloProd);
            tvPreco = itemView.findViewById(R.id.precoProd);

        }
    }
}
