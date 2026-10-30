package FactoryPattern.AbstractFactory;

public interface PizzaIngredientFactory {  // what the supplier will provide
    Dough createDough();
    Sauce createSauce();
}
