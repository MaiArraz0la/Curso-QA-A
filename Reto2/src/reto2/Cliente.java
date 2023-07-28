/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author Usuario
 */
public class Cliente {
    // Atributos
    private int id;
    private String nombre;
    private int edad;
    private int altura;
    private int peso;
    
    // Getters y Setters
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // Geters y Setters
    public int GetId(){
        return this.id;
    }
    
    public void SetId(int id){
        this.id = id;
    }

    public void SetNombre(String dato){
        this.nombre = dato;
    }

    public String GetNombre(){
        return this.nombre;
    }
    
    public void SetEdad(int edad){
        this.edad = edad;
    }
    
    public int GetEdad()
    {
        return this.edad;
    }
}
