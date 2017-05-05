package com.mann.store;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.mann.store.database;

public class Vegetables extends AppCompatActivity {

    database data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetables);

        data = new database(this);
        //data.AddData();
        final float[] arr = data.getdata();

        Log.d("VALS",Float.toString(arr[0]));

        for(int i=0;i<arr.length;i++)
            Log.d("VALUES",Float.toString(arr[i]));


        CardView cv1 = (CardView) findViewById(R.id.card_view1);
        CardView cv2 = (CardView) findViewById(R.id.card_view2);
        CardView cv3 = (CardView) findViewById(R.id.card_view3);
        CardView cv4 = (CardView) findViewById(R.id.card_view4);
        CardView cv5 = (CardView) findViewById(R.id.card_view5);
        CardView cv6 = (CardView) findViewById(R.id.card_view6);
        CardView cv7 = (CardView) findViewById(R.id.card_view7);
        CardView cv8 = (CardView) findViewById(R.id.card_view8);

        cv1.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("ladyfinger",Float.toString(arr[0]));
                LocalBroadcastManager.getInstance(Vegetables.this).sendBroadcast(intent);
                Log.d("ladyfinger",Float.toString(arr[0]));
                return true;
            }
        });

        cv2.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("brinjal",Float.toString(arr[1]));
                LocalBroadcastManager.getInstance(Vegetables.this).sendBroadcast(intent);
                return true;
            }
        });
        cv3.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("onion",Float.toString(arr[2]));
                LocalBroadcastManager.getInstance(Vegetables.this).sendBroadcast(intent);
                return true;
            }
        });

        cv4.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("tomato",Float.toString(arr[3]));
                LocalBroadcastManager.getInstance(Vegetables.this).sendBroadcast(intent);
                return true;
            }
        });

        cv5.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("carrot",Float.toString(arr[4]));
                LocalBroadcastManager.getInstance(Vegetables.this).sendBroadcast(intent);
                return true;
            }
        });

        cv6.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("potato",Float.toString(arr[5]));
                LocalBroadcastManager.getInstance(Vegetables.this).sendBroadcast(intent);
                return true;
            }
        });

        cv7.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("cucumber",Float.toString(arr[6]));
                LocalBroadcastManager.getInstance(Vegetables.this).sendBroadcast(intent);
                return true;
            }
        });

        cv8.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("cabbage",Float.toString(arr[7]));
                LocalBroadcastManager.getInstance(Vegetables.this).sendBroadcast(intent);
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case R.id.expanded_menu:
                startActivity(new Intent(Vegetables.this,Cart.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
