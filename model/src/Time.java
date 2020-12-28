import java.text.DecimalFormat;

public class Time
{
  private int hour, minute, second;

  public Time(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Time(int totalTimeInSeconds)
  {
    int sek = totalTimeInSeconds%60;
    int allMins = (totalTimeInSeconds - sek)/60;
    int min = allMins%60;
    int hour = (allMins-min)/60;

    this.hour = hour;
    this.minute = min;
    this.second = sek;
  }

  public void tic()
  {
    second++;
    if (second > 59 && minute < 59)
    {
      second = 0;
      minute++;
    }

    if (second > 59 && minute == 59)
    {
      second = 0;
      minute = 0;
      hour++;
    }

    if (hour == 24)
    {
      second = 0;
      minute = 0;
      hour = 0;
    }
  }

  public void tic(int seconds)
  {
    for (int i = 0; i < seconds ; i++)
    {
      tic();
    }
  }

  public int convertToSeconds()
  {
    int hourToSec = hour * 60 * 60;
    int minToSec = minute * 60;

    return second + minToSec + hourToSec;
    // samlede sekunder = sekunder givet+ timerISekunder + minutterISekunder
  }

  public boolean isBefore(Time time2)
  {
    if (hour < time2.hour)
      return true;

    if (hour == time2.hour && minute < time2.minute)
      return true;

    if (hour == time2.hour && minute == time2.minute && second < time2.second)
      return true;

    return false;
  }

  public Time timeTo(Time time2)
  {
    int time1InSeconds = convertToSeconds();
    int time2InSeconds = time2.convertToSeconds();
    int difference;

    if (isBefore(time2))
    {
      difference = time2InSeconds-time1InSeconds;
    }
    else
    {
      System.out.println("Time2 is before time1");
      difference = time1InSeconds-time2InSeconds;
    }

    Time timeBetween = new Time(difference);
    return timeBetween;
  }
  public Time copy()
  {
    Time other;
    other = new Time(hour, minute, second);
    return other;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Time)
    {
      Time other = (Time) obj;
      return hour == other.hour && minute == other.minute
          && second == other.second;
    }
    return false;
  }

  public String toString()
  {
    DecimalFormat time = new DecimalFormat("00");
      return time.format(hour) + ":" + time.format(minute) + ":" + time
          .format(second);  }
}
