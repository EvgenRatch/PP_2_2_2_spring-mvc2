package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("White", 4, "V4"));
        cars.add(new Car("Green", 2, "V12"));
        cars.add(new Car("Pink", 3, "V6"));
        cars.add(new Car("Blue", 5, "V2"));
        cars.add(new Car("Yellow", 5, "V8"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
