package java.tasks.oop.rectangle_class;

public class Rectangle
{
  private float length = 1.0f;
  private float width = 1.0f;

  public Rectangle()
  {
  }

  public Rectangle(float length,float width)
          throws IllegalArgumentException
  {
    if(length > 0.0f)
    {
      this.length = length;
    }else
    {
      throw new IllegalArgumentException("length must be > 0.0");
    }
    if(width > 0.0f)
    {
      this.width = width;
    }else
    {
      throw new IllegalArgumentException("width must be > 0.0");
    }
  }

  public float getLength()
  {
    return length;
  }

  public void setLength(float length)
          throws IllegalArgumentException
  {
    if(length > 0.0f)
    {
      this.length = length;
    }else
    {
      throw new IllegalArgumentException("length must be > 0.0");
    }
  }

  public float getWidth()
  {
    return width;
  }

  public void setWidth(float width)
          throws IllegalArgumentException
  {
    if(width > 0.0f)
    {
      this.width = width;
    }else
    {
      throw new IllegalArgumentException("width must be > 0.0");
    }
  }

  public double getArea()
  {
    return length * width;
  }

  public double getPerimetr()
  {
    return 2 * length + 2 * width;
  }

  @Override
  public String toString()
  {
    return "java_tasks_OOP.rectangle_class.Rectangle[" +
            "length=" + length +
            ", width=" + width +
            ']';
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof Rectangle))
    {
      return false;
    }
    Rectangle rectangle = (Rectangle) obj;

    return (length == rectangle.length && width == rectangle.width) ||
            (length == rectangle.width && width == rectangle.length);

  }

  @Override
  public int hashCode()
  {
    int result = 17;

    if(length < width)
    {
      result = 31 * result + Float.floatToIntBits(length);
      result = 31 * result + Float.floatToIntBits(width);
      return result;
    }else
    {
      result = 31 * result + Float.floatToIntBits(width);
      result = 31 * result + Float.floatToIntBits(length);
      return result;
    }
  }


}

