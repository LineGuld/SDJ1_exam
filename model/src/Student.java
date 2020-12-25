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
    //TODO skal kun tilføje karakteren hvis den er på den studerendes kursusliste
  }

  public double getGradeAverage()
  {
    double average;
    //TODO get sll grades, divide by length of array
    return average;
  }

  public Grade[] getAllGrades()
  {
    Grade[] gradeArray;

  }
}
