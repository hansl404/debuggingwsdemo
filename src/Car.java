public class Car implements Vehicle {
    int num_wheels, max_speed, max_passengers;

    public Car() {
        this.num_wheels = 4;
        this.max_speed = 100;
        this.max_passengers = 4;
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
}
