package SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance; // the object will be kept here

    private Singleton() {
    }  // class cannot be initialized from outside, and compiler does not add public constructor automatically
// "private" means that the constructor can only be accessed from within the Singleton class itself

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}