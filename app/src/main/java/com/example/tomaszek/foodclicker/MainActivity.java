package com.example.tomaszek.foodclicker;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnWoda = (Button) findViewById(R.id.btnWoda);
        final Button btnDelete = (Button) findViewById(R.id.btnDelete);
        final EditText editWoda = (EditText) findViewById(R.id.editWoda);


        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editWoda.getText()));
                editWoda.setText(String.valueOf(actualValue + 1));
            }

        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editWoda.setText("0");
            }

        });
    }
}
