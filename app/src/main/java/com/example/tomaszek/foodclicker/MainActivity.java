package com.example.tomaszek.foodclicker;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView btnDelete = (ImageView) findViewById(R.id.btnDelete);
        final ImageView btnWoda = (ImageView) findViewById(R.id.btnWoda);
        final TextView editWoda = (TextView) findViewById(R.id.editWoda);
        final ImageView btnInne = (ImageView) findViewById(R.id.btnInne);
        final TextView editInne = (TextView) findViewById(R.id.editInne);
        final ImageView btnWarzywa = (ImageView) findViewById(R.id.btnWarzywa);
        final TextView editWarzywa = (TextView) findViewById(R.id.editWarzywa);
        final ImageView btnOwoce = (ImageView) findViewById(R.id.btnOwoce);
        final TextView editOwoce = (TextView) findViewById(R.id.editOwoce);
        final ImageView btnRyby = (ImageView) findViewById(R.id.btnRyby);
        final TextView editRyby = (TextView) findViewById(R.id.editRyby);
        final ImageView btnZboza = (ImageView) findViewById(R.id.btnZboza);
        final TextView editZboza = (TextView) findViewById(R.id.editZboza);
        final ImageView btnNabial = (ImageView) findViewById(R.id.btnNabial);
        final TextView editNabial = (TextView) findViewById(R.id.editNabial);
        final ImageView btnOrzechy = (ImageView) findViewById(R.id.btnOrzechy);
        final TextView editOrzechy = (TextView) findViewById(R.id.editOrzechy);
        final ImageView btnPiramida = (ImageView) findViewById(R.id.btnPiramida);


        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = settings.edit();


        int woda_value = settings.getInt("woda", 0);
        int inne_value = settings.getInt("inne", 0);
        int warzywa_value = settings.getInt("warzywa", 0);
        int owoce_value = settings.getInt("owoce", 0);
        int zboza_value = settings.getInt("zboza", 0);
        int ryby_value = settings.getInt("ryby", 0);
        int nabial_value = settings.getInt("nabial", 0);
        int orzech_value = settings.getInt("orzechy", 0);

        setActualValue(editWoda, editInne, editWarzywa, editOwoce, editRyby, editZboza, editNabial, editOrzechy, woda_value, inne_value, warzywa_value, owoce_value, zboza_value, ryby_value, nabial_value, orzech_value);


        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int actualValue = Integer.parseInt(String.valueOf(editWoda.getText()));
                actualValue += 1;
                editWoda.setText(String.valueOf(actualValue));
                saveSharedPref(editor, "woda", actualValue);

            }
        });
        btnWoda.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editWoda.getText()));
                if (actualValue > 0) {
                    actualValue -= 1;
                    editWoda.setText(String.valueOf(actualValue));
                    saveSharedPref(editor, "woda", actualValue);
                    return true;
                }
                return false;
            }
        });

        btnInne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int actualValue = Integer.parseInt(String.valueOf(editInne.getText()));
                actualValue += 1;
                editInne.setText(String.valueOf(actualValue));
                saveSharedPref(editor, "inne", actualValue);
            }
        });
        btnInne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editInne.getText()));
                if (actualValue > 0) {
                    actualValue -= 1;
                    editInne.setText(String.valueOf(actualValue));
                    saveSharedPref(editor, "inne", actualValue);
                    return true;
                }
                return false;
            }
        });

        btnWarzywa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int actualValue = Integer.parseInt(String.valueOf(editWarzywa.getText()));
                actualValue += 1;
                editWarzywa.setText(String.valueOf(actualValue));
                saveSharedPref(editor, "warzywa", actualValue);
            }
        });
        btnWarzywa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editWarzywa.getText()));
                if (actualValue > 0) {
                    actualValue -= 1;
                    editWarzywa.setText(String.valueOf(actualValue));
                    saveSharedPref(editor, "warzywa", actualValue);
                    return true;
                }
                return false;
            }
        });

        btnOwoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editOwoce.getText()));
                actualValue += 1;
                editOwoce.setText(String.valueOf(actualValue));
                saveSharedPref(editor, "owoce", actualValue);
            }
        });
        btnOwoce.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editOwoce.getText()));
                if (actualValue > 0) {
                    actualValue -= 1;
                    editOwoce.setText(String.valueOf(actualValue));
                    saveSharedPref(editor, "owoce", actualValue);
                    return true;
                }
                return false;
            }
        });

        btnRyby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editRyby.getText()));
                actualValue += 1;
                editRyby.setText(String.valueOf(actualValue));
                saveSharedPref(editor, "ryby", actualValue);
            }
        });
        btnRyby.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editRyby.getText()));
                if (actualValue > 0) {
                    actualValue -= 1;
                    editRyby.setText(String.valueOf(actualValue));
                    saveSharedPref(editor, "ryby", actualValue);
                    return true;
                }
                return false;
            }
        });

        btnZboza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int actualValue = Integer.parseInt(String.valueOf(editZboza.getText()));
                actualValue += 1;
                editZboza.setText(String.valueOf(actualValue));
                saveSharedPref(editor, "zboza", actualValue);
            }
        });
        btnZboza.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editZboza.getText()));
                if (actualValue > 0) {
                    actualValue -= 1;
                    editZboza.setText(String.valueOf(actualValue));
                    saveSharedPref(editor, "zboza", actualValue);
                    return true;
                }
                return false;
            }
        });

        btnNabial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int actualValue = Integer.parseInt(String.valueOf(editNabial.getText()));
                actualValue += 1;
                editNabial.setText(String.valueOf(actualValue));
                saveSharedPref(editor, "nabial", actualValue);
            }
        });
        btnNabial.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editNabial.getText()));
                if (actualValue > 0) {
                    actualValue -= 1;
                    editNabial.setText(String.valueOf(actualValue));
                    saveSharedPref(editor, "nabial", actualValue);
                    return true;
                }
                return false;
            }
        });

        btnOrzechy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int actualValue = Integer.parseInt(String.valueOf(editOrzechy.getText()));
                actualValue += 1;
                editOrzechy.setText(String.valueOf(actualValue));
                saveSharedPref(editor, "orzechy", actualValue);
            }
        });
        btnOrzechy.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int actualValue = Integer.parseInt(String.valueOf(editOrzechy.getText()));
                if (actualValue > 0) {
                    actualValue -= 1;
                    editOrzechy.setText(String.valueOf(actualValue));
                    saveSharedPref(editor, "orzechy", actualValue);
                    return true;
                }
                return false;
            }
        });

        btnPiramida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, PiramidActivity.class);
                myIntent.putExtra("woda", ""); //Optional parameters
                myIntent.putExtra("inne", ""); //Optional parameters
                myIntent.putExtra("warzywa", ""); //Optional parameters
                myIntent.putExtra("owoce", ""); //Optional parameters
                myIntent.putExtra("ryby", ""); //Optional parameters
                myIntent.putExtra("zboza", ""); //Optional parameters
                myIntent.putExtra("nabial", ""); //Optional parameters
                myIntent.putExtra("orzechy", ""); //Optional parameters
                MainActivity.this.startActivity(myIntent);
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
                editZboza.setText("0");
                editNabial.setText("0");
                editOrzechy.setText("0");
            }

        });


    }

    private void saveSharedPref(SharedPreferences.Editor editor, String key, int actual_value) {
        editor.putInt(key, actual_value);
        editor.commit();
    }

    private void setActualValue(TextView editWoda, TextView editInne, TextView editWarzywa, TextView editOwoce, TextView editRyby, TextView editZboza, TextView editNabial, TextView editOrzechy, int woda_value, int inne_value, int warzywa_value, int owoce_value, int zboza_value, int ryby_value, int nabial_value, int orzech_value) {
        editWoda.setText(String.valueOf(woda_value));
        editInne.setText(String.valueOf(inne_value));
        editWarzywa.setText(String.valueOf(warzywa_value));
        editOwoce.setText(String.valueOf(owoce_value));
        editZboza.setText(String.valueOf(zboza_value));
        editRyby.setText(String.valueOf(ryby_value));
        editNabial.setText(String.valueOf(nabial_value));
        editOrzechy.setText(String.valueOf(orzech_value));
    }
}
