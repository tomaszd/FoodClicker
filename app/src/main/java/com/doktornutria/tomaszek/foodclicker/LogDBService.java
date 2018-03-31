package com.doktornutria.tomaszek.foodclicker;

import android.app.IntentService;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;

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

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, LogDBService.class);
        intent.setAction(ACTION_ADD);
        intent.putExtra(PARAM_WHAT, param1);
        intent.putExtra(PARAM_WHEN, param2);
        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionBaz(Context context, String param1, String param2) {
        Intent intent = new Intent(context, LogDBService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(PARAM_WHAT, param1);
        intent.putExtra(PARAM_WHEN, param2);
        context.startService(intent);
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

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                //Log only in debug
                //Toast toast1 = Toast.makeText(MyContext, "Added:  " + added + " what: " + what + " when:" + when, Toast.LENGTH_LONG);
                //toast1.show();
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


            }
        });
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
