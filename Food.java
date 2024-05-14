package Restaurant;

import java.sql.Time;
import java.util.Timer;

public class Food {
    private String name;
    private double price;
    private double cost;
    private int initialAmount;
    private Timer timeRequired;
    private int minAmount;
    private int foodID;

    public Food(){}

    public Food(String name, double price, double cost, int initialAmount, Timer timeRequired, int minAmount, int foodID) {
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.initialAmount = initialAmount;
        this.timeRequired = timeRequired;
        this.minAmount = minAmount;
        this.foodID = foodID;
    }

}
