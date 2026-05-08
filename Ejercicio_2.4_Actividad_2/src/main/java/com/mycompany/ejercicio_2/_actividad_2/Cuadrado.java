/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author User
 */
public class Cuadrado {
    
    int Lado;

    public Cuadrado(int L) {
        this.Lado = L;
    }
    
    public int getLado() {
        return Lado;
    }
    
    public void setLado(int Lado) {
        this.Lado = Lado;
    }
    
    public int Area() {
        return (Lado*Lado);
    }
    
    public int Perimetro() {
        return (4*Lado);
    }
    
}
