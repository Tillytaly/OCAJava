package StaticMembers;
import static java.sql.Array.*;

//
//public class StaticMembers {
//}
//tasks for 30.10

//1.write a static variable in a class and modify its value. Figure out if its value changes only in further occurences. --> done
//2.rewrite to work properly: --> done;

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

//3.Add a static import to this file. --> done
//write a static block

public class StaticMembers {
    static double tax = 0.3;
    static double ROOM_WIDTH;
    static double ROOM_LENGTH;
    static double ROOM_SQUARE_METERS;

    static{
         ROOM_WIDTH = 223;
         ROOM_LENGTH = 456;
    }

    static{
       ROOM_SQUARE_METERS = (ROOM_WIDTH * ROOM_LENGTH) / 10000;
    }

    public void logTax(){
        System.out.println(tax);
    }

    public void changeTax(double taxValue){
        tax = taxValue;
    }

    public void logRoomSquareMeters(){
        System.out.println(ROOM_SQUARE_METERS);
        System.out.println(ROOM_LENGTH);


    }
}

