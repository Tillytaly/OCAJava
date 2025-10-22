package methods;
import java.util.Arrays;

public class Methods {
    public static int instanceVariable;

    public static void methods(){
        variables();
    }

    public static void variables(){
        System.out.println("Instance variable was not initialised therefore its value defaulted to " + instanceVariable);

        int localVariable;
//        System.out.println(localVariable);
        localVariable = 9;
        System.out.println(localVariable);

        final int finalTest = 5;
//        finalTest = 6;

        System.out.println(finalTest + " final test variable can not be changed otherwise compilation error will occur");

       final int[] arr = new int[]{1, 2, 3};

       System.out.println("However final array can be modified. It keeps only its reference" + Arrays.toString(arr));

       arr[0] = 2;
       System.out.println("Final Array after modifications " + Arrays.toString(arr));
    }
}
