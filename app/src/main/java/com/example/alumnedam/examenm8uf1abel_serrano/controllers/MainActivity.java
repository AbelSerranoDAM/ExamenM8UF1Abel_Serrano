package com.example.alumnedam.examenm8uf1abel_serrano.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.alumnedam.examenm8uf1abel_serrano.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton radioButtonSuma, radioButtonResta, radioButtonMultiplicacio, radioButtonDivisio, radioButton5, radioButton10, radioButton15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonPreguntes = (Button) findViewById(R.id.buttonPreguntes);
        buttonPreguntes.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, PreguntesActivity.class);
        radioButtonSuma = (RadioButton) findViewById(R.id.radioButtonSuma);
        radioButtonResta = (RadioButton) findViewById(R.id.radioButtonResta);
        radioButtonMultiplicacio = (RadioButton) findViewById(R.id.radioButtonMultiplicacio);
        radioButtonDivisio = (RadioButton) findViewById(R.id.radioButtonDivisio);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton10 = (RadioButton) findViewById(R.id.radioButton10);
        radioButton15 = (RadioButton) findViewById(R.id.radioButton15);
        i.putExtra("Suma", radioButtonSuma.isChecked());
        i.putExtra("Resta", radioButtonResta.isChecked());
        i.putExtra("Multiplicacio", radioButtonMultiplicacio.isChecked());
        i.putExtra("Divisio", radioButtonDivisio.isChecked());
        i.putExtra("5", radioButton5.isChecked());
        i.putExtra("10", radioButton10.isChecked());
        i.putExtra("15", radioButton15.isChecked());
        startActivity(i);
        finish();
    }
}
