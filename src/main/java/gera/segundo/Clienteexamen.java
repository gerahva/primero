/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gera.segundo;
import org.springframework.data.annotation.Id;

/**
 *
 * @author humbe
 */
public class Clienteexamen {
    
    public class Cliente {

    
    @Id
    private Integer id;
    private String nombre;
    private float sueldo_base;
    private Tarjetaexamen tarjeta;
    
   public Cliente(){
       
   }

    public Cliente(Integer id, String nombre, Float sueldo_base, Tarjetaexamen tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo_base = sueldo_base;
        this.tarjeta = tarjeta;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(Float sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public Tarjetaexamen getTarjetaexamen() {
        return tarjeta;
    }

    public void setTarjetaexamen(Tarjetaexamen tarjeta) {
        this.tarjeta = tarjeta;
    }
}
    
}
