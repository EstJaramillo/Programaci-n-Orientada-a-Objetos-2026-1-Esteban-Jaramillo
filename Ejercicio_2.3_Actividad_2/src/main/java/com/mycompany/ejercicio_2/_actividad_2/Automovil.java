/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author User
 */
public class Automovil {
    
    String Marca;
    int Modelo;
    int Motor;
    enum Tipo_Gasolina{GASOLINA,BIOETANOL,DIESEL,BIODISESEL,GAS_NATURAL}
    Tipo_Gasolina TipoG;
    enum Tipo_Automovil{GCIUDAD,SUBCOMPACTO,COMPACTO,FAMILIAR,EJECUTIVO,SUV}
    Tipo_Automovil TipoA;
    int Puertas;
    int Asientos;
    int Velocidad_Max;
    enum Tipo_Color{BLANCO,NEGRO,ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA}
    Tipo_Color TipoC;
    
    int Velocidad_Actual = 0;
    
    public Automovil(String Ma, int Mod, int Mot, Tipo_Gasolina G, Tipo_Automovil Au, int P, int As, int Vm, Tipo_Color C, int Va) {
        this.Marca = Ma;
        this.Modelo = Mod;
        this.Motor = Mot;
        this.TipoG = G;
        this.TipoA = Au;
        this.Puertas = P;
        this.Asientos = As;
        this.Velocidad_Max = Vm;
        this.TipoC = C;
        this.Velocidad_Actual = Va;
        
    }
    
    public String getMarca() {
        return Marca;
    }
        
    public void setMarca (String Marca) {
        this.Marca = Marca;
    }
    
    public int getModelo() {
        return Modelo;
    }
    
    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }
    
    public Tipo_Gasolina getTipoG() {
        return TipoG;
    }
    
    public void setTipoG(Tipo_Gasolina TipoG) {
        this.TipoG = TipoG;
        
    }
    
    public Tipo_Automovil getTipoA() {
        return TipoA;
    }
    
    public void setTipoG(Tipo_Automovil TipoA) {
        this.TipoA = TipoA;
        
    }
    
    public int getPuertas() {
        return Puertas;
    }
    
    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }
    
    public int getAsientos() {
        return Asientos;
    }
    
    public void setAsientos(int Asientos) {
        this.Asientos = Asientos;
    }
    
    public int getVelocidad_Max() {
        return Velocidad_Max;
    }
    
    public void setVelocidad_Max(int Velocidad_Max) {
        this.Velocidad_Max = Velocidad_Max;
    }
    
    public Tipo_Color getTipoC() {
        return TipoC;
    }
    
    public void setTipoC(Tipo_Color TipoC) {
        this.TipoC = TipoC;
        
    }
    public int getVelocidad_Actual() {
        return Velocidad_Actual;
    }
    
    public void setVelocidad_Actual(int Velocidad_Actual) {
        this.Velocidad_Actual = Velocidad_Actual;
    }
    
    public void Acelerar(int Incremento_Velocidad) {
        if (Velocidad_Actual + Incremento_Velocidad < Velocidad_Max) {
            
            Velocidad_Actual = Velocidad_Actual + Incremento_Velocidad;
            
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }
    
    public void Desacelerar(int Decremento_Velocidad)   {
        if (Velocidad_Actual - Decremento_Velocidad > 0) {
            
            Velocidad_Actual = Velocidad_Actual - Decremento_Velocidad;
            
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    
    public void Frenar () {
        Velocidad_Actual = 0;
    }
    public double Tiempo_Llegada(int Distancia) {
        
        return Distancia/Velocidad_Actual;
        
    }
    
@Override
public String toString() {
    return String.format("Marca = %s\nModelo = %d\nMotor = %d\nTipo de combustible = %s\nTipo de automovil = %s\nNumero de puertas = %d\nCantidad de asientos = %d\nVelocidad maxima %d\nColor = %s\n",
                        Marca,Modelo,Motor,TipoC,TipoA,Puertas,Asientos,Velocidad_Max,TipoC);
}
}
    

