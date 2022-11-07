package web.model;

public class Car {

    private String color;

    private int doorCount;

    private String engine;

    public String getColor() {
        return color;
    }


    public Car(String color, int doorCount, String engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine='" + engine + '\'' +
                '}';
    }
}
