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
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifica la peli");
        opinion = leer.nextInt();
        
        if (opinion >=1 && opinion <=5){
        switch (opinion){
            case 1:
            case 2:
                System.out.println("Q mal");
                break;
            case 3:
                System.out.println("Buena");
                break;
            case 4: 
                System.out.println("muy buena");
                break;
            case 5:
                System.out.println("Excelente");
                break;
    }
        
    }
        else if (opinion <0){
            System.out.println("negativo?");
            
        }
}
}
