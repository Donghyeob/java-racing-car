package racingcar.domain;

import racingcar.common.ErrorCode;

public class CarPosition {

    private static final int FORWARD_CONDITION = 4;
    private int position;

    public CarPosition(String position) {
        validate(position);
        this.position = Integer.parseInt(position);
    }

    public void forwardPosition(int moveNumber) {
        if (moveNumber >= FORWARD_CONDITION) {
            this.position++;
        }
    }

    public int getCount() {
        return position;
    }

    public void validate(String number) {
        int result;

        try {
            result = Integer.parseInt(number);
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorCode.INPUT_INTEGER_ERR);
        }

        if (result < 0) {
            throw new IllegalArgumentException(ErrorCode.INPUT_INTEGER_ERR);
        }
    }
}
