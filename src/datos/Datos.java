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
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prueba info = new Prueba("Yahir Gerardo Quezada Romero", "Ingenieria en sistemas computacionales", 2);
        String NumCon = info.getNombre()+" "+info.getCarrera()+" "+info.getSemestre();
        System.out.println("\nDatos generales alumno(a): "+NumCon);
                
    }
    
}
