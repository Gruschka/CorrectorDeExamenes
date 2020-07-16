package com.company;

public class PreguntaConcreta extends Pregunta {

    private String respuestaIngresada;
    private String respuestaCorrecta;

    PreguntaConcreta(String cuerpo, float peso, String respuestaCorrecta) {
        super(cuerpo, peso);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public Boolean estaAprobada() {
        return respuestaCorrecta.contains(respuestaIngresada);
    }

    @Override
    public void resolver() {
        //sets respuestaingresada according to user input
        this.respuestaIngresada = "respuesta"; //dummy
        return;
    }
}
