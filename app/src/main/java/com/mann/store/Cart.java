package com.mann.store;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.FloatProperty;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class Cart extends AppCompatActivity {


    public BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            float sum = (float) 0.0;
            Log.d("BR","HERE");

            if(intent.hasExtra("ladyfinger"))
            {
                Log.d("ladyFinger","ACCEPTED");
                //sum += Float.parseFloat(intent.getExtras().getString("ladyfinger"));
                sum += Float.parseFloat(intent.getStringExtra("ladyfinger"));
            }
            if(intent.hasExtra("brinjal"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("brinjal"));
            }
            if(intent.hasExtra("onion"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("onion"));
            }
            if(intent.hasExtra("tomato"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("tomato"));
            }
            if(intent.hasExtra("carrot"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("carrot"));
            }
            if(intent.hasExtra("potato"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("potato"));
            }
            if(intent.hasExtra("cucumber"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("cucumber"));
            }
            if(intent.hasExtra("cabbage"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("cabbage"));
            }
            if(intent.hasExtra("banana"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("banana"));
            }
            if(intent.hasExtra("orange"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("orange"));
            }
            if(intent.hasExtra("pineapple"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("pineapple"));
            }
            if(intent.hasExtra("guava"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("guava"));
            }
            if(intent.hasExtra("kiwi"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("kiwi"));
            }
            if(intent.hasExtra("grapes"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("grapes"));
            }
            if(intent.hasExtra("pear"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("pear"));
            }
            if(intent.hasExtra("mango"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("mango"));
            }
            if(intent.hasExtra("chips"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("chips"));
            }
            if(intent.hasExtra("snickers"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("snickers"));
            }
            if(intent.hasExtra("kitkat"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("kitkat"));
            }
            if(intent.hasExtra("oreo"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("oreo"));
            }
            if(intent.hasExtra("dairymilk"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("dairymilk"));
            }
            if(intent.hasExtra("cheetos"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("cheetos"));
            }
            if(intent.hasExtra("littlehearts"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("littlehearts"));
            }
            if(intent.hasExtra("milk"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("milk"));
            }
            if(intent.hasExtra("hairoil"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("hairoil"));
            }
            if(intent.hasExtra("salt"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("salt"));
            }
            if(intent.hasExtra("facewash"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("facewash"));
            }
            if(intent.hasExtra("sugar"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("sugar"));
            }
            if(intent.hasExtra("eggs"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("eggs"));
            }
            if(intent.hasExtra("oats"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("oats"));
            }
            if(intent.hasExtra("protein"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("protein"));
            }
            if(intent.hasExtra("lays"))
            {
                sum += Float.parseFloat(intent.getExtras().getString("lays"));
            }

            Log.d("SUM", Float.toString(sum));





        }
    };
    //int random = Random.nextInt(61) + 20;
    Random r = new Random();
    int i1 = r.nextInt(195-90)+65;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        float sum = (float) 0.0;

        Log.d("sum",Float.toString(sum));

        TextView tv = (TextView) findViewById(R.id.textView);

        tv.setText(String.valueOf(i1));

        LocalBroadcastManager.getInstance(Cart.this).registerReceiver(broadcastReceiver, new IntentFilter("INTENT_NAME"));
        //LocalBroadcastManager.getInstance(this).registerReceiver(br, new IntentFilter("INTENT_NAME"));


    }
}
