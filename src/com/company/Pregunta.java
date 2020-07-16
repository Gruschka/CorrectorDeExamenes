package com.company;

public abstract class Pregunta {
    private String cuerpo;
    protected float peso;


    Pregunta(String cuerpo, float peso){
        this.cuerpo = cuerpo;
        this.peso = peso;
    }

    public abstract Boolean estaAprobada();
    public abstract void resolver();

    public float corregir(){
        return this.estaAprobada()? this.peso : 0;
    }
    public float getPeso() {
        return peso;
    }


}
