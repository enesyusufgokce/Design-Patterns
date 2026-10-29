package DecoratorPattern.BaykusCoffee;

public class CoffeeShop {
    public static void main(String[] args) {

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription());

    }
}
