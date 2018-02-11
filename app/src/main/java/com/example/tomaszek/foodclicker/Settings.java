package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        final Button btnInformacja = (Button) findViewById(R.id.btnInformacja);
        final Button btnTabela = (Button) findViewById(R.id.btnTabela);
        final Button btnPiramida = (Button) findViewById(R.id.btnPiramida);
        final Button btnKasujDane = (Button) findViewById(R.id.btnKasujDane);

        btnPiramida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Settings.this, PiramidActivity.class);
                Settings.this.startActivity(myIntent);
            }
        });

        btnKasujDane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Settings.this, MainActivity.class);
                Settings.this.startActivity(myIntent);
            }
        });




    }
}
