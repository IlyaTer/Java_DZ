package javaDz.tasks.oop.myTriangle_class;

import javaDz.tasks.oop.myPoint_class.MyPoint;

import java.util.Arrays;

public class MyTriangle
{
  private MyPoint v1;
  private MyPoint v2;
  private MyPoint v3;

  public MyTriangle(double x1,double y1,double x2,double y2,double x3,double y3)
  {
    this.v1 = new MyPoint(x1,y1);
    this.v2 = new MyPoint(x2,y2);
    this.v3 = new MyPoint(x3,y3);
  }

  public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3)
  {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }

  @Override
  public String toString()
  {
    return "MyTriangle[" +
            "v1=" + v1 +
            ", v2=" + v2 +
            ", v3=" + v3 +
            ']';
  }

  public double getPerimetr()
  {
    double perimetr = 0.0;
    perimetr += v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    return perimetr;
  }

  public String getType()
  {
    if((v1.distance(v2) == v2.distance(v3)) &&
            (v2.distance(v3) == v3.distance(v1)))
    {
      return "Equilateral";
    }
    if((v1.distance(v2) == v1.distance(v3)) ||
            (v2.distance(v1) == v2.distance(v3)) ||
            (v3.distance(v1) == v3.distance(v2)))
    {
      return "Isosceles";
    }
    return "Scalene";
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof MyTriangle))
    {
      return false;
    }
    MyTriangle myTriangle = (MyTriangle) obj;

    double a = v1.distance(v2),
            b = v2.distance(v3),
            c = v3.distance(v1);
    double d = myTriangle.v1.distance(myTriangle.v2),
            e = myTriangle.v2.distance(myTriangle.v3),
            f = myTriangle.v3.distance(myTriangle.v1);
    double acAngle = Math.asin(((v2.getX() - v1.getX()) *
            (v3.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v3.getY() - v1.getY())) / (a * c));
    double abAngle = Math.asin(((v1.getX() - v2.getX()) *
            (v3.getX() - v2.getX()) + (v1.getY() - v2.getY()) * (v3.getY() - v2.getY())) / (a * b));
    double bcAngle = Math.asin(((v1.getX() - v3.getX()) *
            (v2.getX() - v3.getX()) + (v1.getY() - v3.getY()) * (v2.getY() - v3.getY())) / (c * b));

    double deAngle = Math.asin(((myTriangle.v1.getX() - myTriangle.v2.getX()) *
            (myTriangle.v3.getX() - myTriangle.v2.getX()) +
            (myTriangle.v1.getY() - myTriangle.v2.getY()) * (myTriangle.v3.getY() - myTriangle.v2.getY())) / (c * b));
    double efAngle = Math.asin(((myTriangle.v1.getX() - myTriangle.v3.getX()) *
            (myTriangle.v2.getX() - myTriangle.v3.getX()) +
            (myTriangle.v1.getY() - myTriangle.v3.getY()) * (myTriangle.v2.getY() - myTriangle.v3.getY())) / (c * b));
    double fdAngle = Math.asin(((myTriangle.v3.getX() - myTriangle.v1.getX()) *
            (myTriangle.v2.getX() - myTriangle.v1.getX()) +
            (myTriangle.v3.getY() - myTriangle.v1.getY()) * (myTriangle.v2.getY() - myTriangle.v1.getY())) / (c * b));

    if(acAngle == deAngle && a == d && c == e)
    {
      return true;
    }
    if(abAngle == deAngle && a == d && b == e)
    {
      return true;
    }
    if(bcAngle == deAngle && b == d && c == e)
    {
      return true;
    }
    if(acAngle == efAngle && a == e && c == f)
    {
      return true;
    }
    if(abAngle == efAngle && a == e && b == f)
    {
      return true;
    }
    if(bcAngle == efAngle && b == e && c == f)
    {
      return true;
    }
    if(acAngle == fdAngle && a == f && c == f)
    {
      return true;
    }
    if(abAngle == fdAngle && a == f && b == d)
    {
      return true;
    }
    if(bcAngle == fdAngle && b == f && c == d)
    {
      return true;
    }

    return false;
  }

  @Override
  public int hashCode()
  {
    int result = 17;
    double[] promRes = {v1.distance(v2),v2.distance(v3),v3.distance(v1)};
    Arrays.sort(promRes);

    for(double d : promRes)
    {
      long pr = Double.doubleToLongBits(d);
      result = 31 * result + (int) (pr ^ (pr >>> 32));
    }


    return result;
  }


}
