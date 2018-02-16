package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WodaDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woda_details);



        ImageView btnPiramida = (ImageView) findViewById(R.id.btnPiramida);
        btnPiramida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(WodaDetailsActivity.this, PiramidActivity.class);
                WodaDetailsActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnTabela = (ImageView) findViewById(R.id.btnTabela);
        btnTabela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(WodaDetailsActivity.this, TabelaActivity.class);
                WodaDetailsActivity.this.startActivity(myIntent);
            }
        });

    }




}
