package StrategyPattern.DuckSimulator;

public abstract class Duck {
    Flybehavior flybehavior;
    Quackbehavior quackbehavior;

    public abstract void display();

    public void performFly(){
        flybehavior.fly();
    }

    public void performQuack(){
        quackbehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public void setFlybehavior(Flybehavior fb){
        flybehavior = fb;
    }

    public void setQuackbehavior(Quackbehavior qb){
        quackbehavior = qb;
    }
}