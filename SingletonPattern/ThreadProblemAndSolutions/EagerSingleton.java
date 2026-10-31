package SingletonPattern.ThreadProblemAndSolutions;

public class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getInstance(){
        return uniqueInstance;
    }
}
// the cost: the object is created even if it's never used. That's fine if the object is
// lightweight or will always be used anyway.