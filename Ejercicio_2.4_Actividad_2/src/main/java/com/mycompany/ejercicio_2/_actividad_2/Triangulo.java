package com.mycompany.ejercicio_2._actividad_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Triangulo {
    
    int Base;
    int Altura;
    
    public Triangulo(int b, int h) {
        
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
    
    public double Area() {
        return (Base*Altura/2);
    }
    
    public double Perimetro() {
        return (Base+Altura+Hipotenusa());
    }
    
    public double Hipotenusa() {
        return Math.pow(Altura*Altura+Base*Base,0.5);
    }
    
    public void TipoTriangulo() {
        if ((Base == Altura) && (Base == Hipotenusa())) {
            System.out.println("Es un triangulo equilatero");
        } else if ((Base != Altura) && (Base != Hipotenusa()) && (Hipotenusa() != Altura)) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isosceles");
        }
        
    }
    
}
