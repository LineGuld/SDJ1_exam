import javax.sound.midi.Soundbank;
import java.security.spec.RSAOtherPrimeInfo;

public class TestClass
{
  public static void main(String[] args)
  {
    // -------------- TESTING DATE -----------------
    System.out.println("------ DATE TEST --------");
    Date date1 = new Date(11, 12, 2013);
    Date date2 = new Date(9, 7, 2020);

    Date invalid = new Date(-10, 13, -1978);
    Date invalidDay = new Date(32, 12, 2013);

    Date dateCopy = date1.copy();
/*

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
    System.out.println("------ Time TEST -------- \n");
    System.out.println("-------- constructor and toString test ------");
    Time time1 = new Time(11, 20, 19);
    Time time2 = new Time(3662);
    Time time3 = new Time(13, 15, 00);

    /*System.out.println("11:20:19 --- " + time1);
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

    /*System.out.println("---PDF---");
    System.out.println("False: " +  file1.isPDF());
    System.out.println("True: " + file2.isPDF());

    System.out.println("\n ---- equals ---");
    System.out.println("False: " + file1.equals(file3));
    System.out.println("True: " + file2.equals(file4));

    System.out.println("\n ---- String ---");
    System.out.println(file1);
    System.out.println(file2);*/

    File[] res = {file1, file2, file3, file4};

    // ----------------- TESTING Lesson-------------------

    Lesson regularLesson = new Lesson("Lesson", date2, time1, time3, res);
    DiscordLesson discordLesson1 = new DiscordLesson("DiscordLesson", date1,
        time1, time3, res, false, "channel1", true);
    SkypeLesson skypeLesson1 = new SkypeLesson("SkypeLesson", date1, time1,
        time3, res, true, "link.com");

    System.out.println("--- LESSONS TO STRING ---");
 /*   System.out.println(regularLesson);
    System.out.println();
    System.out.println(discordLesson1);
    System.out.println();
    System.out.println(skypeLesson1);*/

    Time early = new Time(8, 19, 55);
    Time late = new Time(21, 15, 05);
    Time lateish = new Time(21, 14, 00);

/*    System.out.println("\n Lektion tider men de er dumme");
    Lesson tooearly = new Lesson("Early", date2, early, time1, res);
    Lesson toolate = new Lesson("Late", date2, time1, late, res);

    System.out.println("\n --- lesson getters ---");
    // (9, 7, 2020)*/
    // 11:20:19 - 13:15:00

  /*  File[] resources = regularLesson.getResources();
    for (int i = 0; i < resources.length; i++)
    {
      System.out.println(resources[i].toString());
    }

    System.out.println("\n" + regularLesson.getTopic() +
        "\n" + regularLesson.getDate() +
        "\n" + regularLesson.getDuration() +
        "\n" + regularLesson.getDateTimeString() +
        "\n" + regularLesson.getAllPDFs()
    );

    System.out.println("\n --- delay ----");
    regularLesson.delayBy(120);
    System.out.println(regularLesson);

    regularLesson.delayBy(121);*/

    Lesson delayTest = new Lesson("Delayed", date2, time1, lateish, res);
   /* delayTest.delayBy(1);
    System.out.println(delayTest);
    delayTest.delayBy(1);
    System.out.println(delayTest);*/

    // ----------------- TESTING COURSE-------------------
    DiscordLesson discordLesson2 = new DiscordLesson("DiscordLesson2",
        new Date(23, 7, 2001), time1, time3, res, true, "channel1", true);
    DiscordLesson discordLesson3 = new DiscordLesson("DiscordLesson3",
        new Date(22, 3, 1991), time1, time3, res, true, "channel1", false);
    SkypeLesson skypeLesson2 = new SkypeLesson("SkypeLesson2",
        new Date(17, 11, 1994), time1, time3, res, true, "link.com");
    SkypeLesson removeLesson = new SkypeLesson("RemoveLesson",
        new Date(14, 7, 1991), time1, time3, res, true, "link.com");

    Course sdj = new Course("SDJ-SW1");
    sdj.addLesson(regularLesson);
    sdj.addLesson(discordLesson1);
    sdj.addLesson(skypeLesson1);
    sdj.addLesson(delayTest);
    sdj.addLesson(discordLesson2);
    sdj.addLesson(discordLesson3);
    sdj.addLesson(skypeLesson2);
    sdj.addLesson(removeLesson);

    //System.out.println(sdj);

    System.out.println(
        "\n Number of lessons: " + sdj.getNumberOfLessons() + "\n Name: " + sdj
            .getName() + "\n Lesson on date (false): " + sdj
            .hasLessonOnDate(new Date(11, 11, 2000))
            + "\n Lesson on date (true): " + sdj
            .hasLessonOnDate(new Date(17, 11, 1994)));

    sdj.removeLesson(removeLesson);
    sdj.removeLesson(delayTest);

    //System.out.println(sdj.getAllLessons());
    // System.out.println(sdj.getAllTopics());
    // System.out.println(sdj.getOnlineLessons());
    //System.out.println(sdj.getSkypeLessons());
    //System.out.println(sdj.getDiscordLessonsWithVoice());
    //System.out.println(sdj.getAllResources());

    // ----------------- TESTING GRADE-------------------

  }
}
