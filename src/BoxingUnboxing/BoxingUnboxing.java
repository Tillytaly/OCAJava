package BoxingUnboxing;



//1.Perform both unboxing and boxing both manually and implicitly. --> done
//2.Perform both with autocasting.
//3.perform implicit casting with manualual boxing/unboxing
//4.perform implicit autoboxing/unboxing with manual casting.

public class BoxingUnboxing {
    public void boxAndUnbox(){
        int numb1 = 4;
        Integer int1 = Integer.valueOf(numb1);

        System.out.println("Converting int to Integer manually int is " + numb1 + ", Integer is " + int1);

        int numb2 = 5;
        Integer int2 = Integer.valueOf(numb2);
        int numb3 = int2.intValue();

        System.out.println("Converting Integer to int manually: int is " + numb3 + ", Integer is " + int2);

        int numb4 = 6;
        Integer int3 = numb4;

        System.out.println("Converting int to Integer implicitly: int is " + numb4 + ", Integer is " + int3);

        Integer int4 = Integer.valueOf(7);
        int numb5 = int4;
        System.out.println("Converting Integer to int implicitly: int is " + numb5 + ", Integer is " + int4);
    }

    public void boxingUnboxingAutocasting(){
//        int num1 = 4;
//        Long x = num1;
        //this is wrong;

        //this is correct
        long long2 = 3L;
        int num2 = (int) long2;
        Integer int1 = num2;

        int num1 = 4;
        Long l3 = (long) num1;
        //this is ok

        long l4 = num1;
        Long L4 = l4;
        //this is also ok



//        System.out.println(num1 + " " + long1);
        System.out.println(int1 + " int1" + long2);
    }
}