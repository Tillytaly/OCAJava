package InitializingObjects;

class Parent {
    private static int pStatic = traceStatic("Parent.pStatic");
    static {
        System.out.println("Parent static block");
    }

    private int pInst = traceInstance("Parent.pInst");
    {
        System.out.println("Parent instance block");
    }

    Parent() {
        System.out.println("Parent() constructor");
    }

    static int traceStatic(String name) {
        System.out.println("static init: " + name);
        return 1;
    }

    int traceInstance(String name) {
        System.out.println("instance init: " + name);
        return 1;
    }
}

public class Child extends Parent {
    private static int cStatic1 = traceStatic("Child.cStatic1");
    static {
        System.out.println("Child static block");
    }
    private static int cStatic2 = traceStatic("Child.cStatic2");

    private int cInst1 = traceInstance("Child.cInst1");
    {
        System.out.println("Child instance block");
    }
    private final int finalChild;

    Child() {
        System.out.println("Child() constructor start");
        finalChild = 7;
        System.out.println("Child() constructor end");
    }

    private static int traceStatic(String name) {
        System.out.println("static init: " + name);
        return 2;
    }

    private int traceInstance(String name) {
        System.out.println("instance init: " + name);
        return 2;
    }

    public static void main(String[] args) {
        System.out.println("Child.main start");
        new Child();
        new Child();
        System.out.println("Child.main end");
    }
}