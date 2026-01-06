// public class Names{
//     public static void name(String[] args) {
//         int n = 0;
//             // while(true){
//             //     System.out.println(n);
//             //     n++;

//             //     if(n == 3){
//             //         break;
//             //     }
//             // }

//         //labelling loops and breaking;
//         int  i = 0;
//         int j =0;

//         //     OUTER_LOOP: while(true){
//         //     i++;

//         //     System.out.println(i);

//         //         INNER_LOOP: while(true){
//         //         j++;   
//         //         System.out.println(j);
//         //         if(j == 3) break OUTER_LOOP;

//         //         }

//         //     }
//         // }


//         // while (i < 5){
            
//         //     System.out.println(i);
//         //     i++;

//         //     if(i==3) continue;
//         //     System.out.println(i);
//         // }


//         // for(int x = 0; x < 10; x++){
//         //     System.out.println(x);
//         // }

//         String[] cars = {"Ford", "Kia", "Fiat", "Citroen"};

//         //foreach loop

//         // for(String car : cars){
//         //     System.out.println(car);
//         // }
//     }
// }



// Lesson 5 = String Methods

import AbstractClasses.PDFDocument;
import AccessModifiersZoo.AccessModifiersZoo;
import AccessModifiersZooTest.AccessModifiersZooTest;
import Arrays.ArraysClass;
import Arrays.ArraysClass;
import BoxingUnboxing.BoxingUnboxing;
import Constructors.AnotherClass;
import Constructors.Constructor;
import CreatingClasses.CreatorExtension;
import DateAndTime.DateAndTime;
import Inheritance.Abi;
import InitializingObjects.OrderExample1;
import InitializingObjects.OrderExample2;
import Overloads.Overloads;
import SM.sm;
import StaticMembers.MyClass;
import StaticMembers.StaticMembers;
import StaticMembers.StaticMembersTest;
import ThisAndSuper.ThisAndSuperChild;
import methods.Methods;

public class Names {
    public static void main(String[] args){
        // createAString();
        // concatenate();
        // runEmptyLine();
        // methods();
//        build();
//        stringPool();
//        ArraysClass.createArray();
//        ArraysClass.sortSearchCompare();
//        DateAndTime.dateAndTime();
//        Methods.methods();
//        AccessModifiersZooTest.useZooModifier();
//        AccessModifiersZoo.logCat();
//        AccessModifiersZooTest.useCat();

//        StaticMembersTest staticMembersTest = new StaticMembersTest();
//        staticMembersTest.logTax();
//        MyClass.useGreatAll();
//
//        StaticMembers staticMembers = new StaticMembers();
//        staticMembers.logRoomSquareMeters();

//        BoxingUnboxing boxingUnboxing = new BoxingUnboxing();
//        boxingUnboxing.boxAndUnbox();
//        boxingUnboxing.boxingUnboxingAutocasting();

//        sm.log("Hello World");
//        Overloads overloads = new Overloads();
//        long l = 1L;
//        int i = 2;
//        overloads.overlodeThis(i);
//
//        Abi abi = new Abi();
//        abi.logAbi();
//        CreatorExtension cr = new CreatorExtension();
//        cr.updateProps(7,"Abi");
//        cr.logData();

//        Constructor constructor = new Constructor();
//        Constructor cons2 = new Constructor("Arg!");
//        Constructor consPrivate = new Constructor(5);
        //private constructor can not be accessed
//        Constructor cons3 = new Constructor( 7, "is"  );
        //protected constructor can only be called within package
//        AnotherClass ac = new AnotherClass();

//        ThisAndSuperChild child = new ThisAndSuperChild();
//        ThisAndSuperChild child2 = new ThisAndSuperChild("Im in this!");

//        OrderExample1 oe = new OrderExample1();
//        OrderExample2 oe2 = new OrderExample2();

        PDFDocument doc =  new PDFDocument();

        System.out.println(doc.getCopy());


    }
    public static void createAString(){
      String bunia = "Bunia";

      String abi = new String("Abi");  
    }

    public static void runEmptyLine(){
      System.out.println();
    }

    public static void logStr(String arg, String mess){
      System.out.print(arg);
      System.out.print(" " + mess);
      System.out.println("");
    }

    public static void logBool(boolean arg, String mess){
      System.out.print(arg);
      System.out.print(" " + mess);
      System.out.println("");
    }


    public static void concatenate(){
           String bunia = "Bunia";

      String abi = new String("Abi");

    //This is all valid
      System.out.println(bunia.concat(abi));
      System.out.println(bunia + abi);
      System.out.println(bunia + 8);
      System.out.println(bunia + null);

      bunia+=abi;
      System.out.println(bunia);
      
    }

