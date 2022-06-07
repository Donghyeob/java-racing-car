package racingcar;

import common.CarCode;
import common.CommonCode;

public class CarName {
    String name;

    CarName(String name) {
        if (name.length() > CarCode.NAME_MAX_LENGTH.getValue()) {
            throw new IllegalArgumentException(CommonCode.INPUT_NAME_LENGTH_ERR.getMessage());
        }
        if (name.length() == 0) {
            throw new IllegalArgumentException(CommonCode.INPUT_NAME_NULL_ERR.getMessage());
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
