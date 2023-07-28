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
public class Circunferencia {
   private double radio;
   
//Este es el constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //Esto es una SOBRECARGA del constructo, es decir 2 constructores con distintos parámetros
    public Circunferencia (){
    }
   
    //métodos Get y Set
    public double GetRadio(){
        return radio;
    }
    public void SetRadio(double radio) {
        this.radio=radio;
    }
    
    //Método Crear cirdunf para guardar el radio
    public void CrearCircunferencia(double radio){
        this.radio = radio;
    }
    //Método para calc el área
    public double CalcArea(){
        double area;
        area=Math.PI*Math.pow(radio,2);
        return area;
    }
    
    //Método perímetro
    public double CalcPerimetro(){
        double perimetro;
        perimetro=Math.PI*radio*2;
        return perimetro;
    }
    
    
}
