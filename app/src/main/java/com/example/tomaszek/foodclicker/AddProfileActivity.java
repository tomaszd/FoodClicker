package com.example.tomaszek.foodclicker;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile_activty);

        final EditText editTextName = (EditText) findViewById(R.id.editTextName);

        final Button buttonAddNewUser = (Button) findViewById(R.id.buttonAddNewUser);
        final Button buttonCancel = (Button) findViewById(R.id.buttonCancel);


        TextView textViewAddNewuser = (TextView) findViewById(R.id.textViewAddNewuser);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font2.ttf");
        textViewAddNewuser.setTypeface(typeface);

        buttonAddNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newUsername = String.valueOf(editTextName.getText());
                if (newUsername.equals("")) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Please enter user name", Toast.LENGTH_LONG);
                    toast1.show();
                    return;
                }
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
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "User addition Canceled", Toast.LENGTH_LONG);
                toast1.show();
                onBackPressed();
            }
        });
    }
}
