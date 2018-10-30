package java_tasks_OOP.myTriangle_class;

import java_tasks_OOP.myPoint_class.MyPoint;

public class MyTriangle
{
  private MyPoint v1;
  private MyPoint v2;
  private MyPoint v3;

  public MyTriangle(double x1,double y1,double x2,double y2,double x3,double y3){
    this.v1 = new MyPoint(x1, y1);
    this.v2 = new MyPoint(x2, y2);
    this.v3 = new MyPoint(x3, y3);
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




}
