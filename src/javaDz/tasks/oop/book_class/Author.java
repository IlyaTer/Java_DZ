package javaDz.tasks.oop.book_class;

public class Author
{
  private String name;
  private String email;
  private char gender;

  public Author(String name,String email,char gender)
          throws IllegalArgumentException
  {
    this.name = name;
    this.email = email;
    if(gender == 'f' || gender == 'm')
    {
      this.gender = gender;
    }
    else
    {
      throw new IllegalArgumentException("gender must be f or m");
    }
  }

  public String getName()
  {
    return name;
  }

  public String getEmail()
  {
    return email;
  }

  public char getGender()
  {
    return gender;
  }

  @Override
  public String toString()
  {
    return "{" +
            "name='" + name +
            ", email='" + email +
            ", gender=" + gender +
            '}';
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof Author))
    {
      return false;
    }
    Author author = (Author) obj;
    return email.equals(author.email) &&
            name.equals(author.name) &&
            gender == author.gender;
  }

  @Override
  public int hashCode()
  {
    int result = 17;

    result = 31 * result + name.hashCode();
    result = 31 * result + email.hashCode();
    result = 31 * result + gender;

    return result;
  }

  public static void main(String[] args)
  {
    Author asd = new Author("asd", "asd", 'f');
  }


}
