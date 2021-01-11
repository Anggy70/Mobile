package com.example.mobile;

/*
 Dibuat Oleh Muhammad Anggy Oryza Pradana
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sharedpreferences extends AppCompatActivity {
    private Button simpan;
    private EditText masukandata;
    private TextView output;

    private Sharedprefmanager sharedprefmanager;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedpreferences);
        simpan = findViewById(R.id.simpan);
        masukandata = findViewById(R.id.masukandata);
        output = findViewById(R.id.output);

        sharedprefmanager = new Sharedprefmanager(this);
        output.setText(sharedprefmanager.getString());
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
                Toast.makeText(getApplicationContext(),"Data tersimpan bro!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getData(){
        String getkonten = masukandata.getText().toString();
        sharedprefmanager.saveString(getkonten);

        output.setText(sharedprefmanager.getString());

    }





}