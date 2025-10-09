package DateAndTime;
import java.time.*;
public class DateAndTime {
    public static void createLocalDates(){
        System.out.println("CreateLocalDates");
      LocalDate smth =   LocalDate.of(2022, Month.NOVEMBER, 2);

      //1 indeed indicates January
       LocalDate smth2 =  LocalDate.of(2022, 1, 2);

        System.out.println(smth);
        System.out.println(smth2);

        LocalTime time = LocalTime.of(21,55);
        LocalTime timeWithSeconds = LocalTime.of(21,33,30);
        System.out.println(time);
        System.out.println(timeWithSeconds);


        System.out.println("Date and time");

        
    }
    public static void dateAndTime(){
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now3 = LocalDateTime.now();
        ZonedDateTime now4 = ZonedDateTime.now();

        System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);
        System.out.println(now4);

        createLocalDates();
    }
}
