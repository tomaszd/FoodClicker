package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font2.ttf");
        textUser1.setTypeface(typeface);
        textUser2.setTypeface(typeface);
        textUser3.setTypeface(typeface);


        textUser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(shake);
                //textUser1.setBackgroundColor("@");
                textUser1.setBackground();
                userSelected = String.valueOf(textUser1.getText());

                Toast toast1 = Toast.makeText(getApplicationContext(), "Added user :  " + newUsername, Toast.LENGTH_LONG);
                toast1.show();
                Intent myIntent = new Intent(AddProfileActivity.this, MainActivity.class);
                myIntent.putExtra("woda", 0); //Optional parameters
                myIntent.putExtra("inne", 0); //Optional parameters
                myIntent.putExtra("warzywa", 0); //Optional parameters
                myIntent.putExtra("owoce", 0); //Optional parameters
                myIntent.putExtra("ryby", 0); //Optional parameters
                myIntent.putExtra("zboza", 0); //Optional parameters
                myIntent.putExtra("nabial", 0); //Optional parameters
                myIntent.putExtra("orzechy", 0); //Optional parameters
                myIntent.putExtra("otherActivity", true); //Optional parameters
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
}
