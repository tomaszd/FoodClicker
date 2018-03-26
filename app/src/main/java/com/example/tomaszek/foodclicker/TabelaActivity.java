package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TabelaActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_tabela);
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

        Intent intent = getIntent();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        woda_value = intent.getIntExtra("woda", 0);
        inne_value = intent.getIntExtra("inne", 0);
        warzywa_value = intent.getIntExtra("warzywa", 0);
        owoce_value = intent.getIntExtra("owoce", 0);
        zboza_value = intent.getIntExtra("zboza", 0);
        ryby_value = intent.getIntExtra("ryby", 0);
        nabial_value = intent.getIntExtra("nabial", 0);
        orzech_value = intent.getIntExtra("orzechy", 0);

        TextView appCompatImageButton = (TextView) findViewById(R.id.appCompatImageButton);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font2.ttf");
        appCompatImageButton.setTypeface(typeface);

        ImageView btnWoda = (ImageView) findViewById(R.id.btnWoda);
        btnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, WodaDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }


        });

        ImageView btnInne = (ImageView) findViewById(R.id.btnInne);
        btnInne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, InneDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnWarzywa = (ImageView) findViewById(R.id.btnWarzywa);
        btnWarzywa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, WarzywaDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnOwoce = (ImageView) findViewById(R.id.btnOwoce);
        btnOwoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, OwoceDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnRyby = (ImageView) findViewById(R.id.btnRyby);
        btnRyby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, RybyDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnOlejorzech = (ImageView) findViewById(R.id.btnOrzechy);
        btnOlejorzech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, OlejorzechDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnZboza = (ImageView) findViewById(R.id.btnZboza);
        btnZboza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, ZbozaDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        ImageView btnNabial = (ImageView) findViewById(R.id.btnNabial);
        btnNabial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TabelaActivity.this, NabialDetailsActivity.class);
                myIntent = extendIntentByAmountValues(myIntent,
                        woda_value,
                        inne_value,
                        warzywa_value,
                        owoce_value,
                        zboza_value,
                        ryby_value,
                        nabial_value,
                        orzech_value);
                TabelaActivity.this.startActivity(myIntent);
            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        switch (menuItem.getItemId()) {
                            case R.id.nav_log:
                                Intent myIntent0 = new Intent(TabelaActivity.this, LogActivity.class);
                                myIntent0.putExtra("woda", woda_value); //Optional parameters
                                myIntent0.putExtra("inne", inne_value); //Optional parameters
                                myIntent0.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent0.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent0.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent0.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent0.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent0.putExtra("orzechy", orzech_value); //Optional parameters
                                TabelaActivity.this.startActivity(myIntent0);
                                break;
                            case R.id.nav_home_view:
                                Intent myIntent = new Intent(TabelaActivity.this, TabelaActivity.class);
                                myIntent.putExtra("woda", woda_value); //Optional parameters
                                myIntent.putExtra("inne", inne_value); //Optional parameters
                                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                                myIntent.putExtra("otherActivity", true); //Optional parameters
                                TabelaActivity.this.startActivity(myIntent);
                                break;
                            case R.id.nav_info_view:
                                Intent myIntent2 = new Intent(TabelaActivity.this, TabelaActivity.class);
                                myIntent2.putExtra("woda", woda_value); //Optional parameters
                                myIntent2.putExtra("inne", inne_value); //Optional parameters
                                myIntent2.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent2.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent2.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent2.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent2.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent2.putExtra("orzechy", orzech_value); //Optional parameters
                                TabelaActivity.this.startActivity(myIntent2);
                                break;
                            case R.id.nav_piramid_view:
                                Intent myIntent3 = new Intent(TabelaActivity.this, PiramidActivity.class);
                                myIntent3.putExtra("woda", woda_value); //Optional parameters
                                myIntent3.putExtra("inne", inne_value); //Optional parameters
                                myIntent3.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent3.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent3.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent3.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent3.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent3.putExtra("orzechy", orzech_value); //Optional parameters
                                TabelaActivity.this.startActivity(myIntent3);
                                break;
                            case R.id.nav_add_profil:
                                Intent myIntent4 = new Intent(TabelaActivity.this, AddProfileActivity.class);
                                myIntent4.putExtra("woda", woda_value); //Optional parameters
                                myIntent4.putExtra("inne", inne_value); //Optional parameters
                                myIntent4.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent4.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent4.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent4.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent4.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent4.putExtra("orzechy", orzech_value); //Optional parameters
                                TabelaActivity.this.startActivity(myIntent4);
                                break;
                            case R.id.nav_choose_profile:
                                Intent myIntent5 = new Intent(TabelaActivity.this, SelectUserActivity.class);
                                myIntent5.putExtra("woda", woda_value); //Optional parameters
                                myIntent5.putExtra("inne", inne_value); //Optional parameters
                                myIntent5.putExtra("warzywa", warzywa_value); //Optional parameters
                                myIntent5.putExtra("owoce", owoce_value); //Optional parameters
                                myIntent5.putExtra("ryby", ryby_value); //Optional parameters
                                myIntent5.putExtra("zboza", zboza_value); //Optional parameters
                                myIntent5.putExtra("nabial", nabial_value); //Optional parameters
                                myIntent5.putExtra("orzechy", orzech_value); //Optional parameters
                                TabelaActivity.this.startActivity(myIntent5);
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

    private Intent extendIntentByAmountValues(Intent myIntent, int woda_value, int inne_value, int warzywa_value,
                                              int owoce_value, int ryby_value, int zboza_value, int nabial_value,
                                              int orzech_value) {
        myIntent.putExtra("woda", woda_value); //Optional parameters
        myIntent.putExtra("inne", inne_value); //Optional parameters
        myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
        myIntent.putExtra("owoce", owoce_value); //Optional parameters
        myIntent.putExtra("ryby", ryby_value); //Optional parameters
        myIntent.putExtra("zboza", zboza_value); //Optional parameters
        myIntent.putExtra("nabial", nabial_value); //Optional parameters
        myIntent.putExtra("orzechy", orzech_value); //Optional parameters
        return myIntent;
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
                        Intent myIntent = new Intent(TabelaActivity.this, MainActivity.class);
                        myIntent.putExtra("woda", woda_value); //Optional parameters
                        myIntent.putExtra("inne", inne_value); //Optional parameters
                        myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                        myIntent.putExtra("otherActivity", true); //Optional parameters
                        TabelaActivity.this.startActivity(myIntent);
                        break;
                    case R.id.action_info:
                        Intent myIntent2 = new Intent(TabelaActivity.this, TabelaActivity.class);
                        myIntent2.putExtra("woda", woda_value); //Optional parameters
                        myIntent2.putExtra("inne", inne_value); //Optional parameters
                        myIntent2.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent2.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent2.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent2.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent2.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent2.putExtra("orzechy", orzech_value); //Optional parameters
                        TabelaActivity.this.startActivity(myIntent2);
                        break;
                    case R.id.action_piramid:
                        Intent myIntent3 = new Intent(TabelaActivity.this, PiramidActivity.class);
                        myIntent3.putExtra("woda", woda_value); //Optional parameters
                        myIntent3.putExtra("inne", inne_value); //Optional parameters
                        myIntent3.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent3.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent3.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent3.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent3.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent3.putExtra("orzechy", orzech_value); //Optional parameters
                        TabelaActivity.this.startActivity(myIntent3);
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
