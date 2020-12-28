public class DiscordLesson extends OnlineLesson
{
  private String channelName;
  private boolean voiceChannel;

  public DiscordLesson(String topic, Date date, Time start, Time end,
      File[] resources, boolean screenShare, String channel, boolean voice)
  {
    super(topic, date, start, end, resources, screenShare);
    channelName = channel;
    voiceChannel=voice;
  }

  public String getChannelName()
  {
    return channelName;
  }

  public boolean usesVoiceChannel()
  {
    return voiceChannel;
  }

  @Override public String nameOfSoftware()
  {
    return "Discord";
  }

  public String toString()
  {
    return super.toString() + "\n Channel name: " + getChannelName()
        + "\n Voice channel: " + usesVoiceChannel();
  }
}
