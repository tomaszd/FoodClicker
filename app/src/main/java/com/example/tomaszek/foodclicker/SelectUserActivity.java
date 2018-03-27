package com.example.tomaszek.foodclicker;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.tomaszek.foodclicker.Product.UserEntry.COLUMN_NAME_USER_NAME;

public class SelectUserActivity extends AppCompatActivity {
    String userSelected = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_user);
        final Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        final Button buttonSelectUser = (Button) findViewById(R.id.buttonSelectUser);
        final Button buttonCancel = (Button) findViewById(R.id.buttonCancel);
        final Button buttonDelete = (Button) findViewById(R.id.buttonDelete);
        final LinearLayout lytDelete = (LinearLayout) findViewById(R.id.lytDelete);


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


        final SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPrefs.edit();


        ProductDbHelper mDbHelper = new ProductDbHelper(getApplicationContext());
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String sortOrder =
                //COLUMN_NAME_TIMESTAMP + " DESC";
                BaseColumns._ID + " ASC";

        Cursor cursor = db.query(
                Product.UserEntry.TABLE_NAME,   // The table to query
                null,//projection,             // The array of columns to return (pass null to get all)
                null,//selection,              // The columns for the WHERE clause
                null,//selectionArgs,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder,               // The sort order,
                "5"//limit
        );

        List itemIds = new ArrayList<>();
        final List rowUsername = new ArrayList<>();

        while (cursor.moveToNext()) {
            itemIds.add(cursor.getString(0));
            rowUsername.add(cursor.getString(1));
        }
        cursor.close();

        if (rowUsername.size() >= 0 + 1) {
            textUser1.setVisibility(View.VISIBLE);
            textUser1.setText(String.valueOf(rowUsername.get(0)));
        }
        if (rowUsername.size() >= 1 + 1) {
            textUser2.setVisibility(View.VISIBLE);
            textUser2.setText(String.valueOf(rowUsername.get(1)));
        }
        if (rowUsername.size() >= 2 + 1) {
            textUser3.setVisibility(View.VISIBLE);
            textUser3.setText(String.valueOf(rowUsername.get(2)));
        }
        if (rowUsername.size() >= 3 + 1) {
            textUser4.setVisibility(View.VISIBLE);
            textUser4.setText(String.valueOf(rowUsername.get(3)));
        }
        if (rowUsername.size() >= 4 + 1) {
            textUser5.setVisibility(View.VISIBLE);
            textUser5.setText(String.valueOf(rowUsername.get(4)));
        }


        textUser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lytDelete.setVisibility(View.VISIBLE);
                view.startAnimation(shake);
                selectActiveColor(textUser1, allTextViews);
            }
        });
        textUser2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lytDelete.setVisibility(View.VISIBLE);
                view.startAnimation(shake);
                selectActiveColor(textUser2, allTextViews);
            }
        });
        textUser3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lytDelete.setVisibility(View.VISIBLE);
                view.startAnimation(shake);
                selectActiveColor(textUser3, allTextViews);
            }
        });
        textUser4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lytDelete.setVisibility(View.VISIBLE);
                view.startAnimation(shake);

                selectActiveColor(textUser4, allTextViews);
            }
        });
        textUser5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lytDelete.setVisibility(View.VISIBLE);
                view.startAnimation(shake);

                selectActiveColor(textUser5, allTextViews);

            }
        });

        buttonSelectUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userSelected == null) {
                    Toast toast0 = Toast.makeText(getApplicationContext(), "Select an user and click OK", Toast.LENGTH_LONG);
                    toast0.show();
                    return;
                }
                Toast toast1 = Toast.makeText(getApplicationContext(), "User Selected : " + userSelected, Toast.LENGTH_LONG);
                toast1.show();
                editor.putString("username", userSelected);
                editor.commit();


                onBackPressed();
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "User Selection Cancelled", Toast.LENGTH_LONG);
                toast1.show();
                onBackPressed();
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "User deleted Add actions!" + userSelected, Toast.LENGTH_LONG);
                toast1.show();

                AlertDialog.Builder builder = new AlertDialog.Builder(SelectUserActivity.this);
                builder.setMessage("Are you sure you want to delete user " + userSelected + " ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                if (deleteUser(userSelected)) {
                                    Toast toast1 = Toast.makeText(getApplicationContext(), "User deleted: " + userSelected, Toast.LENGTH_LONG);
                                    toast1.show();
                                }
                                editor.remove("username");
                                editor.apply();
                                recreate();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

                // usunac z bazy
                // przerywsowac

            }

            private boolean deleteUser(String userSelected) {
                ProductDbHelper mDbHelper = new ProductDbHelper(getApplicationContext());
                SQLiteDatabase db = mDbHelper.getReadableDatabase();
                return db.delete(Product.UserEntry.TABLE_NAME, COLUMN_NAME_USER_NAME + "=?", new String[]{String.valueOf(userSelected)}) > 0;
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
