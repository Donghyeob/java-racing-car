package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars newCars(String names) {
        List<Car> cars = new ArrayList<>();
        String[] carNames = names.replaceAll(" ", "").split(",");

        for(String carName : carNames) {
            cars.add(Car.newCar(carName));
        }

        return new Cars(cars);
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void move() {
        for(Car car : cars) {
            car.move(Randoms.pickNumberInRange(0, 9));
        }
    }
}
