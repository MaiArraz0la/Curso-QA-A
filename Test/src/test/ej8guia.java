
package test;

import java.util.Scanner;

public class ej8guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       //int nota = leer.nextInt();
      
       /*while (nota <= 0 || nota>=10){
            System.out.println("nota incorrecta");
       nota= leer.nextInt();
       }*/
       
       /*ej 9
        int i=0, suma=0, num;
       
       do {
        System.out.println("Ingresa el número cero"); 
        num = leer.nextInt();
        i = i+1;
           if (num>0) {
               suma= suma + num;
           }
        
       } while (num != 0 && i<20);
       
       
       
        if (num == 0) {
            System.out.println("Se capturó el número cero");
            System.out.println("La suma es = " + suma);
        }
        */
       //ej 10
       //;
       System.out.println("Ingresa 4 números");
        for (int i = 0; i < 4; i++) {
            
            int num = leer.nextInt();
            if (num>= 1 && num<=20){
               System.out.print(num + " "); 
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
              System.out.println("");  
            }
            
        }
 
       
       
    }
    
}
