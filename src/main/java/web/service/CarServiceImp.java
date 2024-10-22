package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImp implements CarService{
    @Override
    public List<Car> listCars(List<Car> cars,int count) {

            if (count == 0 || count > 5) return cars;
            return cars.stream().limit(count).collect(Collectors.toList());

    }

    ;
}
