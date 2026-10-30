package FactoryPattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");

        chicagoStore.createPizza("cheese");
        nyStore.createPizza("cheese");
    }
}
