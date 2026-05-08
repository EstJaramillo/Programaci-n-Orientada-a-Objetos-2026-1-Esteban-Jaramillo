/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2._actividad_2;

/**
 *
 * @author ASUS
 */
public class Persona {
    String Nombre;
    String Apellido;
    String Documento;
    int Año_Nacimiento;
    String Pais_Origen;
    char sexo;
    
    public Persona(String N,String A,String D,int Año, String P, char s){
    
        this.Nombre = N;
        this.Apellido = A;
        this.Documento = D;
        this.Año_Nacimiento = Año;
        this.Pais_Origen = P;
        setSexo(s);
    
    }

    public String getPais_Origen() {
        return Pais_Origen;
    }

    public void setPais_Origen(String Pais_Origen) {
        this.Pais_Origen = Pais_Origen;
    }

    public char getSexo() {
        return sexo;
    }

    public final void setSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M'){
            this.sexo = sexo;
        }
        else{
            this.sexo = 'N';
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public int getAño_Nacimiento() {
        return Año_Nacimiento;
    }

    public void setAño_Nacimiento(int Año_Nacimiento) {
        this.Año_Nacimiento = Año_Nacimiento;
    }
    
    
    @Override
    public String toString(){
        return String.format("Nombre: %s\nApellido: %s\nDocumento: %s\nAño de nacimiento: %d\nPais de origen: %s\nSexo: %c\n", 
                            Nombre,Apellido,Documento,Año_Nacimiento,Pais_Origen,sexo);
    }
}
