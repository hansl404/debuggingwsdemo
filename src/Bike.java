public class Bike implements Vehicle {

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
    return getBikerEnergy() / getMilesPerEnergy();
  }

  public double moneySaved(double distance) {
    Car imaginaryCar = new Car(biker);
    double pricePerGallon = imaginaryCar.getGasPricePerGallon();
    double milesPerGallon = imaginaryCar.getMPG();
    double gallonsGasNeeded = distance / milesPerGallon;
    double priceToTravelByCar = gallonsGasNeeded * pricePerGallon;
    return priceToTravelByCar;
  }

}
