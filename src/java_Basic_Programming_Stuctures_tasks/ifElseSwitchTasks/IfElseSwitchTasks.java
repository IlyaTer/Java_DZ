package java_Basic_Programming_Stuctures_tasks.ifElseSwitchTasks;

import static java_Basic_Programming_Stuctures_tasks.ifElseSwitchTasks.Cars.*;

public class IfElseSwitchTasks
{
  public static void main(String[] args)
  {
    for(Cars car : Cars.values())
    {
      long startTime = System.nanoTime();
      switch(car)
      {
        case Ferrari:
          System.out.println(Ferrari);
          break;
        case Lamborghini:
          System.out.println(Lamborghini);
          break;
        case Bugatti:
          System.out.println(Bugatti);
          break;
        case Maserati:
          System.out.println(Maserati);
          break;
        case Zhiguli:
          System.out.println(Zhiguli);
          break;
        default:
          System.out.println("default");
          break;
      }//end switch
      startTime = System.nanoTime() - startTime;
      System.out.println("Final time after branches " + startTime);
    }//end for

    System.out.println();
    for(Cars car : Cars.values())
    {
      long startTime = System.nanoTime();
      if(car == Ferrari)
      {
        System.out.println(Ferrari);
      }else if(car == Lamborghini)
      {
        System.out.println(Lamborghini);
      }else if(car == Bugatti)
      {
        System.out.println(Bugatti);
      }else if(car == Maserati)
      {
        System.out.println(Maserati);
      }else if(car == Zhiguli)
      {
        System.out.println(Zhiguli);
      }else
      {
        System.out.println("default");
      }

      startTime = System.nanoTime() - startTime;
      System.out.println("Final time after branches " + startTime);
    }//end if else

    System.out.println();
    int[] mas = new int[50];
    for(int i = 0; i < mas.length; i++)
    {
      mas[i] = (int) (Math.random() * 11);
    }
    int[] valuesCount = new int[11];
    for(int i : mas)
    {
      long startTime = System.nanoTime();
      switch(i)
      {
        case 0:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 1:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 2:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 3:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 4:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 5:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 6:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 7:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 8:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 9:
          System.out.println(i);
          valuesCount[i]++;
          break;
        case 10:
          System.out.println(i);
          valuesCount[i]++;
          break;
        default:
          break;
      }//end switch

      startTime = System.nanoTime() - startTime;
      System.out.println("Final time after branches " + startTime);
    }//end for

    for(int i = 0; i < valuesCount.length; i++)
    {
      System.out.print(i + " " + valuesCount[i]);
      System.out.println();
    }


    valuesCount = new int[11];
    for(int i : mas)
    {
      long startTime = System.nanoTime();
      if(i == 0)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 1)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 2)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 3)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 4)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 5)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 6)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 7)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 8)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 9)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else if(i == 10)
      {
        System.out.println(i);
        valuesCount[i]++;
      }else
      {

      }
      startTime = System.nanoTime() - startTime;
      System.out.println("Final time after branches " + startTime);
    }//end for

    System.out.println();
    for(int i = 0; i < valuesCount.length; i++)
    {
      System.out.print(i + " " + valuesCount[i]);
      System.out.println();
    }
  }//end main

}
