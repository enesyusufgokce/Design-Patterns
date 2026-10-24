package StrategyPattern;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flybehavior = new Flywithwings();
        quackbehavior = new Quack();
    }
    public void display(){
        System.out.println("I am a real mallard duck");
    }
}
