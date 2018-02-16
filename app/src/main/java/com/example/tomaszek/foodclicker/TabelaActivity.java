package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TabelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela);

        ImageView btnWoda = (ImageView) findViewById(R.id.btnWoda);
        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, WodaDetailsActivity.class);
                TabelaActivity.this.startActivity(myIntent);
            }
        });
    }


}
