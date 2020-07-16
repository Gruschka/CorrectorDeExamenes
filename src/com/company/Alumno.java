package com.company;

public class Alumno {

    private String nombre;

    public ResultadoExamen resolverExamen(Examen unExamen){
        unExamen.responderPreguntas();
        float nota = unExamen.obtenerResultado();
        ResultadoExamen resultado = new ResultadoExamen(unExamen,this, nota);
        return resultado;
    }

}
