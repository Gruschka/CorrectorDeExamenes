package com.company;

public class PreguntaVoF extends Pregunta{

    private Boolean respuestaIngresada;
    private Boolean respuestaCorrecta;

    PreguntaVoF(String cuerpo, float peso, Boolean respuestaCorrecta) {
        super(cuerpo, peso);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public Boolean estaAprobada() {
        return respuestaIngresada == respuestaCorrecta;
    }

    @Override
    public void resolver() {
        //sets respuestaingresada according to user input
        this.respuestaIngresada = true; //dummy
        return;
    }

    public void responder(Boolean rta){
        this.respuestaIngresada = rta;
    }

}
