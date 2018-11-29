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
    private int ident;
    private String nombre;
    private String mail;
    
   public Cliente(){
       
   }
   public Cliente(int ident, String nombre, String mail) {
        this.ident = ident;
        this.nombre = nombre;
        this.mail = mail;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
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
}


    