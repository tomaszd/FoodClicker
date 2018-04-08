package com.doktornutria.tomaszek.foodclicker;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
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

        final SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPrefs.edit();
        TextView textViewAddNewuser = (TextView) findViewById(R.id.textViewAddNewuser);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/custom_font2.ttf");
        textViewAddNewuser.setTypeface(typeface);
        setupBottomNavigationView();

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


                ProductDbHelper mDbHelper = new ProductDbHelper(getApplicationContext());
                // Gets the data repository in write mode
                SQLiteDatabase db = mDbHelper.getWritableDatabase();
// Create a new map of values, where column names are the keys
                ContentValues values = new ContentValues();
                values.put(Product.UserEntry.COLUMN_NAME_USER_NAME, newUsername);

// Insert the new row, returning the primary key value of the new row
                long newRowId = db.insert(Product.UserEntry.TABLE_NAME, null, values);
                Toast toast2 = Toast.makeText(getApplicationContext(), "Dodano do db :  " + newUsername, Toast.LENGTH_LONG);
                toast2.show();
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

                editor.putString("username", newUsername);
                editor.commit();


                AddProfileActivity.this.startActivity(myIntent);
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

    private void setupBottomNavigationView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent myIntent = new Intent(AddProfileActivity.this, MainActivity.class);

                        AddProfileActivity.this.startActivity(myIntent);
                        break;
                    case R.id.action_info:
                        Intent myIntent2 = new Intent(AddProfileActivity.this, TabelaActivity.class);

                        AddProfileActivity.this.startActivity(myIntent2);
                        break;
                    case R.id.action_piramid:
                        Intent myIntent3 = new Intent(AddProfileActivity.this, PiramidActivity.class);
                        AddProfileActivity.this.startActivity(myIntent3);
                        break;
                }
                return true;
            }
        });
    }
}
