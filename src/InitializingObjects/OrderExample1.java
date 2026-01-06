package InitializingObjects;

public class OrderExample1 {
    private static int staticField1 = registerStatic("staticField1");
    static {
        System.out.println("static block 1");
    }
    private static int staticField2 = registerStatic("staticField2");

    private int instanceField1 = registerInstance("instanceField1");
    {
        System.out.println("instance initializer block 1");
    }
    private final int finalInstance; // must be assigned by constructor

    public OrderExample1() {
        System.out.println("constructor start");
        finalInstance = 99;
        System.out.println("constructor end (finalInstance=" + finalInstance + ")");
    }

    private static int registerStatic(String name) {
        System.out.println("static field init: " + name);
        return name.length();
    }

    private int registerInstance(String name) {
        System.out.println("instance field init: " + name);
        return name.length();
    }

    public static void main(String[] args) {
        System.out.println("main start");
        new OrderExample1();
        System.out.println("main end");
    }
}