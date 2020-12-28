public class SkypeLesson extends OnlineLesson
{
  private String inviteLink;

  public SkypeLesson(String topic, Date date, Time start, Time end,
      File[] resources, boolean screenShare, String link)
  {
    super(topic, date, start, end, resources, screenShare);
    link = inviteLink;
  }

  public String getInviteLink()
  {
    return inviteLink;
  }

  @Override public String nameOfSoftware()
  {
    return "Skype";
  }

  public String toString()
  {
    return super.toString() + "\n Invite link: " + getInviteLink();
  }
}
