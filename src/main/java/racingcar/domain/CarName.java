package racingcar.domain;

import racingcar.common.ErrorCode;

public class CarName {
    private final String name;
    private static final int NAME_MAX_LENGTH = 5;

    CarName(String name) {
        validate(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void validate(String name) {
        if (validateMaxLength(name)) {
            throw new IllegalArgumentException(ErrorCode.INPUT_NAME_LENGTH_ERR);
        }
        if (validateEmptyLength(name)) {
            throw new IllegalArgumentException(ErrorCode.INPUT_NAME_NULL_ERR);
        }
    }

    private boolean validateMaxLength(String name) {
        return name.length() > NAME_MAX_LENGTH;
    }

    private boolean validateEmptyLength(String name) {
        return name == null || name.trim().length() == 0;
    }
}
