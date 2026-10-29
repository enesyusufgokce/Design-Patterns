package DecoratorPattern.PizzaShop;

public abstract class Pizza {

    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
