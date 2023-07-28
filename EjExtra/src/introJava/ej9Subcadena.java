
package introJava;

import java.util.Scanner;


public class ej9Subcadena 
{

    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String palabra;
        
        System.out.println ("Ingresa una palabra");
        
        palabra = leer.nextLine();
        
        //String primeraLetra = palabra.substring(0,1); USÉ ESTO PARA DEBUGGEAR PASO A PASO
        
        //boolean resulttado = "A".equals(primeraLetra);
        
        if ("A".equals(palabra.substring(0,1))) 
        {
            System.out.println ("Correcto");
        }
        else
        {
            System.out.println ("Incorrecto");
        }
    }
    
}
