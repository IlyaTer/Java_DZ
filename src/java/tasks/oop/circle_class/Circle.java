package java.tasks.oop.circle_class;

public class Circle
{
  private double radius = 1.0;
  private String color = "red";

  public Circle()
  {
  }

  public Circle(double radius)
  {
    if(radius >= 0.0)
    {
      this.radius = radius;
    }
    else
    {
      throw new IllegalArgumentException("radius must be >= 0.0");
    }
  }

  public Circle(double radius,String color)
  {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public String getColor()
  {
    return color;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  @Override
  public String toString()
  {
    return "java_tasks_OOP.circle_class.Circle[" +
            "radius=" + radius +
            ", color=" + color + "]";
  }

  public double getArea(){
    return Math.PI * Math.pow(radius, 2.0);
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof Circle))
    {
      return false;
    }
    Circle circle = (Circle) obj;

    return Double.compare(radius, circle.radius) == 0 && color.equals(circle.color);
  }

  @Override
  public int hashCode()
  {
    int result = 17;

    long promRadius = Double.doubleToLongBits(radius);
    result = 31 * result + (int) (promRadius ^ (promRadius >>> 32));
    result = 31 * result + color.hashCode();

    return result;
  }

}
