package ciclo3.reto3.Controlador;

import ciclo3.reto3.Entidad.Car;
import ciclo3.reto3.Servicio.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/api/Car/")
@CrossOrigin(origins = "*")
public class ApiCar {
    @Autowired
    private CarService service;
   @GetMapping("/all/")
    public List<Car> findAllCars(){
        return service.getCars();
    }

   @PostMapping("/save/")
    public ResponseEntity saveCar(@RequestBody Car car){
        service.getCars();
        return ResponseEntity.status(201).build();


    }
}
