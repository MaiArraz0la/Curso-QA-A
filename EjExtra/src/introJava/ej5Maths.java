
package introJava;

import java.util.Scanner;

public class ej5Maths 
{

    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in);
        int num1;
        
        System.out.println ("Ingresa el número");
        num1 = leer.nextInt();
        int doble= num1*2;
        int triple=num1*3;
        double raiz = Math.sqrt(num1);
        System.out.println ("El doble es: "+ doble);
        System.out.println ("El triple es: "+ triple);
        System.out.println ("La raíz cuadrada es: "+ raiz);
        
    }
    
}
