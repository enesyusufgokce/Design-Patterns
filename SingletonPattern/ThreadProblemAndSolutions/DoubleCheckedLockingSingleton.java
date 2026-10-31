package SingletonPattern.ThreadProblemAndSolutions;

public class DoubleCheckedLockingSingleton {

    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton(){}

    public static DoubleCheckedLockingSingleton getInstance(){
        if (uniqueInstance == null){                                               // 1. check: unlocked
            synchronized (DoubleCheckedLockingSingleton.class){                    // lock only at first
                if(uniqueInstance == null) {                                       // 2. check: inside the lock
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
