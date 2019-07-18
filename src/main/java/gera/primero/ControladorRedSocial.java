package gera.primero;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ControladorRedSocial {

@Autowired RepoRedSocial repoRedSocial;
    @CrossOrigin()
    @PostMapping("/red-social")
    public Estatus guardar(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();

        Estatus e = new Estatus();

        RedSocial red = maper.readValue(json, RedSocial.class);
        System.out.println("Si llego "+red);


            e.setSuccess(true);
            e.setMensaje("Red Social guardado con exito");

return e;

    }
}
