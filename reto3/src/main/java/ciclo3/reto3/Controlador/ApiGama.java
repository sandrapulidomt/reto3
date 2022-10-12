package ciclo3.reto3.Controlador;

import ciclo3.reto3.Entidad.Car;
import ciclo3.reto3.Entidad.Gama;
import ciclo3.reto3.Servicio.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/api/Gama/")
@CrossOrigin(origins = "*")
public class ApiGama {

    @Autowired
    private GamaService service;
@GetMapping("/all/")
    public List<Gama> findAllGama(){
    return service.GetGamas();
    }
  @PostMapping("/save/")
    public ResponseEntity saveGama(Gama gama){
        service.saveGama(gama);
        return ResponseEntity.status(201).build();


    }
}
