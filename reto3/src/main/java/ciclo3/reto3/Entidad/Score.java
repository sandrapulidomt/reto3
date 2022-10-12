package ciclo3.reto3.Entidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
