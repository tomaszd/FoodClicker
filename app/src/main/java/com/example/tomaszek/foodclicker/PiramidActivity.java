package com.example.tomaszek.foodclicker;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class PiramidActivity extends AppCompatActivity {

    boolean btnOwoce_enabled = false;
    boolean btnRyby1_enabled = false;
    boolean btnOlejorzech_enabled = false;
    boolean btnNabial1_enabled = false;
    boolean btnNabial2_enabled = false;
    boolean btnZboza1_enabled = false;
    boolean btnZboza2_enabled = false;
    boolean btnZboza3_enabled = false;

    boolean btnWarzywa1_enabled = false;
    boolean btnWarzywa2_enabled = false;
    boolean btnWarzywa3_enabled = false;
    boolean btnWarzywa4_enabled = false;

    boolean btnInne1_enabled = false;
    boolean btnInne2_enabled = false;
    boolean btnInne3_enabled = false;
    boolean btnInne4_enabled = false;
    boolean btnInne5_enabled = false;

    boolean btnWoda1_enabled = false;
    boolean btnWoda2_enabled = false;
    boolean btnWoda3_enabled = false;
    boolean btnWoda4_enabled = false;
    boolean btnWoda5_enabled = false;
    boolean btnWoda6_enabled = false;


    int woda_value = 0;
    int inne_value = 0;
    int warzywa_value = 0;
    int owoce_value = 0;
    int zboza_value = 0;
    int ryby_value = 0;
    int nabial_value = 0;
    int orzech_value = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramid);

        final Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);


        final ImageView btnSettings = (ImageView) findViewById(R.id.btnSettings);
        final ImageView btnTabela = (ImageView) findViewById(R.id.btnTabela);
        final ImageView btnOwoce = (ImageView) findViewById(R.id.btnOwoce);
        final ImageButton btnRyby1 = (ImageButton) findViewById(R.id.btnRyby1);
        final ImageButton btnOlejorzech = (ImageButton) findViewById(R.id.btnOlejorzech);
        final ImageButton btnNabial1 = (ImageButton) findViewById(R.id.btnNabial1);
        final ImageButton btnNabial2 = (ImageButton) findViewById(R.id.btnNabial2);

        final ImageButton btnZboza1 = (ImageButton) findViewById(R.id.btnZboza1);
        final ImageButton btnZboza2 = (ImageButton) findViewById(R.id.btnZboza2);
        final ImageButton btnZboza3 = (ImageButton) findViewById(R.id.btnZboza3);

        final ImageButton btnWarzywa1 = (ImageButton) findViewById(R.id.btnWarzywa1);
        final ImageButton btnWarzywa2 = (ImageButton) findViewById(R.id.btnWarzywa2);
        final ImageButton btnWarzywa3 = (ImageButton) findViewById(R.id.btnWarzywa3);
        final ImageButton btnWarzywa4 = (ImageButton) findViewById(R.id.btnWarzywa4);

        final ImageButton btnInne1 = (ImageButton) findViewById(R.id.btnInne1);
        final ImageButton btnInne2 = (ImageButton) findViewById(R.id.btnInne2);
        final ImageButton btnInne3 = (ImageButton) findViewById(R.id.btnInne3);
        final ImageButton btnInne4 = (ImageButton) findViewById(R.id.btnInne4);
        final ImageButton btnInne5 = (ImageButton) findViewById(R.id.btnInne5);

        final ImageButton btnWoda1 = (ImageButton) findViewById(R.id.btnWoda1);
        final ImageButton btnWoda2 = (ImageButton) findViewById(R.id.btnWoda2);
        final ImageButton btnWoda3 = (ImageButton) findViewById(R.id.btnWoda3);
        final ImageButton btnWoda4 = (ImageButton) findViewById(R.id.btnWoda4);
        final ImageButton btnWoda5 = (ImageButton) findViewById(R.id.btnWoda5);
        final ImageButton btnWoda6 = (ImageButton) findViewById(R.id.btnWoda6);
        TextView appCompatImageButton = (TextView) findViewById(R.id.appCompatImageButton);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font.ttf");
        appCompatImageButton.setTypeface(typeface);

        btnOwoce.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.ananas)));
        btnRyby1.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba)));
        btnOlejorzech.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech)));
        btnNabial1.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.nabial)));
        btnNabial2.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.nabial)));
        btnZboza1.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza)));
        btnZboza2.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza)));
        btnZboza3.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza)));
        btnWarzywa1.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa)));
        btnWarzywa2.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa)));
        btnWarzywa3.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa)));
        btnWarzywa4.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa)));
        btnInne1.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.posilki)));
        btnInne2.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.posilki)));
        btnInne3.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.posilki)));
        btnInne4.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.posilki)));
        btnInne5.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.posilki)));
        btnWoda1.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.woda)));
        btnWoda2.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.woda)));
        btnWoda3.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.woda)));
        btnWoda4.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.woda)));
        btnWoda5.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.woda)));
        btnWoda6.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.woda)));


        Intent intent = getIntent();

        woda_value = intent.getIntExtra("woda", 0);
        inne_value = intent.getIntExtra("inne", 0);
        warzywa_value = intent.getIntExtra("warzywa", 0);
        owoce_value = intent.getIntExtra("owoce", 0);
        zboza_value = intent.getIntExtra("zboza", 0);
        ryby_value = intent.getIntExtra("ryby", 0);
        nabial_value = intent.getIntExtra("nabial", 0);
        orzech_value = intent.getIntExtra("orzechy", 0);


        if (owoce_value > 0) {
            setButtonVisible(btnOwoce, R.drawable.ananas);
            btnOwoce_enabled = true;
        }
        if (ryby_value > 0) {
            setButtonVisible(btnRyby1, R.drawable.ryba);
            btnRyby1_enabled = true;
        }
        if (orzech_value > 0) {
            setButtonVisible(btnOlejorzech, (R.drawable.olejorzech));
            btnOlejorzech_enabled = true;
        }
        if (nabial_value >= 1) {
            setButtonVisible(btnNabial1, (R.drawable.nabial));
            btnNabial1_enabled = true;
        }
        if (nabial_value >= 2) {
            setButtonVisible(btnNabial2, (R.drawable.nabial));
            btnNabial2_enabled = true;
        }

        if (zboza_value >= 1) {
            setButtonVisible(btnZboza1, (R.drawable.zboza));
            btnZboza1_enabled = true;
        }
        if (zboza_value >= 2) {
            setButtonVisible(btnZboza2, (R.drawable.zboza));
            btnZboza2_enabled = true;
        }
        if (zboza_value >= 3) {
            setButtonVisible(btnZboza3, (R.drawable.zboza));
            btnZboza3_enabled = true;
        }
        if (warzywa_value >= 1) {
            setButtonVisible(btnWarzywa1, (R.drawable.warzywa));
            btnWarzywa1_enabled = true;
        }
        if (warzywa_value >= 2) {
            setButtonVisible(btnWarzywa2, (R.drawable.warzywa));
            btnWarzywa2_enabled = true;
        }
        if (warzywa_value >= 3) {
            setButtonVisible(btnWarzywa3, (R.drawable.warzywa));
            btnWarzywa3_enabled = true;
        }
        if (warzywa_value >= 4) {
            setButtonVisible(btnWarzywa4, (R.drawable.warzywa));
            btnWarzywa4_enabled = true;
        }
        if (inne_value >= 1) {
            setButtonVisible(btnInne1, (R.drawable.posilki));
            btnInne1_enabled = true;
        }
        if (inne_value >= 2) {
            setButtonVisible(btnInne2, (R.drawable.posilki));
            btnInne2_enabled = true;
        }

        if (inne_value >= 3) {
            setButtonVisible(btnInne3, (R.drawable.posilki));
            btnInne3_enabled = true;
        }

        if (inne_value >= 4) {
            setButtonVisible(btnInne4, (R.drawable.posilki));
            btnInne4_enabled = true;
        }
        if (inne_value >= 5) {
            setButtonVisible(btnInne5, (R.drawable.posilki));
            btnInne5_enabled = true;
        }
        if (woda_value >= 1) {
            setButtonVisible(btnWoda1, (R.drawable.woda));
            btnWoda1_enabled = true;
        }
        if (woda_value >= 2) {
            setButtonVisible(btnWoda2, (R.drawable.woda));
            btnWoda2_enabled = true;
        }
        if (woda_value >= 3) {
            setButtonVisible(btnWoda3, (R.drawable.woda));
            btnWoda3_enabled = true;
        }

        if (woda_value >= 4) {
            setButtonVisible(btnWoda4, (R.drawable.woda));
            btnWoda4_enabled = true;
        }

        if (woda_value >= 5) {
            setButtonVisible(btnWoda5, (R.drawable.woda));
            btnWoda5_enabled = true;
        }

        if (woda_value >= 6) {
            setButtonVisible(btnWoda6, (R.drawable.woda));
            btnWoda6_enabled = true;
        }

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                Intent myIntent = new Intent(PiramidActivity.this, SettingsActivity.class);
                myIntent.putExtra("woda", woda_value); //Optional parameters
                myIntent.putExtra("inne", inne_value); //Optional parameters
                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                PiramidActivity.this.startActivity(myIntent);
            }
        });

        btnTabela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                Intent myIntent = new Intent(PiramidActivity.this, TabelaActivity.class);
                myIntent.putExtra("woda", woda_value); //Optional parameters
                myIntent.putExtra("inne", inne_value); //Optional parameters
                myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                myIntent.putExtra("owoce", owoce_value); //Optional parameters
                myIntent.putExtra("ryby", ryby_value); //Optional parameters
                myIntent.putExtra("zboza", zboza_value); //Optional parameters
                myIntent.putExtra("nabial", nabial_value); //Optional parameters
                myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                PiramidActivity.this.startActivity(myIntent);
            }
        });
        btnOwoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnOwoceIcon = getApplicationContext().getResources().getDrawable(R.drawable.ananas);
                Drawable grayedIcon = convertDrawableToGrayScale(btnOwoceIcon);
                if (btnOwoce_enabled) {
                    btnOwoce.setImageDrawable(grayedIcon);
                    btnOwoce_enabled = false;
                } else {
                    btnOwoceIcon.clearColorFilter();
                    btnOwoce.setImageDrawable(btnOwoceIcon);
                    btnOwoce_enabled = true;
                }

            }
        });

        btnRyby1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.ryba);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnRyby1_enabled) {
                    btnRyby1.setImageDrawable(grayedIcon);
                    btnRyby1_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnRyby1.setImageDrawable(btnIcon);
                    btnRyby1_enabled = true;
                }

            }
        });

        btnOlejorzech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.olejorzech);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnOlejorzech_enabled) {
                    btnOlejorzech.setImageDrawable(grayedIcon);
                    btnOlejorzech_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnOlejorzech.setImageDrawable(btnIcon);
                    btnOlejorzech_enabled = true;
                }
            }
        });

        btnNabial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.nabial);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnNabial1_enabled) {
                    btnNabial1.setImageDrawable(grayedIcon);
                    btnNabial1_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnNabial1.setImageDrawable(btnIcon);
                    btnNabial1_enabled = true;
                }
            }
        });

        btnNabial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.nabial);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnNabial2_enabled) {
                    btnNabial2.setImageDrawable(grayedIcon);
                    btnNabial2_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnNabial2.setImageDrawable(btnIcon);
                    btnNabial2_enabled = true;
                }
            }
        });

        btnZboza1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnZboza1_enabled) {
                    btnZboza1.setImageDrawable(grayedIcon);
                    btnZboza1_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza1_enabled = true;
                }
            }
        });

        btnZboza2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnZboza2_enabled) {
                    btnZboza2.setImageDrawable(grayedIcon);
                    btnZboza2_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza2_enabled = true;
                }
            }
        });

        btnZboza3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnZboza3_enabled) {
                    btnZboza3.setImageDrawable(grayedIcon);
                    btnZboza3_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnZboza3.setImageDrawable(btnIcon);
                    btnZboza3_enabled = true;
                }
            }
        });

        btnWarzywa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWarzywa1_enabled) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa1_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa1_enabled = true;
                }
            }
        });

        btnWarzywa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWarzywa2_enabled) {
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa2_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa2_enabled = true;
                }
            }
        });

        btnWarzywa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWarzywa3_enabled) {
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa3_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa3_enabled = true;
                }
            }
        });

        btnWarzywa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWarzywa4_enabled) {
                    btnWarzywa4.setImageDrawable(grayedIcon);
                    btnWarzywa4_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWarzywa4.setImageDrawable(btnIcon);
                    btnWarzywa4_enabled = true;
                }
            }
        });


        btnInne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne1_enabled) {
                    btnInne1.setImageDrawable(grayedIcon);
                    btnInne1_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnInne1.setImageDrawable(btnIcon);
                    btnInne1_enabled = true;
                }
            }
        });


        btnInne2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne2_enabled) {
                    btnInne2.setImageDrawable(grayedIcon);
                    btnInne2_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnInne2.setImageDrawable(btnIcon);
                    btnInne2_enabled = true;
                }
            }
        });

        btnInne3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne3_enabled) {
                    btnInne3.setImageDrawable(grayedIcon);
                    btnInne3_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnInne3.setImageDrawable(btnIcon);
                    btnInne3_enabled = true;
                }
            }
        });

        btnInne4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne4_enabled) {
                    btnInne4.setImageDrawable(grayedIcon);
                    btnInne4_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnInne4.setImageDrawable(btnIcon);
                    btnInne4_enabled = true;
                }
            }
        });
        btnInne5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne5_enabled) {
                    btnInne5.setImageDrawable(grayedIcon);
                    btnInne5_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnInne5.setImageDrawable(btnIcon);
                    btnInne5_enabled = true;
                }
            }
        });

        btnWoda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda1_enabled) {
                    btnWoda1.setImageDrawable(grayedIcon);
                    btnWoda1_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWoda1.setImageDrawable(btnIcon);
                    btnWoda1_enabled = true;
                }
            }
        });

        btnWoda2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda2_enabled) {
                    btnWoda2.setImageDrawable(grayedIcon);
                    btnWoda2_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWoda2.setImageDrawable(btnIcon);
                    btnWoda2_enabled = true;
                }
            }
        });
        btnWoda3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda3_enabled) {
                    btnWoda3.setImageDrawable(grayedIcon);
                    btnWoda3_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWoda3.setImageDrawable(btnIcon);
                    btnWoda3_enabled = true;
                }
            }
        });

        btnWoda4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda4_enabled) {
                    btnWoda4.setImageDrawable(grayedIcon);
                    btnWoda4_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWoda4.setImageDrawable(btnIcon);
                    btnWoda4_enabled = true;
                }
            }
        });
        btnWoda5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda5_enabled) {
                    btnWoda5.setImageDrawable(grayedIcon);
                    btnWoda5_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWoda5.setImageDrawable(btnIcon);
                    btnWoda5_enabled = true;
                }
            }
        });
        btnWoda6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda6_enabled) {
                    btnWoda6.setImageDrawable(grayedIcon);
                    btnWoda6_enabled = false;
                } else {
                    btnIcon.clearColorFilter();
                    btnWoda6.setImageDrawable(btnIcon);
                    btnWoda6_enabled = true;
                }
            }
        });

    }

    private void setButtonVisible(ImageButton imgButton, int drawableIcon) {
        getApplicationContext().getResources().getDrawable(drawableIcon).clearColorFilter();
        imgButton.setImageDrawable(getApplicationContext().getResources().getDrawable(drawableIcon));
    }

    private void setButtonVisible(ImageView imgButton, int drawableIcon) {
        getApplicationContext().getResources().getDrawable(drawableIcon).clearColorFilter();
        imgButton.setImageDrawable(getApplicationContext().getResources().getDrawable(drawableIcon));
    }

    /**
     * Mutates and applies a filter that converts the given drawable to a Gray
     * image. This method may be used to simulate the color of disable icons in
     * Honeycomb's ActionBar.
     *
     * @return a mutated version of the given drawable with a color filter applied.
     */
    public static Drawable convertDrawableToGrayScale(Drawable drawable) {
        if (drawable == null)
            return null;

        Drawable res = drawable.mutate();
        //res.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
        res.setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
        return res;
    }

    /**
     * Sets the image button to the given state and grays-out the icon.
     *
     * @param enabled   The state of the button
     * @param item      The button item to modify
     * @param iconResId The button's icon ID
     */
    public static void setImageButtonEnabled(Context ctxt, boolean enabled,
                                             ImageButton item, int iconResId) {

        item.setEnabled(enabled);
        Drawable originalIcon = ctxt.getResources().getDrawable(iconResId);
        Drawable icon = enabled ? originalIcon : convertDrawableToGrayScale(originalIcon);
        item.setImageDrawable(icon);
    }


}
