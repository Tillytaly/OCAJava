package InitializingObjects;

public class LazyClass {
    private static int sA = announce("LazyClass.sA");
    static {
        System.out.println("LazyClass static block A");
    }
    private static int sB = announce("LazyClass.sB");
    static {
        System.out.println("LazyClass static block B");
    }

    private int iA = announceInstance("LazyClass.iA");
    {
        System.out.println("LazyClass instance block");
    }

    public LazyClass() {
        System.out.println("LazyClass() constructor");
    }

    private static int announce(String name) {
        System.out.println("static: " + name);
        return 0;
    }

    private int announceInstance(String name) {
        System.out.println("instance: " + name);
        return 0;
    }

    public static int STATIC_VALUE = 123;
}
