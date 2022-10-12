package ciclo3.reto3.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date startDate;
    private Date devolutionDate;

    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties("reservation")
    private  Client client;

    @ManyToOne
    @JoinColumn(name = "idCar")
    @JsonIgnoreProperties("reservation")
    private  Car car;

}
