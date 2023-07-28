/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           
           int tipoMotor = leer.nextInt();
           switch (tipoMotor) {
               case 1:
                   System.out.println("Bomba de agua");
                   break;
               case 2:
                   System.out.println("Bomba de gasolina");
                   break;
               case 3:
                   System.out.println("Bomba de hormigón");
                   break;
                case 4:
                   System.out.println("Bomba de pasta");
                   break;
                 default:
                     System.out.println("No existe un vlaor válido para tipo de bomba");
           }
    }
    
}
