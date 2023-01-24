public class Car implements Vehicle {
    private final int num_wheels = 4;
    private final int max_speed = 100;
    private final int max_passengers = 4;
    private String driver_name;

    public Car(String driver_name) {
        this.driver_name = driver_name;
    }

    @Override
    public int getWheels() {
        return num_wheels;
    }

    @Override
    public int getMaxSpeed() {
        return max_speed;
    }

    @Override
    public int getMaxPassengers() {
        return max_passengers;
    }

    @Override
    public String getDriverName() {
        return driver_name;
    }
}
