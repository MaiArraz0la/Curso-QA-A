
package introJava;

import java.util.Scanner;

public class ej3FraseMayusc 
{
    public static void main(String[] args) 
    {
     
     Scanner leer = new Scanner(System.in);
        String tuFrase;
        
        System.out.println ("Ingresa una frase");
        tuFrase = leer.nextLine();
        System.out.println ("Mira tu frase en mayúculas y en minúsuculas");
        System.out.println(tuFrase.toUpperCase());
        System.out.println(tuFrase.toLowerCase());
    }
    
}
