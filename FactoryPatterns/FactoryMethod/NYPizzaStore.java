package FactoryPattern.FactoryMethod;

public class NYPizzaStore extends PizzaStore{

    Pizza createPizza(String type){
        return new NYStyleCheesePizza();
    }
}