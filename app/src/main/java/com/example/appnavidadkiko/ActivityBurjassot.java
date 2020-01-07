package com.example.appnavidadkiko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import static android.content.Intent.ACTION_VIEW;

public class ActivityBurjassot extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private GimnasioAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burjassot);

        final ArrayList<gimnasios> gimnasiosLista = new ArrayList<>();
        gimnasiosLista.add(new gimnasios(R.drawable.belfast, "Belfast", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.benimamet, "Benimamet", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.burjagodella, "Burjassot Godella", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.burjassot, "Burjassot", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.campanariogodella, "Campanario", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.canal9, "Canal 9", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.cantereria, "Cantereria", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.centrocivico, "Centro Cívico", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.empalme, "Empalme", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.ermitasalvador, "Ermita Salvador", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.escultura, "Escultura", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.estatuablasco, "Estatua Blasco", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.evangelica, "Evangélica", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));
        gimnasiosLista.add(new gimnasios(R.drawable.fuente, "Fuente", "https://goo.gl/maps/wXm64Vxaf26GB5sZ7"));
        gimnasiosLista.add(new gimnasios(R.drawable.fuentesvm, "Fuente SVM", "https://goo.gl/maps/tvuYXqrBqZuprG5x5"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new GimnasioAdapter(gimnasiosLista);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new GimnasioAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String maps = gimnasiosLista.get(position).getURL();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(maps));
                startActivity(browserIntent);

            }
        });
    }
}
