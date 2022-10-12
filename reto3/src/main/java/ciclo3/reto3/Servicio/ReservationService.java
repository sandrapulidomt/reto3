package ciclo3.reto3.Servicio;


import ciclo3.reto3.Entidad.Reservation;
import ciclo3.reto3.Repositorio.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public List<Reservation> getReservations() {
        return repository.findAll();

    }

    public Reservation saveReservation() {
        Reservation reservation = null;
        return repository.save(reservation);


    }
}
