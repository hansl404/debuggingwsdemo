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

  public double getBikerEnergy() {
    return biker.getEnergy();
  }

  @Override
  public double getMaxPossibleDistance() {
    return getBikerEnergy() / getMilesPerEnergy();
  }

  public double moneySaved(double distance) {
    Car imaginaryCar = new Car(biker);
    double pricePerGallon = imaginaryCar.getGasPricePerGallon();
    double milesPerGallon = imaginaryCar.getDriverMoney();
    double gallonsGasNeeded = distance / milesPerGallon;
    double priceToTravelByCar = gallonsGasNeeded * pricePerGallon;
    return Math.round(priceToTravelByCar * 100.0) / 100.0;
  }

}
