/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gera.primero;

/**
 *
 * @author humbe
 */
public class Tarjetaexamen {
  
  
    private String nombre;
    private Integer nip;
    private float saldo;
    
   public Tarjetaexamen(){
       
       
   }

    public Tarjetaexamen(String nombre, Integer nip, float saldo) {
        this.nombre = nombre;
        this.nip = nip;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNip() {
        return nip;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}

