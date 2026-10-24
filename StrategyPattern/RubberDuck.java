package StrategyPattern;

public class RubberDuck extends Duck{

    RubberDuck(){
        flybehavior = new Flynoway();
        quackbehavior = new Squeak();
    }
    public void display(){
        System.out.println("I am a rubber duck");
    }
}
