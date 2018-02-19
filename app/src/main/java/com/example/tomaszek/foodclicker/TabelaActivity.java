package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class TabelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela);

        EditText appCompatImageButton =(EditText) findViewById(R.id.appCompatImageButton);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font.ttf");
        appCompatImageButton.setTypeface(typeface);


        ImageView btnWoda = (ImageView) findViewById(R.id.btnWoda);
        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, WodaDetailsActivity.class);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnInne = (ImageView) findViewById(R.id.btnInne);
        btnInne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, InneDetailsActivity.class);
                TabelaActivity.this.startActivity(myIntent);
            }
        });


    }


}
