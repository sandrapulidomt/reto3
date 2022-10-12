package ciclo3.reto3.Servicio;

import ciclo3.reto3.Entidad.Client;
import ciclo3.reto3.Repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {
    @Autowired
   private ClientRepository repository;

    public List<Client> getClients(){
        return  repository.findAll();

    }
    public Client saveClientClient(Client client){
        return  repository.save(client);

    }
}
