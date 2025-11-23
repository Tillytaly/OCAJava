package CreatingClasses;
//1. create a class with private and protected fields and create a class that inherits this class. the other class should create a method to change these properties and second one to log these values.

public class CreatingClasses {
    private String name;
    protected int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
