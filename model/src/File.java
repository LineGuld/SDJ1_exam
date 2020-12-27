import java.util.Objects;

public class File
{
  private String fileName, extension;

  public File(String fileName, String extension)
  {
    this.fileName = fileName;
    this.extension = extension;
  }

  public boolean isPDF()
  {
   return extension.equalsIgnoreCase("pdf");
  }

  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof File))
      return false;
    else
    {
      File other = (File) obj;
      return fileName.equals(other.fileName) && extension.equalsIgnoreCase(
          other.extension);
    }
  }

  public String toString()
  {
    return "File: " + fileName + "." + extension;
  }
}
