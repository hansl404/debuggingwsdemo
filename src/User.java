public class User {

  private String name;
  private double money;
  private double energy;

  public User (String name, double money, int energy) {
    this.name = name;
    this.money = money;
    this.energy = energy;
  }

  public String getName() {
    return this.name;
  }

  public double getMoney() {
    return this.money;
  }

  public double getEnergy() {
    return this.energy;
  }

}
