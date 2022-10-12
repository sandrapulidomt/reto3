package ciclo3.reto3.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "message")

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String messageText;

    @ManyToOne
    @JoinColumn(name ="idClient")
    @JsonIgnoreProperties("message")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "idCar")
    @JsonIgnoreProperties("message")
    private Car car;
}
