package DecoratorPattern.PizzaShop;

public class Olive extends ToppingDecorator{

    Pizza pizza;

    public Olive(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + ", Olive";
    }

    public double cost(){
        return pizza.cost() + 10;
    }
}
