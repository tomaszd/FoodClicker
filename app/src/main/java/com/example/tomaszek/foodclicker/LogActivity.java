package com.example.tomaszek.foodclicker;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static com.example.tomaszek.foodclicker.Product.ProductEntry.COLUMN_NAME_TIMESTAMP;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        ProductDbHelper mDbHelper = new ProductDbHelper(getApplicationContext());
        SQLiteDatabase db = mDbHelper.getReadableDatabase();


        String[] projection = {
                BaseColumns._ID,
                Product.ProductEntry.COLUMN_NAME_PRODUCT_NAME,
                Product.ProductEntry.COLUMN_NAME_TIMESTAMP,
                Product.ProductEntry.COLUMN_NAME_ADDED,

        };

// Filter results WHERE "title" = 'My Title'
        String selection = Product.ProductEntry.COLUMN_NAME_PRODUCT_NAME + " = ?";
        //String[] selectionArgs = {"My Title"};
        String[] selectionArgs = {null};

// How you want the results sorted in the resulting Cursor
        String sortOrder =
                COLUMN_NAME_TIMESTAMP + " DESC";

        Cursor cursor = db.query(
                Product.ProductEntry.TABLE_NAME,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                selection,              // The columns for the WHERE clause
                selectionArgs,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        );

        List itemIds = new ArrayList<>();
        while (cursor.moveToNext()) {
            long itemId = cursor.getLong(
                    cursor.getColumnIndexOrThrow(Product.ProductEntry._ID));
            itemIds.add(itemId);
        }
        cursor.close();

    }
}
