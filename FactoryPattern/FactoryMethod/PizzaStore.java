package FactoryPattern.FactoryMethod;

public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
