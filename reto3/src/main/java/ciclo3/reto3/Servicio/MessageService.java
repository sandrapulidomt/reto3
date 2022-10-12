package ciclo3.reto3.Servicio;


import ciclo3.reto3.Entidad.Message;
import ciclo3.reto3.Repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public List<Message> getMessage(){
        return repository.findAll();

    }
    public Message saveMessage(Message message){
        return repository.save(message);
    }
}
