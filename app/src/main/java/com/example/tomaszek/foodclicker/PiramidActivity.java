package com.example.tomaszek.foodclicker;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PiramidActivity extends AppCompatActivity {

    boolean btnOwoce_enabled = false;
    boolean btnRyby1_enabled = false;
    boolean btnRyby2_enabled = false;
    boolean btnOlejorzech_enabled = false;
    boolean btnOlejorzech2_enabled = false;
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
        setupBottomNavigationView();
        final Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);

        final ImageButton btnOwoce = (ImageButton) findViewById(R.id.btnOwoce);
        final ImageButton btnRyby1 = (ImageButton) findViewById(R.id.btnRyby1);
        final ImageButton btnRyby2 = (ImageButton) findViewById(R.id.btnRyby2);
        final ImageButton btnOlejorzech = (ImageButton) findViewById(R.id.btnOlejorzech);
        final ImageButton btnOlejorzech2 = (ImageButton) findViewById(R.id.btnOlejorzech2);
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
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font2.ttf");
        appCompatImageButton.setTypeface(typeface);
        appCompatImageButton.setTextColor(0xffa55712); //this is white color

        btnOwoce.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.ananas)));
        btnRyby1.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba)));
        btnRyby2.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba)));
        btnOlejorzech.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech)));
        btnOlejorzech2.setImageDrawable(convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech)));
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
        if (ryby_value > 1) {
            setButtonVisible(btnRyby2, R.drawable.ryba);
            btnRyby2_enabled = true;
        }
        if (orzech_value > 0) {
            setButtonVisible(btnOlejorzech, (R.drawable.olejorzech));
            btnOlejorzech_enabled = true;
        }
        if (orzech_value > 1) {
            setButtonVisible(btnOlejorzech2, (R.drawable.olejorzech));
            btnOlejorzech2_enabled = true;
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

        btnOwoce.setOnClickListener(new View.OnClickListener() {
            Drawable btnOwoceIcon = getApplicationContext().getResources().getDrawable(R.drawable.ananas);
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.ananas));

            @Override
            public void onClick(View view) {

                owoce_value += 1;
                btnOwoce_enabled = true;
                saveLogIntoDB("owoce", true);
                if (owoce_value > 1) {
                    btnOwoce.setImageDrawable(redIcon);
                } else {
                    btnOwoce.setImageDrawable(btnOwoceIcon);
                }

            }
        });

        btnOwoce.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnOwoceIcon = getApplicationContext().getResources().getDrawable(R.drawable.ananas);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.ananas));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.ananas));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                owoce_value -= 1;
                btnOwoce_enabled = false;
                if (owoce_value < 0) {
                    owoce_value = 0;
                    return true;

                }
                btnOwoce_enabled = false;
                saveLogIntoDB("owoce", false);
                if (owoce_value > 1) {
                    btnOwoce.setImageDrawable(redIcon);
                }
                if (owoce_value == 1) {
                    btnOwoce.setImageDrawable(btnOwoceIcon);
                }
                if (owoce_value == 0) {
                    btnOwoce.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });
        btnRyby1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.ryba);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba));
                ryby_value += 1;
                btnRyby1_enabled = true;
                saveLogIntoDB("ryby", true);
                btnRyby1.setImageDrawable(btnIcon);
                if (ryby_value > 2) {
                    btnRyby1.setImageDrawable(redIcon);
                    btnRyby2.setImageDrawable(redIcon);
                } else if (ryby_value == 2) {
                    btnRyby1.setImageDrawable(btnIcon);
                    btnRyby2.setImageDrawable(btnIcon);
                } else {
                    btnRyby1.setImageDrawable(btnIcon);
                }

            }
        });

        btnRyby1.setOnLongClickListener(new View.OnLongClickListener()

        {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.ryba);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                ryby_value -= 1;
                btnRyby1_enabled = false;
                if (ryby_value < 0) {
                    ryby_value = 0;
                    return true;
                }
                saveLogIntoDB("ryby", false);
                if (ryby_value > 2) {
                    btnRyby1.setImageDrawable(redIcon);
                    btnRyby2.setImageDrawable(redIcon);
                } else if (ryby_value == 2) {
                    btnRyby1.setImageDrawable(btnIcon);
                    btnRyby2.setImageDrawable(btnIcon);
                }
                if (ryby_value == 1) {
                    btnRyby1.setImageDrawable(grayedIcon);
                }
                if (ryby_value == 0) {
                    btnRyby1.setImageDrawable(grayedIcon);
                    btnRyby2.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });

        btnRyby2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.ryba);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba));
                ryby_value += 1;
                btnRyby2_enabled = true;
                saveLogIntoDB("ryby", true);

                btnRyby2.setImageDrawable(btnIcon);
                if (ryby_value > 2) {
                    btnRyby1.setImageDrawable(redIcon);
                    btnRyby2.setImageDrawable(redIcon);
                } else if (ryby_value == 2) {
                    btnRyby1.setImageDrawable(btnIcon);
                    btnRyby2.setImageDrawable(btnIcon);
                } else {
                    btnRyby2.setImageDrawable(btnIcon);
                }

            }
        });

        btnRyby2.setOnLongClickListener(new View.OnLongClickListener()

        {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.ryba);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.ryba));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                ryby_value -= 1;
                btnRyby2_enabled = false;
                if (ryby_value < 0) {
                    ryby_value = 0;
                    return true;
                }
                saveLogIntoDB("ryby", false);
                if (ryby_value > 2) {
                    btnRyby1.setImageDrawable(redIcon);
                    btnRyby2.setImageDrawable(redIcon);
                } else if (ryby_value == 2) {
                    btnRyby1.setImageDrawable(btnIcon);
                    btnRyby2.setImageDrawable(btnIcon);
                }
                if (ryby_value == 1) {
                    btnRyby2.setImageDrawable(grayedIcon);
                }
                if (ryby_value == 0) {
                    btnRyby1.setImageDrawable(grayedIcon);
                    btnRyby2.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });
        btnOlejorzech.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.olejorzech);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech));
                orzech_value += 1;
                btnOlejorzech_enabled = true;
                saveLogIntoDB("orzechy", true);
                btnOlejorzech.setImageDrawable(btnIcon);
                if (orzech_value > 2) {
                    btnOlejorzech.setImageDrawable(redIcon);
                    btnOlejorzech2.setImageDrawable(redIcon);
                }
                if (orzech_value == 2) {
                    btnOlejorzech.setImageDrawable(btnIcon);
                    btnOlejorzech2.setImageDrawable(btnIcon);
                } else {
                    btnOlejorzech.setImageDrawable(btnIcon);
                }

            }
        });
        btnOlejorzech.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.olejorzech);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                orzech_value -= 1;
                btnOlejorzech_enabled = false;
                if (orzech_value < 0) {
                    orzech_value = 0;
                    return true;
                }
                saveLogIntoDB("orzechy", false);
                if (orzech_value > 2) {
                    btnOlejorzech.setImageDrawable(redIcon);
                    btnOlejorzech2.setImageDrawable(redIcon);
                } else if (orzech_value == 2) {
                    btnOlejorzech.setImageDrawable(btnIcon);
                    btnOlejorzech2.setImageDrawable(btnIcon);
                }
                if (orzech_value == 1) {
                    btnOlejorzech.setImageDrawable(grayedIcon);
                }
                if (orzech_value == 0) {
                    btnOlejorzech.setImageDrawable(grayedIcon);
                    btnOlejorzech2.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });
        btnOlejorzech2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.olejorzech);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech));
                orzech_value += 1;
                btnOlejorzech2_enabled = true;
                saveLogIntoDB("orzechy", true);
                if (orzech_value > 2) {
                    btnOlejorzech2.setImageDrawable(redIcon);
                    btnOlejorzech.setImageDrawable(redIcon);
                }
                if (orzech_value == 2) {
                    btnOlejorzech.setImageDrawable(btnIcon);
                    btnOlejorzech2.setImageDrawable(btnIcon);
                } else {
                    btnOlejorzech2.setImageDrawable(btnIcon);
                }

            }
        });

        btnOlejorzech2.setOnLongClickListener(new View.OnLongClickListener()

        {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.olejorzech);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.olejorzech));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                orzech_value -= 1;
                btnOlejorzech2_enabled = false;
                if (orzech_value < 0) {
                    orzech_value = 0;
                    return true;
                }
                saveLogIntoDB("orzechy", false);
                if (orzech_value > 2) {
                    btnOlejorzech2.setImageDrawable(redIcon);
                    btnOlejorzech.setImageDrawable(redIcon);
                } else if (orzech_value == 2) {
                    btnOlejorzech.setImageDrawable(btnIcon);
                    btnOlejorzech2.setImageDrawable(btnIcon);
                }
                if (orzech_value == 1) {
                    btnOlejorzech2.setImageDrawable(grayedIcon);
                }
                if (orzech_value == 0) {
                    btnOlejorzech.setImageDrawable(grayedIcon);
                    btnOlejorzech2.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });
        btnNabial1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.nabial);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.nabial));
                nabial_value += 1;
                btnNabial1_enabled = true;
                saveLogIntoDB("nabial", true);
                btnNabial1.setImageDrawable(btnIcon);
                if (nabial_value > 2) {
                    btnNabial1.setImageDrawable(redIcon);
                    btnNabial2.setImageDrawable(redIcon);
                } else if (nabial_value == 2) {
                    btnNabial1.setImageDrawable(btnIcon);
                    btnNabial1.setImageDrawable(btnIcon);
                } else {
                    btnNabial1.setImageDrawable(btnIcon);
                }

            }
        });

        btnNabial1.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.nabial);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.nabial));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.nabial));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                nabial_value -= 1;
                btnNabial1_enabled = false;
                if (nabial_value < 0) {
                    nabial_value = 0;
                    return true;
                }
                saveLogIntoDB("nabial", false);
                if (nabial_value > 2) {
                    btnNabial1.setImageDrawable(redIcon);
                    btnNabial2.setImageDrawable(redIcon);
                } else if (nabial_value == 2) {
                    btnNabial1.setImageDrawable(btnIcon);
                    btnNabial2.setImageDrawable(btnIcon);
                }
                if (nabial_value == 1) {
                    btnNabial1.setImageDrawable(grayedIcon);
                }
                if (nabial_value == 0) {
                    btnNabial1.setImageDrawable(grayedIcon);
                    btnNabial2.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });
        btnNabial2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.nabial);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.nabial));
                nabial_value += 1;
                btnNabial2_enabled = true;
                saveLogIntoDB("nabial", true);
                if (nabial_value > 2) {
                    btnNabial2.setImageDrawable(redIcon);
                    btnNabial1.setImageDrawable(redIcon);
                } else if (nabial_value == 2) {
                    btnNabial1.setImageDrawable(btnIcon);
                    btnNabial2.setImageDrawable(btnIcon);
                } else {
                    btnNabial2.setImageDrawable(btnIcon);
                }

            }
        });

        btnNabial2.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.nabial);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.nabial));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.nabial));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                nabial_value -= 1;
                btnNabial2_enabled = false;
                if (nabial_value < 0) {
                    nabial_value = 0;
                    return true;
                }
                saveLogIntoDB("nabial", false);
                if (nabial_value > 2) {
                    btnNabial2.setImageDrawable(redIcon);
                    btnNabial1.setImageDrawable(redIcon);
                } else if (nabial_value == 2) {
                    btnNabial1.setImageDrawable(btnIcon);
                    btnNabial2.setImageDrawable(btnIcon);
                }
                if (nabial_value == 1) {
                    btnNabial2.setImageDrawable(grayedIcon);
                }
                if (nabial_value == 0) {
                    btnNabial1.setImageDrawable(grayedIcon);
                    btnNabial2.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });

        btnZboza1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
                Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
                zboza_value += 1;
                btnZboza1_enabled = true;
                saveLogIntoDB("zboza", true);
                btnZboza1.setImageDrawable(btnIcon);
                if (zboza_value > 3) {
                    btnZboza1.setImageDrawable(redIcon);
                    btnZboza2.setImageDrawable(redIcon);
                    btnZboza3.setImageDrawable(redIcon);
                } else if (zboza_value == 3) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                } else if (zboza_value == 2) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(grayedIcon);
                }
            }
        });

        btnZboza1.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                zboza_value -= 1;
                btnZboza1_enabled = false;
                if (zboza_value < 0) {
                    zboza_value = 0;
                    return true;
                }
                saveLogIntoDB("zboza", false);
                if (zboza_value > 3) {
                    btnZboza1.setImageDrawable(redIcon);
                    btnZboza2.setImageDrawable(redIcon);
                    btnZboza3.setImageDrawable(redIcon);
                } else if (zboza_value == 3) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                } else if (zboza_value == 2) {
                    btnZboza1.setImageDrawable(grayedIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                }
                if (zboza_value == 1) {
                    btnZboza1.setImageDrawable(grayedIcon);
                    btnZboza2.setImageDrawable(grayedIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                }
                if (zboza_value == 0) {
                    btnZboza1.setImageDrawable(grayedIcon);
                    btnZboza2.setImageDrawable(grayedIcon);
                    btnZboza3.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });
        btnZboza2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
                Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
                zboza_value += 1;
                btnZboza2_enabled = true;
                saveLogIntoDB("zboza", true);
                btnZboza2.setImageDrawable(btnIcon);
                if (zboza_value > 3) {
                    btnZboza1.setImageDrawable(redIcon);
                    btnZboza2.setImageDrawable(redIcon);
                    btnZboza3.setImageDrawable(redIcon);
                } else if (zboza_value == 3) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                } else if (zboza_value == 2) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(grayedIcon);
                }
            }
        });

        btnZboza2.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                zboza_value -= 1;
                btnZboza2_enabled = false;
                if (zboza_value < 0) {
                    zboza_value = 0;
                    return true;
                }
                saveLogIntoDB("zboza", false);
                if (zboza_value > 3) {
                    btnZboza1.setImageDrawable(redIcon);
                    btnZboza2.setImageDrawable(redIcon);
                    btnZboza3.setImageDrawable(redIcon);
                } else if (zboza_value == 3) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                } else if (zboza_value == 2) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(grayedIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                }
                if (zboza_value == 1) {
                    btnZboza1.setImageDrawable(grayedIcon);
                    btnZboza2.setImageDrawable(grayedIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                }
                if (zboza_value == 0) {
                    btnZboza1.setImageDrawable(grayedIcon);
                    btnZboza2.setImageDrawable(grayedIcon);
                    btnZboza3.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });
        btnZboza3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
                Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
                zboza_value += 1;
                btnZboza3_enabled = true;
                saveLogIntoDB("zboza", true);
                btnZboza3.setImageDrawable(btnIcon);
                if (zboza_value > 3) {
                    btnZboza1.setImageDrawable(redIcon);
                    btnZboza2.setImageDrawable(redIcon);
                    btnZboza3.setImageDrawable(redIcon);
                } else if (zboza_value == 3) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                } else if (zboza_value == 2) {
                    btnZboza3.setImageDrawable(btnIcon);
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza1.setImageDrawable(grayedIcon);
                }
            }
        });

        btnZboza3.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.zboza);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.zboza));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                zboza_value -= 1;
                btnZboza3_enabled = false;
                if (zboza_value < 0) {
                    zboza_value = 0;
                    return true;
                }
                saveLogIntoDB("zboza", false);
                if (zboza_value > 3) {
                    btnZboza1.setImageDrawable(redIcon);
                    btnZboza2.setImageDrawable(redIcon);
                    btnZboza3.setImageDrawable(redIcon);
                } else if (zboza_value == 3) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(btnIcon);
                } else if (zboza_value == 2) {
                    btnZboza1.setImageDrawable(btnIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(grayedIcon);
                }
                if (zboza_value == 1) {
                    btnZboza1.setImageDrawable(grayedIcon);
                    btnZboza2.setImageDrawable(btnIcon);
                    btnZboza3.setImageDrawable(grayedIcon);
                }
                if (zboza_value == 0) {
                    btnZboza1.setImageDrawable(grayedIcon);
                    btnZboza2.setImageDrawable(grayedIcon);
                    btnZboza3.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });


        btnWarzywa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
                Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
                warzywa_value += 1;
                btnWarzywa1_enabled = true;
                saveLogIntoDB("warzywa", true);
                btnWarzywa1.setImageDrawable(btnIcon);
                if (warzywa_value > 4) {
                    btnWarzywa1.setImageDrawable(redIcon);
                    btnWarzywa2.setImageDrawable(redIcon);
                    btnWarzywa3.setImageDrawable(redIcon);
                    btnWarzywa4.setImageDrawable(redIcon);
                } else if (warzywa_value == 4) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 3) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                } else if (warzywa_value == 2) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
            }
        });

        btnWarzywa1.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                warzywa_value -= 1;
                btnWarzywa1_enabled = false;
                if (warzywa_value < 0) {
                    warzywa_value = 0;
                    return true;
                }
                saveLogIntoDB("warzywa", false);
                if (warzywa_value > 4) {
                    btnWarzywa1.setImageDrawable(redIcon);
                    btnWarzywa2.setImageDrawable(redIcon);
                    btnWarzywa3.setImageDrawable(redIcon);
                    btnWarzywa4.setImageDrawable(redIcon);
                } else if (warzywa_value == 4) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 3) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 2) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                }
                if (warzywa_value == 1) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                }
                if (warzywa_value == 0) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });

        btnWarzywa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
                Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
                warzywa_value += 1;
                btnWarzywa1_enabled = true;
                saveLogIntoDB("warzywa", true);
                btnWarzywa2.setImageDrawable(btnIcon);
                if (warzywa_value > 4) {
                    btnWarzywa1.setImageDrawable(redIcon);
                    btnWarzywa2.setImageDrawable(redIcon);
                    btnWarzywa3.setImageDrawable(redIcon);
                    btnWarzywa4.setImageDrawable(redIcon);
                } else if (warzywa_value == 4) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 3) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                } else if (warzywa_value == 2) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
            }
        });

        btnWarzywa2.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                warzywa_value -= 1;
                btnWarzywa2_enabled = false;
                if (warzywa_value < 0) {
                    warzywa_value = 0;
                    return true;
                }
                saveLogIntoDB("warzywa", false);
                if (warzywa_value > 4) {
                    btnWarzywa1.setImageDrawable(redIcon);
                    btnWarzywa2.setImageDrawable(redIcon);
                    btnWarzywa3.setImageDrawable(redIcon);
                    btnWarzywa4.setImageDrawable(redIcon);
                } else if (warzywa_value == 4) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 3) {
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 2) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                }
                if (warzywa_value == 1) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                }
                if (warzywa_value == 0) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });

        btnWarzywa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
                Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
                warzywa_value += 1;
                btnWarzywa3_enabled = true;
                saveLogIntoDB("warzywa", true);
                btnWarzywa3.setImageDrawable(btnIcon);
                if (warzywa_value > 4) {
                    btnWarzywa1.setImageDrawable(redIcon);
                    btnWarzywa2.setImageDrawable(redIcon);
                    btnWarzywa3.setImageDrawable(redIcon);
                    btnWarzywa4.setImageDrawable(redIcon);
                } else if (warzywa_value == 4) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 3) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                } else if (warzywa_value == 2) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
            }
        });

        btnWarzywa3.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                warzywa_value -= 1;
                btnWarzywa3_enabled = false;
                if (warzywa_value < 0) {
                    warzywa_value = 0;
                    return true;
                }
                saveLogIntoDB("warzywa", false);
                if (warzywa_value > 4) {
                    btnWarzywa1.setImageDrawable(redIcon);
                    btnWarzywa2.setImageDrawable(redIcon);
                    btnWarzywa3.setImageDrawable(redIcon);
                    btnWarzywa4.setImageDrawable(redIcon);
                } else if (warzywa_value == 4) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 3) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 2) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                }
                if (warzywa_value == 1) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                }
                if (warzywa_value == 0) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });

        btnWarzywa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
                Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
                Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
                warzywa_value += 1;
                btnWarzywa4_enabled = true;
                saveLogIntoDB("warzywa", true);
                btnWarzywa4.setImageDrawable(btnIcon);
                if (warzywa_value > 4) {
                    btnWarzywa1.setImageDrawable(redIcon);
                    btnWarzywa2.setImageDrawable(redIcon);
                    btnWarzywa3.setImageDrawable(redIcon);
                    btnWarzywa4.setImageDrawable(redIcon);
                } else if (warzywa_value == 4) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 3) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 2) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                }
            }
        });

        btnWarzywa4.setOnLongClickListener(new View.OnLongClickListener() {
            Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.warzywa);
            Drawable grayedIcon = convertDrawableToGrayScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));
            Drawable redIcon = convertDrawableToRedScale(getApplicationContext().getResources().getDrawable(R.drawable.warzywa));

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                warzywa_value -= 1;
                btnWarzywa4_enabled = false;
                if (warzywa_value < 0) {
                    warzywa_value = 0;
                    return true;
                }
                saveLogIntoDB("warzywa", false);
                if (warzywa_value > 4) {
                    btnWarzywa1.setImageDrawable(redIcon);
                    btnWarzywa2.setImageDrawable(redIcon);
                    btnWarzywa3.setImageDrawable(redIcon);
                    btnWarzywa4.setImageDrawable(redIcon);
                } else if (warzywa_value == 4) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(btnIcon);
                } else if (warzywa_value == 3) {
                    btnWarzywa1.setImageDrawable(btnIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                } else if (warzywa_value == 2) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(btnIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
                if (warzywa_value == 1) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(btnIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
                if (warzywa_value == 0) {
                    btnWarzywa1.setImageDrawable(grayedIcon);
                    btnWarzywa2.setImageDrawable(grayedIcon);
                    btnWarzywa3.setImageDrawable(grayedIcon);
                    btnWarzywa4.setImageDrawable(grayedIcon);
                }
                return true;
            }
        });


        btnInne1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne1_enabled) {
                    inne_value -= 1;
                    btnInne1.setImageDrawable(grayedIcon);
                    btnInne1_enabled = false;
                    saveLogIntoDB("inne", false);
                } else {
                    inne_value += 1;
                    btnIcon.clearColorFilter();
                    btnInne1.setImageDrawable(btnIcon);
                    btnInne1_enabled = true;
                    saveLogIntoDB("inne", true);
                }
            }
        });


        btnInne2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne2_enabled) {
                    inne_value -= 1;
                    btnInne2.setImageDrawable(grayedIcon);
                    btnInne2_enabled = false;
                    saveLogIntoDB("inne", false);
                } else {
                    inne_value += 1;
                    btnIcon.clearColorFilter();
                    btnInne2.setImageDrawable(btnIcon);
                    btnInne2_enabled = true;
                    saveLogIntoDB("inne", true);
                }
            }
        });

        btnInne3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne3_enabled) {
                    inne_value -= 1;
                    btnInne3.setImageDrawable(grayedIcon);
                    btnInne3_enabled = false;
                    saveLogIntoDB("inne", false);
                } else {
                    inne_value += 1;
                    btnIcon.clearColorFilter();
                    btnInne3.setImageDrawable(btnIcon);
                    btnInne3_enabled = true;
                    saveLogIntoDB("inne", true);
                }
            }
        });

        btnInne4.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne4_enabled) {
                    inne_value -= 1;
                    btnInne4.setImageDrawable(grayedIcon);
                    btnInne4_enabled = false;
                    saveLogIntoDB("inne", false);
                } else {
                    inne_value += 1;
                    btnIcon.clearColorFilter();
                    btnInne4.setImageDrawable(btnIcon);
                    btnInne4_enabled = true;
                    saveLogIntoDB("inne", true);
                }
            }
        });
        btnInne5.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.posilki);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnInne5_enabled) {
                    inne_value -= 1;
                    btnInne5.setImageDrawable(grayedIcon);
                    btnInne5_enabled = false;
                    saveLogIntoDB("inne", false);
                } else {
                    inne_value += 1;
                    btnIcon.clearColorFilter();
                    btnInne5.setImageDrawable(btnIcon);
                    btnInne5_enabled = true;
                    saveLogIntoDB("inne", true);
                }
            }
        });

        btnWoda1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda1_enabled) {
                    woda_value -= 1;
                    btnWoda1.setImageDrawable(grayedIcon);
                    btnWoda1_enabled = false;
                    saveLogIntoDB("woda", false);
                } else {
                    woda_value += 1;
                    btnIcon.clearColorFilter();
                    btnWoda1.setImageDrawable(btnIcon);
                    btnWoda1_enabled = true;
                    saveLogIntoDB("woda", true);
                }
            }
        });

        btnWoda2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda2_enabled) {
                    woda_value -= 1;
                    btnWoda2.setImageDrawable(grayedIcon);
                    btnWoda2_enabled = false;
                    saveLogIntoDB("woda", false);
                } else {
                    woda_value += 1;
                    btnIcon.clearColorFilter();
                    btnWoda2.setImageDrawable(btnIcon);
                    btnWoda2_enabled = true;
                    saveLogIntoDB("woda", true);
                }
            }
        });
        btnWoda3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda3_enabled) {
                    woda_value -= 1;
                    btnWoda3.setImageDrawable(grayedIcon);
                    btnWoda3_enabled = false;
                    saveLogIntoDB("woda", false);
                } else {
                    woda_value += 1;
                    btnIcon.clearColorFilter();
                    btnWoda3.setImageDrawable(btnIcon);
                    btnWoda3_enabled = true;
                    saveLogIntoDB("woda", true);
                }
            }
        });

        btnWoda4.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda4_enabled) {
                    woda_value -= 1;
                    btnWoda4.setImageDrawable(grayedIcon);
                    btnWoda4_enabled = false;
                    saveLogIntoDB("woda", false);
                } else {
                    woda_value += 1;
                    btnIcon.clearColorFilter();
                    btnWoda4.setImageDrawable(btnIcon);
                    btnWoda4_enabled = true;
                    saveLogIntoDB("woda", true);
                }
            }
        });
        btnWoda5.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda5_enabled) {
                    woda_value -= 1;
                    btnWoda5.setImageDrawable(grayedIcon);
                    btnWoda5_enabled = false;
                    saveLogIntoDB("woda", false);
                } else {
                    woda_value += 1;
                    btnIcon.clearColorFilter();
                    btnWoda5.setImageDrawable(btnIcon);
                    btnWoda5_enabled = true;
                    saveLogIntoDB("woda", true);
                }
            }
        });
        btnWoda6.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Drawable btnIcon = getApplicationContext().getResources().getDrawable(R.drawable.woda);
                Drawable grayedIcon = convertDrawableToGrayScale(btnIcon);
                if (btnWoda6_enabled) {
                    woda_value -= 1;
                    btnWoda6.setImageDrawable(grayedIcon);
                    btnWoda6_enabled = false;
                    saveLogIntoDB("woda", false);
                } else {
                    woda_value += 1;
                    btnIcon.clearColorFilter();
                    btnWoda6.setImageDrawable(btnIcon);
                    btnWoda6_enabled = true;
                    saveLogIntoDB("woda", true);
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
     * Mutates and applies a filter that converts the given drawable to a Gray
     * image. This method may be used to simulate the color of disable icons in
     * Honeycomb's ActionBar.
     *
     * @return a mutated version of the given drawable with a color filter applied.
     */
    public Drawable convertDrawableToRedScale(Drawable drawable) {
        if (drawable == null)
            return null;

        Drawable res = drawable.mutate();
        //res.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_IN);
        res.setColorFilter(getResources().getColor(R.color.colorTooMuch), PorterDuff.Mode.MULTIPLY);
        return res;
    }


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

    private void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent myIntent = new Intent(PiramidActivity.this, MainActivity.class);
                        myIntent.putExtra("woda", woda_value); //Optional parameters
                        myIntent.putExtra("inne", inne_value); //Optional parameters
                        myIntent.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent.putExtra("orzechy", orzech_value); //Optional parameters
                        myIntent.putExtra("otherActivity", true); //Optional parameters
                        PiramidActivity.this.startActivity(myIntent);
                        break;
                    case R.id.action_info:
                        Intent myIntent2 = new Intent(PiramidActivity.this, TabelaActivity.class);
                        myIntent2.putExtra("woda", woda_value); //Optional parameters
                        myIntent2.putExtra("inne", inne_value); //Optional parameters
                        myIntent2.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent2.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent2.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent2.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent2.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent2.putExtra("orzechy", orzech_value); //Optional parameters
                        PiramidActivity.this.startActivity(myIntent2);
                        break;
                    case R.id.action_piramid:
                        Intent myIntent3 = new Intent(PiramidActivity.this, PiramidActivity.class);
                        myIntent3.putExtra("woda", woda_value); //Optional parameters
                        myIntent3.putExtra("inne", inne_value); //Optional parameters
                        myIntent3.putExtra("warzywa", warzywa_value); //Optional parameters
                        myIntent3.putExtra("owoce", owoce_value); //Optional parameters
                        myIntent3.putExtra("ryby", ryby_value); //Optional parameters
                        myIntent3.putExtra("zboza", zboza_value); //Optional parameters
                        myIntent3.putExtra("nabial", nabial_value); //Optional parameters
                        myIntent3.putExtra("orzechy", orzech_value); //Optional parameters
                        PiramidActivity.this.startActivity(myIntent3);
                        break;
                }
                return true;
            }
        });
    }

}
