package gera.primero;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ControladorRedSocial {

@Autowired RepoRedSocial repoRedSocial;



    //BUscar Todos (CRUD) R
    @GetMapping("/red-social")
    public List<RedSocial> buscarTodos() {

        return repoRedSocial.findAll();
    }

    @PostMapping("/red-social")
    public Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();

        Estatus e = new Estatus();

        RedSocial red = maper.readValue(json, RedSocial.class);
        System.out.println("Si llego "+red);

            repoRedSocial.save(red);
            e.setSuccess(true);
            e.setMensaje("Red Social guardado con exito ya!!");

return e;

    }
}
