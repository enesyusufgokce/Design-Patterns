package StrategyPattern.DuckSimulator;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.flybehavior.fly();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.swim();
        rubber.performFly();
        rubber.performQuack();

        mallard.setFlybehavior(new Flynoway());
        mallard.performFly();
    }
}
