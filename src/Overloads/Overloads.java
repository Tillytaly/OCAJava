package Overloads;
//1.write a basic method with overload
//2.write an overload and investigate the order of choosing which overload will be run with:
//primitives, String, super types

public class Overloads {
//    NOK!
//    public String overlodeThis(String arg){return arg;};
    public void overlodeThis(Integer arg){System.out.println("Hello Integer " + arg);}
    public void overlodeThis(Number arg){System.out.println("Hello Number " + arg);}
    public void overlodeThis(String arg){System.out.println("Hello string " + arg);};
}
