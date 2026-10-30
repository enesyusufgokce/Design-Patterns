package FactoryPattern.AbstractFactory;

public class CheesePizza extends Pizza{

    PizzaIngredientFactory factory;  // retains the supplier

    CheesePizza(PizzaIngredientFactory factory){
        this.factory = factory;
        name = "Cheese Pizza";
    }

    void prepare(){
        dough = factory.createDough();  // Which dough? The supplier knows
        sauce = factory.createSauce();
        System.out.println("Preparing " + name + ": " + dough.getName() + ", " + sauce.getName());
    }
}
