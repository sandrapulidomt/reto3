package ciclo3.reto3.Controlador;

import ciclo3.reto3.Entidad.Message;
import ciclo3.reto3.Servicio.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api/Message/")
@CrossOrigin(origins ="*")
public class ApiMessage {
    @Autowired
    private MessageService service;

    @GetMapping("/all/")
    public List<Message> findAllMessages() {
        return service.getMessage();
    }

    @PostMapping("/save/")
    public ResponseEntity saveMessage(@RequestBody Message message) {
        service.getMessage();
        return ResponseEntity.status(201).build();
    }
}