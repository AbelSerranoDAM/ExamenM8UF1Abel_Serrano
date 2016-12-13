package com.example.alumnedam.examenm8uf1abel_serrano.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.alumnedam.examenm8uf1abel_serrano.R;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class FinalActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Button buttonInicial = (Button) findViewById(R.id.buttonInicial);
        buttonInicial.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
