package com.example.mobile;

/*
 Dibuat Oleh Muhammad Anggy Oryza Pradana
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Call extends AppCompatActivity {
    private final static String TAG="AppCallLink";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        Log.i(TAG, "Pada Event onCreate");
    }

    public void onClickCallsEvens (View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +62081328683303"));
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "Pada Event onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "Pada Event onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "Pada Event onPause()");
    }


    protected void onStop(){
        super.onStop  ();
        Log.i(TAG, "Pada Event onStart()");
    }


    protected void onRestart(){
        super.onRestart  ();
        Log.i(TAG, "Pada Event onRestart()");
    }


    protected void onDestroy(){
        super.onDestroy  ();
        Log.i(TAG, "Pada Event onDestroy()");
    }

}