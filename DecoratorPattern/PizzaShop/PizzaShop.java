package DecoratorPattern.PizzaShop;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza1 = new Margherita();
        pizza1 = new Cheese(pizza1);
        pizza1 = new Cheese(pizza1);
        pizza1 = new Olive(pizza1);

        System.out.println(pizza1.description + ", price is: " + pizza1.cost());
    }
}
