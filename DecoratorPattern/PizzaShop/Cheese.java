package DecoratorPattern.PizzaShop;

public class Cheese extends ToppingDecorator{
    Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }
    public String getDescription(){
        return pizza.getDescription() + ", Margherita";
    }
    public double cost(){
        return pizza.cost() + 15;
    }
}
