package javaDz.tasks.oop2.ball_class;

public class Container
{
  private int x1;
  private int y1;
  private int x2;
  private int y2;

  public Container(int x, int y, int width, int height)
          throws IllegalArgumentException
  {
    this.x1 = x;
    this.y1 = y;
    if(width > 0)
    {
      this.x2 = x1 + width;
    }
    else
    {
      throw new IllegalArgumentException("width must be > 0");
    }
    if(height > 0)
    {
      this.y2 = y1 + height;
    }
    else
    {
      throw new IllegalArgumentException("height must be > 0");
    }
  }

  public int getX()
  {
    return x1;
  }

  public int getY()
  {
    return y1;
  }

  public int getWidth()
  {
    return x2 - x1;
  }

  public int getHeight()
  {
    return y2 - y1;
  }

  public boolean collides(Ball ball)
  {
    if(ball.getX() < x1 || ball.getX() > x2) return false;
    if(ball.getY() < y1 || ball.getY() > y2) return false;
    if((ball.getX() - x1) < ball.getRadius() && (ball.getY() - y1) < ball.getRadius())return false;
    if((x2 - ball.getX()) < ball.getRadius() && (y2 - ball.getY()) < ball.getRadius())return false;
    return true;
  }

  @Override
  public String toString()
  {
    return "Container[("+x1+","+y1+"),("+x2+","+y2+")]";
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof Container))
    {
      return false;
    }
    Container container = (Container) obj;
    int width = x2 - x1;
    int height = y2 - y1;

    int objWidth = container.x2 - container.x1;
    int objHeight = container.y2 - container.y1;

    return (width == objWidth && height == objHeight) ||
            (width == objHeight && height == objWidth);
  }

  @Override
  public int hashCode()
  {
    int width = x2 - x1;
    int height = y2 - y1;

    int result = 17;

    if(width < height)
    {
      result = 31 * result + width;
      result = 31 * result + height;

      return  result;
    }
    else
    {
      result = 31 * result + height;
      result = 31 * result + width;

      return result;
    }
  }

  public static void main(String[] args)
  {
    Container container = new Container(1,1,10,15);
    Container container1 = new Container(2,10,15,10);
    Container container2 = new Container(3,1,10,15);
    System.out.println(container.hashCode());
    System.out.println(container1.hashCode());
    System.out.println(container2.hashCode());
  }

}
