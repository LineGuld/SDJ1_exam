import javax.sound.midi.Soundbank;
import java.security.spec.RSAOtherPrimeInfo;

public class TestClass
{
  public static void main(String[] args)
  {
    // -------------- TESTING DATE -----------------
    /*
    System.out.println("------ DATE TEST --------");
    Date date1 = new Date(11, 12, 2013);
    Date date2 = new Date(9, 7, 2020);

    Date invalid = new Date(-10, 13, -1978);
    Date invalidDay = new Date(32, 12, 2013);

    Date dateCopy = date1.copy();

    System.out.println("Dates correct + toString works");
    System.out.println("Entered 11/12/2013:  " + date1);
    System.out.println("Entered -10/13/-1978:  " + invalid);
    System.out.println("Entered 32/12/2013:  " + invalidDay);

    System.out.println("\n ---Date1 = Date2, returns false ----");
    System.out.println(date1.equals(date2));

    System.out.println("\n ---Date 1 equals dateCopy, returns true---");
    System.out.println(date1.equals(dateCopy));
    */

    // ----------------- TESTING TIME -------------------
   /* System.out.println("------ Time TEST -------- \n");
    System.out.println("-------- constructor and toString test ------");
    Time time1 = new Time(11, 20, 19);
    Time time2 = new Time(3662);

    System.out.println("11:20:19 --- " + time1);
    System.out.println("3662 (01:01:02)--- " + time2);
    System.out.println();

    System.out.println("\n--- TicTok test --- ");
    time1.tic();
    System.out.println("Time1 tic: " + time1);

    time2.tic(60);
    System.out.println("Time2 + 60 seconds: " + time2);
    System.out.println();

    int seconds = time1.convertToSeconds();
    System.out.println("Convert to seconds ( 40820 ): " + seconds);

    System.out.println("\n--- copy + equals test ---");
    Time copy = time1.copy();
    System.out.println("equals true: " + time1.equals(copy));
    System.out.println("equals false: " + time1.equals(time2));

    System.out.println("\n--- is before test ---");
    System.out.println("False: " + time1.isBefore(time2));
    System.out.println("True: " + time2.isBefore(time1));

    System.out.println("\n--- time to test ---");
    System.out.println("From time2 to time1 (about 10 hours): " +  time2.timeTo(time1));*/

    // ----------------- TESTING FILE -------------------
    File file1 = new File("file1", "jpg");
    File file2 = new File("file2", "pdf");
    File file3 = new File("file3", "doc");
    File file4 = new File("file2", "pdf");

    System.out.println("---PDF---");
    System.out.println("False: " +  file1.isPDF());
    System.out.println("True: " + file2.isPDF());

    System.out.println("\n ---- equals ---");
    System.out.println("False: " + file1.equals(file3));
    System.out.println("True: " + file2.equals(file4));

    System.out.println("\n ---- String ---");
    System.out.println(file1);
    System.out.println(file2);
  }
}
