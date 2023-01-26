public class Car implements Vehicle {
    private final int num_wheels = 4;
    private final int max_speed = 100;
    private final int max_passengers = 4;
    private final int mpg = 30;
    private final double gasPricePerGallon = 2.5;

    private User driver;

    public Car(User driver) {
        this.driver = driver;
    }

    public int getMPG() {
        return mpg;
    }

    public double getGasPricePerGallon() {
        return gasPricePerGallon;
    }

    @Override
    public String getUserName() {
        return driver.getName();
    }

    public double getDriverMoney() {
        return driver.getMoney();
    }

    // BUG: Can change return type of one of the steps to a int instead of a double
    @Override
    public double getMaxPossibleDistance() {
        double totalGas = getDriverMoney() / getGasPricePerGallon();
        double maxMiles = totalGas * getMPG();
        return maxMiles;
    }
}
