package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDAO;

    @Autowired
    public CarServiceImp(CarDao carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCarsOfCount(int count) {
        if (count == 0 || count > 5) return carDAO.getAllCars();
        return carDAO.getAllCars().stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public int getCountCars() {
        return carDAO.getCountCars();
    }
}
