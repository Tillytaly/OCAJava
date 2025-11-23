package ThisAndSuper;
//call this in the constructor of the class you create
//call super of the parent class in the constructor
//try calling both - what happens

public class ThisAndSuper {

    protected ThisAndSuper(String name){
        System.out.println("You reached me " + name + "!");

    }

    public ThisAndSuper(){
        this("Agata");
    }
}
