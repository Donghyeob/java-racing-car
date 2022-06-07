package common;

public enum CommonCode {
    INPUT_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_ROUND_COUNT_MESSAGE("시도할 회수는 몇회인가요?"),
    INPUT_NAME_LENGTH_ERR("[ERROR] 5자 이하만 입력가능"),
    INPUT_NAME_NULL_ERR("[ERROR] 1자 이상만 입력가능"),
    INPUT_INTEGER_ERR("[ERROR] 숫자만 입력가능");

    private final String message;

    CommonCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
