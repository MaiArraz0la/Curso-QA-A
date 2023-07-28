
package test;

import java.util.Scanner;


public class Ej11y14Guia {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
      
        String[] equipo = new String[5];
        for (int i = 0; i < 5; i++) {
            equipo[i]=leer.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + equipo[i] + "]");
        }
        System.out.println("");
        /*String frase = leer.nextLine();
        String letra;
        
        for (int i = 0; i <frase.length(); i++) {
            letra=frase.substring(i,i+1);
            switch (letra) {
                                    
                    break;
                default:
                    throw new AssertionError();
            }
        }*/
    }
}
