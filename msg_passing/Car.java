package msg_passing;

public class Car {
    private boolean engineOn;

    public Car() {
        engineOn = false;
    }

    public void start() {
        if (!engineOn) {
            System.out.println("Car is starting...");
            engineOn = true;
        } else {
            System.out.println("Car is already started.");
        }
    }
}
