import java.util.ArrayList;

public class Lesson
{
  private String topic;
  private Date date;
  private Time start, end;
  private File[] resources; //HVORFOR ER DU ET ARRAY

  public Lesson(String topic, Date date, Time start, Time end, File[] resources)
  {
    if (hasValidTime(start, end))
    {
      this.topic = topic;
      this.date = date.copy();
      this.start = start.copy();
      this.end = end.copy();
      this.resources = resources;
    }
    else
      System.out.println("Please make sure the input time is valid");
  }

  public String getTopic()
  {
    return topic;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public File[] getResources()
  {
    return resources;
  }

  public ArrayList<File> getAllPDFs()
  {
    ArrayList<File> PDFs = new ArrayList<>();
    for (int i = 0; i < resources.length; i++)
    {
      if (resources[i].isPDF())
        PDFs.add(resources[i]);
    }

    return PDFs;
  }

  public Time getDuration()
  {
    Time duration = start.timeTo(end);
    return duration;
  }

  public static boolean hasValidTime(Time startTime, Time endTime)
  {
    Time morning = new Time(8, 20, 00);
    Time night = new Time(21, 15, 00);

    boolean validTime = true;
    if (startTime.isBefore(morning))
      validTime = false;
    if ((!endTime.isBefore(night)))
      validTime = false;

    return validTime;
  }

  public void delayBy(int minutes)
  {
    if (minutes > 120)
    {
      System.out.println("Cannot delay by more than 120 minutes");
    }
    else
    {
      Time endCopy = end.copy();
      int delaySeconds = minutes * 60;
      int newTimeSeconds = endCopy.convertToSeconds() + delaySeconds;
      Time newEnd = new Time(newTimeSeconds);
      Time night = new Time(21, 15, 00);

      if (newEnd.isBefore(night) || newEnd.equals(night))
      {
        end = newEnd;
      }
      else if (!(newEnd.isBefore(night)))
        System.out.println("Lesson can not be delayed beyond 21:15");
    }
  }

  public String getDateTimeString()
  {
    return date.toString() + " Time: " + start.toString() + " - " + end.toString();
  }

  public String toString()
  {
    String res = "";
    for (int i = 0; i < resources.length; i++)
    {
      res += resources[i].toString() + "\n";
    }

    return getTopic() + "\n" +
        "Date: " + date.toString() + "\n" +
        "Start: " + start.toString() + "\n" +
        "End: " + end.toString() + "\n" +
        res;
  }
}
