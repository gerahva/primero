/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gera.primero;

import org.springframework.data.annotation.Id;

/**
 *
 * @author otros
 */
public class Usuario {
    
    @Id
    private int numero;
    private String nombre;
    private String ocupacion;
    
   public Usuario(){
       
   }

    public Usuario(int numero, String nombre, String ocupacion) {
        this.numero = numero;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
}
