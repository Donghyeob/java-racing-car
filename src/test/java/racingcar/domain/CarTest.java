package racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
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
}
