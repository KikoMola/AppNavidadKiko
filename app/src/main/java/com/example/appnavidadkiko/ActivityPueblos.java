package com.example.appnavidadkiko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class ActivityPueblos extends AppCompatActivity {
    private Button burjassot, godella, benimamet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pueblos);

        burjassot = findViewById(R.id.logoBurjassot);
        godella = findViewById(R.id.logoGodella);
        benimamet = findViewById(R.id.logoBenimamet);

        burjassot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPueblos.this, ActivityBurjassot.class);
                startActivity(intent);
            }
        });

        godella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPueblos.this, ActivityGodella.class);
                startActivity(intent);
            }
        });

        benimamet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPueblos.this, ActivityBenimamet.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logo:
                Uri uri = Uri.parse("https://pokemongoburja.github.io/web/index.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
        }
        return super.onContextItemSelected(item);
    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text = parent.getItemAtPosition(position).toString();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }
}
