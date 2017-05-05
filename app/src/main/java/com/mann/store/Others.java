package com.mann.store;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

public class Others extends AppCompatActivity {

    database data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.others);

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
                intent.putExtra("milk",Float.toString(arr[24]));
                LocalBroadcastManager.getInstance(Others.this).sendBroadcast(intent);
                return true;
            }
        });

        cv2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("hairoil",Float.toString(arr[25]));
                LocalBroadcastManager.getInstance(Others.this).sendBroadcast(intent);
                return true;
            }
        });
        cv3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("salt",Float.toString(arr[26]));
                LocalBroadcastManager.getInstance(Others.this).sendBroadcast(intent);
                return true;
            }
        });

        cv4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("facewash",Float.toString(arr[27]));
                LocalBroadcastManager.getInstance(Others.this).sendBroadcast(intent);
                return true;
            }
        });

        cv5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("sugar",Float.toString(arr[28]));
                LocalBroadcastManager.getInstance(Others.this).sendBroadcast(intent);
                return true;
            }
        });

        cv6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("eggs",Float.toString(arr[29]));
                LocalBroadcastManager.getInstance(Others.this).sendBroadcast(intent);
                return true;
            }
        });

        cv7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("oats",Float.toString(arr[30]));
                LocalBroadcastManager.getInstance(Others.this).sendBroadcast(intent);
                return true;
            }
        });

        cv8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("CART","ADDED TO CART");
                Intent intent = new Intent("INTENT_NAME");
                intent.putExtra("protein",Float.toString(arr[31]));
                LocalBroadcastManager.getInstance(Others.this).sendBroadcast(intent);
                return true;
            }
        });


    }
}
