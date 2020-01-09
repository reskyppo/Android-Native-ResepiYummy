package com.dicoding.picodiploma.resepiyummy.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dicoding.picodiploma.resepiyummy.R;

public class about_me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        getSupportActionBar().setTitle("About Me");
    }
}
