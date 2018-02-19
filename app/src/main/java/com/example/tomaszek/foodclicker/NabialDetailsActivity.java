package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NabialDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nabial_details);

        Intent intent = getIntent();
        final int woda_value = intent.getIntExtra("woda", 0);
        final int inne_value = intent.getIntExtra("inne", 0);
        final int warzywa_value = intent.getIntExtra("warzywa", 0);
        final int owoce_value = intent.getIntExtra("owoce", 0);
        final int zboza_value = intent.getIntExtra("zboza", 0);
        final int ryby_value = intent.getIntExtra("ryby", 0);
        final int nabial_value = intent.getIntExtra("nabial", 0);
        final int orzech_value = intent.getIntExtra("orzechy", 0);


        ImageView btnPiramida = (ImageView) findViewById(R.id.btnPiramida);
        btnPiramida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(NabialDetailsActivity.this, PiramidActivity.class);
                myIntent.putExtra("woda", woda_value); //Optional parameters
                myIntent.putExtra("inne", inne_value); //Optional parameters
                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                NabialDetailsActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnTabela = (ImageView) findViewById(R.id.btnTabela);
        btnTabela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(NabialDetailsActivity.this, TabelaActivity.class);
                myIntent.putExtra("woda", woda_value); //Optional parameters
                myIntent.putExtra("inne", inne_value); //Optional parameters
                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                NabialDetailsActivity.this.startActivity(myIntent);
            }
        });

    }


}
