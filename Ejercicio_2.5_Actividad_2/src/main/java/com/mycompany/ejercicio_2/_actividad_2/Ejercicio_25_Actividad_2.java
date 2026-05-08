/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author User
 */
public class Ejercicio_25_Actividad_2 {

    public static void main(String[] args) {
        CuentaBancaria Cuenta1 = new CuentaBancaria("Pedro","Jaramillo",123456789,CuentaBancaria.Tipo.Ahorros);
        Cuenta1.Imprimir();
        Cuenta1.Consignar(200000);
        Cuenta1.Consignar(300000);
        Cuenta1.Retirar(400000);
    }
}
