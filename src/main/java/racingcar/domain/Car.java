package racingcar.domain;

public class Car {

    private CarName carName;
    private CarPosition carPosition;

    public Car(String name) {
        this.carName = new CarName(name);
        this.carPosition = new CarPosition();
    }

    public void move(int random) {
        if(random >= 4) {
            this.carPosition.move();
        }
    }

    public String getName() {
        return this.carName.getName();
    }

    public int getDistance() {
        return this.carPosition.getDistance();
    }

    public String getDisplayDis() {
        return this.carName.getName() + " : "
                + this.carPosition.getDisplayDis();
    }
}