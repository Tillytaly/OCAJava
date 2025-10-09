public class Dog {

    String name = "Toby";

    public Dog() {
        name = "Abi";

        System.out.println("Dog Constructor");
    }

    {System.out.println("Dog Constructor outside");}
}
