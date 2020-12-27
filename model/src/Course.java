import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course
{
private String name;
private ArrayList<Lesson> schedule;

  public Course(String name)
  {
    this.name = name;
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
    // TODO remove lesson
  }

  public boolean hasLessonOnDate(Date date)
  {
    //TODO check lesson on date
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


}
