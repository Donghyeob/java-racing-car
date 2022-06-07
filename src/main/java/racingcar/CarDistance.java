package racingcar;

public class CarDistance {
    private int distance = 0;
    private String displayDis = "";


    public void move() {
        this.distance++;
        this.displayDis += '-';
    }

    public String getDisplayDis() {
        return this.displayDis;
    }

    public int getDistance() {
        return this.distance;
    }
}
