package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {
    private static long CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        Car car1 = new Car();
        car1.setId(++CARS_COUNT);
        car1.setMake("Aston Martin");
        car1.setModel("Vanquish II");
        car1.setYear(2014);
        cars.add(car1);
        Car car2 = new Car();
        car2.setId(++CARS_COUNT);
        car2.setMake("Mitsubishi");
        car2.setModel("ASX");
        car2.setYear(2021);
        cars.add(car2);
        Car car3 = new Car();
        car3.setId(++CARS_COUNT);
        car3.setMake("Mercedes-Benz");
        car3.setModel("Maybach S VI");
        car3.setYear(2016);
        cars.add(car3);
        Car car4 = new Car();
        car4.setId(++CARS_COUNT);
        car4.setMake("Ford");
        car4.setModel("Fiesta");
        car4.setYear(2013);
        cars.add(car4);
        Car car5 = new Car();
        car5.setId(++CARS_COUNT);
        car5.setMake("VAZ");
        car5.setModel("2101");
        car5.setYear(1976);
        cars.add(car5);
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
