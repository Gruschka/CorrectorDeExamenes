package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Alumno> alumnos = new ArrayList<>();
    private List<ResultadoExamen> resultados = new ArrayList<>();
    private List<Examen> examenes = new ArrayList<>();


    /*La idea es que se pueda 'crear' un examen 'original' como haria un profesor en la vida real
    y despues a cada alumno le entregue su 'copia' (o instancia) correspondiente para que puedan dejar sus
    respuestas dentro de cada examen
     */
    public void tomarExamen(Examen unExamen){

        for(Alumno alumno: alumnos){
            Examen examenARendir = new Examen(unExamen.getNotaMinima(), unExamen.getPreguntas());
            ResultadoExamen res = alumno.resolverExamen(examenARendir);
            resultados.add(res);
        }

    }

    /*
    La clase curso abre la posibilidad de instanciar un Examen, al cual se le pueden agregarPreguntas()
    y son almacenados en la lista de examenes del curso, para luego pasar una de esas instancias a
    tomarExamen
     */

    public void crearExamen(){
        Examen examenPorTomar = new Examen(4, null) ;//dummy



    }



}
