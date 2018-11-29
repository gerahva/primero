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
public class Direccion {
     @Id
    private String calle;
    private int cp;
    private String municipio;
    
   public Direccion(){
       
       
   }

    public Direccion(String calle, int cp, String municipio) {
        this.calle = calle;
        this.cp = cp;
        this.municipio = municipio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
