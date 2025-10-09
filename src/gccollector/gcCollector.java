package gccollector;

public class gcCollector {
    public static void main(String[] args) {
            String a, b;
            a = new String("Emperor");
            b = new String("King");
            a=b;
            String c = a;
            a = null;
    }
}
