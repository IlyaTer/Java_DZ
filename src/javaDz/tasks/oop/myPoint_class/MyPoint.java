package javaDz.tasks.oop.myPoint_class;

public class MyPoint
{
  private static final double accuracy = 0.0000001;
  private double x = 0.0;
  private double y = 0.0;

  public MyPoint()
  {
  }

  public MyPoint(double x,double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public void setX(double x)
  {
    this.x = x;
  }

  public double getY()
  {
    return y;
  }

  public void setY(double y)
  {
    this.y = y;
  }

  public double[] getXY()
  {
    return new double[]{x,y};
  }

  public void setXY(int y,int x)
  {
    this.y = y;
    this.x = x;
  }

  @Override
  public String toString()
  {
    return "(" + x + "," + y + ")";
  }

  public double distance(double x,double y)
  {
    double promRes = Math.sqrt(Math.pow(x - this.x,2.0) + Math.pow(y - this.y,2.0));
    int par = (int) promRes;
    if((Math.abs(par - promRes) < Math.abs(par + 1 - promRes))
            && (Math.abs(par - promRes) < accuracy))
    {
      return par;
    }

    if((Math.abs(par - promRes) > Math.abs(par + 1 - promRes))
            && (Math.abs(par + 1 - promRes) < accuracy))
    {
      return par + 1;
    }

    return promRes;
  }

  public double distance(MyPoint another)
  {
    return distance(another.x,another.y);
  }

  public double distance()
  {
    return distance(0.0,0.0);
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof MyPoint))
    {
      return false;
    }
    MyPoint myPoint = (MyPoint) obj;

    return Double.compare(x,myPoint.x) == 0 &&
            Double.compare(y,myPoint.y) == 0;
  }

  @Override
  public int hashCode()
  {
    int result = 17;

    long promData = Double.doubleToLongBits(x);
    result = 31 * result + (int) (promData ^ (promData >>> 32));
    promData = Double.doubleToLongBits(y);
    result = 31 * result + (int) (promData ^ (promData >>> 32));

    return result;
  }

}



































