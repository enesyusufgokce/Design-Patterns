package FactoryPattern.AbstractFactory;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{

    public Dough createDough(){
        return new ThickCrustDough();
    }
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
}
