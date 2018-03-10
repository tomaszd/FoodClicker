package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class NabialDetailsActivity extends AppCompatActivity {
    int woda_value = 0;
    int owoce_value = 0;
    int inne_value = 0;
    int warzywa_value = 0;
    int zboza_value = 0;
    int ryby_value = 0;
    int nabial_value = 0;
    int orzech_value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nabial_details);
        setupBottomNavigationView();
        Intent intent = getIntent();
        woda_value = intent.getIntExtra("woda", 0);
        inne_value = intent.getIntExtra("inne", 0);
        warzywa_value = intent.getIntExtra("warzywa", 0);
        owoce_value = intent.getIntExtra("owoce", 0);
        zboza_value = intent.getIntExtra("zboza", 0);
        ryby_value = intent.getIntExtra("ryby", 0);
        nabial_value = intent.getIntExtra("nabial", 0);
        orzech_value = intent.getIntExtra("orzechy", 0);


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

    private void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent myIntent = new Intent(NabialDetailsActivity.this, NabialDetailsActivity.class);
                        myIntent.putExtra("woda", woda_value); //Optional parameters
                        myIntent.putExtra("inne", inne_value); //Optional parameters
                        myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                        NabialDetailsActivity.this.startActivity(myIntent);
                        break;
                    case R.id.action_info:
                        Intent myIntent2 = new Intent(NabialDetailsActivity.this, TabelaActivity.class);
                        myIntent2.putExtra("woda", woda_value); //Optional parameters
                        myIntent2.putExtra("inne", inne_value); //Optional parameters
                        myIntent2.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent2.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent2.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent2.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent2.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent2.putExtra("orzechy", orzech_value); //Optional parameters
                        NabialDetailsActivity.this.startActivity(myIntent2);
                        break;
                    case R.id.action_piramid:
                        Intent myIntent3 = new Intent(NabialDetailsActivity.this, PiramidActivity.class);
                        myIntent3.putExtra("woda", woda_value); //Optional parameters
                        myIntent3.putExtra("inne", inne_value); //Optional parameters
                        myIntent3.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent3.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent3.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent3.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent3.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent3.putExtra("orzechy", orzech_value); //Optional parameters
                        NabialDetailsActivity.this.startActivity(myIntent3);
                        break;
                }
                return true;
            }
        });
    }

}
