package Java_tasks_OOP_2.myPolinomial_class;

import java.util.Arrays;

public class MyPolinomial
{
  private double[] coeffs;

  public MyPolinomial(double... coeffs)
  {
    this.coeffs = coeffs;
  }

  public int getDegree()
  {
    for(int i = coeffs.length - 1; i > 0; i--)
    {
      if(coeffs[i] != 0.0)
      {
        return i;
      }
    }
    return 0;
  }

  @Override
  public String toString()
  {
    String resStr = "";
    for(int i = coeffs.length - 1; i > 0; i--)
    {
      if(coeffs[i] != 0.0)
      {
        resStr += coeffs[i] + "x^" + i;
        if((i - 1) != 0)
        {
          resStr += "+";
        }
      }
    }
    if(coeffs[0] != 0.0)
    {
      resStr += "+" + coeffs[0];
    }
    return resStr;
  }

  public double evaluate(double x)
  {
    double result = 0.0;
    for(int i = 0; i < coeffs.length; i++)
    {
      result += coeffs[i] * Math.pow(x,i);
    }
    return result;
  }

  public MyPolinomial add(MyPolinomial right)
  {
    int lenghtMin = (right.coeffs.length < this.coeffs.length)? right.coeffs.length : this.coeffs.length;
    int lenghtMax = (right.coeffs.length > this.coeffs.length)? right.coeffs.length : this.coeffs.length;
    double[] maxMas = (lenghtMax == coeffs.length)? coeffs : right.coeffs;
    double[] result = new double[lenghtMax];

    for(int i = 0; i < lenghtMin; i++)
    {
      result[i] = coeffs[i] + right.coeffs[i];
    }

    for(int i = lenghtMin; i < lenghtMax; i++)
    {
      result[i] = maxMas[i];
    }

    return new MyPolinomial(result);
  }

  public MyPolinomial multiply(MyPolinomial right)
  {
    double[] result = new double[right.getDegree() + this.getDegree() + 1];
    for(int i = 0; i < coeffs.length; i++)
    {
      for(int j = 0; j < right.coeffs.length; j++)
      {
        if(coeffs[i] != 0.0 && right.coeffs[j] != 0.0)
        {
          result[i + j] += coeffs[i] * right.coeffs[j];
        }
      }
    }

    return new MyPolinomial(result);
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return  true;
    }
    if(!(obj instanceof MyPolinomial))
    {
      return false;
    }
    MyPolinomial myPolinomial = (MyPolinomial) obj;

    return Arrays.equals(coeffs, myPolinomial.coeffs);
  }

  @Override
  public int hashCode()
  {
    int result = 17;

    long promRes = 0L;
    for(double d: coeffs)
    {
      promRes = Double.doubleToLongBits(d);
      result = 31 * result + (int) (promRes ^ (promRes >>> 32));
    }

    return result;
  }

}
