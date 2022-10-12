package ciclo3.reto3.Servicio;

import ciclo3.reto3.Entidad.Gama;
import ciclo3.reto3.Repositorio.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {
    @Autowired
    private GamaRepository repository;

    public List<Gama> GetGamas(){
        return  repository.findAll();

    }
    public Gama saveGama(Gama gama){
        return  repository.save(gama);

    }
}
