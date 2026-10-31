package FactoryPattern.AbstractFactory;

public class NYIngredientFactory implements PizzaIngredientFactory{

    public Dough createDough(){
        return new ThinCrustDough();
    }
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
}