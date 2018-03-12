package com.example.tomaszek.foodclicker;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.tomaszek.foodclicker.Product.ProductEntry.COLUMN_NAME_TIMESTAMP;
import static com.example.tomaszek.foodclicker.R.id.textLog0;
import static com.example.tomaszek.foodclicker.R.id.view_offset_helper;

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
                null,//projection,             // The array of columns to return (pass null to get all)
                null,//selection,              // The columns for the WHERE clause
                null,//selectionArgs,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder,               // The sort order,
                "50"//limit
        );
/**
 * The third and fourth arguments (selection and selectionArgs) are combined to create a WHERE clause.
 * Because the arguments are provided separately from the selection query, they are escaped before
 * being combined. * This makes your selection statements immune to SQL injection.
 * For more detail about all arguments, see the query() reference.

 To look at a row in the cursor, use one of the Cursor move methods,
 which you must always call before you begin reading values. Since
 the cursor starts at position -1, calling moveToNext() places the "read position" on the first
 entry in the results and returns whether or not the cursor is already past the last entry in the result set.
 For each row, you can read a column's value by calling one of the Cursor get methods, such as getString()
 or getLong(). For each of the get methods, you must pass the index position of the column you desire,
 which you can get by calling getColumnIndex() or getColumnIndexOrThrow(). When finished iterating through
 results, call close() on the cursor to release its resources. For example, the following shows how to get
 all the item IDs stored in a cursor and add them to a list:
 */
        List itemIds = new ArrayList<>();
        List itemWhat = new ArrayList<>();
        List itemWhen = new ArrayList<>();
        List itemAdded = new ArrayList<>();

        while (cursor.moveToNext()) {

            itemWhat.add(cursor.getString(1));
            itemWhen.add(cursor.getString(2));
            itemAdded.add(cursor.getString(3));
        }
        cursor.close();


        TextView textLog0 = (TextView) findViewById(R.id.textLog0);
        TextView textLog1 = (TextView) findViewById(R.id.textLog1);
        TextView textLog2 = (TextView) findViewById(R.id.textLog2);
        TextView textLog3 = (TextView) findViewById(R.id.textLog3);
        TextView textLog4 = (TextView) findViewById(R.id.textLog4);
        TextView textLog5 = (TextView) findViewById(R.id.textLog5);
        TextView textLog6 = (TextView) findViewById(R.id.textLog6);
        TextView textLog7 = (TextView) findViewById(R.id.textLog7);


        textLog0.setText((String) itemWhen.get(1));
        textLog1.setText((String) itemWhen.get(2));
        textLog2.setText((String) itemWhen.get(3));
        textLog3.setText((String) itemWhen.get(4));
        textLog4.setText((String) itemWhen.get(5));
        textLog5.setText((String) itemWhen.get(6));
        textLog6.setText((String) itemWhen.get(7));
        textLog7.setText((String) itemWhen.get(8));


    }
}
