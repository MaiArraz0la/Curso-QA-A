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
public class Ej1MalO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
/*String nombre;
Scanner leer = new Scanner(System.in);
nombre = leer.next();
boolean aviso;
//aviso = leer.nextBoolean();//
char charT;
charT = leer.next().charAt(0);
int edad = 32;
long circunf = 12650;
float num = 3.00f;
double desp;
desp = leer.nextDouble();

int numero = 48;
double decimales = 3.55;
boolean bandera = false;
        
    System.out.println (nombre);
    System.out.println(edad);
  
    
   System.out.println("Ingresa tu edad");
String name = leer.nextLine();

System.out.println("Ingresa tu nombre");
int age = leer.nextInt();*/
   
int num1 = leer.nextInt();
int num2 = leer.nextInt();

        if ((num1>25) && (num2>25)){
            System.out.println("Los números son mayores");
        } else if ((num1>25) || (num2>25)){
                System.out.println("Solo uno es mayor");
        }else {System.out.println("Ninguno es mayor");
                
                }


}
}

