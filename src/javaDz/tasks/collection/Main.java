package javaDz.tasks.collection;

import javaDz.tasks.collection.classes.list.MyLinkedList;
import javaDz.tasks.collection.interfaces.ILinkedKist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
    long startTime = System.nanoTime();
    ILinkedKist<Integer> integerILinkedKist = new MyLinkedList<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerILinkedKist.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println("MyList test");
//test add
    startTime = System.nanoTime();
    integerILinkedKist.add(-111);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end MyList, time = " + startTime);

//test add in pos
    startTime = System.nanoTime();
    integerILinkedKist.add(10101,-55);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in pos in to end MyList, time = " + startTime);

//test remove
    startTime = System.nanoTime();
    integerILinkedKist.remove(101);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove from MyList, time = " + startTime);

//test get
    startTime = System.nanoTime();
    int res = integerILinkedKist.get(101);
    startTime = System.nanoTime() - startTime;
    System.out.println("get from MyList, time = " + startTime);
    System.out.println("result get " + res);

//test indexOf
    startTime = System.nanoTime();
    res = integerILinkedKist.indexOf(101010);
    startTime = System.nanoTime() - startTime;
    System.out.println("indexOf from MyList, time = " + startTime);
    System.out.println("result indexOf " + res);

//test set
    startTime = System.nanoTime();
    res = integerILinkedKist.set(101010,-77);
    startTime = System.nanoTime() - startTime;
    System.out.println("set in MyList, time = " + startTime);
    System.out.println("result set " + res);

integerILinkedKist.clear();
//test toArray
    Integer[] testMas = integerILinkedKist.toArray();
//test Iterator
    for(Integer i : integerILinkedKist)
    {

    }


//test LinkedList
    List<Integer> integers = new LinkedList<>();
    for(int i = 0; i < 1000000; i++)
    {
      integers.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println();
    System.out.println("LinkedList test");
//test add
    startTime = System.nanoTime();
    integers.add(-111);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end LinkedList, time = " + startTime);

//test add in pos
    startTime = System.nanoTime();
    integers.add(10101,-55);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in pos in to end LinkedList, time = " + startTime);

//test remove
    startTime = System.nanoTime();
    integers.remove(101);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove from LinkedList, time = " + startTime);

//test get
    startTime = System.nanoTime();
    res = integers.get(101);
    startTime = System.nanoTime() - startTime;
    System.out.println("get from LinkedList, time = " + startTime);
    System.out.println("result get " + res);

//test indexOf
    startTime = System.nanoTime();
    res = integers.indexOf(101010);
    startTime = System.nanoTime() - startTime;
    System.out.println("indexOf from LinkedList, time = " + startTime);
    System.out.println("result indexOf " + res);

//test set
    startTime = System.nanoTime();
    res = integers.set(101010,-77);
    startTime = System.nanoTime() - startTime;
    System.out.println("set in LinkedList, time = " + startTime);
    System.out.println("result set " + res);

  }

}
