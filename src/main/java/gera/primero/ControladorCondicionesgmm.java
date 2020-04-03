package gera.primero;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class ControladorCondicionesgmm {

    @Autowired
    RepoCondicionesgmm repoC;

    //BUSCAR POR IDENT (CRUD) R
    @GetMapping("/polizagmm/{identif}")
    public Polizagmm buscarPorId (@PathVariable Integer identif) {
        return repoC.findById(identif).get();
    }

    //BUSCAR TODOS (CRUD) R
    @GetMapping("/polizagmm")
    public List<Polizagmm> buscarTodos(){
        return repoC.findAll();
    }

    //GUARDAR
    @CrossOrigin()
    @PostMapping("/polizagmm")
    public Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper mapper= new ObjectMapper();
        Polizagmm polizagmm=mapper.readValue(json, Polizagmm.class);
        System.out.println("Si llegó"+ polizagmm);

        repoC.save(polizagmm);
        Estatus e= new Estatus( "Asegurado guardado con éxito ", true);
        return e;

    }

    //ACTUALIZAR
    @PutMapping("/polizagmm")
    public Estatus actualizar (@RequestBody String json ) throws Exception{
        ObjectMapper mapper=new ObjectMapper();
        Polizagmm polizagmm= mapper.readValue(json, Polizagmm.class);

        //Guardamos
        repoC.save(polizagmm);
                Estatus e= new Estatus ("Asegurado guardado con éxito", true);
        return e;


    }

    //BORRAR
    @DeleteMapping("/polizagmm/{identif}")
    public Estatus borrar (@PathVariable Integer identif){
        repoC.deleteById(identif);
        Estatus e= new Estatus ("Asegurado borrado con éxito", true);
        return e;
    }



}
