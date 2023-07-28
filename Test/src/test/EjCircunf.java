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
public class EjCircunf {

public class Circunferencia {
    private double radio = 2;
    public int area;
    
    public Circunferencia(){};
    
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    public double getCircunferencia (){
         return this.radio;
    }
    
     public double getArea (){
         return 3.14 *(this.radio * this.radio);
     }
     
     public double getPerimetro (){
         return 2 * 3.14 * this.radio;
     }

}
//package pooej2final;


//public class POOej2final {

    
   /* public static void main(String[] args) {
        Circunferencia circun1 = crearCircunferencia(2.33);
        
        System.out.println(circun1.getArea());
        System.out.println(circun1.getPerimetro());
        

    }
    
 //  public static Circunferencia crearCircunferencia(Double radio) {
   //     return new Circunferencia(radio);
    }*/
    
    
    
}
