package com.example.tomaszek.foodclicker;

import android.provider.BaseColumns;

public final class Product {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private Product() {
    }

    /* Inner class that defines the table contents */
    public static class ProductEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_PRODUCT_NAME = "product";
        public static final String COLUMN_NAME_TIMESTAMP = "timestamp";
        public static final String COLUMN_NAME_ADDED = "added";
    }

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + ProductEntry.TABLE_NAME + " (" +
                    ProductEntry._ID + " INTEGER PRIMARY KEY," +
                    ProductEntry.COLUMN_NAME_PRODUCT_NAME + " TEXT," +
                    ProductEntry.COLUMN_NAME_TIMESTAMP + " TEXT," +
                    ProductEntry.COLUMN_NAME_ADDED + " BOOLEAN)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ProductEntry.TABLE_NAME;

}