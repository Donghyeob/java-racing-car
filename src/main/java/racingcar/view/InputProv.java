package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.common.CommonCode;

public class InputProv {

    public static String inputCarNames() {
        System.out.println(CommonCode.INPUT_CAR_NAME_MESSAGE);
        return Console.readLine();
    }

    public static String inputRacingCount() {
        System.out.println(CommonCode.INPUT_ROUND_COUNT_MESSAGE);
        return Console.readLine();
    }
}
