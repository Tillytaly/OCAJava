package ThisAndSuper;

public class ThisAndSuperChild extends ThisAndSuper{
    public ThisAndSuperChild( String arg){
        System.out.println(arg);
    }
    public ThisAndSuperChild(){
        super();
//        this("Agata");
    }
}
