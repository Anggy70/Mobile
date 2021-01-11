package com.example.mobile;

/*
 Dibuat Oleh Muhammad Anggy Oryza Pradana
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentSatu extends Fragment {

    public FragmentSatu() {
        // Required empty public constructor
    }

    public FragmentSatu(int contentLayoutId) {
        super(contentLayoutId);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_fragment_satu, container, false);
    }

}