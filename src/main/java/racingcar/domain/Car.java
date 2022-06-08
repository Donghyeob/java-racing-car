package racingcar.domain;

public class Car {

    private final CarName carName;
    private final CarPosition carPosition;

    public Car(CarName carName, CarPosition carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
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