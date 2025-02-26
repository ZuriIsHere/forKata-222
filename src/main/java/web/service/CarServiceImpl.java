package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = Arrays.asList(
            new Car("Lada", "Granta", 2008),
            new Car("Lada", "Priora", 1999),
            new Car("Lamborghini", "Aventador", 2025),
            new Car("Kia", "Rio", 2013),
            new Car("Dodge", "Challenger", 2012)
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
