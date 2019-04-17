/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gera.primero;

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
@RestController
@CrossOrigin
@RequestMapping("/api")
public class ControladorCliente {

    @Autowired
    RepoCliente repoC;

    //BUscar Todos (CRUD) R
    @GetMapping("/cliente")
    public List<Cliente> buscarTodos() {

        return repoC.findAll();
    }

    //BUscar por id (CRUD) R
    @GetMapping("/cliente/{ident}")
    public Cliente buscarPorId(@PathVariable Integer ident) {

        return repoC.findById(ident).get();
    }

    //Guardar
    @CrossOrigin()
    @PostMapping("/cliente")
    public Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();

        Estatus e = new Estatus();
     
        Cliente cliente = maper.readValue(json, Cliente.class);  
        System.out.println("Si llego "+cliente);
        //Buscamos
        
          if(repoC.existsById(cliente.getIdent())){
            e.setSuccess(false);
            e.setMensaje("Ese id ya existe");
        } else {
            //Guardamos
            repoC.save(cliente);
            e.setSuccess(true);
            e.setMensaje("Cliente guardado con exito");
        }

        return e;
    }

    //Actualizar
    @PutMapping("/cliente")
    public Estatus actualizar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        Cliente cliente = maper.readValue(json, Cliente.class);

        //Guardamos
        repoC.save(cliente);
        Estatus e = new Estatus("Cliente actualizado con exito", true);
        return e;
    }

    //Borrar
    @DeleteMapping("/cliente/{ident}")
    public Estatus borrar(@PathVariable Integer ident) {
        repoC.deleteById(ident);
        Estatus e = new Estatus("Cliente borrado con exito", true);
        return e;
    }

}
