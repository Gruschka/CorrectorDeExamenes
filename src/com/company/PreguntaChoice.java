package com.company;

public class PreguntaChoice extends Pregunta {

    private int respuestaIngresada;
    private int respuestaCorrecta;

    PreguntaChoice(String cuerpo, float peso, int respuestaCorrecta) {
        super(cuerpo, peso);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public Boolean estaAprobada() {
        return respuestaCorrecta == respuestaIngresada;
    }

    @Override
    public void resolver() {
        //sets respuestaingresada according to user input
        this.respuestaIngresada = 3; //dummy
        return;
    }

}
