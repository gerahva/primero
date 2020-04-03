package gera.primero;

public class Dependientesgmm {

    private String nombredep;
    private String apellpat;
    private String apellmat;
    private int edad;

    public Dependientesgmm (){

    }
    public Dependientesgmm (String nombredep,String apellpat, String apellmat, int edad){
        this.nombredep = nombredep;
        this.apellpat = apellpat;
        this.apellmat = apellmat;
        this.edad = edad;

    }
    public String getNombredep() {return nombredep; }
    public void setNombredep( String nombredep) { this.nombredep = nombredep; }

    public String getApellpat() {return apellpat; }
    public void setApellpat( String apellpat) { this.apellpat = apellpat; }

    public String getApellmat() { return  apellmat; }
    public void setApellmat() { this.apellmat = apellmat; }

    public int getEdad() { return  edad; }
    public void setEdad() { this.edad = edad; }
}
