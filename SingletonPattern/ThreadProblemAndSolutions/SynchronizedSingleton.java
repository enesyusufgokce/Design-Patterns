package SingletonPattern.ThreadProblemAndSolutions;

public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton(){};

    public static synchronized SynchronizedSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}

// the cost: the lock is actually needed only on the first call. After the object is created,
// every call still waits unnecessarily.
