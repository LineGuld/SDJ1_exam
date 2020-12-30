public abstract class OnlineLesson extends Lesson
{
  private boolean screenSharing;

  public OnlineLesson(String topic, Date date, Time start, Time end,
      File[] resources, boolean screenShare)
  {
    super(topic, date, start, end, resources);
    screenSharing = screenShare;
  }

  public boolean teacherWillShareScreen()
  {
    return screenSharing;
  }

  public abstract String nameOfSoftware();

  public String toString()
  {
    return super.toString() + "\n Online Lesson"
        + "\n Screenshare: " +  teacherWillShareScreen() +
        "\n Software: " + nameOfSoftware();
  }
}
