/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author ASUS
 */
public class Planeta {
    String Nombre = null;
    int Cantidad_satelites = 0;
    double Masa = 0;
    double Volumen = 0;
    int Diametro = 0;
    int distancia_al_sol = 0;
    enum Tipo_Planeta{GASEOSO,TERRESTRE,ENANO}
    Tipo_Planeta Tipo;
    boolean Observable = false;
    
    double UA = 149597870; 

    public Planeta(String N, int C, double M,double V, int D, int DS, Tipo_Planeta T,Boolean O){
        this.Nombre = N;
        this.Cantidad_satelites = C;
        this.Masa = M;
        this.Volumen = V;
        this.Diametro = D;
        this.distancia_al_sol = DS;
        this.Tipo = T;
        this.Observable = O;
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad_satelites() {
        return Cantidad_satelites;
    }

    public void setCantidad_satelites(int Cantidad_satelites) {
        this.Cantidad_satelites = Cantidad_satelites;
    }

    public double getMasa() {
        return Masa;
    }

    public void setMasa(double Masa) {
        this.Masa = Masa;
    }
    
    public final void setVolumen(double Volumen){
        this.Volumen = Volumen;
    }
    
    public double getVolumen(){
        return Volumen;
    }

    public int getDiametro() {
        return Diametro;
    }

    public void setDiametro(int Diametro) {
        this.Diametro = Diametro;
    }

    public int getDistancia_al_sol() {
        return distancia_al_sol;
    }

    public void setDistancia_al_sol(int distancia_al_sol) {
        this.distancia_al_sol = distancia_al_sol;
    }

    public Tipo_Planeta getTipo() {
        return Tipo;
    }

    public void setTipo(Tipo_Planeta Tipo) {
        this.Tipo = Tipo;
    }

    public boolean getObservable() {
        return Observable;
    }

    public final void setObservable(Boolean Observable) {
        this.Observable = Observable;
    }
    
    public double Calcular_Densidad(){
        return(Masa/Volumen);
    }

    public Boolean Es_Planeta_Exterior(){
        if (((this.distancia_al_sol * 1000000)/this.UA) > 3.4)
            return true;
        else {
            return false;
        }
    
    }
    
@Override
public String toString(){
    return String.format ("Nombre del planeta = %s\nCantidad de satelites = %d\nmasa del planeta = %f\nvolumen del planeta = %f\ndiametro del planeta = %d\ndistancia al sol = %d\ntipo del planeta = %s\nEs observable = %b\ndensidad del planeta = %f\nes planeta exterior = %b\n",
                            Nombre, Cantidad_satelites, Masa, Volumen, Diametro, distancia_al_sol, Tipo, Observable, Calcular_Densidad(), Es_Planeta_Exterior());

}
}
