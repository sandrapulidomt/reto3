package ciclo3.reto3.Repositorio;

import ciclo3.reto3.Entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository <Message, Long> {
}
