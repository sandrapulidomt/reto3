package ciclo3.reto3.Controlador;

import ciclo3.reto3.Entidad.Client;
import ciclo3.reto3.Servicio.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Cliente/")
@CrossOrigin(origins = "*")
public class ApiClient {
    @Autowired
    private ClientService service;
     @GetMapping("/*all/")
    public List<Client> findAllClients(){
        return service.getClients();
     }

     @PostMapping("/save/")
    public ResponseEntity saveClient(@RequestBody Client client){
         service.saveClientClient(client);
         return ResponseEntity.status(201).build();


     }
}
