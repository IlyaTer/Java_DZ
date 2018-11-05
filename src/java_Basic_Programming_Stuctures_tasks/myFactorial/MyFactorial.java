package java_Basic_Programming_Stuctures_tasks.myFactorial;

public class MyFactorial
{
  public static int factorialRec(int n)
  {
    if(n == 0 || n == 1)
    {
      return 1;
    }else
    {
      return n * factorialRec(n - 1);
    }
  }//end factorialRec

  public static int factorialCycle(int n)
  {
    int res = 1;

    for(int i = n; i > 0; i--)
    {
      res *= i;
    }

    return res;
  }

  public static void testFact(int n)
  {
    long startTime = System.nanoTime();
    factorialRec(n);
    startTime = System.nanoTime() - startTime;
    System.out.println("factorialRec worked for " + startTime + " nanoseconds");

    startTime = System.nanoTime();
    factorialCycle(n);
    startTime = System.nanoTime() - startTime;
    System.out.println("factorialCycle worked for " + startTime + " nanoseconds");
  }

  public static void main(String[] args)
  {
    testFact(10);
  }

}
