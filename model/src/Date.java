import java.text.DecimalFormat;

public class Date
{
  private int day, month, year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;

    if (month < 1)
      this.month = 1;

    if (month > 12)
      this.month = 12;

    if (year < 0)
      this.year = -year;

    if (day < 1)
      day = -day;

    // Making sure the month doesn't get too many days
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        || month == 10 || month == 12)
      if (day > 31)
        day = 31;

    if (month == 4 || month == 6 || month == 9 || month == 11)
      if (day > 30)
        day = 30;

      // Checkinh for leapyear in febuary
    if (month == 2 && year % 4 == 0)
      if (day > 29)
      {
        day = 29;
      }
      else if (year % 4 != 0)
        if (day > 28)
          day = 28;

    this.day = day;
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
    DecimalFormat dayMonth = new DecimalFormat("00");
    DecimalFormat yyyy = new DecimalFormat("0000");

    return dayMonth.format(day) + "/" + dayMonth.format(month) + "/" + yyyy
        .format(year);
  }
}
