package com.example.tomaszek.foodclicker;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnDelete = (Button) findViewById(R.id.btnDelete);
        final Button btnWoda = (Button) findViewById(R.id.btnWoda);
        final TextView editWoda = (TextView) findViewById(R.id.editWoda);
        final Button btnInne = (Button) findViewById(R.id.btnInne);
        final TextView editInne = (TextView) findViewById(R.id.editInne);
        final Button btnWarzywa = (Button) findViewById(R.id.btnWarzywa);
        final TextView editWarzywa = (TextView) findViewById(R.id.editWarzywa);
        final Button btnOwoce = (Button) findViewById(R.id.btnOwoce);
        final TextView editOwoce = (TextView) findViewById(R.id.editOwoce);
        final Button btnRyby = (Button) findViewById(R.id.btnRyby);
        final TextView editRyby = (TextView) findViewById(R.id.editRyby);
        final Button btnMieso = (Button) findViewById(R.id.btnMieso);
        final TextView editMieso = (TextView) findViewById(R.id.editMieso);
        final Button btnZboza = (Button) findViewById(R.id.btnZboza);
        final TextView editZboza = (TextView) findViewById(R.id.editZboza);
        final Button btnNabial = (Button) findViewById(R.id.btnNabial);
        final TextView editNabial = (TextView) findViewById(R.id.editNabial);
        final Button btnOrzechy = (Button) findViewById(R.id.btnOrzechy);
        final TextView editOrzechy = (TextView) findViewById(R.id.editOrzechy);
        final Button btnSlodycze = (Button) findViewById(R.id.btnSlodycze);
        final TextView editSlodycze = (TextView) findViewById(R.id.editSlodycze);

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

        btnInne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editInne.getText()));
                editInne.setText(String.valueOf(actualValue + 1));
            }
        });
        btnInne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editInne.getText()));
                if (actualValue > 0) {
                    editInne.setText(String.valueOf(actualValue - 1));
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

        btnRyby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editRyby.getText()));
                editRyby.setText(String.valueOf(actualValue + 1));
            }
        });
        btnRyby.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editRyby.getText()));
                if (actualValue > 0) {
                    editRyby.setText(String.valueOf(actualValue - 1));
                    return true;
                }
                return false;
            }
        });
        btnMieso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editMieso.getText()));
                editMieso.setText(String.valueOf(actualValue + 1));
            }
        });
        btnMieso.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editMieso.getText()));
                if (actualValue > 0) {
                    editMieso.setText(String.valueOf(actualValue - 1));
                    return true;
                }
                return false;
            }
        });

        btnZboza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editZboza.getText()));
                editZboza.setText(String.valueOf(actualValue + 1));
            }
        });
        btnZboza.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editZboza.getText()));
                if (actualValue > 0) {
                    editZboza.setText(String.valueOf(actualValue - 1));
                    return true;
                }
                return false;
            }
        });

        btnNabial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editNabial.getText()));
                editNabial.setText(String.valueOf(actualValue + 1));
            }
        });
        btnNabial.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editNabial.getText()));
                if (actualValue > 0) {
                    editNabial.setText(String.valueOf(actualValue - 1));
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
        btnSlodycze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editSlodycze.getText()));
                editSlodycze.setText(String.valueOf(actualValue + 1));
            }
        });
        btnSlodycze.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editSlodycze.getText()));
                if (actualValue > 0) {
                    editSlodycze.setText(String.valueOf(actualValue - 1));
                    return true;
                }
                return false;
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editWoda.setText("0");
                editInne.setText("0");
                editWarzywa.setText("0");
                editOwoce.setText("0");
                editRyby.setText("0");
                editMieso.setText("0");
                editZboza.setText("0");
                editNabial.setText("0");
                editOrzechy.setText("0");
                editSlodycze.setText("0");


            }

        });


    }
}
