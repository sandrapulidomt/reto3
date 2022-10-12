package ciclo3.reto3.Controlador;

import ciclo3.reto3.Entidad.Reservation;
import ciclo3.reto3.Servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api/Reservation/")
@CrossOrigin(origins = "*")

public class ApiReservation {
    @Autowired
    private ReservationService service;

    @GetMapping("/all/")
    public List<Reservation> findAllReservation() {
        return service.getReservations();
    }

    @PostMapping("/save/")
    public ResponseEntity saveReservation(@RequestBody Reservation reservation) {
        service.getReservations();
        return ResponseEntity.status(201).build();
    }
}

