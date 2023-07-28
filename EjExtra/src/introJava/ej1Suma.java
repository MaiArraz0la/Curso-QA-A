
package introJava;

import java.util.Scanner;


public class ej1Suma 
{
    public static void main(String[] args) 
    {
    Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        System.out.println ("Ingresa el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo número");
        num2 = leer.nextInt();
        suma = num1+num2;
        System.out.println("La suma es: " + suma);
    }
}