package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {
    private List<Car> cars;

    public CarGenerator(String names) {
        this.cars = forCars(names);
    }

    public List<Car> forCars(String names) {
        String[] carNames = names.replaceAll(" ", "").split(",");
        this.cars = new ArrayList<>();

        for(String name : carNames) {
            cars.add(new Car(name));
        }

        return cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void carMove() {
        for(Car car : cars) {
            car.move(Randoms.pickNumberInRange(0, 9));
            System.out.println(car.getDisplayDis());
        }
    }
}
