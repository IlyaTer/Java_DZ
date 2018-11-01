package Java_tasks_OOP_2.myComplex_class;

public class MyComplex
{
  private double real = 0.0;
  private double imag = 0.0;

  public MyComplex()
  {
  }

  public MyComplex(double real,double imag)
  {
    this.real = real;
    this.imag = imag;
  }

  public double getReal()
  {
    return real;
  }

  public void setReal(double real)
  {
    this.real = real;
  }

  public double getImag()
  {
    return imag;
  }

  public void setImag(double imag)
  {
    this.imag = imag;
  }

  public void getValue(double real,double imag)
  {
    this.real = real;
    this.imag = imag;
  }

  @Override
  public String toString()
  {
    return "(" + real + "+" + imag + "i)";
  }

  public boolean isReal()
  {
    if(real != 0.0)
    {
      return true;
    }
    return false;
  }

  public boolean isImaginary()
  {
    if(imag != 0.0)
    {
      return true;
    }
    return false;
  }

  public boolean equals(double real,double imag)
  {
    if(this.real == real && this.imag == imag)
    {
      return true;
    }
    return false;
  }

  public boolean equals(MyComplex rigth)
  {
    return equals(rigth.real,rigth.imag);
  }

  public double magnitude()
  {
    return Math.sqrt(Math.pow(real,2.0) + Math.pow(imag,2.0));
  }

  public double argumetn()
  {
    return Math.acos(real / magnitude());
  }

  public MyComplex add(MyComplex rigth)
  {
    return new MyComplex(real + rigth.real,imag + rigth.imag);
  }

  public MyComplex addNew(MyComplex rigth)
  {
    real += rigth.real;
    imag += rigth.imag;
    return this;
  }

  public MyComplex subtract(MyComplex rigth)
  {
    return new MyComplex(real - rigth.real,imag - rigth.imag);
  }

  public MyComplex subtractNew(MyComplex rigth)
  {
    real -= rigth.real;
    imag -= rigth.imag;
    return this;
  }

  public MyComplex multiply(MyComplex right)
  {
    return new MyComplex((real * right.real - imag * right.imag),(real * right.imag + imag * right.real));
  }

  public MyComplex divide(MyComplex right)
  {
    MyComplex result = this.multiply(right.conjugate());
    result.setReal(result.real / (Math.pow(right.real,2.0) + Math.pow(right.imag,2.0)));
    return result;
  }

  public MyComplex conjugate()
  {
    return new MyComplex(real,(-1.0) * imag);
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof MyComplex))
    {
      return false;
    }
    MyComplex myComplex = (MyComplex) obj;

    return Double.compare(real, myComplex.real) == 0 &&
            Double.compare(imag, myComplex.imag) == 0;
  }

  @Override
  public int hashCode()
  {
    int result = 17;

    long promRes = Double.doubleToLongBits(real);
    result = 31 * result + (int) (promRes ^ (promRes >>> 32));
    promRes = Double.doubleToLongBits(imag);
    result = 31 * result + (int) (promRes ^ (promRes >>> 32));

    return result;
  }

}
