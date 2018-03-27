package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    int woda_value = 0;
    int owoce_value = 0;
    int inne_value = 0;
    int warzywa_value = 0;
    int zboza_value = 0;
    int ryby_value = 0;
    int nabial_value = 0;
    int orzech_value = 0;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
        toolbar.setTitle("Food Clicker");
        toolbar.setDrawingCacheBackgroundColor(getResources().getColor(R.color.colorWhite));


        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
        setupBottomNavigationView();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.add_user, R.string.choose_user);

        mDrawerToggle.setDrawerIndicatorEnabled(false);

        mDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });

        mDrawerToggle.setHomeAsUpIndicator(R.drawable.ananas);

        //mDrawerLayout.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorWhite));


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
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font2.ttf");
        appCompatImageButton.setTypeface(typeface);

        final Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);


        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPrefs.edit();
        Intent intent = getIntent();

        if (intent.getBooleanExtra("otherActivity", false)) //Optional parameters
        {
            woda_value = intent.getIntExtra("woda", 0);
            inne_value = intent.getIntExtra("inne", 0);
            warzywa_value = intent.getIntExtra("warzywa", 0);
            owoce_value = intent.getIntExtra("owoce", 0);
            zboza_value = intent.getIntExtra("zboza", 0);
            ryby_value = intent.getIntExtra("ryby", 0);
            nabial_value = intent.getIntExtra("nabial", 0);
            orzech_value = intent.getIntExtra("orzechy", 0);
        } else {

            woda_value = sharedPrefs.getInt("woda", 0);
            inne_value = sharedPrefs.getInt("inne", 0);
            warzywa_value = sharedPrefs.getInt("warzywa", 0);
            owoce_value = sharedPrefs.getInt("owoce", 0);
            zboza_value = sharedPrefs.getInt("zboza", 0);
            ryby_value = sharedPrefs.getInt("ryby", 0);
            nabial_value = sharedPrefs.getInt("nabial", 0);
            orzech_value = sharedPrefs.getInt("orzechy", 0);
        }

        setActualValue(editWoda, editInne, editWarzywa, editOwoce, editRyby, editZboza, editNabial, editOrzechy, woda_value, inne_value, warzywa_value, owoce_value, zboza_value, ryby_value, nabial_value, orzech_value);


        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                woda_value += 1;
                editWoda.setText(String.valueOf(woda_value));
                saveSharedPref(editor, "woda", woda_value);
                saveLogIntoDB("woda", true);
            }
        });
        btnWoda.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (woda_value > 0) {
                    woda_value -= 1;
                    editWoda.setText(String.valueOf(woda_value));
                    saveSharedPref(editor, "woda", woda_value);
                    saveLogIntoDB("woda", false);
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
                saveLogIntoDB("inne", true);
            }
        });
        btnInne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (inne_value > 0) {
                    inne_value -= 1;
                    editInne.setText(String.valueOf(inne_value));
                    saveSharedPref(editor, "inne", inne_value);
                    saveLogIntoDB("inne", false);
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
                saveLogIntoDB("warzywa", true);
            }
        });
        btnWarzywa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (warzywa_value > 0) {
                    warzywa_value -= 1;
                    editWarzywa.setText(String.valueOf(warzywa_value));
                    saveSharedPref(editor, "warzywa", warzywa_value);
                    saveLogIntoDB("warzywa", false);
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
                saveLogIntoDB("owoce", true);
            }
        });
        btnOwoce.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if (owoce_value > 0) {
                    owoce_value -= 1;
                    editOwoce.setText(String.valueOf(owoce_value));
                    saveSharedPref(editor, "owoce", owoce_value);
                    saveLogIntoDB("owoce", false);
                    return true;
                }
                return false;
            }
        });

        btnRyby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ryby_value += 1;
                view.startAnimation(shake);
                editRyby.setText(String.valueOf(ryby_value));
                saveSharedPref(editor, "ryby", ryby_value);
                saveLogIntoDB("ryby", true);
            }
        });
        btnRyby.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (ryby_value > 0) {
                    ryby_value -= 1;
                    editRyby.setText(String.valueOf(ryby_value));
                    saveSharedPref(editor, "ryby", ryby_value);
                    saveLogIntoDB("ryby", false);
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
                saveLogIntoDB("zboza", true);
            }
        });
        btnZboza.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if (zboza_value > 0) {
                    zboza_value -= 1;
                    editZboza.setText(String.valueOf(zboza_value));
                    saveSharedPref(editor, "zboza", zboza_value);
                    saveLogIntoDB("zboza", false);
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
                saveLogIntoDB("nabial", true);
            }
        });
        btnNabial.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (nabial_value > 0) {
                    nabial_value -= 1;
                    editNabial.setText(String.valueOf(nabial_value));
                    saveSharedPref(editor, "nabial", nabial_value);
                    saveLogIntoDB("nabial", false);
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
                saveLogIntoDB("orzechy", true);
            }
        });
        btnOrzechy.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (orzech_value > 0) {
                    orzech_value -= 1;
                    editOrzechy.setText(String.valueOf(orzech_value));
                    saveSharedPref(editor, "orzechy", orzech_value);
                    saveLogIntoDB("orzechy", false);
                    return true;
                }
                return false;
            }
        });


        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
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
                view.startAnimation(shake);
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
                view.startAnimation(shake);
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
                view.startAnimation(shake);
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


                editOwoce.startAnimation(shake);

                editWoda.startAnimation(shake);
                editInne.startAnimation(shake);
                editWarzywa.startAnimation(shake);
                editOwoce.startAnimation(shake);
                editRyby.startAnimation(shake);
                editZboza.startAnimation(shake);
                editNabial.startAnimation(shake);
                editOrzechy.startAnimation(shake);
                saveLogIntoDB("kosz", false);


            }

        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);


        View headerView = navigationView.getHeaderView(0);
        TextView txtUsername = (TextView) headerView.findViewById(R.id.txtUsername);
        String username = sharedPrefs.getString("username", "Anonymous");
        txtUsername.setText(username);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        switch (menuItem.getItemId()) {
                            case R.id.nav_log:
                                Intent myIntent0 = new Intent(MainActivity.this, LogActivity.class);
                                myIntent0.putExtra("woda", woda_value); //Optional parameters
                                myIntent0.putExtra("inne", inne_value); //Optional parameters
                                myIntent0.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent0.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent0.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent0.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent0.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent0.putExtra("orzechy", orzech_value); //Optional parameters
                                MainActivity.this.startActivity(myIntent0);
                                break;
                            case R.id.nav_home_view:
                                Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
                                myIntent.putExtra("woda", woda_value); //Optional parameters
                                myIntent.putExtra("inne", inne_value); //Optional parameters
                                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                                myIntent.putExtra("otherActivity", true); //Optional parameters
                                MainActivity.this.startActivity(myIntent);
                                break;
                            case R.id.nav_info_view:
                                Intent myIntent2 = new Intent(MainActivity.this, TabelaActivity.class);
                                myIntent2.putExtra("woda", woda_value); //Optional parameters
                                myIntent2.putExtra("inne", inne_value); //Optional parameters
                                myIntent2.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent2.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent2.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent2.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent2.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent2.putExtra("orzechy", orzech_value); //Optional parameters
                                MainActivity.this.startActivity(myIntent2);
                                break;
                            case R.id.nav_piramid_view:
                                Intent myIntent3 = new Intent(MainActivity.this, PiramidActivity.class);
                                myIntent3.putExtra("woda", woda_value); //Optional parameters
                                myIntent3.putExtra("inne", inne_value); //Optional parameters
                                myIntent3.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent3.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent3.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent3.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent3.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent3.putExtra("orzechy", orzech_value); //Optional parameters
                                MainActivity.this.startActivity(myIntent3);
                                break;
                            case R.id.nav_add_profil:
                                Intent myIntent4 = new Intent(MainActivity.this, AddProfileActivity.class);
                                myIntent4.putExtra("woda", woda_value); //Optional parameters
                                myIntent4.putExtra("inne", inne_value); //Optional parameters
                                myIntent4.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent4.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent4.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent4.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent4.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent4.putExtra("orzechy", orzech_value); //Optional parameters
                                MainActivity.this.startActivity(myIntent4);
                                break;
                            case R.id.nav_choose_profile:
                                Intent myIntent5 = new Intent(MainActivity.this, SelectUserActivity.class);
                                myIntent5.putExtra("woda", woda_value); //Optional parameters
                                myIntent5.putExtra("inne", inne_value); //Optional parameters
                                myIntent5.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent5.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent5.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent5.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent5.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent5.putExtra("orzechy", orzech_value); //Optional parameters
                                MainActivity.this.startActivity(myIntent5);
                                break;


                        }
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

    }

    /**
     * Added ->
     *
     * @param what  "woda" "inne etc"
     * @param added true -item added false item deleted
     */

    private void saveLogIntoDB(String what, boolean added) {
        Intent mServiceIntent = new Intent(getApplicationContext(), LogDBService.class);
        mServiceIntent.setAction("com.example.tomaszek.foodclicker.action.add");
        mServiceIntent.putExtra("what", what);
        DateFormat df = new SimpleDateFormat("hh:mm (dd.MM)");
        String date = df.format(new Date());
        mServiceIntent.putExtra("when", date);
        mServiceIntent.putExtra("added", added);
        getApplicationContext().startService(mServiceIntent);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
                        myIntent.putExtra("woda", woda_value); //Optional parameters
                        myIntent.putExtra("inne", inne_value); //Optional parameters
                        myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                        myIntent.putExtra("otherActivity", true); //Optional parameters
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case R.id.action_info:
                        Intent myIntent2 = new Intent(MainActivity.this, TabelaActivity.class);
                        myIntent2.putExtra("woda", woda_value); //Optional parameters
                        myIntent2.putExtra("inne", inne_value); //Optional parameters
                        myIntent2.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent2.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent2.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent2.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent2.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent2.putExtra("orzechy", orzech_value); //Optional parameters
                        MainActivity.this.startActivity(myIntent2);
                        break;
                    case R.id.action_piramid:
                        Intent myIntent3 = new Intent(MainActivity.this, PiramidActivity.class);
                        myIntent3.putExtra("woda", woda_value); //Optional parameters
                        myIntent3.putExtra("inne", inne_value); //Optional parameters
                        myIntent3.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent3.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent3.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent3.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent3.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent3.putExtra("orzechy", orzech_value); //Optional parameters
                        MainActivity.this.startActivity(myIntent3);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (layout.isDrawerOpen(GravityCompat.START)) {
            layout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
