public class User {

  private String name;
  private double money;
  private int energy;

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

  public int getEnergy() {
    return this.energy;
  }

}
