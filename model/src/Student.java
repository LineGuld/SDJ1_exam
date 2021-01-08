import java.util.ArrayList;

public class Student
{
  private int studentNUmber;
  private String name;
  private ArrayList<Course> courses;
  private ArrayList<Grade> grades;

  public Student(int studentNUmber, String name)
  {
    this.studentNUmber = studentNUmber;
    this.name = name;
    courses = new ArrayList<>();
    grades = new ArrayList<>();
  }

  public int getStudentNUmber()
  {
    return studentNUmber;
  }

  public String getName()
  {
    return name;
  }

  public void addCourse(Course course)
  {
    courses.add(course);
  }

  public void addGrade(int grade, Course course)
  {
    boolean hasCourse = false;

    //For each course in courelist, the loop checks if the course in the list is tha same as provided.
    //If they are the same is sets true, and otherwise it does nothing. In this way the loop can only change
    // the boolean to true and will not change to false when the loop continues after getting a true.
    for (Course course1 : courses)
    {
      if (course1.equals(course))
        hasCourse = true;
    }

    if (hasCourse)
    {
      Grade theGrade = new Grade(grade,
          course); //Turn information given into grade-object
      grades.add(theGrade);
    }
    else
      System.out.println("Student not taking that course, please enter correct course");
  }

  public double getGradeAverage()
  {
    double average = 0;

    for (Grade grade : grades)
    {
      average += grade.getGrade();
    }

    average = average / grades.size();

    return average;
  }

  public Grade[] getAllGrades()
  {
    Grade[] gradeArray = new Grade[grades.size()];
    for (int i = 0; i < grades.size(); i++)
    {
      Grade grade = grades.get(i);
      gradeArray[i] = grade;
    }

    return gradeArray;
  }

  public Course[] getAllCourses()
  {
    Course[] courseArray = new Course[courses.size()];
    for (int i = 0; i < courses.size(); i++)
    {
      Course course = courses.get(i);
      courseArray[i] = course;
    }

    return courseArray;
  }
}
