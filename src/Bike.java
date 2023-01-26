public class Bike implements Vehicle {
  private final int num_wheels = 2;
  private final int max_speed = 20;
  private final int max_passengers = 2;
  private final int milesPerEnergy = 10;

  private User biker;

  public Bike(User biker) {
    this.biker = biker;
  }

  public int getMilesPerEnergy() {
    return milesPerEnergy;
  }

  @Override
  public String getUserName() {
    return biker.getName();
  }

  // BUG: Can try to get biker's money instead of energy
  public int getBikerEnergy() {
    return biker.getEnergy();
  }

  @Override
  public double getMaxPossibleDistance() {
    return biker.getEnergy() / milesPerEnergy;
  }

}
