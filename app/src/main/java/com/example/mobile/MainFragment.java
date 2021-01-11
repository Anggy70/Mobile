package com.example.mobile;

/*
 Dibuat Oleh Muhammad Anggy Oryza Pradana
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainFragment extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
    }

    @Override
    protected void onResume() {
        super.onResume();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfragment(new FragmentSatu());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadfragment(new FragmentKedua());
            }

        });

    }

    private void loadfragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.container_frag,fragment);
        fragmentTransaction.commit();
    }

}