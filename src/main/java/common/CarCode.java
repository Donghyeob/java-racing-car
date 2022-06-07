package common;

public enum CarCode {
    GO_CONDITION_VALUE(4),
    STOP_CONDITION_VALUE(3),
    NAME_MAX_LENGTH(5);

    private int value;

    CarCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
