package com.mann.store;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Fruits extends AppCompatActivity {

    database data;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);

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

        cv1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("banana",Float.toString(arr[8]));
                LocalBroadcastManager.getInstance(Fruits.this).sendBroadcast(intent);
                return true;
            }
        });

        cv2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("orange",Float.toString(arr[9]));
                LocalBroadcastManager.getInstance(Fruits.this).sendBroadcast(intent);
                return true;
            }
        });
        cv3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("pineapple",Float.toString(arr[10]));
                LocalBroadcastManager.getInstance(Fruits.this).sendBroadcast(intent);
                return true;
            }
        });

        cv4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("guava",Float.toString(arr[11]));
                LocalBroadcastManager.getInstance(Fruits.this).sendBroadcast(intent);
                return true;
            }
        });

        cv5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("kiwi",Float.toString(arr[12]));
                LocalBroadcastManager.getInstance(Fruits.this).sendBroadcast(intent);
                return true;
            }
        });

        cv6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("grapes",Float.toString(arr[13]));
                LocalBroadcastManager.getInstance(Fruits.this).sendBroadcast(intent);
                return true;
            }
        });

        cv7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("pear",Float.toString(arr[14]));
                LocalBroadcastManager.getInstance(Fruits.this).sendBroadcast(intent);
                return true;
            }
        });

        cv8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("mango",Float.toString(arr[15]));
                LocalBroadcastManager.getInstance(Fruits.this).sendBroadcast(intent);
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
                startActivity(new Intent("INTENT_NAME"));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
