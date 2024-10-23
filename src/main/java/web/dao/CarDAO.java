package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private static long CARS_COUNT;
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT,"Aston Martin","Vanquish II",2014));
        cars.add(new Car(++CARS_COUNT,"Mercedes-Benz","Maybach S VI",2016));
        cars.add(new Car(++CARS_COUNT,"Mitsubishi","ASX",2021));
        cars.add(new Car(++CARS_COUNT,"Ford","Fiesta",2013));
        cars.add(new Car(++CARS_COUNT,"VAZ","2101",1976));
    }

    public List<Car> getCars() {
        return cars;
    }
}
