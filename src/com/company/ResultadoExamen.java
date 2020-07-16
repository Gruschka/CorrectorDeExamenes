package com.company;

import java.util.ArrayList;
import java.util.List;
public class ResultadoExamen {
    private Examen examen;
    private Alumno alumno;
    private float nota;


    ResultadoExamen(Examen examen, Alumno alumno, float nota){
        this.examen = examen;
        this.alumno = alumno;
        this.nota = nota;
    }

    public Boolean estaAprobado(){
        return this.nota > this.examen.getNotaMinima();
    }
}
