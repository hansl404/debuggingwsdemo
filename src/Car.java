import java.util.*;

public class Car implements Vehicle {

    private final int mpg = 30;
    private final double gasPricePerGallon = 3.14;

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

    @Override
    public double maxPossibleDistance() {
        int totalGas = (int)(getDriverMoney() / getGasPricePerGallon());
        double maxMiles = totalGas * getMPG();
        return maxMiles;
    }

    public List<String> possibleCities() {
        List<String> answer = new ArrayList<>();
        HashMap<String, Double> cityDistances = new HashMap<>();
        cityDistances.put("Durham", 14.3);
        cityDistances.put("Cary", 22.3);
        cityDistances.put("Raleigh", 28.3);
        cityDistances.put("Greensboro", 50.5);
        cityDistances.put("Charlotte", 141.2);
        cityDistances.put("Asheville", 221.1);
        cityDistances.put("The Moon", 238900.0);

        for (Map.Entry<String, Double> element: cityDistances.entrySet()) {
            String city = element.getKey();
            double miles = element.getValue();
            System.out.println(city + " is " + miles + " miles away");
            if (miles > maxPossibleDistance()) {
                answer.add(city);
            }
        }

        return answer;
    }

}
