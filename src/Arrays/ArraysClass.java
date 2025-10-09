package Arrays;
import java.util.Arrays;

public class ArraysClass {
    public static void createArray(){
        System.out.println("Success");

       int[] nums = new int[3];
       int [] nums2 = new int[3];
       int []nums3 = new int[3];
       int nums4[];

       int[] myNumbers, newNumbers;

       int myNumbers2[], a;

       int[] numsEqual = {1, 2, 3};
       int[] numsEqual2 = new int[] {1, 2, 3};

//       System.out.println(numsEqual.equals(numsEqual2));
       System.out.println(Arrays.toString(numsEqual2));


    }

    public static void mismatch(){
//        String[] mis = new String[]{"xyz", "abc"};
//        String[] mis1 = new String[]{"xyz", "abd"};
//
//        System.out.println(Arrays.mismatch(mis, mis1));
//
//        String[] mis2 = new String[]{"xyz", "abc"};
//        String[] mis3 = new String[]{"xyz", "abc"};
//
//        System.out.println(Arrays.mismatch(mis2, mis3));
    }

    public static void compare(){
//        int[] toCompare1 = new int[]{1,2,3};
//        int[] toCompare2 = new int[]{1,2,3};
//        Arrays.compare(toCompare1, toCompare2);
//
//        System.out.println(Arrays.compare(toCompare1, toCompare2));
//
//        int[] toCompare3 = new int[]{1,2,4};
//        int[] toCompare4 = new int[]{1,2,3};
//
//        System.out.println(Arrays.compare(toCompare3, toCompare4));
//
//        int[] toCompare5 = new int[]{1,2,3};
//        int[] toCompare6 = new int[]{1,2,4};
//
//        System.out.println(Arrays.compare(toCompare5, toCompare6));
//
//        String[] compare1 = new String[]{"abc", "def"};
//        String[] compare2 = new String[]{"abc", "fed"};
//
//        System.out.println(Arrays.compare(compare1, compare2));
//
//        String[] compare3 = new String[]{"abc", "def"};
//        String[] compare4 = new String[]{"abc", "defd"};
//
//
//        System.out.println(Arrays.compare(compare3, compare4));
    }

    public static void sortSearchCompare(){
        int[] arrToSort = new int[] {12, 4, 2};
        Arrays.sort(arrToSort);
        int result  = Arrays.binarySearch(arrToSort, 1);
        System.out.println(result);

        String.format("Initial array %s", Arrays.toString(arrToSort));
        System.out.println("Sorting");
        System.out.println(Arrays.toString(arrToSort));

        System.out.println(Arrays.binarySearch(arrToSort, 22));

        System.out.println("compare");
        int[] toCompare1 = new int[]{1,2,3};
        int[] toCompare2 = new int[]{1,2,3};
        System.out.println("compare");
//            compare();

        System.out.println("mismatch");
        String[] mis = new String[]{"xyz", "abc"};
        String[] mis1 = new String[]{"xyz", "abd"};

//        mismatch();

    }
}
