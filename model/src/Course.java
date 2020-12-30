import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course
{
private String name;
private ArrayList<Lesson> schedule;

  public Course(String name)
  {
    this.name = name;
    ArrayList<Lesson> schedule = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfLessons()
  {
    int lessons = schedule.size();
    return lessons;
  }

  public void addLesson(Lesson lesson)
  {
    schedule.add(lesson);
  }

  public void removeLesson(Lesson lesson)
  {
    for (Lesson lessons: schedule)
    {
      if (lessons.equals(lesson))
        schedule.remove(lesson);
    }
  }

  public boolean hasLessonOnDate(Date date)
  {
    boolean hasLesson = false;
    for (Lesson lesson: schedule)
    {
     if (lesson.getDate().equals(date))
     hasLesson = true;
    }
     return hasLesson;
  }

  public ArrayList<Lesson> getAllLessons()
  {
    return schedule;
  }

  public ArrayList<String> getAllTopics()
  {
    ArrayList<String> topicArray = new ArrayList<String>();

    for (Lesson lesson: schedule)
    {
      topicArray.add(lesson.getTopic());
    }

    return  topicArray;
  }

  public ArrayList<OnlineLesson> getOnlineLessons()
  {
    ArrayList<OnlineLesson> onlineLessons = new ArrayList<OnlineLesson>();

    for (Lesson lesson: schedule)
    {
      if (lesson instanceof OnlineLesson)
      {
        OnlineLesson onlinelesson = (OnlineLesson) lesson;
        onlineLessons.add(onlinelesson);
      }
    }

    return onlineLessons;
  }

  public ArrayList<SkypeLesson> getSkypeLessons()
  {
    ArrayList<SkypeLesson> skypeLessons = new ArrayList<SkypeLesson>();

    for (Lesson lesson: schedule)
    {
      if (lesson instanceof SkypeLesson)
      {
        SkypeLesson skypeLesson = (SkypeLesson) lesson;
        skypeLessons.add(skypeLesson);
      }
    }
    return skypeLessons;
  }

  public ArrayList<DiscordLesson> getDiscordLessonsWithVoice()
  {
    ArrayList<DiscordLesson> voiceLessons = new ArrayList<DiscordLesson>();

    for (Lesson lesson: schedule)
    {
      if (lesson instanceof DiscordLesson)
      {
        DiscordLesson discord = (DiscordLesson) lesson;
        if (discord.usesVoiceChannel())
          voiceLessons.add(discord);
      }
    }

    return voiceLessons;
  }

  public ArrayList<File> getAllResources()
  {
    ArrayList<File> resources = new ArrayList<>();

    for (Lesson lesson: schedule)
    {
      File[] files = lesson.getResources();
      for (int i = 0; i < files.length; i++)
      {
        File res = files[i];
        resources.add(res);
      }
    }

    return resources;
  }

  public String toString()
  {
    String lessonString = "";
    for (Lesson lesson: schedule)
    {
      lessonString += lesson.toString() + "\n";
    }

    return "Course: " + name + "\n" + lessonString;
  }
}
