public class Lesson
{
  private String topic;
  private Date date;
  private Time start, end;
  private File[] resources;

  public Lesson(String topic, Date date, Time start, Time end, File[] resources)
  {
    this.topic = topic;
    this.date = date;
    this.start = start;
    this.end = end;
    this.resources = resources;

    //TODO dato-validator
  }

  public String getTopic()
  {
    return topic;
  }

  public Date getDate()
  {
    return date;
  }

  public File[] getResources()
  {
    return resources;
  }
}
