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
public class Cliente {

    
    @Id
    private Integer ident;
    private String nombre;
    private String mail;
    private Direccion direccion;
    
   public Cliente(){
       
   }

    public Cliente(Integer ident, String nombre, String mail, Direccion direccion) {
        this.ident = ident;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(Integer ident) {
        this.ident = ident;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}


    