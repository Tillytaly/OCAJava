package InitializingObjects;

public class OrderExample2 {
    private static int staticA = registerStatic("staticA");
    static {
        System.out.println("static block A");
    }
    private static int staticB = registerStatic("staticB");
    static {
        System.out.println("static block B");
    }

    private int instanceA = registerInstance("instanceA");
    {
        System.out.println("instance initializer block A");
    }
    private int instanceB = registerInstance("instanceB");
    {
        System.out.println("instance initializer block B");
    }

    private final int finalValue;

    public OrderExample2() {
        System.out.println("constructor start");
        finalValue = computeFinal();
        System.out.println("constructor end (finalValue=" + finalValue + ")");
    }

    private static int registerStatic(String name) {
        System.out.println("static field init: " + name);
        return name.length();
    }

    private int registerInstance(String name) {
        System.out.println("instance field init: " + name);
        return name.length();
    }

    private int computeFinal() {
        System.out.println("computing final value");
        return 123;
    }

    public static void main(String[] args) {
        System.out.println("main start");
        new OrderExample2();
        System.out.println("--- creating second instance ---");
        new OrderExample2();
        System.out.println("main end");
    }
}
