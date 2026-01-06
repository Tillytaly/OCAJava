package InitializingObjects;

public class Starter {
    public static void main(String[] args) {
        System.out.println("Starter.main start");

        System.out.println("Referencing LazyClass.STATIC_VALUE (class init expected now): " + LazyClass.STATIC_VALUE);

        System.out.println("Creating first LazyClass instance:");
        new LazyClass();

        System.out.println("Creating second LazyClass instance:");
        new LazyClass();

        System.out.println("Demonstrating final local variable capture:");
        demonstrateFinalCapture();

        System.out.println("Starter.main end");
    }

    private static void demonstrateFinalCapture() {
        final int captured = 5;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Captured final local = " + captured);
            }
        };
        r.run();
    }
}
