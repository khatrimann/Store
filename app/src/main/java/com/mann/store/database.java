package com.mann.store;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static android.content.Context.INPUT_METHOD_SERVICE;
import static android.content.Context.MODE_PRIVATE;

/**
 * Created by mann on 5/1/17.
 */

public class database extends SQLiteOpenHelper {

    public database(Context context) {
        super(context, "Storedb.db", null, 1);
        Log.d("READY","class");
        /*SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase("Storedb.db",null,null);
        onCreate(db);*/
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("READY","onCreate");
        String query = "CREATE TABLE IF NOT EXISTS info(NAME TEXT, PRICE REAL, CATEGORY TEXT);";
        //db = SQLiteDatabase.openOrCreateDatabase("Storedb.db", null,null);
        //db.execSQL("DROP TABLE IF EXISTS info");
        db.execSQL(query);
        Log.d("DATA","ADDED");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("READY","onUpgrade");
        db.execSQL("DROP TABLE IF EXISTS info");
        onCreate(db);
    }

    public void AddData()
    {
        SQLiteDatabase db = this.getWritableDatabase();

        /*ContentValues values = new ContentValues();
        values.put("NAME","LADYFINGER");
        values.put("PRICE",12.00);
        values.put("CATEGORY","VEGETABLES");*/

        String query = "INSERT INTO info VALUES(\""+  "Ladyfinger\", 12.00, \"VEGETABLES\")," +
                "                              (\"" + "Brinjal\", 90.00, \"VEGETABLES\")," +
                "                              (\"" + "Onion\", 20.00, \"VEGETABLES\")," +
                "                              (\"" + "Tomato\", 12.00, \"VEGETABLES\")," +
                "                              (\"" + "Carrot\", 20.00, \"VEGETABLES\")," +
                "                              (\"" + "Potato\", 10.00, \"VEGETABLES\")," +
                "                              (\"" + "Cucumber\", 12.00, \"VEGETABLES\")," +
                "                              (\"" + "Cabbage\", 21.00, \"VEGETABLES\")," +
                "                              (\"" + "Banana\", 60.00, \"FRUITS\")," +
                "                              (\"" + "Orange\", 12.00, \"FRUITS\")," +
                "                              (\"" + "Pineapple\", 60.00, \"FRUITS\")," +
                "                              (\"" + "Guava\", 12.00, \"FRUITS\")," +
                "                              (\"" + "Kiwi\", 80.00, \"FRUITS\")," +
                "                              (\"" + "Grape\", 120.00, \"FRUITS\")," +
                "                              (\"" + "Pear\", 150.00, \"FRUITS\")," +
                "                              (\"" + "Mango\", 100.00, \"FRUITS\")," +
                "                              (\"" + "Lays\", 20.00, \"CHIPS\")," +
                "                              (\"" + "Unclechips\", 20.00, \"CHIPS\")," +
                "                              (\"" + "Snickers\", 18.00, \"CHIPS\")," +
                "                              (\"" + "Kitkat\", 10.00, \"CHIPS\")," +
                "                              (\"" + "Oreo\", 30.00, \"CHIPS\")," +
                "                              (\"" + "DairyMilk\", 75.00, \"CHIPS\")," +
                "                              (\"" + "Cheetos\", 10.00, \"CHIPS\")," +
                "                              (\"" + "LittleHearts\", 10.00, \"CHIPS\")," +
                "                              (\"" + "Milk\", 25.00, \"OTHERS\")," +
                "                              (\"" + "HairOil\", 49.00, \"OTHERS\")," +
                "                              (\"" + "Salt\", 20.00, \"OTHERS\")," +
                "                              (\"" + "Facewash\", 90.00, \"OTHERS\")," +
                "                              (\"" + "Sugar\", 32.00, \"OTHERS\")," +
                "                              (\"" + "Eggs\", 5.00, \"OTHERS\")," +
                "                              (\"" + "Oats\", 175.00, \"OTHERS\")," +
                "                              (\"" + "Protein\", 4259.00, \"OTHERS\");";
        Log.d("TAG",query);

        db.execSQL(query);
        Log.d("VEGETABLE","DATA");
        //onCreate(db);

    }

    public float[] getdata()
    {
        String query = "SELECT PRICE FROM info;";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(query,null);
        c.moveToFirst();
        int s = c.getCount();
        Log.d("size", Integer.toString(s));

        float[] arr = new float[s+1];
        int i=0;

        while (!c.isLast())
        {
            Log.d("GETDATA",Float.toString(c.getFloat(c.getColumnIndex("PRICE"))));
            arr[i] = c.getFloat(c.getColumnIndex("PRICE"));
            i++;
            c.moveToNext();
            Log.d("GETVAL",Float.toString(arr[i-1]));
        }

        return arr;

    }

}
