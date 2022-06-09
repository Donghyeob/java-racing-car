package racingcar.domain;

import org.junit.jupiter.api.Test;

public class CarsTest {
    /**
     * Cars Test
     */

    @Test
    void 자동차들_생성() {
        String carNames = "aa,bb,cc,dd";

//        assertThat(cars.size()).isEqualTo(4);
    }

    @Test
    void 자동차들_움직임() {
        String carNames = "aa,bb,cc,dd";
        Cars cars = Cars.newCars(carNames);


    }
}
