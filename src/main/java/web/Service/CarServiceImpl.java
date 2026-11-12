package web.Service;

import org.springframework.stereotype.Service;
import web.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Lada", 5, 24584));
        cars.add(new Car("BMW",  3,  261789));
        cars.add(new Car("Jip",  8, 35203));
        cars.add(new Car("Toyota", 12, 326226));
        cars.add(new Car("Forge", 1, 156437));
    }


    @Override
    public List<Car> getCars(int count) {
        if (count <=0 || count >=cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
