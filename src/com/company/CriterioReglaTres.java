package com.company;

public class CriterioReglaTres implements CriterioCalculoNota{

    @Override
    public float calcularNota(Examen examen) {
        return (examen.puntosAlumno() * 10) / examen.puntosTotales();
    }
}
