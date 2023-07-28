
package introJava;

import java.util.Scanner;

public class ej4TempF 
{

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        double tempC;
        double tempF;
        System.out.println ("Ingresa la temperatura en °C");
        tempC = leer.nextDouble();
        tempF= 32+(tempC*9/5);
        System.out.println ("La temperatura en °F es: " + tempF);
    }
    
}
