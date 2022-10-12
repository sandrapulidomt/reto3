package ciclo3.reto3.Servicio;

import ciclo3.reto3.Entidad.Car;
import ciclo3.reto3.Repositorio.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    public List<Car> getCars(){
        return  repository.findAll();

    }
    public Car saveCar(Car car){
        return  repository.save(car);

    }
}
