package java_Basic_Programming_Stuctures_tasks.tasksArrays;

import java.util.Arrays;

public class TasksArrays
{
  public static void taskA()
  {
    System.out.println("Task a");
    int[] mas = new int[50];
    for(int i = 1, j = 0; j < mas.length; i += 2,j++)
    {
      mas[j] = i;
    }

    for(int i = 0; i < mas.length; i++)
    {
      System.out.print(mas[i] + " ");
    }

    System.out.println();
    for(int i = mas.length - 1; i >= 0; i--)
    {
      System.out.print(mas[i] + " ");
    }
  }

  public static void taskB()
  {
    System.out.println();
    System.out.println();
    System.out.println("Task b");
    int[] mas1 = new int[20];

    int isModTwo = 0;
    int notModTwo = 0;

    for(int i = 0; i < mas1.length; i++)
    {
      mas1[i] = (int) (Math.random() * 11);
      if(mas1[i] % 2 == 0 && mas1[i] != 0)
      {
        isModTwo++;
      }else if(mas1[i] != 0)
      {
        notModTwo++;
      }
      System.out.print(mas1[i] + " ");
    }//end for
    System.out.println();
    System.out.println("isModTwo = " + isModTwo);
    System.out.println("notModTwo = " + notModTwo);
  }

  public static void taskC()
  {
    System.out.println();
    System.out.println("Task c");
    int[] mas2 = new int[10];
    String firstView = "";
    String nextView = "";

    for(int i = 0; i < mas2.length; i++)
    {
      mas2[i] = (int) (1 + Math.random() * 100);
      firstView += mas2[i] + " ";
      if(i % 2 != 0)
      {
        nextView += 0 + " ";
      }else
      {
        nextView += mas2[i] + " ";
      }
    }//endfor
    System.out.println(firstView);
    System.out.println(nextView);
  }

  public static void taskD()
  {
    System.out.println();
    System.out.println("Task d");
    int[] mas3 = new int[15];
    int maxEl = Integer.MIN_VALUE;
    int minEl = Integer.MAX_VALUE;
    int lastMaxIndex = 0;
    int lastMinIndex = 0;
    for(int i = 0; i < mas3.length; i++)
    {
      mas3[i] = (int) (-50 + Math.random() * 101);
      if(mas3[i] >= maxEl)
      {
        maxEl = mas3[i];
        lastMaxIndex = i;
      }
      if(mas3[i] <= minEl)
      {
        minEl = mas3[i];
        lastMinIndex = i;
      }
    }//end for

    System.out.println("maxEl = " + maxEl + " lastMaxIndex = " + lastMaxIndex);
    System.out.println("minEl = " + minEl + " lastMinIndex = " + lastMinIndex);
  }

  public static void taskE()
  {
    System.out.println();
    System.out.println("Task e");
    int[] masTe1 = new int[10];
    int[] masTe2 = new int[10];
    double AvgM1 = 0.0;
    double AvgM2 = 0.0;
    String firstMas = "";
    String nextMas = "";
    for(int i = 0; i < masTe1.length; i++)
    {
      masTe1[i] = (int) (Math.random() * 11);
      AvgM1 += masTe1[i];
      firstMas += masTe1[i] + " ";
      masTe2[i] = (int) (int) (Math.random() * 11);
      AvgM2 += masTe2[i];
      nextMas += masTe2[i] + " ";
    }

    System.out.println(firstMas);
    System.out.println(nextMas);
    AvgM1 = AvgM1 / 10;
    System.out.println("AvgM1 = " + AvgM1);
    AvgM2 = AvgM2 / 10;
    System.out.println("AvgM2 = " + AvgM2);

    if(AvgM1 > AvgM2)
    {
      System.out.println("Max AvgM1 = " + AvgM1);
    }else if(AvgM2 > AvgM1)
    {
      System.out.println("Max AvgM2 = " + AvgM2);
    }else
    {
      System.out.println("AVG equasl = " + AvgM1);
    }
  }

  public static void taskF()
  {
    System.out.println();
    System.out.println("Task f");
    int[] fmas = new int[10];
    for(int i = 0; i < fmas.length; i++)
    {
      fmas[i] = (int) (1 + Math.random() * 10);
    }
    Arrays.sort(fmas);
    int fmaxEl = fmas[0];
    int fmaxCount = 1;
    int fmaxCountProm = 1;
    for(int i = 0; i < fmas.length; i++)
    {
      System.out.print(fmas[i] + " ");
    }
    for(int i = 1; i < fmas.length; i++)
    {
      if(fmas[i] == fmas[i - 1])
      {
        fmaxCountProm++;
      }else
      {
        if(fmaxCountProm > fmaxCount)
        {
          fmaxEl = fmas[i - 1];
          fmaxCount = fmaxCountProm;
          fmaxCountProm = 1;
        }else
        {
          fmaxCountProm = 1;
        }
      }
    }
    if(fmaxCountProm > fmaxCount)
    {
      fmaxEl = fmas[fmas.length - 1];
      fmaxCount = fmaxCountProm;
      fmaxCountProm = 1;
    }
    else
    {
      fmaxCountProm = 1;
    }


    System.out.println();
    System.out.println("MaxCountEl = " + fmaxEl + " Count = " + fmaxCount);


    for(int i = fmaxCount; i > 0; i--)
    {
      String promStr = "";
      for(int j = 1; j < fmas.length; j++)
      {
        if(fmas[j] == fmas[j - 1])
        {
          fmaxCountProm++;
        }else
        {
          if(fmaxCountProm == i)
          {
            promStr += fmas[j - 1] + " ";
            fmaxCountProm = 1;
          }
          else
          {
            fmaxCountProm = 1;
          }
        }
      }//end j for
      if(fmaxCountProm == i)
      {
        promStr += fmas[fmas.length - 1] + " ";
      }
      if(!(promStr.length() == 2 || promStr.length() == 3 || promStr.length() == 0))
      {
        System.out.println(promStr + "count " + i);
      }
      fmaxCountProm = 1;
    }//end i for
  }

  public static void main(String[] args)
  {
    //task a
    taskA();

    //task b
    taskB();

    //task c
    taskC();

    //task d
    taskD();

    //task e
    taskE();

    //task f
    taskF();

  }//end main

}
