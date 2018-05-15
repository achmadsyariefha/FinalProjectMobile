package com.android.example.app.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incomeWindow(View view) {
        Intent intent = new Intent(MainActivity.this, IncomeActivity.class);
        startActivity(intent);
    }

    public void outcomeWindow(View view) {
        Intent intent = new Intent(MainActivity.this, OutcomeActivity.class);
        startActivity(intent);
    }

    public void reportWindow(View view) {
        Intent intent = new Intent(MainActivity.this, Report.class);
        startActivity(intent);
    }
}
