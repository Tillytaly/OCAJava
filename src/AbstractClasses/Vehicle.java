package AbstractClasses;

import java.util.BitSet;

abstract public class Vehicle {
    int maxSpeed;

  public Vehicle () {
    maxSpeed = 50;
    }

    abstract void move();
}
 class Bicycle extends Vehicle {
    public Bicycle(){
        super();
    }
    @Override
    public void move(){
        System.out.println("Moved!");

    }
}
