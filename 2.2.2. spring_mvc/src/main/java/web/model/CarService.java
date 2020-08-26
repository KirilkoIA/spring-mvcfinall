package web.model;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", "black", 22));
        cars.add(new Car("car2", "black", 23));
        cars.add(new Car("car3", "black", 24));
        return cars;
    }

    public CarService() {
    }
}
