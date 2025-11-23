package CreatingClasses;

public class CreatorExtension extends CreatingClasses{
    public void updateProps(int age, String name){
        this.age = age;

        setName(name);
    }

    public void logData(){
        System.out.println(age + " " + getName());
    };
}
