package ciclo3.reto3.Servicio;

import ciclo3.reto3.Entidad.Admin;
import ciclo3.reto3.Repositorio.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;

    public List<Admin> getAdmins(){
        return  repository.findAll();

    }
    public Admin saveAdmin(Admin admin){
        return  repository.save(admin);

    }
}
