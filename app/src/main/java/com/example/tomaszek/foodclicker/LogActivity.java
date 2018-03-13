package com.example.tomaszek.foodclicker;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

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
                //COLUMN_NAME_TIMESTAMP + " DESC";
                BaseColumns._ID + " DESC";

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
        final List itemWhat = new ArrayList<>();
        final List itemWhen = new ArrayList<>();
        final List itemAdded = new ArrayList<>();

        while (cursor.moveToNext()) {
            itemIds.add(cursor.getString(0));
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

        ImageButton btnLog0 = (ImageButton) findViewById(R.id.btnLog0);
        ImageButton btnLog1 = (ImageButton) findViewById(R.id.btnLog1);
        ImageButton btnLog2 = (ImageButton) findViewById(R.id.btnLog2);
        ImageButton btnLog3 = (ImageButton) findViewById(R.id.btnLog3);
        ImageButton btnLog4 = (ImageButton) findViewById(R.id.btnLog4);
        ImageButton btnLog5 = (ImageButton) findViewById(R.id.btnLog5);
        ImageButton btnLog6 = (ImageButton) findViewById(R.id.btnLog6);
        ImageButton btnLog7 = (ImageButton) findViewById(R.id.btnLog7);


        if (itemWhat.size() >= 1) {
            setLogInUI(textLog0, btnLog0, itemWhat.get(0), itemWhen.get(0), itemAdded.get(0));
        }
        if (itemWhat.size() >= 2) {
            setLogInUI(textLog1, btnLog1, itemWhat.get(1), itemWhen.get(1), itemAdded.get(1));
        }
        if (itemWhat.size() >= 3) {
            setLogInUI(textLog2, btnLog2, itemWhat.get(2), itemWhen.get(2), itemAdded.get(2));
        }
        if (itemWhat.size() >= 4) {
            setLogInUI(textLog3, btnLog3, itemWhat.get(3), itemWhen.get(3), itemAdded.get(3));
        }
        if (itemWhat.size() >= 5) {
            setLogInUI(textLog4, btnLog4, itemWhat.get(4), itemWhen.get(4), itemAdded.get(4));
        }
        if (itemWhat.size() >= 6) {
            setLogInUI(textLog5, btnLog5, itemWhat.get(5), itemWhen.get(5), itemAdded.get(5));
        }
        if (itemWhat.size() >= 7) {
            setLogInUI(textLog6, btnLog6, itemWhat.get(6), itemWhen.get(6), itemAdded.get(6));
        }
        if (itemWhat.size() >= 8) {
            setLogInUI(textLog7, btnLog7, itemWhat.get(7), itemWhen.get(7), itemAdded.get(7));
        }

    }

    private void setLogInUI(TextView textLog, ImageButton btnLog, Object what, Object when, Object added) {
        textLog.setText((String) when);
        textLog.setTypeface(null, Typeface.BOLD_ITALIC);
        if (added.equals("1")) {
            textLog.setTextColor(Color.RED);
        } else
            textLog.setTextColor(Color.BLUE);
        switch ((String) what) {
            case "owoce":
                btnLog.setImageResource(R.drawable.owoc_wst);
                break;
            case "warzywa":
                btnLog.setImageResource(R.drawable.warzyw_wst);
                break;
            case "inne":
                btnLog.setImageResource(R.drawable.posil_wst);
                break;
            case "woda":
                btnLog.setImageResource(R.drawable.woda_wst);
                break;
            case "zboza":
                btnLog.setImageResource(R.drawable.zboza_wst);
                break;
            case "nabial":
                btnLog.setImageResource(R.drawable.nabial_wst);
                break;
            case "orzech":
                btnLog.setImageResource(R.drawable.olej_wst);
                break;
            case "ryby":
                btnLog.setImageResource(R.drawable.ryba_wst);
                break;
            default:
                btnLog.setImageResource(R.drawable.posil_wst);
                break;
        }


    }


}


