package javaDz.tasks.collection;

import java.util.*;

public class TestJavaCollections
{
  public static void main(String[] args)
  {
    System.out.println("Test a");
    //ArrayList vs LinkedList
    long startTime = System.nanoTime();
    List<Integer> integerArrayList = new ArrayList<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerArrayList.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println("ArrayList test");
//test add
    startTime = System.nanoTime();
    integerArrayList.add(-111);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end ArrayList, time = " + startTime);

//test add in pos
    startTime = System.nanoTime();
    integerArrayList.add(10101,-55);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in pos in to end ArrayList, time = " + startTime);

//test remove
    startTime = System.nanoTime();
    integerArrayList.remove(1000000);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove from ArrayList, time = " + startTime);

//test get
    startTime = System.nanoTime();
    int res = integerArrayList.get(0);
    startTime = System.nanoTime() - startTime;
    System.out.println("get from ArrayList, time = " + startTime);
    System.out.println("result get " + res);

//test indexOf
    startTime = System.nanoTime();
    res = integerArrayList.indexOf(-111);
    startTime = System.nanoTime() - startTime;
    System.out.println("indexOf from ArrayList, time = " + startTime);
    System.out.println("result indexOf " + res);

//test set
    startTime = System.nanoTime();
    res = integerArrayList.set(101010,-77);
    startTime = System.nanoTime() - startTime;
    System.out.println("set in ArrayList, time = " + startTime);
    System.out.println("result set " + res);





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
    res = integers.indexOf(-111);
    startTime = System.nanoTime() - startTime;
    System.out.println("indexOf from LinkedList, time = " + startTime);
    System.out.println("result indexOf " + res);

//test set
    startTime = System.nanoTime();
    res = integers.set(101010,-77);
    startTime = System.nanoTime() - startTime;
    System.out.println("set in LinkedList, time = " + startTime);
    System.out.println("result set " + res);


//test b
    System.out.println();
    System.out.println("Test b");
    Set<Integer> integerSet = new HashSet<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerSet.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println("HashSet test");
//test add
    startTime = System.nanoTime();
    integerSet.add(-111);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end LinkedList, time = " + startTime);

//test remove
    startTime = System.nanoTime();
    integerSet.remove(101);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove from LinkedList, time = " + startTime);

//test contains
    startTime = System.nanoTime();
    integerSet.contains(10110);
    startTime = System.nanoTime() - startTime;
    System.out.println("contains from LinkedList, time = " + startTime);



    Set<Integer> integerTreeSet = new TreeSet<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerTreeSet.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println();
    System.out.println("TreeSet test");
//test add
    startTime = System.nanoTime();
    integerTreeSet.add(-111);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end LinkedList, time = " + startTime);

//test remove
    startTime = System.nanoTime();
    integerTreeSet.remove(101);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove from LinkedList, time = " + startTime);

//test contains
    startTime = System.nanoTime();
    integerTreeSet.contains(10110);
    startTime = System.nanoTime() - startTime;
    System.out.println("contains from LinkedList, time = " + startTime);


    Set<Integer> integerLinkedHashSet = new LinkedHashSet<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerLinkedHashSet.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println();
    System.out.println("LinkedHashSet test");
//test add
    startTime = System.nanoTime();
    integerLinkedHashSet.add(-111);
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end LinkedList, time = " + startTime);

//test remove
    startTime = System.nanoTime();
    integerLinkedHashSet.remove(101);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove from LinkedList, time = " + startTime);

//test contains
    startTime = System.nanoTime();
    integerLinkedHashSet.contains(10110);
    startTime = System.nanoTime() - startTime;
    System.out.println("contains from LinkedList, time = " + startTime);


//test c
    System.out.println();
    System.out.println("test c");
    Map<Integer, String> stringMap = new HashMap<>();
    for(int i = 0; i < 1000000; i++)
    {
      stringMap.put(i ,Integer.toString((int) (1 + Math.random() * 1000000)));
    }
    System.out.println();
    System.out.println("HasMap test");
//test put
    startTime = System.nanoTime();
    stringMap.put(-1, "Test");
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end HashMap, time = " + startTime);

//test get
    startTime = System.nanoTime();
    stringMap.get(1123);
    startTime = System.nanoTime() - startTime;
    System.out.println("get from HashMap, time = " + startTime);

//test contains key
    startTime = System.nanoTime();
    stringMap.containsKey(1123);
    startTime = System.nanoTime() - startTime;
    System.out.println("containsKey from HashMap, time = " + startTime);

//test cuntains value
    startTime = System.nanoTime();
    stringMap.containsValue("1233");
    startTime = System.nanoTime() - startTime;
    System.out.println("containsValue from HashMap, time = " + startTime);

//test remove key
    startTime = System.nanoTime();
    stringMap.remove(1233);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove by key from HashMap, time = " + startTime);


    Map<Integer, String> integerStringMap = new TreeMap<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerStringMap.put(i ,Integer.toString((int) (1 + Math.random() * 1000000)));
    }
    System.out.println();
    System.out.println("TreeMap test");
//test put
    startTime = System.nanoTime();
    integerStringMap.put(-1, "Test");
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end HashMap, time = " + startTime);

//test get
    startTime = System.nanoTime();
    integerStringMap.get(1123);
    startTime = System.nanoTime() - startTime;
    System.out.println("get from HashMap, time = " + startTime);

//test contains key
    startTime = System.nanoTime();
    integerStringMap.containsKey(1123);
    startTime = System.nanoTime() - startTime;
    System.out.println("containsKey from HashMap, time = " + startTime);

//test cuntains value
    startTime = System.nanoTime();
    integerStringMap.containsValue("1233");
    startTime = System.nanoTime() - startTime;
    System.out.println("containsValue from HashMap, time = " + startTime);

//test remove key
    startTime = System.nanoTime();
    integerStringMap.remove(1233);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove by key from HashMap, time = " + startTime);


    Map<Integer, String> integerStrMap = new LinkedHashMap<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerStrMap.put(i ,Integer.toString((int) (1 + Math.random() * 1000000)));
    }
    System.out.println();
    System.out.println("LinkedHashMap test");
//test put
    startTime = System.nanoTime();
    integerStrMap.put(-1, "Test");
    startTime = System.nanoTime() - startTime;
    System.out.println("insetr in to end HashMap, time = " + startTime);

//test get
    startTime = System.nanoTime();
    integerStrMap.get(1123);
    startTime = System.nanoTime() - startTime;
    System.out.println("get from HashMap, time = " + startTime);

//test contains key
    startTime = System.nanoTime();
    integerStrMap.containsKey(1123);
    startTime = System.nanoTime() - startTime;
    System.out.println("containsKey from HashMap, time = " + startTime);

//test cuntains value
    startTime = System.nanoTime();
    integerStrMap.containsValue("1233");
    startTime = System.nanoTime() - startTime;
    System.out.println("containsValue from HashMap, time = " + startTime);

//test remove key
    startTime = System.nanoTime();
    integerStrMap.remove(1233);
    startTime = System.nanoTime() - startTime;
    System.out.println("remove by key from HashMap, time = " + startTime);

  }
}
