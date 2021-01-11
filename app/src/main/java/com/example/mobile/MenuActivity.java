package com.example.mobile;

/*
 Dibuat Oleh Muhammad Anggy Oryza Pradana
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button first;
    private Button call;
    private Button intent;
    private Button mainfragment;
    private Button preference;
    private Button database;
    private Button time;
    private Button out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        first = (Button)findViewById(R.id.first);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(i);
            }
        });

        call = (Button)findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Call.class);
                startActivity(i);
            }
        });

        intent = (Button)findViewById(R.id.intent);
        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), com.example.mobile.Intent.class);
                startActivity(i);
            }
        });

        mainfragment = (Button)findViewById(R.id.mainfragment);
        mainfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainFragment.class);
                startActivity(i);
            }
        });

        preference = (Button)findViewById(R.id.preference);
        preference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Sharedpreferences.class);
                startActivity(i);
            }
        });

        database = (Button)findViewById(R.id.database);
        database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Roomdata.class);
                startActivity(i);
            }
        });

        time = (Button)findViewById(R.id.time);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TimeService.class);
                startActivity(i);
            }
        });

        out = (Button)findViewById(R.id.out);
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}