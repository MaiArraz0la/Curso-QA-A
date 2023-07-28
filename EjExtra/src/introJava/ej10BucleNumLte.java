
  package introJava;

import java.util.Scanner;

public class ej10BucleNumLte 
{

    public static void main(String[] args) 
    {
      Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println ("Ingresa el límite");
        n = leer.nextInt(); 
        int suma = 0;
        int num;
        do 
        {            
        //System.out.println ("Ingresa un número");
        num = leer.nextInt();
        suma= suma + num;    
        } while (suma < n);
                  
        System.out.println("Llegaste al límite: " +suma);
    }
    
}
