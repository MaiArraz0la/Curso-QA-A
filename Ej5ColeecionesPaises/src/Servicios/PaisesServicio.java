
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class PaisesServicio {
    HashSet<String> paises = new HashSet<>();//Así se crea un CONJUNTO, Con HashSet, parece que se puede poner con <>
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     public void crearPais()
    {
    String rta = "";
    do {
        System.out.println("Digita el país");
        paises.add(leer.next());
        System.out.println("¿Deseas ingresar otro país? S/N");
        rta = leer.next();
        } while (rta.equalsIgnoreCase("S"));
        mostrar();
    }
     
     
     public void ordenarPaises(){
         //Para ordenar el CONJUNTO con sort hayq  convertirlo a Lista
         ArrayList <String> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises);
        mostrar();
    }
     
     public void eliminar(){
         System.out.println("Digita el país que vas a eliminar");
        String paisBuscado = leer.next();
         Iterator <String> busca = paises.iterator();
         boolean bandera = false;
         while (busca.hasNext()) {
             String next = busca.next();
             if (next.equalsIgnoreCase(paisBuscado)) {
                 busca.remove();
                 bandera = true;
                 break;
             }   
         }
         if (!bandera){
             System.out.println("El país no se encontró en el conjunto");
         }
            
     }
     
     
     
     public void mostrar (){
     for (String pais : paises) {
         System.out.println(pais);
        }
     }
}

