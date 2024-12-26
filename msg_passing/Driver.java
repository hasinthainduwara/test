package msg_passing;

public class Driver {
    public void drive(Car car) {
        car.start(); // Sending a "start" message to the car
        car.start();
        System.out.println("Driver is driving the car.");
    }
}
