package racingcar.domain;

public class Car {

    private final CarName carName;
    private final CarPosition carPosition;

    public Car(String name) {
        this.carName = new CarName(name);
        this.carPosition = new CarPosition(0);
    }

    public static Car newCar(String name) {
        return new Car(new CarName(name), new CarPosition());
    }

    public void move(int moveNumber) {
        this.carPosition.forwardPosition(moveNumber);
    }

    public String getName() {
        return this.carName.getName();
    }

    public int getPosition() {
        return this.carPosition.getCount();
    }
}