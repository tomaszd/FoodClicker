package com.doktornutria.tomaszek.foodclicker;

import android.app.IntentService;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class LogDBService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_ADD = "com.example.tomaszek.foodclicker.action.add";
    private static final String ACTION_BAZ = "com.example.tomaszek.foodclicker.action.BAZ";

    // TODO: Rename parameters
    private static final String PARAM_WHAT = "what";
    private static final String PARAM_WHEN = "when";
    private static final String PARAM_ADDED = "added";


    public LogDBService() {
        super("LogDBService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_ADD.equals(action)) {
                final String what = intent.getStringExtra(PARAM_WHAT);
                final String when = intent.getStringExtra(PARAM_WHEN);
                final Boolean added = intent.getBooleanExtra(PARAM_ADDED, true);
                handleActionFoo(what, when, added);
            } else if (ACTION_BAZ.equals(action)) {
                final String param1 = intent.getStringExtra(PARAM_WHAT);
                final String param2 = intent.getStringExtra(PARAM_WHEN);
                handleActionBaz(param1, param2);
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(final String what, final String when, final Boolean added) {
        // TODO: Handle action Foo
        final Context MyContext = this;
        final SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                //Log only in debug
                //Toast toast1 = Toast.makeText(MyContext, "Added:  " + added + " what: " + what + " when:" + when, Toast.LENGTH_LONG);
                //toast1.show();
                String username = sharedPrefs.getString("username", "Anonymous");
                ProductDbHelper mDbHelper = new ProductDbHelper(getApplicationContext());
                // Gets the data repository in write mode
                SQLiteDatabase db = mDbHelper.getWritableDatabase();


// Create a new map of values, where column names are the keys
                ContentValues values = new ContentValues();
                values.put(Product.ProductEntry.COLUMN_NAME_PRODUCT_NAME, what);
                values.put(Product.ProductEntry.COLUMN_NAME_TIMESTAMP, when);
                values.put(Product.ProductEntry.COLUMN_NAME_ADDED, added);
// Insert the new row, returning the primary key value of the new row
                long newRowId = db.insert(Product.ProductEntry.TABLE_NAME, null, values);


                //czytanie starej wartosci :

                SQLiteDatabase dbReadable = mDbHelper.getReadableDatabase();

                //Check if there is auser in DB:
                checkIfUserInDb(dbReadable, db, username);


// Define a projection that specifies which columns from the database
// you will actually use after this query.

                String[] projection = {
                        what
                };
                if (what.equals("kosz")) {
                    projection = null;
                }

                String selection = Product.UserEntry.COLUMN_NAME_USER_NAME + " = ?";
                String[] selectionArgs = {username};

// How you want the results sorted in the resulting Cursor
                String sortOrder =
                        Product.UserEntry.COLUMN_NAME_USER_NAME + " DESC";

                Cursor cursor = dbReadable.query(
                        Product.UserEntry.TABLE_NAME,   // The table to query
                        projection,             // The array of columns to return (pass null to get all)
                        //null,
                        selection,              // The columns for the WHERE clause
                        selectionArgs,          // The values for the WHERE clause
                        null,                   // don't group the rows
                        null,                   // don't filter by row groups
                        sortOrder               // The sort order
                );
                int old_what_value = 0;

                if (what.equals("kosz")) {
                    ContentValues cv_kosz = new ContentValues();
                    cv_kosz.put("woda", "0"); //These Fields should be your String values of actual column names
                    cv_kosz.put("inne", "0"); //These Fields should be your String values of actual column names
                    cv_kosz.put("warzywa", "0"); //These Fields should be your String values of actual column names
                    cv_kosz.put("owoce", "0"); //These Fields should be your String values of actual column names
                    cv_kosz.put("ryby", "0"); //These Fields should be your String values of actual column names
                    cv_kosz.put("zboza", "0"); //These Fields should be your String values of actual column names
                    cv_kosz.put("nabial", "0"); //These Fields should be your String values of actual column names
                    cv_kosz.put("orzechy", "0"); //These Fields should be your String values of actual column names
                    //Then use the update method, it should work now:
                    db.update(Product.UserEntry.TABLE_NAME, cv_kosz, Product.UserEntry.COLUMN_NAME_USER_NAME + " LIKE ?", new String[]{username});
                    cursor.close();
                    //Log only in debug
                    Toast toast1 = Toast.makeText(MyContext, "Deleted data for user:  " + username, Toast.LENGTH_LONG);
                    //toast1.show();
                    return;


                }


                while (cursor.moveToNext()) {
                    old_what_value = Integer.valueOf(cursor.getString(cursor.getColumnIndex(what)));

                    //woda = Integer.valueOf(cursor.getString(cursor.getColumnIndex("woda")));
                    //inne = Integer.valueOf(cursor.getString(cursor.getColumnIndex("inne")));
                    //warzywa = Integer.valueOf(cursor.getString(cursor.getColumnIndex("warzywa")));
                    //owoce = Integer.valueOf(cursor.getString(cursor.getColumnIndex("owoce")));
                    //ryby = Integer.valueOf(cursor.getString(cursor.getColumnIndex("ryby")));
                    //zboza = Integer.valueOf(cursor.getString(cursor.getColumnIndex("zboza")));
                    //nabial = Integer.valueOf(cursor.getString(cursor.getColumnIndex("nabial")));
                    //orzechy = Integer.valueOf(cursor.getString(cursor.getColumnIndex("orzechy")));
                }

                //update user Values
                ContentValues cv = new ContentValues();
                int new_value = 0;
                if (added) {
                    new_value = old_what_value + 1;
                } else {
                    new_value = old_what_value - 1;
                }
                if (new_value < 0) {
                    new_value = 0;
                }
                cv.put(what, new_value); //These Fields should be your String values of actual column names
                //Then use the update method, it should work now:
                db.update(Product.UserEntry.TABLE_NAME, cv, Product.UserEntry.COLUMN_NAME_USER_NAME + " LIKE ?", new String[]{username});
                cursor.close();
            }
        });
    }

    private void checkIfUserInDb(SQLiteDatabase dbReadable, SQLiteDatabase db, String username) {
        String[] projection = {
                Product.UserEntry.COLUMN_NAME_USER_NAME
        };

        String selection = Product.UserEntry.COLUMN_NAME_USER_NAME + " = ?";
        String[] selectionArgs = {username};

// How you want the results sorted in the resulting Cursor
        String sortOrder =
                Product.UserEntry.COLUMN_NAME_USER_NAME + " DESC";

        Cursor cursor = dbReadable.query(
                Product.UserEntry.TABLE_NAME,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                //null,
                selection,              // The columns for the WHERE clause
                selectionArgs,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        );
        if (!cursor.moveToNext()) {
            ContentValues values = new ContentValues();
            values.put(Product.UserEntry.COLUMN_NAME_USER_NAME, username);
            long newRowId = db.insert(Product.UserEntry.TABLE_NAME, null, values);

        }
        cursor.close();
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
