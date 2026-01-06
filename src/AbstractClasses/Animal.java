package AbstractClasses;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
