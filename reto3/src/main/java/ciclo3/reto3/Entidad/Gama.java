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
@Entity(name = "gama")

public class Gama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "gama")
    @JsonIgnoreProperties("gama")
    private List<Car>cars;

}
