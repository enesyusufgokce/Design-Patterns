package FactoryPattern.AbstractFactory;

public class Main {
    public static void main (String[] args){
        new CheesePizza(new NYIngredientFactory()).prepare();
        new CheesePizza(new ChicagoIngredientFactory()).prepare();
    }
}
