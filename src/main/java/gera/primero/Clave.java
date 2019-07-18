package gera.primero;

import org.springframework.data.annotation.Id;

public class Clave {

   @Id
   String token;
   String nip;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    String nombre;


    public Clave() {
    }

    @Override
    public String toString() {
        return "Clave{" +
                "token='" + token + '\'' +
                ", nip=" + nip +
                ", name='" + nombre + '\'' +
                '}';
    }

    public Clave(String token, String nip, String nombre) {
        this.token = token;
        this.nip = nip;
        this.nombre = nombre;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}