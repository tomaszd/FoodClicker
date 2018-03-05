package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TabelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela);


        Intent intent = getIntent();

        final int woda_value = intent.getIntExtra("woda", 0);
        final int inne_value = intent.getIntExtra("inne", 0);
        final int warzywa_value = intent.getIntExtra("warzywa", 0);
        final int owoce_value = intent.getIntExtra("owoce", 0);
        final int zboza_value = intent.getIntExtra("zboza", 0);
        final int ryby_value = intent.getIntExtra("ryby", 0);
        final int nabial_value = intent.getIntExtra("nabial", 0);
        final int orzech_value = intent.getIntExtra("orzechy", 0);

        TextView appCompatImageButton = (TextView) findViewById(R.id.appCompatImageButton);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font2.ttf");
        appCompatImageButton.setTypeface(typeface);
        appCompatImageButton.setTextColor(0xffffffff); //this is white color


        ImageView btnWoda = (ImageView) findViewById(R.id.btnWoda);
        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, WodaDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }


        });

        ImageView btnInne = (ImageView) findViewById(R.id.btnInne);
        btnInne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, InneDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnWarzywa = (ImageView) findViewById(R.id.btnWarzywa);
        btnWarzywa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, WarzywaDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnOwoce = (ImageView) findViewById(R.id.btnOwoce);
        btnOwoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, OwoceDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnRyby = (ImageView) findViewById(R.id.btnRyby);
        btnRyby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, RybyDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnOlejorzech = (ImageView) findViewById(R.id.btnOrzechy);
        btnOlejorzech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, OlejorzechDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnZboza = (ImageView) findViewById(R.id.btnZboza);
        btnZboza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, ZbozaDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnNabial = (ImageView) findViewById(R.id.btnNabial);
        btnNabial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, NabialDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });
        ImageView btnPiramida = (ImageView) findViewById(R.id.btnPiramida);
        btnPiramida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(TabelaActivity.this, PiramidActivity.class);
                myIntent.putExtra("woda", woda_value); //Optional parameters
                myIntent.putExtra("inne", inne_value); //Optional parameters
                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                TabelaActivity.this.startActivity(myIntent);
            }
        });


    }

    private Intent extendIntentByAmountValues(Intent myIntent, int woda_value, int inne_value, int warzywa_value,
                                              int owoce_value, int ryby_value, int zboza_value, int nabial_value,
                                              int orzech_value) {
        myIntent.putExtra("woda", woda_value); //Optional parameters
        myIntent.putExtra("inne", inne_value); //Optional parameters
        myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
        myIntent.putExtra("owoce", owoce_value); //Optional parameters
        myIntent.putExtra("ryby", ryby_value); //Optional parameters
        myIntent.putExtra("zboza", zboza_value); //Optional parameters
        myIntent.putExtra("nabial", nabial_value); //Optional parameters
        myIntent.putExtra("orzechy", orzech_value); //Optional parameters
        return myIntent;
    }


}
