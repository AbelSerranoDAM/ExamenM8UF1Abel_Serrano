package com.example.alumnedam.examenm8uf1abel_serrano.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alumnedam.examenm8uf1abel_serrano.R;
import com.example.alumnedam.examenm8uf1abel_serrano.model.Pregunta;
import com.example.alumnedam.examenm8uf1abel_serrano.model.Test;

import java.util.ArrayList;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class PreguntesActivity extends AppCompatActivity implements View.OnClickListener {
    Test test = new Test();
    int cont = 0;
    boolean suma, resta, divisio, multiplicacio, cinco, diez, quince;
    int tipusOperacio, nombrePreguntes;
    double resposta;
    ArrayList<Pregunta> llistaPreguntes = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntes);


        Button buttonVariat = (Button) findViewById(R.id.buttonVariat);
        buttonVariat.setOnClickListener(this);
        TextView textViewEnunciat = (TextView) findViewById(R.id.textViewEnunciat);
        Intent i = getIntent();
        suma = i.getBooleanExtra("Suma", false);
        resta = i.getBooleanExtra("Resta", false);
        multiplicacio = i.getBooleanExtra("Multiplicacio", false);
        divisio = i.getBooleanExtra("Divisio", false);
        cinco = i.getBooleanExtra("5", false);
        diez = i.getBooleanExtra("10", false);
        quince = i.getBooleanExtra("15", false);

        if (suma) {
            tipusOperacio = 1;
        } else if (resta) {
            tipusOperacio = 2;
        } else if (multiplicacio) {
            tipusOperacio = 3;
        } else if (divisio) {
            tipusOperacio = 4;
        }
        if (cinco) {
            nombrePreguntes = 5;
        } else if (diez) {
            nombrePreguntes = 10;
        } else if (quince) {
            nombrePreguntes = 15;
        }
        test.obtenirPreguntes(tipusOperacio, nombrePreguntes);
        for (int cont = 0; cont < test.getLlistaPreguntes().size(); cont++) {
            llistaPreguntes.add(test.getLlistaPreguntes().get(cont));

        }
        textViewEnunciat.setText("Enunciat");

    }

    @Override
    public void onClick(View view) {
        EditText editTextResposta = (EditText) findViewById(R.id.editTextResposta);
        resposta = (Double.parseDouble(editTextResposta.getText().toString()));

        TextView textViewEncerts = (TextView) findViewById(R.id.textViewEncerts);
        TextView textViewErrades = (TextView) findViewById(R.id.textViewErrades);
        if (cont == 0) {
            if (resposta == 4) {
                textViewEncerts.setText("1");
                cont = 1;
            } else {
                textViewErrades.setText("1");
                Toast.makeText(this, "La resposta correcta es 4", Toast.LENGTH_SHORT);
                cont = 1;
            }
        } else {

            Intent i = new Intent(this, FinalActivity.class);
            startActivity(i);
            finish();
        }


    }

}
