/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author User
 */
public class Ejercicio_23_Actividad_2 {

    public static void main(String[] args) {
        Automovil Auto1 = new Automovil("Ford",2018,3,Automovil.Tipo_Gasolina.DIESEL,Automovil.Tipo_Automovil.EJECUTIVO,5,6,250,Automovil.Tipo_Color.NEGRO,0);
        System.out.println(Auto1);
        Auto1.setVelocidad_Actual(100);
        System.out.println("Velocidad Actual = "+Auto1.getVelocidad_Actual());
        Auto1.Acelerar(20);
        System.out.println("Velocidad Actual = "+Auto1.getVelocidad_Actual());
        Auto1.Desacelerar(50);
        System.out.println("Velocidad Actual = "+Auto1.getVelocidad_Actual());
        Auto1.Frenar();
        System.out.println("Velocidad Actual = "+Auto1.getVelocidad_Actual());
        Auto1.Desacelerar(20);
    }
}
