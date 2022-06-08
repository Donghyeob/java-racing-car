package racingcar.domain;

public class CarPosition {

    private static final int FORWARD_CONDITION = 4;
    private Integer count;

    CarPosition() {
        this.count = 0;
    }

    public void forwardPosition(int moveNumber) {
        if (moveNumber >= FORWARD_CONDITION) {
            this.count++;
        }
    }

    public Integer getCount() {
        return count;
    }
}
