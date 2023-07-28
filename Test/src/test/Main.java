/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Para instanciar un objeto de la clase circunferencia
        Circunferencia circunf=new Circunferencia();
        circunf.SetRadio(3);
        double area = circunf.CalcArea();
        System.out.println("El área es: "+ area);
    }
    
}
