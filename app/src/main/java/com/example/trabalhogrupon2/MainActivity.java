package com.example.trabalhogrupon2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.ktx.Firebase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    RecyclerView categoriasHome;
    FirebaseFirestore FirebaseFirestore;

    //categorias home
    List<Categorias> categoriasList;
    AdapterRVCategorias categoriasAdapter;
    Context context;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseFirestore = FirebaseFirestore.getInstance();

        categoriasHome = findViewById(R.id.cat_recycler);
        //Query
        Query query = FirebaseFirestore.collection("Categorias");
        //Opções recycler
        FirestoreRecyclerOptions<Categorias> opcoes = new FirestoreRecyclerOptions.Builder<Categorias>()
                .setQuery(query, Categorias.class)
                .build();

        //Categorias itens
        categoriasHome.setHasFixedSize(true);
        categoriasHome.setLayoutManager(new LinearLayoutManager(this));
        //categoriasHome.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        categoriasList = new ArrayList<>();
        categoriasAdapter = new AdapterRVCategorias(context, categoriasList);
        categoriasHome.setAdapter(categoriasAdapter);

        /*
        db.collection("Categorias")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if(task.isSuccessful()){
                            for(QueryDocumentSnapshot document : task.getResult()){
                                Categorias categorias = document.toObject(Categorias.class);
                                categoriasList.add(categorias);
                                categoriasAdapter.notifyDataSetChanged();
                            }
                        } else {
                            Toast.makeText(getActivity(), "Error" + task.getException(), Toast.LENGTH_SHORT);
                        }
                    }
                });

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

        return root;
        */
    }

}