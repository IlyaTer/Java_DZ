package java.basic.programming.stuctures.tasks.multidimensionalArrays;

import java.util.Arrays;

public class MultidimensionalArrays
{
  public static void taskA()
  {
    int[][] masA = new int[8][8];
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0; i < masA.length; i++)
    {
      for(int j = 0; j < masA[i].length; j++)
      {
        masA[i][j] = (int) (1 + Math.random() * 98);
        if(i == j)
        {
          sum1 += masA[i][j];
        }
        if(j == masA[0].length - 1 - i)
        {
          sum2 += masA[i][j];
        }
      }//end j for
    }
    System.out.println("General diagonal sum = " + sum1);
    System.out.println("Side diagonal sum = " + sum2);
  }

  public static void taskB()
  {
    System.out.println();
    int[][] masB = new int[8][5];
    int maxEl = Integer.MIN_VALUE;
    int indexI = 0;
    int indexJ = 0;
    for(int i = 0; i < masB.length; i++)
    {
      for(int j = 0; j < masB[i].length; j++)
      {
        masB[i][j] = (int) (-99 + Math.random() * 199);
        if(masB[i][j] > maxEl)
        {
          maxEl = masB[i][j];
          indexI = i;
          indexJ = j;
        }
        System.out.print(masB[i][j] + " ");
      }//end j for
      System.out.println();
    }//end i for
    System.out.println();
    System.out.println("MaxEl" + maxEl + "[" + indexI + "][" + indexJ + "]");
  }

  public static void taskC()
  {
    System.out.println();
    int[][] masC = new int[8][5];
    int rowSumAbs = Integer.MIN_VALUE;
    int strNum = 0;
    for(int i = 0; i < masC.length; i++)
    {
      int promSum = 1;
      for(int j = 0; j < masC[i].length; j++)
      {
        masC[i][j] = (int) (-10 + Math.random() * 21);
        promSum *= masC[i][j];
        System.out.print(masC[i][j] + " ");
      }//end j for
      if(Math.abs(promSum) > rowSumAbs)
      {
        rowSumAbs = Math.abs(promSum);
        strNum = i;
      }
      System.out.println();
    }//end i for

    System.out.println();
    System.out.println("Max mul Abs str num = " + strNum);
  }

  public static void taskD()
  {
    System.out.println();
    System.out.println("task d");
    Integer[][] masD = new Integer[10][7];
    for(int i = 0; i < masD.length; i++)
    {
      for(int j = 0; j < masD[i].length; j++)
      {
        masD[i][j] = (int) (Math.random() * 101);
        System.out.print(masD[i][j] + " ");
      }
      System.out.println();
      Arrays.sort(masD[i],(f,s) ->
      {
        return (f - s) * (-1);
      });
    }

    System.out.println();
    for(int i = 0; i < masD.length; i++)
    {
      for(int j = 0; j < masD[i].length; j++)
      {
        System.out.print(masD[i][j] + " ");
      }
      System.out.println();
    }
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

  }//end main

}
