package Constructors;
//ad a class constructor and add some log to it
//overload a contructor
//play around access modifiers

public class Constructor {
    protected Constructor(int intArg, String str){
        System.out.println(intArg + "int arg " + str);
    }
    private Constructor(int arg){
        System.out.println("Log private" + arg);
    }
    public Constructor(String arg){
        System.out.println("Passed arg " + arg);

    }
    public Constructor(){
        System.out.println("Logging from constructor!");
    }
}
