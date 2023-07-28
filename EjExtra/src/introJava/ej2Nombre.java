
package introJava;

import java.util.Scanner;

public class ej2Nombre 
{
    public static void main(String[] args) 
    {
     Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println ("Ingresa tu nombre");
        nombre = leer.nextLine();
        System.out.println("Hola " + nombre);
    }
    
}
