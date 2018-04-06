package com.doktornutria.tomaszek.foodclicker;

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

    /* Inner class that defines the table contents */
    public static class UserEntry implements BaseColumns {
        public static final String TABLE_NAME = "user";
        public static final String COLUMN_NAME_USER_NAME = "username";
        //new
        public static final String COLUMN_NAME_WODA = "woda";
        public static final String COLUMN_NAME_INNE = "inne";
        public static final String COLUMN_NAME_WARZYWA = "warzywa";
        public static final String COLUMN_NAME_OWOCE = "owoce";
        public static final String COLUMN_NAME_ZBOZA = "zboza";
        public static final String COLUMN_NAME_RYBY = "ryby";
        public static final String COLUMN_NAME_NABIAL = "nabial";
        public static final String COLUMN_NAME_ORZECHY = "orzechy";

    }


    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + ProductEntry.TABLE_NAME + " (" +
                    ProductEntry._ID + " INTEGER PRIMARY KEY," +
                    ProductEntry.COLUMN_NAME_PRODUCT_NAME + " TEXT," +
                    ProductEntry.COLUMN_NAME_TIMESTAMP + " TEXT," +
                    ProductEntry.COLUMN_NAME_ADDED + " BOOLEAN)";

    public static final String SQL_USER_CREATE_ENTRIES =
            "CREATE TABLE " + UserEntry.TABLE_NAME + " (" +
                    UserEntry._ID + " INTEGER PRIMARY KEY," +
                    UserEntry.COLUMN_NAME_USER_NAME + " TEXT," +
                    UserEntry.COLUMN_NAME_WODA + " INTEGER DEFAULT 0," +
                    UserEntry.COLUMN_NAME_INNE + " INTEGER DEFAULT 0," +
                    UserEntry.COLUMN_NAME_WARZYWA + " INTEGER DEFAULT 0," +
                    UserEntry.COLUMN_NAME_OWOCE + " INTEGER DEFAULT 0," +
                    UserEntry.COLUMN_NAME_ZBOZA + " INTEGER DEFAULT 0," +
                    UserEntry.COLUMN_NAME_RYBY + " INTEGER DEFAULT 0," +
                    UserEntry.COLUMN_NAME_NABIAL + " INTEGER DEFAULT 0," +
                    UserEntry.COLUMN_NAME_ORZECHY + " INTEGER DEFAULT 0)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ProductEntry.TABLE_NAME;
    public static final String SQL_USER_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + UserEntry.TABLE_NAME;
}