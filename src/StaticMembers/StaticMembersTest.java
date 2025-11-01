package StaticMembers;

public class StaticMembersTest {
    public void logTax(){
        StaticMembers newInstance = new StaticMembers();
        StaticMembers secondInstance = new StaticMembers();
       newInstance.logTax();
       newInstance.changeTax(0.2);
       newInstance.logTax();
       System.out.println("New tax instance");
       secondInstance.logTax();
    }
}
