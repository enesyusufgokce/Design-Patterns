package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);

        // Singleton c = new Singleton();   error!!
        System.out.println(b.toString());  // öylesine
    }
}