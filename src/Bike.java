public class Bike implements Vehicle {
  private final int num_wheels = 2;
  private final int max_speed = 20;
  private final int max_passengers = 2;
  private final int milesPerEnergy = 10;

  private User biker;

  public Bike(User biker) {
    this.biker = biker;
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

  public int getMilesPerEnergy() {
    return milesPerEnergy;
  }

  public String getBikerName() {
    return biker.getName();
  }

  // BUG: Can get biker's money instead of energy
  public int getBikerEnergy() {
    return biker.getEnergy();
  }

  public double getMaxPossibleDistance() {
    return biker.getEnergy() / milesPerEnergy;
  }

}
