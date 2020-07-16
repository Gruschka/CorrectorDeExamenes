package com.company;

import java.util.ArrayList;
import java.util.List;

public class Examen {

    //Attributes
    private List<Pregunta> preguntas = new ArrayList<>();
    private int notaMinima;
    private CriterioCalculoNota criterioCorreccion;

    Examen(int notaMinima, List<Pregunta> preguntas){
        this.notaMinima = notaMinima;
        this.preguntas = preguntas;
    }

    //Abro la posibilidad de inyectarle el criterio por constructor
    Examen(int notaMinima, List<Pregunta> preguntas, CriterioCalculoNota criterio){
        this.notaMinima = notaMinima;
        this.preguntas = preguntas;
        this.criterioCorreccion = criterio;
    }

    //Methods
    public void responderPreguntas(){
        for(Pregunta pregunta: this.preguntas){
            pregunta.resolver();
        }
    }

    //El examen le delega a su criterio el calculo de la nota
    public float obtenerResultado(){
        return criterioCorreccion.calcularNota(this);
    }

    public void agregarPreguntas(Pregunta unaPregunta){
        this.preguntas.add(unaPregunta);
    }

    //Utils
    public float puntosTotales(){
        float acc = 0;
        for(Pregunta pregunta: this.preguntas){
            acc += pregunta.getPeso();
        }
        return acc;
    }

    public float puntosAlumno(){
        float acc = 0;
        for(Pregunta pregunta: this.preguntas){
            acc += pregunta.corregir();
        }
        return acc;
    }


    //GETTERS
    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public int getNotaMinima() {
        return notaMinima;
    }

}
