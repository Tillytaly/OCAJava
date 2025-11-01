package StaticMembers;
//2.rewrite to work properly:

//public class MyClass{
//    String hi = "Good Afternoon";
//    public static void greet1(){System.out.println("Hello!");};
//    private static void greet2(){System.out.println(System.out.println(hi));};
//    private  void greet3(){System.out.println("Good day!");};
//
//    public static void greetAll(){
//        greet1();
//        greet2();
//        greet3();
//    }
//}

public class MyClass {
     static MyClass myClassInstance = new MyClass();
    String hi = "Good Afternoon";

    public static void greet1(){System.out.println("Hello!");};
    private static void greet2(){System.out.println(myClassInstance.hi);};
private  void greet3(){System.out.println("Good day!");};

    public static void greetAll(){
        greet1();
        greet2();
        myClassInstance.greet3();
    }

    public static void useGreatAll(){
        greetAll();
    }
}
