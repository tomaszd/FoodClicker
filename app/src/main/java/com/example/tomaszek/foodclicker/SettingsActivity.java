package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        final Button btnInformacja = (Button) findViewById(R.id.btnInformacja);
        final Button btnTabela = (Button) findViewById(R.id.btnTabela);
        final Button btnPiramida = (Button) findViewById(R.id.btnPiramida);
        final Button btnKasujDane = (Button) findViewById(R.id.btnKasujDane);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font.ttf");
        btnInformacja.setTypeface(typeface);
        btnTabela.setTypeface(typeface);
        btnPiramida.setTypeface(typeface);
        btnKasujDane.setTypeface(typeface);

        final SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPrefs.edit();


        btnPiramida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SettingsActivity.this, PiramidActivity.class);
                SettingsActivity.this.startActivity(myIntent);
            }
        });

        btnTabela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SettingsActivity.this, TabelaActivity.class);
                SettingsActivity.this.startActivity(myIntent);
            }
        });

        btnKasujDane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putInt("woda", 0);
                editor.putInt("inne", 0);
                editor.putInt("warzywa", 0);
                editor.putInt("owoce", 0);
                editor.putInt("zboza", 0);
                editor.putInt("ryby", 0);
                editor.putInt("nabial", 0);
                editor.putInt("orzechy", 0);
                editor.commit();

                Intent myIntent = new Intent(SettingsActivity.this, MainActivity.class);
                //myIntent.putExtra("woda", 0); //Optional parameters
                //myIntent.putExtra("inne", 0); //Optional parameters
                //myIntent.putExtra("warzywa", 0); //Optional parameters
                //myIntent.putExtra("owoce", 0); //Optional parameters
                //myIntent.putExtra("ryby", 0); //Optional parameters
                //myIntent.putExtra("zboza", 0); //Optional parameters
                //myIntent.putExtra("nabial", 0); //Optional parameters
                //myIntent.putExtra("orzechy", 0); //Optional parameters
                SettingsActivity.this.startActivity(myIntent);
            }
        });

    }
}
