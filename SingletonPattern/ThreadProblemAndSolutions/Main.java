package SingletonPattern.ThreadProblemAndSolutions;

public class Main {
    public static void main(String[] args) {
        SynchronizedSingleton a = SynchronizedSingleton.getInstance();
        SynchronizedSingleton b = SynchronizedSingleton.getInstance();

        System.out.println(a == b);


        EagerSingleton c = EagerSingleton.getInstance();
        EagerSingleton d = EagerSingleton.getInstance();

        System.out.println(c == d);

        DoubleCheckedLockingSingleton e = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton f = DoubleCheckedLockingSingleton.getInstance();

        System.out.println(e == f);
    }
}