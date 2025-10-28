package AccessModifiersZoo;

import AccessModifiersZooTest.Cat;

public class AccessModifiersZoo {
    private String dog = "Abi";
    String cat = "Bułka";
    protected String hamster = "Bisia";

    public void logDog (){
        System.out.println(dog);

    }

    public static void logCat(){
        Cat bunia = new Cat();
        bunia.logCat();

//        System.out.println(bunia.bunia);
        // bunias name can not be accessed because its default therefore it can be used in package classes only
        System.out.println("Calling default key in a different package is not possible directly through the key binding, only through the method within the class the modifier has been declared in.");
    }
}
