
package introJava;

import java.util.Scanner;

public class ej7Eureka 
{

    public static void main(String[] args) 
    {
     Scanner leer = new Scanner(System.in);
        String palabra;
        
        System.out.println ("Ingresa la palabra");
        palabra = leer.nextLine();
        if (palabra.equals("Eureka"))
        {
            System.out.println("Correcto ");
        }
        else
        {
            System.out.println("Incorrecto ");
        }
    }
    
}
