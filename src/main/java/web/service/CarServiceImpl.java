package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = Arrays.asList(
            new Car("Toyota", "Jetta", 1865),
            new Car("Infinity", "Sonata", 2020),
            new Car("Ferrari", "Nexia", 1995),
            new Car("IDK", "Hwanson", 1204),
            new Car("Daewo", "Sport", 2035)
    );
    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
