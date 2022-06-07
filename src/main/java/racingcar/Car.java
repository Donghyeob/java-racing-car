package racingcar;

public class Car {

    private CarName carName;
    private CarDistance carDistance;

    public Car(String name) {
        this.carName = new CarName(name);
        this.carDistance = new CarDistance();
    }

    public void move(int random) {
        if(random >= 4) {
            this.carDistance.move();
        }
    }

    public String getName() {
        return this.carName.getName();
    }

    public int getDistance() {
        return this.carDistance.getDistance();
    }

    public String getDisplayDis() {
        return this.carName.getName() + " : "
                + this.carDistance.getDisplayDis();
    }
}