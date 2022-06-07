package racingcar.domain;

import racingcar.common.CommonCode;
import racingcar.common.ErrorCode;

public class CarName {
    String name;

    CarName(String name) {
        this.name = name;
        customException();
    }

    public String getName() {
        return name;
    }

    public void customException() {
        if (name.length() > CommonCode.NAME_MAX_LENGTH.getValue()) {
            throw new IllegalArgumentException(ErrorCode.INPUT_NAME_LENGTH_ERR.getMessage());
        }
        if (name.length() == 0) {
            throw new IllegalArgumentException(ErrorCode.INPUT_NAME_NULL_ERR.getMessage());
        }
    }
}
