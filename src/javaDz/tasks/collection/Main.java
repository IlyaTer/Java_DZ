package javaDz.tasks.collection;

import javaDz.tasks.collection.classes.list.MyLinkedList;
import javaDz.tasks.collection.interfaces.ILinkedKist;

import java.util.LinkedList;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
    long startTime = System.nanoTime();
    int res = 0;
    double avgAddTime = 0;
    double avgAddInPosTime = 0;
    double avgRemoveTime = 0;
    double avgGetTime = 0;
    double avgIndexOfTime = 0;
    double avgSetTime = 0;
    int cuontLaunch = 100;

    ILinkedKist<Integer> integerILinkedKist = new MyLinkedList<>();

    for(int i = 0; i < 1000000; i++)
    {
      integerILinkedKist.add(123);
    }
    System.out.println("MyList test");
    for(int i = 0; i < cuontLaunch; i++)
    {
//test add
      startTime = System.nanoTime();
      integerILinkedKist.add(-111);
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test add in pos
      startTime = System.nanoTime();
      integerILinkedKist.add(10101,-55);
      startTime = System.nanoTime() - startTime;
      avgAddInPosTime += startTime;

//test remove
      startTime = System.nanoTime();
      integerILinkedKist.remove(1000000);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;

//test get
      startTime = System.nanoTime();
      res = integerILinkedKist.get(0);
      startTime = System.nanoTime() - startTime;
      avgGetTime += startTime;

//test indexOf
      startTime = System.currentTimeMillis();
      res = integerILinkedKist.indexOf(-111);
      startTime = System.currentTimeMillis() - startTime;
      avgIndexOfTime += startTime;

//test set
      startTime = System.nanoTime();
      res = integerILinkedKist.set(0,-77);
      startTime = System.nanoTime() - startTime;
      avgSetTime += startTime;
    }//end test for


//test toArray
    Object[] testMas = integerILinkedKist.toArray();

//test Iterator
    for(Integer i : integerILinkedKist)
    {

    }
//test clear
    integerILinkedKist.clear();

    System.out.println("Avg add time = " + avgAddTime/cuontLaunch);
    System.out.println("Avg add in pos time = " + avgAddInPosTime/cuontLaunch);
    System.out.println("Avg remove time = " + avgRemoveTime/cuontLaunch);
    System.out.println("Avg get time = " + avgGetTime/cuontLaunch);
    System.out.println("Avg indexOf time = " + avgIndexOfTime/cuontLaunch);
    System.out.println("Avg set time = " + avgSetTime/cuontLaunch);






//test LinkedList
    List<Integer> integers = new LinkedList<>();
    avgAddTime = 0;
    avgAddInPosTime = 0;
    avgRemoveTime = 0;
    avgGetTime = 0;
    avgIndexOfTime = 0;
    avgSetTime = 0;

    for(int i = 0; i < 1000000; i++)
    {
      integers.add(123);
    }
    System.out.println();
    System.out.println("LinkedList test");

    for(int i = 0; i < cuontLaunch; i++)
    {
//test add
      startTime = System.nanoTime();
      integers.add(-111);
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test add in pos
      startTime = System.nanoTime();
      integers.add(10101,-55);
      startTime = System.nanoTime() - startTime;
      avgAddInPosTime += startTime;

//test remove
      startTime = System.nanoTime();
      integers.remove(101);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;

//test get
      startTime = System.nanoTime();
      res = integers.get(101);
      startTime = System.nanoTime() - startTime;
      avgGetTime += startTime;

//test indexOf
      startTime = System.currentTimeMillis();
      res = integers.indexOf(-111);
      startTime = System.currentTimeMillis() - startTime;
      avgIndexOfTime += startTime;

//test set
      startTime = System.nanoTime();
      res = integers.set(101010,-77);
      startTime = System.nanoTime() - startTime;
      avgSetTime += startTime;
    }//end test for

    System.out.println("Avg add time = " + avgAddTime/cuontLaunch);
    System.out.println("Avg add in pos time = " + avgAddInPosTime/cuontLaunch);
    System.out.println("Avg remove time = " + avgRemoveTime/cuontLaunch);
    System.out.println("Avg get time = " + avgGetTime/cuontLaunch);
    System.out.println("Avg indexOf time = " + avgIndexOfTime/cuontLaunch);
    System.out.println("Avg set time = " + avgSetTime/cuontLaunch);

}

}
