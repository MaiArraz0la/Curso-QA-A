
package introJava;

import java.util.Scanner;

public class ej6ParImpar 
{
    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in);
        int num;
        System.out.println ("Ingresa el número");
        num = leer.nextInt();
        
            if (num%2 == 0) 
            {
                System.out.println("El número es par");
            }
            else 
            {
                System.out.println("El número es impar");
            }
        
    }
    
}
