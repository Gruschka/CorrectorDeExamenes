package com.company;

import java.util.List;

public class ConjuntoCriteriosTomaMayorNota implements CriterioCalculoNota{

    private List<CriterioCalculoNota> criterios;

    @Override
    public float calcularNota(Examen examen) {
        float notaMayor = 0;

        for(CriterioCalculoNota criterio: criterios){
            if(criterio.calcularNota(examen) > notaMayor){
                notaMayor = criterio.calcularNota(examen);
            }
        }
        return notaMayor;
    }
}
