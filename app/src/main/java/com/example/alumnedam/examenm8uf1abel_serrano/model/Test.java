package com.example.alumnedam.examenm8uf1abel_serrano.model;

import java.util.ArrayList;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class Test {
    ArrayList<Pregunta> llistaPreguntes = new ArrayList();

    public void obtenirPreguntes(int tema, int nombrePreguntes) {
        for (int i = 0; i < nombrePreguntes; i++) {

            llistaPreguntes.add(new Pregunta("Pregunta número " + i + " Quan fan 2 + 2?", 4));
        }
    }

    public ArrayList<Pregunta> getLlistaPreguntes() {
        return llistaPreguntes;
    }


}
