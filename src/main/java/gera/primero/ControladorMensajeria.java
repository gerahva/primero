package gera.primero;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ControladorMensajeria {
@Autowired
    RepoRedSocial repoRedSocial;


    @GetMapping("/mensajeria/{nickname}/{mensaje}")
    Estatus postearIncidencia(@PathVariable String nickname, @PathVariable String mensaje) throws Exception {


//1. Leemos al academico que trae a) La incidencia y b) el campos clinicoa al que enviaremos dicha incidencia c)
        //el director a cuya clave de celualr le madaremos dicha incidencia


        RedSocial redSocial=    repoRedSocial.findByNickname(nickname).get(0);




        System.out.println("Tu usuario de red social es "+redSocial);

String token=redSocial.token;
Mensajeria mensa=new Mensajeria();

        Data data =new Data();
        data.setTitle(redSocial.nickname);
         data.setBody(mensaje);
        mensa.setTo(token);
        mensa.setData(data);


        System.out.println("MENSJE A ENVIAR POR FIREBAS "+mensa);
// Ajustamos los headers
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(new MediaType("application","json"));

        requestHeaders.set("Authorization","key=AIzaSyAKKs5CA6c8MATwstDDNMkOzAcy0vMnqtY");

        HttpEntity<Mensajeria> requestEntity = new HttpEntity<Mensajeria>(mensa, requestHeaders);

// Creaamos un RestTemplate
        RestTemplate restTemplate = new RestTemplate();

// Mandamos al uri del servicio web comomo consumimos normalmente un servicio Rest
        ResponseEntity<String> responseEntity = restTemplate.exchange("https://fcm.googleapis.com/fcm/send", HttpMethod.POST, requestEntity, String.class);
        String resultado = responseEntity.getBody();

        Estatus estatus=new Estatus(resultado, true);
        System.out.println("Res "+resultado);

        //   monito.subscribe();
        return estatus;
    }


}
