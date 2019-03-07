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
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author humbe
 */
//Genera un controlador que se llame ControladoClienteexamen
@RestController
@CrossOrigin
@RequestMapping("/api")  // En el RequestMapping da la ruta /api
public class ControladorClienteexamen {
    @Autowired RepoClienteexamen repoC;   //agregar un atributo de tipo repositorio y anotalo con Autowired
    //Buscar todos los clientes, proporciona una arquitectura REST correspondiente a la entidad
    @GetMapping("/clienteexamen")
    public List<Clienteexamen> buscarTodos(){
        
        return repoC.findAll();
    }
    
    
    //Guardar un cliente junto con su tarjeta
    @PostMapping("/clienteexamen")
    public Estatusexamen guardar(@RequestBody String json)throws Exception{
        ObjectMapper maper=new ObjectMapper();
        Clienteexamen cliente= maper.readValue(json,Clienteexamen.class);
        
        //Se guarda el cliente junto con su tarjeta
        repoC.save(cliente);
        Estatusexamen e=new Estatusexamen("Cliente guardado con exito", true);
        return e;
    }
    
   
     
    //Borrar un cliente por medio de su identificador
 
    @DeleteMapping("/clienteexamen/{ident}")
    public Estatusexamen borrar(@PathVariable Integer ident){
          repoC.deleteById(ident);
        Estatusexamen e=new Estatusexamen("Cliente borrado con exito", true);
        return e;
    }
    
    
    
    
}


