
package introJava;

import java.util.Scanner;

public class ej8LargoFrases {

    public static void main(String[] args) 
    {
      Scanner leer = new Scanner(System.in);
        String tuFrase;
        
        System.out.println ("Ingresa una frase");
        tuFrase = leer.nextLine();
        if (tuFrase.length()== 8) 
        {
            System.out.println ("Correcto");
        }
        else
        {
        System.out.println ("Incorrecto");
        }
        
    }
    
}
