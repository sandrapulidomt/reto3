package ciclo3.reto3.Controlador;

import ciclo3.reto3.Entidad.Admin;
import ciclo3.reto3.Servicio.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin/")
@CrossOrigin(origins = "*")
public class ApiAdmin {
    @Autowired
    private AdminService service;
    @GetMapping("/all/")
    public List<Admin> findAllAdmins(){
        return service.getAdmins();
    }

    @PostMapping("/save/")
    public ResponseEntity saveAdmin(@RequestBody Admin admin){
        service.getAdmins();
        return ResponseEntity.status(201).build();


    }
}
