package java.basic.programming.stuctures.tasks.mySorting;

import java.util.Arrays;

public class MySorting
{
  public static void bubbleSort(int[] mas)
  {
    for(int i = 0; i < mas.length; i++)
    {
      for(int j = 1; j < mas.length; j++)
      {
        if(mas[j] < mas[j - 1])
        {
          int temp = mas[j];
          mas[j] = mas[j - 1];
          mas[j - 1] = temp;
        }//end if
      }//end j for
    }//end i for
  }

  public static void selectSort(int[] mas)
  {
    int out, in, min;
    for(out = 0; out < mas.length; out++)
    {
      min = out;
      for(in = out + 1; in < mas.length; in++)
      {
        if(mas[in] < mas[min])
        {
          min = in;
        }
      }

      int temp = mas[out];
      mas[out] = mas[min];
      mas[min] = temp;
    }
  }

  public static void funcData(int n)
  {
    int[] testMas = new int[n];
    int[] testMas1 = new int[n];
    int[] testMas2 = new int[n];

    for(int i = 0; i < n; i++)
    {
      int promRes = (int) (Math.random()*101);
      testMas[i] = promRes;
      testMas1[i] = promRes;
      testMas2[i] = promRes;
    }

    long startTime = System.nanoTime();
    bubbleSort(testMas);
    startTime = System.nanoTime() - startTime;
    System.out.println("BubbleSort sorting worked for " + startTime + " nanoseconds");

    startTime = System.nanoTime();
    selectSort(testMas);
    startTime = System.nanoTime() - startTime;
    System.out.println("SelectSort sorting worked for " + startTime + " nanoseconds");

    startTime = System.nanoTime();
    Arrays.sort(testMas);
    startTime = System.nanoTime() - startTime;
    System.out.println("ClassicSort sorting worked for  " + startTime + " nanoseconds");

  }

  public static void main(String[] args)
  {
    funcData(10000);
  }// end main
}
