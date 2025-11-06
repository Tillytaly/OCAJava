package Inheritance;

public class Abi extends Dog{

    public void logAbi(){
        super.setName("Abi");
        super.setAge(8);
        super.setBreed("Schnauzer");

        System.out.println(super.getName() + "is a " + super.getBreed() + "of age " + super.getAge());
    }
}
