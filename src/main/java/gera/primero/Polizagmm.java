package gera.primero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Polizagmm {

    @Id
    private Integer identif;
    private String nombre;
    private String rfc;
    private String ciudad;
    private String municipio;
    private String estado;

    public Polizagmm() {
    }

    public void setIdentif(Integer identif) {
        this.identif = identif;
    }

    public Dependientesgmm getDependientesgmm() {
        return dependientesgmm;
    }

    public void setDependientesgmm(Dependientesgmm dependientesgmm) {
        this.dependientesgmm = dependientesgmm;
    }

    private Dependientesgmm dependientesgmm;

    public Polizagmm ( int identif, String nombre, String rfc, String ciudad, String municipio, String estado){

        this.identif= identif;
        this.nombre= nombre;
        this.rfc= rfc;
        this.ciudad= ciudad;
        this.municipio= municipio;
        this.estado= estado;
    }
    public int getIdentif() { return identif; }
    public void setIdentif( int identif) {this.identif= identif; }

    public String getNombre() { return nombre; }
    public  void setNombre ( String nombre) { this.nombre= nombre; }

    public String getRfc() { return rfc; }
    public void setRfc( String rfc ) { this.rfc= nombre; }

    public String getCiudad() { return rfc; }
    public void setCiudad ( String ciudad ) { this.ciudad= ciudad; }

    public String getMunicipio() { return municipio; }
    public void setMunicipio ( String municipio ) {this.municipio= municipio; }

    public String getEstado() { return estado; }
    public void setEstado ( String estado ) { this.estado= estado; }
}
