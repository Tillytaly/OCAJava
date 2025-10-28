package AccessModifiersZooTest;

import AccessModifiersZoo.AccessModifiersZoo;

public class AccessModifiersZooTest {

    public void logNames(){

        //    AccessModifiersZoo.dog;

        //    AccessModifiersZoo.cat;

        ////        AccessModifiersZoo.bisia;
        //    System.out.print("Accessing private modifier, default or protected wont work in another class.");

    }

    public static void useZooModifier(){

        AccessModifiersZoo accessModifiersZoo = new AccessModifiersZoo();
        accessModifiersZoo.logDog();
        System.out.println("calling a method which logs a private modifier from where its been declared will work, calling key directly wont.");
//        AccessModifiersZoo.dog;
    }

    public static void useCat(){
        Cat Bunia = new Cat();

        System.out.println(Bunia.bunia + " But calling default modifier is possible within the same package directly through key binding.");
    }
}
