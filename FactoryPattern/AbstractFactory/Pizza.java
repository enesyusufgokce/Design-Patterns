package FactoryPattern.AbstractFactory;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    abstract void prepare();
}
