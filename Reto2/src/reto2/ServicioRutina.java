
package reto2;

import java.util.ArrayList;


public class ServicioRutina 
{
    //atributos
   private static ArrayList<Rutina> listaDeRutinas = new ArrayList<Rutina>(); 
   
   //CRUD
   
   //Create
   public void crearRutina(int id, String nombre, int duracion, String nivel, String descripcion)
   {
       Rutina nuevaRutina = new Rutina();
       
       //Asignamos los valores de las propiedades al objeto Cliente
       nuevaRutina.setId(id);
       nuevaRutina.setNombre(nombre);
       nuevaRutina.setDuracion(duracion);
       nuevaRutina.setNivelDificultad(nivel);
       nuevaRutina.setDescripcion(descripcion);
       
       listaDeRutinas.add(nuevaRutina);
   }
   
   // Read
   public ArrayList<Rutina> obtenerRutinas()
   {
       return listaDeRutinas;
   }
   
   // Update
   public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion)
   {
       for (int i = 0; i < listaDeRutinas.size() - 1; i++)
       {
           Rutina rutinaEnLaLista = listaDeRutinas.get(i);
           
           int identificador = rutinaEnLaLista.getId();
           
           if (identificador == id)
           {
               rutinaEnLaLista.setNombre(nombre);
               rutinaEnLaLista.setDuracion(duracion);
               rutinaEnLaLista.setNivelDificultad(nivelDificultad);
               rutinaEnLaLista.setDescripcion(descripcion);
               break;
           }
       }
   }
   
   //Delete
   public void eliminarRutina(int id)
   {
       for (int i = 0; i < listaDeRutinas.size() - 1; i++)
       {
           Rutina rutinaEnLaLista = listaDeRutinas.get(i);
           
           int identificador = rutinaEnLaLista.getId();
           
           if (identificador == id)
           {
               listaDeRutinas.remove(i);
               break;
           }
       }
   }
}
