/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author invitado
 */
public class Prueba {
    String nombre;
    String carrera;
    int semestre;

    public Prueba(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return "\nEl nombre es: "+nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return "\nLa carrera es: "+carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return "\nEl semestre es: "+semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
   
}
