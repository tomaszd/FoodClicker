package com.example.tomaszek.foodclicker;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SelectUserActivity extends AppCompatActivity {
    String userSelected = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_user);
        final Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        final Button buttonSelectUser = (Button) findViewById(R.id.buttonSelectUser);
        final Button buttonCancel = (Button) findViewById(R.id.buttonCancel);

        final TextView textUser1 = (TextView) findViewById(R.id.textUser1);
        final TextView textUser2 = (TextView) findViewById(R.id.textUser2);
        final TextView textUser3 = (TextView) findViewById(R.id.textUser3);
        final TextView textUser4 = (TextView) findViewById(R.id.textUser4);
        final TextView textUser5 = (TextView) findViewById(R.id.textUser5);


        final TextView[] allTextViews = {textUser1, textUser2, textUser3, textUser4, textUser5};

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font2.ttf");
        textUser1.setTypeface(typeface);
        textUser2.setTypeface(typeface);
        textUser3.setTypeface(typeface);
        textUser4.setTypeface(typeface);
        textUser5.setTypeface(typeface);
        textUser3.setTypeface(typeface);

        textUser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                //textUser1.setBackgroundColor("@");
                selectActiveColor(textUser1, allTextViews);
            }
        });
        textUser2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                //textUser1.setBackgroundColor("@");
                selectActiveColor(textUser2, allTextViews);
            }
        });
        textUser3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                //textUser1.setBackgroundColor("@");
                selectActiveColor(textUser3, allTextViews);
            }
        });
        textUser4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                //textUser4.setBackgroundColor("@");
                selectActiveColor(textUser4, allTextViews);
            }
        });
        textUser5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                //textUser1.setBackgroundColor("@");
                selectActiveColor(textUser5, allTextViews);

            }
        });

        buttonSelectUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast1 = Toast.makeText(getApplicationContext(), "User Selected : ", Toast.LENGTH_LONG);
                toast1.show();
                onBackPressed();
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "User Selection Canceled", Toast.LENGTH_LONG);
                toast1.show();
                onBackPressed();
            }
        });

    }

    private void selectActiveColor(TextView textUserSelected, TextView[] allTextViews) {
        for (TextView tv : allTextViews) {
            tv.setBackgroundColor(getResources().getColor(R.color.tlo));
            tv.setTextColor(getResources().getColor(R.color.tekst_zliczanie));
        }
        textUserSelected.setBackgroundColor(getResources().getColor(R.color.tekst_zliczanie));
        textUserSelected.setTextColor(getResources().getColor(R.color.tlo));
        userSelected = String.valueOf(textUserSelected.getText());

    }
}
