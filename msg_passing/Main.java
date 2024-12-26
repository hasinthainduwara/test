package msg_passing;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Driver driver = new Driver();
        driver.drive(myCar);
    }
}
