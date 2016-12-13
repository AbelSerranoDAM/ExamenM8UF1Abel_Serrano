package com.example.alumnedam.examenm8uf1abel_serrano.model;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class Pregunta {
    String enunciat;
    double resultat;

    public Pregunta(String enunciat, double resultat) {
        this.enunciat = enunciat;
        this.resultat = resultat;
    }

    public String getEnunciat() {
        return enunciat;
    }

    public double getResultat() {
        return resultat;
    }
}
