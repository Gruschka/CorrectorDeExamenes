package com.company;

public class CriterioConversion implements CriterioCalculoNota{


    @Override
    public float calcularNota(Examen examen) {
       if(examen.puntosAlumno() >= 16){
           return 10;
       }
        if(examen.puntosAlumno() >= 15){
            return 8;
        }
        if(examen.puntosAlumno() >= 14){
            return 6;
        }
        if(examen.puntosAlumno() >= 13){
            return 4;
        }
        return 2;
    }
}
