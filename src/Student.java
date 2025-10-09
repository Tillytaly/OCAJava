//this is first java OCA lesson 12.07.2025
//simple java class
/* this is a comment too*/
/**this is a java doc**/
/**  new java doc
 * @AgataZiemniak
 * **/

public class Student{
    String name; //instance variable

    public Student() {
        System.out.println("Student Constructor");
    }
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}

//this class can not be public if its in the same file as Student class
class Book {}