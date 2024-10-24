package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> listCars(int count) {
        if (count == 0 || count > 5) return carDAO.getAllCars();
        return carDAO.getAllCars().stream().limit(count).collect(Collectors.toList());
    }
}
