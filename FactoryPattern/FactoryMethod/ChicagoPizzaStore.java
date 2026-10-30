package FactoryPattern.FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore{

    Pizza createPizza(String type){
        return new ChicagoStyleCheesePizza();
    }
}
