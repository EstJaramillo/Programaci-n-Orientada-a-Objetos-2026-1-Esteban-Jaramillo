/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author User
 */
public class Rectangulo {
    
    int Base;
    int Altura;
    
    public Rectangulo(int b, int h) {
        
        this.Base = b;
        this.Altura = h;
    }
    
    public int getBase() {
        return Base;
    }
    
    public void setBase(int Base) {
        this.Base = Base;
    }
    
    public int getAltura() {
        return Altura;
    }
    
    public void setAltura(int Altura) {
        this.Altura = Altura;
    }
        
    
    public int Area()   {
        return Base*Altura;
    }
    
    public int Perimetro()  {
        return (2*Base)+(2*Altura);
    }
}
