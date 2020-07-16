package com.company;

public class CriterioRestaN implements CriterioCalculoNota{

    private float n;

    CriterioRestaN(float n){
        this.n = n;
    }

    @Override
    public float calcularNota(Examen examen) {
        return examen.puntosAlumno() - this.n;
    }
}
