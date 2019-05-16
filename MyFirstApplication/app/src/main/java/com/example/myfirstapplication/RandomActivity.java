package com.example.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RandomActivity extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }

    public void showRandomNumber(){
        Integer count = getIntent().getIntExtra(TOTAL_COUNT, 0);
    }
}
