package com.example.tomaszek.foodclicker;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnDelete = (Button) findViewById(R.id.btnDelete);
        final Button btnWoda = (Button) findViewById(R.id.btnWoda);
        final EditText editWoda = (EditText) findViewById(R.id.editWoda);
        final Button btnWarzywa = (Button) findViewById(R.id.btnWarzywa);
        final EditText editWarzywa = (EditText) findViewById(R.id.editWarzywa);
        final Button btnOwoce = (Button) findViewById(R.id.btnOwoce);
        final EditText editOwoce = (EditText) findViewById(R.id.editOwoce);
        final Button btnOrzechy = (Button) findViewById(R.id.btnOrzechy);
        final EditText editOrzechy = (EditText) findViewById(R.id.editOrzechy);

        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editWoda.getText()));
                editWoda.setText(String.valueOf(actualValue + 1));
            }
        });
        btnWoda.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editWoda.getText()));
                if (actualValue > 0) {
                    editWoda.setText(String.valueOf(actualValue - 1));
                    return true;
                }
                return false;
            }
        });

        btnWarzywa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editWarzywa.getText()));
                editWarzywa.setText(String.valueOf(actualValue + 1));
            }
        });
        btnWarzywa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editWarzywa.getText()));
                if (actualValue > 0) {
                    editWarzywa.setText(String.valueOf(actualValue - 1));
                    return true;
                }
                return false;
            }
        });

        btnOwoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editOwoce.getText()));
                editOwoce.setText(String.valueOf(actualValue + 1));
            }
        });
        btnOwoce.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editOwoce.getText()));
                if (actualValue > 0) {
                    editOwoce.setText(String.valueOf(actualValue - 1));
                    return true;
                }
                return false;
            }
        });


        btnOrzechy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editOrzechy.getText()));
                editOrzechy.setText(String.valueOf(actualValue + 1));
            }
        });
        btnOrzechy.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editOrzechy.getText()));
                if (actualValue > 0) {
                    editOrzechy.setText(String.valueOf(actualValue - 1));
                    return true;
                }
                return false;
            }
        });


        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editWoda.setText("0");
                editWarzywa.setText("0");
                editOwoce.setText("0");
                editOrzechy.setText("0");
            }

        });


    }
}
