package DecoratorPattern.PizzaShop;

public class Margherita extends Pizza{

    public Margherita(){
        description = "Margherita pizza";
    }
    public double cost(){
        return 120.0;
    }
}
