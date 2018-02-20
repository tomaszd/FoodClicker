package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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
        final ImageView btnSettings = (ImageView) findViewById(R.id.btnSettings);
        final ImageView btnTabela = (ImageView) findViewById(R.id.btnTabela);

        TextView appCompatImageButton = (TextView) findViewById(R.id.appCompatImageButton);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font.ttf");
        appCompatImageButton.setTypeface(typeface);

        final Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);


        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPrefs.edit();


        woda_value = sharedPrefs.getInt("woda", 0);
        inne_value = sharedPrefs.getInt("inne", 0);
        warzywa_value = sharedPrefs.getInt("warzywa", 0);
        owoce_value = sharedPrefs.getInt("owoce", 0);
        zboza_value = sharedPrefs.getInt("zboza", 0);
        ryby_value = sharedPrefs.getInt("ryby", 0);
        nabial_value = sharedPrefs.getInt("nabial", 0);
        orzech_value = sharedPrefs.getInt("orzechy", 0);

        setActualValue(editWoda, editInne, editWarzywa, editOwoce, editRyby, editZboza, editNabial, editOrzechy, woda_value, inne_value, warzywa_value, owoce_value, zboza_value, ryby_value, nabial_value, orzech_value);


        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int actualValue = Integer.parseInt(String.valueOf(editWoda.getText()));
                view.startAnimation(shake);
                woda_value += 1;
                editWoda.setText(String.valueOf(woda_value));
                saveSharedPref(editor, "woda", woda_value);

            }
        });
        btnWoda.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (woda_value > 0) {
                    woda_value -= 1;
                    editWoda.setText(String.valueOf(woda_value));
                    saveSharedPref(editor, "woda", woda_value);
                    return true;
                }
                return false;
            }
        });

        btnInne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inne_value += 1;
                view.startAnimation(shake);
                editInne.setText(String.valueOf(inne_value));
                saveSharedPref(editor, "inne", inne_value);
            }
        });
        btnInne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (inne_value > 0) {
                    inne_value -= 1;
                    editInne.setText(String.valueOf(inne_value));
                    saveSharedPref(editor, "inne", inne_value);
                    return true;
                }
                return false;
            }
        });

        btnWarzywa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                warzywa_value += 1;
                view.startAnimation(shake);
                editWarzywa.setText(String.valueOf(warzywa_value));
                saveSharedPref(editor, "warzywa", warzywa_value);
            }
        });
        btnWarzywa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if (warzywa_value > 0) {
                    warzywa_value -= 1;
                    editWarzywa.setText(String.valueOf(warzywa_value));
                    saveSharedPref(editor, "warzywa", warzywa_value);
                    return true;
                }
                return false;
            }
        });

        btnOwoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                owoce_value += 1;
                view.startAnimation(shake);
                editOwoce.setText(String.valueOf(owoce_value));
                saveSharedPref(editor, "owoce", owoce_value);
            }
        });
        btnOwoce.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if (owoce_value > 0) {
                    owoce_value -= 1;
                    editOwoce.setText(String.valueOf(owoce_value));
                    saveSharedPref(editor, "owoce", owoce_value);
                    return true;
                }
                return false;
            }
        });

        btnRyby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ryby_value = Integer.parseInt(String.valueOf(editRyby.getText()));
                ryby_value += 1;
                view.startAnimation(shake);
                editRyby.setText(String.valueOf(ryby_value));
                saveSharedPref(editor, "ryby", ryby_value);
            }
        });
        btnRyby.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int ryby_value = Integer.parseInt(String.valueOf(editRyby.getText()));
                if (ryby_value > 0) {
                    ryby_value -= 1;
                    editRyby.setText(String.valueOf(ryby_value));
                    saveSharedPref(editor, "ryby", ryby_value);
                    return true;
                }
                return false;
            }
        });

        btnZboza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                zboza_value += 1;
                view.startAnimation(shake);
                editZboza.setText(String.valueOf(zboza_value));
                saveSharedPref(editor, "zboza", zboza_value);
            }
        });
        btnZboza.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if (zboza_value > 0) {
                    zboza_value -= 1;
                    editZboza.setText(String.valueOf(zboza_value));
                    saveSharedPref(editor, "zboza", zboza_value);
                    return true;
                }
                return false;
            }
        });

        btnNabial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nabial_value += 1;
                view.startAnimation(shake);
                editNabial.setText(String.valueOf(nabial_value));
                saveSharedPref(editor, "nabial", nabial_value);
            }
        });
        btnNabial.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if (nabial_value > 0) {
                    nabial_value -= 1;
                    editNabial.setText(String.valueOf(nabial_value));
                    saveSharedPref(editor, "nabial", nabial_value);
                    return true;
                }
                return false;
            }
        });

        btnOrzechy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                orzech_value += 1;
                view.startAnimation(shake);
                editOrzechy.setText(String.valueOf(orzech_value));
                saveSharedPref(editor, "orzechy", orzech_value);
            }
        });
        btnOrzechy.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if (orzech_value > 0) {
                    orzech_value -= 1;
                    editOrzechy.setText(String.valueOf(orzech_value));
                    saveSharedPref(editor, "orzechy", orzech_value);
                    return true;
                }
                return false;
            }
        });


        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, SettingsActivity.class);
                myIntent.putExtra("woda", woda_value); //Optional parameters
                myIntent.putExtra("inne", inne_value); //Optional parameters
                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

        btnTabela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, TabelaActivity.class);
                myIntent.putExtra("woda", woda_value); //Optional parameters
                myIntent.putExtra("inne", inne_value); //Optional parameters
                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

        btnPiramida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, PiramidActivity.class);
                myIntent.putExtra("woda", woda_value); //Optional parameters
                myIntent.putExtra("inne", inne_value); //Optional parameters
                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                woda_value = 0;
                inne_value = 0;
                warzywa_value = 0;
                owoce_value = 0;
                ryby_value = 0;
                zboza_value = 0;
                nabial_value = 0;
                orzech_value = 0;
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
