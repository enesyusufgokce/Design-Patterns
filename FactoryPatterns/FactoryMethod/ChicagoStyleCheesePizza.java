package FactoryPattern.FactoryMethod;

public class ChicagoStyleCheesePizza extends Pizza{

    ChicagoStyleCheesePizza(){
        name = "Chicago Style Cheese Pizza";
    }
    void cut(){
        System.out.println("cutting into square slices");
    }

}
