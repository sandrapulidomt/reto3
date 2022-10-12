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
@Entity
@Table(name="client")

public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;
    private String name;
    private String email;
    private String password;
    private  int age;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "car")
    @JsonIgnoreProperties("car")
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "car")
    @JsonIgnoreProperties("car")
    private List<Reservation> reservations;




}
