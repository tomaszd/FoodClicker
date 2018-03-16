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
        TextView textLog8 = (TextView) findViewById(R.id.textLog8);
        TextView textLog9 = (TextView) findViewById(R.id.textLog9);
        TextView textLog10 = (TextView) findViewById(R.id.textLog10);
        TextView textLog11 = (TextView) findViewById(R.id.textLog11);
        TextView textLog12 = (TextView) findViewById(R.id.textLog12);
        TextView textLog13 = (TextView) findViewById(R.id.textLog13);
        TextView textLog14 = (TextView) findViewById(R.id.textLog14);


        ImageButton btnLog0 = (ImageButton) findViewById(R.id.btnLog0);
        ImageButton btnLog1 = (ImageButton) findViewById(R.id.btnLog1);
        ImageButton btnLog2 = (ImageButton) findViewById(R.id.btnLog2);
        ImageButton btnLog3 = (ImageButton) findViewById(R.id.btnLog3);
        ImageButton btnLog4 = (ImageButton) findViewById(R.id.btnLog4);
        ImageButton btnLog5 = (ImageButton) findViewById(R.id.btnLog5);
        ImageButton btnLog6 = (ImageButton) findViewById(R.id.btnLog6);
        ImageButton btnLog7 = (ImageButton) findViewById(R.id.btnLog7);
        ImageButton btnLog8 = (ImageButton) findViewById(R.id.btnLog8);
        ImageButton btnLog9 = (ImageButton) findViewById(R.id.btnLog9);
        ImageButton btnLog10 = (ImageButton) findViewById(R.id.btnLog10);
        ImageButton btnLog11 = (ImageButton) findViewById(R.id.btnLog11);
        ImageButton btnLog12 = (ImageButton) findViewById(R.id.btnLog12);
        ImageButton btnLog13 = (ImageButton) findViewById(R.id.btnLog13);
        ImageButton btnLog14 = (ImageButton) findViewById(R.id.btnLog14);


        TextView textSign0 = (TextView) findViewById(R.id.textSign0);
        TextView textSign1 = (TextView) findViewById(R.id.textSign1);
        TextView textSign2 = (TextView) findViewById(R.id.textSign2);
        TextView textSign3 = (TextView) findViewById(R.id.textSign3);
        TextView textSign4 = (TextView) findViewById(R.id.textSign4);
        TextView textSign5 = (TextView) findViewById(R.id.textSign5);
        TextView textSign6 = (TextView) findViewById(R.id.textSign6);
        TextView textSign7 = (TextView) findViewById(R.id.textSign7);
        TextView textSign8 = (TextView) findViewById(R.id.textSign8);
        TextView textSign9 = (TextView) findViewById(R.id.textSign9);
        TextView textSign10 = (TextView) findViewById(R.id.textSign10);
        TextView textSign11 = (TextView) findViewById(R.id.textSign11);
        TextView textSign12 = (TextView) findViewById(R.id.textSign12);
        TextView textSign13 = (TextView) findViewById(R.id.textSign13);
        TextView textSign14 = (TextView) findViewById(R.id.textSign14);


        if (itemWhat.size() >= 1) {
            setLogInUI(textLog0, btnLog0, textSign0, itemWhat.get(0), itemWhen.get(0), itemAdded.get(0));
        }
        if (itemWhat.size() >= 2) {
            setLogInUI(textLog1, btnLog1, textSign1, itemWhat.get(1), itemWhen.get(1), itemAdded.get(1));
        }
        if (itemWhat.size() >= 3) {
            setLogInUI(textLog2, btnLog2, textSign2, itemWhat.get(2), itemWhen.get(2), itemAdded.get(2));
        }
        if (itemWhat.size() >= 4) {
            setLogInUI(textLog3, btnLog3, textSign3, itemWhat.get(3), itemWhen.get(3), itemAdded.get(3));
        }
        if (itemWhat.size() >= 5) {
            setLogInUI(textLog4, btnLog4, textSign4, itemWhat.get(4), itemWhen.get(4), itemAdded.get(4));
        }
        if (itemWhat.size() >= 6) {
            setLogInUI(textLog5, btnLog5, textSign5, itemWhat.get(5), itemWhen.get(5), itemAdded.get(5));
        }
        if (itemWhat.size() >= 7) {
            setLogInUI(textLog6, btnLog6, textSign6, itemWhat.get(6), itemWhen.get(6), itemAdded.get(6));
        }
        if (itemWhat.size() >= 8) {
            setLogInUI(textLog7, btnLog7, textSign7, itemWhat.get(7), itemWhen.get(7), itemAdded.get(7));
        }
        if (itemWhat.size() >= 9) {
            setLogInUI(textLog8, btnLog8, textSign8, itemWhat.get(8), itemWhen.get(8), itemAdded.get(8));
        }
        if (itemWhat.size() >= 10) {
            setLogInUI(textLog9, btnLog9, textSign9, itemWhat.get(9), itemWhen.get(9), itemAdded.get(9));
        }
        if (itemWhat.size() >= 11) {
            setLogInUI(textLog10, btnLog10, textSign10, itemWhat.get(10), itemWhen.get(10), itemAdded.get(10));
        }
        if (itemWhat.size() >= 11 + 1) {
            setLogInUI(textLog11, btnLog11, textSign11, itemWhat.get(11), itemWhen.get(11), itemAdded.get(11));
        }
        if (itemWhat.size() >= 12 + 1) {
            setLogInUI(textLog12, btnLog12, textSign12, itemWhat.get(12), itemWhen.get(12), itemAdded.get(12));
        }
        if (itemWhat.size() >= 13 + 1) {
            setLogInUI(textLog13, btnLog13, textSign13, itemWhat.get(13), itemWhen.get(13), itemAdded.get(13));
        }
        if (itemWhat.size() >= 14 + 1) {
            setLogInUI(textLog14, btnLog14, textSign14, itemWhat.get(14), itemWhen.get(14), itemAdded.get(14));
        }
    }

    private void setLogInUI(TextView textLog, ImageButton btnLog, TextView textSign, Object what, Object when, Object added) {
        textLog.setText((String) when);
        textLog.setTypeface(null, Typeface.BOLD_ITALIC);
        if (added.equals("1")) {
            textLog.setTextColor(Color.GREEN);
            textSign.setTextColor(Color.GREEN);
        } else {
            textLog.setTextColor(Color.RED);
            textSign.setTextColor(Color.RED);
            textSign.setText("-");
        }


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
            case "kosz":
                btnLog.setImageResource(R.drawable.kosz);
                break;
            default:
                btnLog.setImageResource(R.drawable.posil_wst);
                break;
        }


    }


}


