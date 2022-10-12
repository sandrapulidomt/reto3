package ciclo3.reto3.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String brand;
    private int year;
    private String description;
@ManyToOne
@JoinColumn(name = "idGama")
    @JsonIgnoreProperties("cars")
    private  Gama gama;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "car")
    @JsonIgnoreProperties("car")
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "car")
    @JsonIgnoreProperties("car")
    private List<Reservation> reservations;


}
