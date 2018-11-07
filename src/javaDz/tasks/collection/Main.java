package javaDz.tasks.collection;

import javaDz.tasks.collection.classes.list.MyLinkedList;
import javaDz.tasks.collection.interfaces.ILinkedKist;

public class Main
{
  public static void main(String[] args)
  {
    long startTime = System.nanoTime();
    ILinkedKist<Integer> integerILinkedKist = new MyLinkedList<>();
    integerILinkedKist.add(15);
    integerILinkedKist.add(17);
    integerILinkedKist.add(11);
    integerILinkedKist.add(12);
    integerILinkedKist.add(13);
    integerILinkedKist.add(14);
    integerILinkedKist.add(15);
    integerILinkedKist.add(5);

    System.out.println(integerILinkedKist.indexOf(5));
    integerILinkedKist.add(3, 21);
    System.out.println(integerILinkedKist.indexOf(5));
    integerILinkedKist.add(31);
    System.out.println(integerILinkedKist.indexOf(31));
    System.out.println(integerILinkedKist.get(3));
    System.out.println("size list " + integerILinkedKist.size());

  }
}
