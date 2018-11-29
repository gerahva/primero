package gera.primero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeroApplication implements CommandLineRunner{
@Autowired RepoUsuario repoU;
    
	public static void main(String[] args) {
		SpringApplication.run(PrimeroApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
     Usuario u= new Usuario(1, "Humberto", "desarrollador jaja");
        //repoU.save(u);
        //repoU.deleteById(1);
        System.out.println("Usuario guardado");
        
        for(Usuario us:repoU.findAll())   {
            System.out.println(us.getNombre());
        }
        
        System.out.println(repoU.findById(1).get().getNombre());  
        
    }
}
