/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gera.primero;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SegundoApplication implements CommandLineRunner{
@Autowired RepoCliente repoC;
    
	public static void main(String[] args) {
		SpringApplication.run(SegundoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
     Cliente c= new Cliente(1, "Humberto", "humbertova@hotmail.com");
     Direccion d=new Direccion("Tlanepantla", 57710, "Nezahualcoyotl");
        repoC.save(c,d);
        //repoC.deleteById(1);
        System.out.println("Cliente guardado");
        
       // for(Cliente cl:repoC.findAll())   {
       //     System.out.println(cl.getNombre());
       // }
        
       // System.out.println(repoC.findById(1).get().getNombre());  
        
    }
}

/**
 *
 * @author otros
 */
