public class Date
{
  private int day, month, year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;

    //TODO validator for Date
  }

  public Date copy()
  {
    Date copy = new Date(day, month, year);
    return copy;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
      return false;
    else
    {
      Date other = (Date) obj;
      return day == other.day && month == other.month && year == other.year;
    }
  }

  public String toString()
  {
    return "";
    // TODO date to string
  }
}
