
package ej5coleecionespaises;

import Servicios.PaisesServicio;


public class Ej5ColeecionesPaises {

    
    public static void main(String[] args) {
        PaisesServicio objetoATraer = new PaisesServicio();
        objetoATraer.crearPais();
        System.out.println("los paises ordenados son");
        objetoATraer.ordenarPaises();
        objetoATraer.eliminar();
        System.out.println("la lista actualizada es: ");
        objetoATraer.mostrar();
    }
    
}