    public static void methods(){
        String bunia = "Bunia";
      String abi = new String("Abi");

      System.out.println("indexOf:");

      //indexOf is case sensitive
      System.out.println(abi.indexOf("a"));
      System.out.println(abi.indexOf("test"));
      // looking for string do beginning from index 1
      System.out.println(abi.indexOf("bi", 1));
      System.out.println("Running index of starting from unexisting index does not cause an error");
      System.out.println(abi.indexOf("bi", 5));


      //substring
      System.out.println("substring:");
      // "substring starting from idx 2"
      System.out.println(abi.substring(2));
      //end idx not included
      //"substring starting from idx 0 and ending on 1"
      System.out.println(abi.substring(0,2));
      System.out.println("Running substring on unexisting indexes throws an out of bound error");
      //"out of bound exception" -> stops the program
      // System.out.println(abi.substring(4,6));

        runEmptyLine();

      // //to lower case / to upper case
      String name = "AGATA";
      System.out.println(name + " string is going to be processed");
      System.out.println(name.toLowerCase());

      runEmptyLine();

      // replace -> Case sensitive
      System.out.println("replace");
      System.out.println(name.replace("a", "y"));

      runEmptyLine();

      //charAt
      String charAt = "charAT";
      System.out.println("charAt");
      System.out.println(charAt.charAt(3));
      System.out.println("checking char at index which does not appear in a word causes out of bound exception error.");
      // System.out.println(charAt.charAt(9));


      runEmptyLine();
      //equals, equalsIgnoreCase
      String name1 = new String("John Wayne");
      String name2 = new String("John Wayne");
      String name3 = new String("john wayne");
  
      System.out.println("is name1 === name2");
      System.out.println(name1 == name2);
      System.out.println("equals name1  name2");
      System.out.println(name1.equals(name2));
      //equals compares content not reference;
      //equals ingore case ignores different cases
      System.out.println(name1.equalsIgnoreCase(name3));


        runEmptyLine();
        logStr("startsWith / endsWith", "");
        //case sensitive
        logBool(name1.startsWith("jo"), "");
        logBool(name1.startsWith("Jo"), "");
        logBool(name1.endsWith("ne"), "");

        //checking a char wont work and will throw a compilation error
        // System.out.println(name.endsWith('c'));


         runEmptyLine();
        logStr("contains", "");
        //will return false if letter casing does not match the original string
        logBool(name1.contains("jo"), "doesnt, because of casing");
        logBool(name1.contains("Jo"), "casing ok");
        
        runEmptyLine();
        logStr("replace", "");
        logStr(name1.replace("jo", "an"), "does not replace because of casing");
        logStr(name1.replace("Jo", "an"), "does not replace because of casing");
        
        

        runEmptyLine();
        logStr("strip/ trim/ stripLeading/ stripTrailing", "");
        //you can replace both strings and chars

        String toTrim = "  abc  ";
        //strip and trim do the same thing
        // logStr("|" + toTrim.trim() + "|", "trim");
        // logStr("|" + "  abc  ".strip() + "|", "");
    
        // logStr("|" + toTrim.stripLeading() + "|", "");
        // logStr("|" + toTrim.stripTrailing() + "|", "");


        //indent
        //if n = 0 does nothing
        //if n > 0 adds the same number of blank spaces to each line
        //if n < 0 tries to remove n whitespace chars from the beginning of line
        //normalizes existing line brakes
        //adds line break to the end of the line if its missing

        // String test = "GeeksforGeeks\nA Computer Science portal for geeks.";

        // logStr(test, "original");
        // logStr(test.indent(0), "indent()");
        // logStr(test.indent(1));
        // logStr(test.indent(-1));


        //stripIndent
        //removes all leading incidental whitespace
        //normalizes existing breaks
        //does not add line break at the end if missing

        // String test = "   abc";

        // System.out.println("|" + test.stripIndent() + "|");


        //transaleEscapes ???
          // String s = "Welcome \n to \n tutorials \n point";
          // System.out.println(s);
          // System.out.println(s.translateEscapes());

        //isEmpty, isBlank

        // String testing = "";

        // logBool(testing.isEmpty(), "isEmpty");
        // logBool(testing.isBlank(), "isBlank");

        // isEmpty when string.length == 0;
        //isBlank when string.length ==0, string == null, string has only spaces, or tabs


        //format  
    }

    public static void build(){
      System.out.println("String builder");
      System.out.println("Has several useful methods that can be used to be then converted to string");
      System.out.println("String builder is mutable!");

      StringBuilder name = new StringBuilder("John");
      name.append("Wayne");
      name.append(1).append(true);
      System.out.println(name);

      StringBuilder agata = new StringBuilder("Agata");
      System.out.println(agata);

      agata.insert(3, "Z.");

      System.out.println(agata);

      //this will not throw exception if end index it too big
      // string builder does not work with equals method
      
      System.out.println(agata.replace(1, 3, "abi"));

      StringBuilder est1 = new StringBuilder("jest");
      StringBuilder est2 =  new StringBuilder("jest");

      System.out.println("string builder does not work with equals method");
      logBool(est1 == est2, "== comparison of sting builder objects");
      logBool(est1.equals(est2), "equals comparison");

       //substring
       System.out.println("Substring is the only method which does not change the String object!"); 
    }

    public static void stringPool(){
        String agata = "Agata";
        String newAgata = "Agata";

        logBool(agata == newAgata, "string pool 7.1");

        String krystian = "Krystian";
        String krystianNew = " Krystian ".trim();

        logBool(krystianNew == krystian, "String pool 7.1b");

        String tafi = "Tafi Ziemniak";
        String tafiNew = "Tafi" + " Ziemniak";

        logBool(tafi == tafiNew, "String pool 7.1b addition");

        logBool(krystian == krystianNew.intern(), "String pool 7.1c");

        String abi = "abi";
        String abiNew = new String("abi");

        logBool(abi == abiNew, "String pool 7.1d");
    }
}
