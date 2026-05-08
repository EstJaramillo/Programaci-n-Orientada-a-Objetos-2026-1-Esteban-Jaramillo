/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author User
 */
public class Circulo {
    
    int Radio;
    
    public Circulo(int R) {
        this.Radio = R;
    }
    
    public int getRadio() {
        return Radio;
    }
    
    public void setRadio(int Radio) {
        this.Radio = Radio;
    }
    
    public double Area() {
        return Math.PI*Math.pow(Radio,2);
    }
    
    public double Perimetro() {
        return 2*Math.PI*Radio;
    }
    
}
