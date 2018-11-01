package Java_tasks_OOP_2.ball_class;

public class Ball
{
  public float x;
  public float y;
  private int radius;
  private float xDelta;
  private float yDelta;

  public Ball(float x,float y,int radius,int speed,int direction)
          throws IllegalArgumentException
  {
    this.x = x;
    this.y = y;
    if(radius >= 0)
    {
    this.radius = radius;
    }
    else
    {
      throw new IllegalArgumentException("radius must br > 0");
    }
    if(speed >= 0 && (direction <= Math.PI && direction >= -Math.PI))
    {
      this.xDelta = (float) (speed * Math.cos(direction));
      this.yDelta = (float) (-speed * Math.sin(direction));
    }
    else
    {
      if(speed < 0)
      {
        throw new IllegalArgumentException("speed must be >= 0");
      }
      else
      {
        throw new IllegalArgumentException("direction must be >= -PI and <= PI");
      }
    }//end first else
  }// end constructor

  public float getX()
  {
    return x;
  }

  public void setX(float x)
  {
    this.x = x;
  }

  public float getY()
  {
    return y;
  }

  public void setY(float y)
  {
    this.y = y;
  }

  public int getRadius()
  {
    return radius;
  }

  public void setRadius(int radius)
          throws IllegalArgumentException
  {
    if(radius >= 0)
    {
      this.radius = radius;
    }
    else
    {
      throw new IllegalArgumentException("radius must br > 0");
    }
  }

  public float getxDelta()
  {
    return xDelta;
  }

  public void setxDelta(float xDelta)
  {
    this.xDelta = xDelta;
  }

  public float getyDelta()
  {
    return yDelta;
  }

  public void setyDelta(float yDelta)
  {
    this.yDelta = yDelta;
  }

  public void move()
  {
    x += xDelta;
    y += yDelta;
  }

  public void reflectHorizontal()
  {
    xDelta = -xDelta;
  }

  public void reflectVertical()
  {
    yDelta = -yDelta;
  }

  @Override
  public String toString()
  {
    return "Ball[("+x+","+y+"), speed=("+xDelta+","+yDelta+")]";
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof Ball))
    {
      return false;
    }
    Ball ball = (Ball) obj;
    return Float.compare(xDelta, ball.xDelta) == 0 &&
            Float.compare(yDelta, ball.yDelta) == 0 &&
            radius == ball.radius;
  }

  @Override
  public int hashCode()
  {
    int result = 17;

    result = 31 * result + radius;
    result = 31 * result + Float.floatToIntBits(xDelta);
    result = 31 * result + Float.floatToIntBits(yDelta);

    return result;
  }

}
