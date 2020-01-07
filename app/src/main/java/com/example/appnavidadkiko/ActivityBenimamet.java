package com.example.appnavidadkiko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityBenimamet extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benimamet);

        ArrayList<gimnasios> gimnasiosLista = new ArrayList<>();
        gimnasiosLista.add(new gimnasios(R.drawable.campanariogodella, "Campanario", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.canal9, "Canal 9", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.cantereria, "Cantereria", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.centrocivico, "Centro Cívico", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.empalme, "Empalme", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.belfast, "Belfast", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.benimamet, "Benimamet", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.burjagodella, "Burjassot Godella", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.burjassot, "Burjassot", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new GimnasioAdapter(gimnasiosLista);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
