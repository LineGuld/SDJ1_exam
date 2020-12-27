public class Grade
{
  private int grade;
  private Course course;

  public Grade(int grade, Course course)
  {
    this.grade = grade;
    this.course = course;
  }

  public int getGrade()
  {
    return grade;
  }

  public Course getCourse()
  {
    return course;
  }

  public Grade copy()
  {
    Grade copy = new Grade(grade, course);
     return copy;
  }

  public String toString()
  {
    String string = "Your grade is: " + getGrade() + " in " + getCourse() + "\n";
    return string;
  }
}
