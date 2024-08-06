package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("Mercedes-Benz", "CLS 300", "2022"));
        cars.add(new Car("BMW", "M4", "2023"));
        cars.add(new Car("Ford", "Dark Horse", "2023"));
        cars.add(new Car("Chevrolet", "Camaro", "2024"));
        cars.add(new Car("Mazda", "6", "2021"));

    }

    public List<Car> getCars(int count) {
        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if(i >= cars.size()) {
                break;
            }
            carsList.add(cars.get(i));
        }
        return carsList;
    }
}
