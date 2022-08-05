package web.Dao;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();
    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void addTestData() {
        add(new Car("zaz",12));
        add(new Car("belaz",6));
        add(new Car("seat",3));
        add(new Car("bicycle",2));
        add(new Car("ya i sam svoego roda mashina",0));
    }

    @Override
    public List getAll() {
        return cars;
    }

    @Override
    public List getAllLimitedByCount(Long count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
