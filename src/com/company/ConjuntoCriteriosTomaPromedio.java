package com.company;

import com.company.CriterioCalculoNota;
import com.company.Examen;

import java.util.List;

public class ConjuntoCriteriosTomaPromedio implements CriterioCalculoNota {

    private List<CriterioCalculoNota> criterios;

    @Override
    public float calcularNota(Examen examen) {
        float acc = 0;

        for(CriterioCalculoNota criterio: criterios){
            acc += criterio.calcularNota(examen);
        }
        return acc / criterios.size();
    }
}
