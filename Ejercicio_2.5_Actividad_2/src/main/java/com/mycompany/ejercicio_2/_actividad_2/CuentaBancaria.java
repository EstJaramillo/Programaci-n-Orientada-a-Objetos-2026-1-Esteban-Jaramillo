/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author User
 */
public class CuentaBancaria {
    
    String Nombre;
    String Apellido;
    int Numero;
    enum Tipo {Ahorros,Corriente}
    Tipo TipoCuenta;
    float Saldo = 0;
    
    public CuentaBancaria(String No, String A, int Nm, Tipo T) {
        
        this.Nombre = No;
        this.Apellido = A;
        this.Numero = Nm;
        this.TipoCuenta = T;
        
    }
    
    public void Imprimir() {
        System.out.println("Nombres del titular = " + Nombre);
        System.out.println("Apellidos del titular = " + Apellido);
        System.out.println("Numero de cuenta = " + Numero);
        System.out.println("Tipo de cuenta = " + TipoCuenta);
        System.out.println("Saldo = " + Saldo);
    }
    
    public void ConsultarSaldo() {
        System.out.println("El saldo actual es = " + Saldo);
    }
    
    public boolean Consignar(int Valor) {
        if (Valor > 0) {
            Saldo = Saldo + Valor;
            System.out.println("Se ha consignado $" + Valor + "en la cuenta. El nuevo saldo es $" + Saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }
    
    public boolean Retirar(int Valor) {
        if ((Valor <= Saldo) && (Valor > 0)) {
            Saldo = Saldo-Valor;
            System.out.println("Se ha retirado $" + Valor + "de la cuenta. El nuevo saldo es $" + Saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual");
            return false;
        }
    }
}
