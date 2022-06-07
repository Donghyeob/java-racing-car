package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;

class racingCountTest {
    @Test
    void go() {
        int random = Randoms.pickNumberInRange(0, 9);
        String goAndStop = "go";
        System.out.println(random);

        if (random <= 3) {
            goAndStop = "stop";
        }

        System.out.println(goAndStop);


    }
}
