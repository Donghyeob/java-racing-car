package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest {
    /**
     * Car, CarName, CarPosition Test
     */
    @ParameterizedTest
    @ValueSource(strings = {"test", "dong"})
    void 자동차_생성(String name) {
        Car car = Car.newCar(name);

        assertThat(car.getName()).isEqualTo(name);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 자동차_이름_길이_예외처리() {
        String name = "abc-def";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car.newCar(name);
        });
    }

    @Test
    void 자동차_이름_공백_예외처리() {
        String name = " ";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car.newCar(name);
        });
    }

    @Test
    void 자동차_전진() {
        String name = "aa";
        int moveNumber = 5;
        Car car = Car.newCar(name);

        car.move(moveNumber);

        assertThat(car.getPosition()).isGreaterThan(0);
    }

    @Test
    void 자동차_멈춤() {
        String name = "aa";
        int moveNumber = 3;
        Car car = Car.newCar(name);

        car.move(moveNumber);

        assertThat(car.getPosition()).isEqualTo(0);
    }

    /**
     * Cars Test
     */
    @Test
    void 자동차들_생성() {
        String carNames = "aa,bb,cc,dd";

        List<Car> cars = Cars.newCars(carNames);

        assertThat(cars.size()).isEqualTo(4);
    }
    @Test
    void 자동차들_움직임() {
        String carNames = "aa,bb,cc,dd";
        Cars cars = Cars.newCars(carNames);


    }
}
