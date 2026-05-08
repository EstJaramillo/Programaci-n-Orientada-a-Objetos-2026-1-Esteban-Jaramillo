/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author User
 */
public class Ejercicio_24_Actividad_2 {

    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        Triangulo figura4 = new Triangulo(3,5);
        System.out.println("El area del circulo es = " + figura1.Area());
        System.out.println("El perimetro del circulo es = " + figura1.Perimetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.Area());
        System.out.println("El perimetro del rectangulo es = " + figura2.Perimetro());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.Area());
        System.out.println("El perimetro del cuadrado es = " + figura3.Perimetro());
        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.Area());
        System.out.println("El perimetro del triangulo es = " + figura4.Perimetro());
        figura4.TipoTriangulo();
    }
}
