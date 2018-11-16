package javaDz.tasks.collection;

import java.util.*;

public class TestJavaCollections
{
  private static void arrayListVsLinkedList(int cuontLaunch)
  {
    System.out.println("Test a");
    //ArrayList vs LinkedList
    int res = 0;
    long startTime = System.nanoTime();
    double avgAddTime = 0;
    double avgAddInPosTime = 0;
    double avgRemoveTime = 0;
    double avgGetTime = 0;
    double avgIndexOfTime = 0;
    double avgSetTime = 0;
    List<Integer> integerArrayList = new ArrayList<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerArrayList.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println("ArrayList test");
    for(int i = 0; i < cuontLaunch; i++)
    {
//test add
      startTime = System.nanoTime();
      integerArrayList.add(-111);
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test add in pos
      startTime = System.nanoTime();
      integerArrayList.add(10101,-55);
      startTime = System.nanoTime() - startTime;
      avgAddInPosTime += startTime;

//test remove
      startTime = System.nanoTime();
      integerArrayList.remove(1000000);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;

//test get
      startTime = System.nanoTime();
      res = integerArrayList.get(101);
      startTime = System.nanoTime() - startTime;
      avgGetTime += startTime;
//test indexOf
      startTime = System.nanoTime();
      res = integerArrayList.indexOf(-111);
      startTime = System.nanoTime() - startTime;
      avgIndexOfTime += startTime;

//test set
      startTime = System.nanoTime();
      res = integerArrayList.set(101010,-77);
      startTime = System.nanoTime() - startTime;
      avgSetTime += startTime;
    }//end test for

    System.out.println("Avg add time = " + avgAddTime / cuontLaunch);
    System.out.println("Avg add in pos time = " + avgAddInPosTime / cuontLaunch);
    System.out.println("Avg remove time = " + avgRemoveTime / cuontLaunch);
    System.out.println("Avg get time = " + avgGetTime / cuontLaunch);
    System.out.println("Avg indexOf time = " + avgIndexOfTime / cuontLaunch);
    System.out.println("Avg set time = " + avgSetTime / cuontLaunch);


    List<Integer> integers = new LinkedList<>();
    avgAddTime = 0;
    avgAddInPosTime = 0;
    avgRemoveTime = 0;
    avgGetTime = 0;
    avgIndexOfTime = 0;
    avgSetTime = 0;
    for(int i = 0; i < 1000000; i++)
    {
      integers.add(((int) (1 + Math.random() * 1000000)));
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
      startTime = System.nanoTime();
      res = integers.indexOf(-111);
      startTime = System.nanoTime() - startTime;
      avgIndexOfTime += startTime;

//test set
      startTime = System.nanoTime();
      res = integers.set(101010,-77);
      startTime = System.nanoTime() - startTime;
      avgSetTime += startTime;
    }//end test for

    System.out.println("Avg add time = " + avgAddTime / cuontLaunch);
    System.out.println("Avg add in pos time = " + avgAddInPosTime / cuontLaunch);
    System.out.println("Avg remove time = " + avgRemoveTime / cuontLaunch);
    System.out.println("Avg get time = " + avgGetTime / cuontLaunch);
    System.out.println("Avg indexOf time = " + avgIndexOfTime / cuontLaunch);
    System.out.println("Avg set time = " + avgSetTime / cuontLaunch);

  }

  private static void hashSetVsTreeSetVsLinkedHashSet(int cuontLaunch)
  {
    long startTime = 0;
    double avgAddTime = 0;
    double avgRemoveTime = 0;
    double avgContains = 0;
    System.out.println();
    System.out.println("Test b");
    Set<Integer> integerSet = new HashSet<>();
    for(int i = 0; i < 1000000; i++)
    {
      integerSet.add(((int) (1 + Math.random() * 1000000)));
    }
    System.out.println("HashSet test");
    for(int i = 0; i < cuontLaunch; i++)
    {
//test add
      startTime = System.nanoTime();
      integerSet.add(-111);
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test remove
      startTime = System.nanoTime();
      integerSet.remove(101);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;

//test contains
      startTime = System.nanoTime();
      integerSet.contains(10110);
      startTime = System.nanoTime() - startTime;
      avgContains += startTime;
    }

    System.out.println("Avg add HashSet = " + avgAddTime / cuontLaunch);
    System.out.println("Avg remove HashSet = " + avgRemoveTime / cuontLaunch);
    System.out.println("Avg contains HashSet = " + avgContains / cuontLaunch);


    Set<Integer> integerTreeSet = new TreeSet<>();
    avgAddTime = 0;
    avgRemoveTime = 0;
    avgContains = 0;

    for(int i = 0; i < 1000000; i++)
    {
      integerTreeSet.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println();
    System.out.println("TreeSet test");
    for(int i = 0; i < cuontLaunch; i++)
    {
//test add
      startTime = System.nanoTime();
      integerTreeSet.add(-111);
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test remove
      startTime = System.nanoTime();
      integerTreeSet.remove(101);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;

//test contains
      startTime = System.nanoTime();
      integerTreeSet.contains(10110);
      startTime = System.nanoTime() - startTime;
      avgContains += startTime;
    }

    System.out.println("Avg add TreeSet = " + avgAddTime / cuontLaunch);
    System.out.println("Avg remove TreeSet = " + avgRemoveTime / cuontLaunch);
    System.out.println("Avg contains TreeSet = " + avgContains / cuontLaunch);


    Set<Integer> integerLinkedHashSet = new LinkedHashSet<>();
    avgAddTime = 0;
    avgRemoveTime = 0;
    avgContains = 0;

    for(int i = 0; i < 1000000; i++)
    {
      integerLinkedHashSet.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println();
    System.out.println("LinkedHashSet test");
//test add
    for(int i = 0; i < cuontLaunch; i++)
    {
      startTime = System.nanoTime();
      integerLinkedHashSet.add(-111);
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test remove
      startTime = System.nanoTime();
      integerLinkedHashSet.remove(101);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;

//test contains
      startTime = System.nanoTime();
      integerLinkedHashSet.contains(10110);
      startTime = System.nanoTime() - startTime;
      avgContains += startTime;
    }

    System.out.println("Avg add LinkedHashSet = " + avgAddTime / cuontLaunch);
    System.out.println("Avg remove LinkedHashSet = " + avgRemoveTime / cuontLaunch);
    System.out.println("Avg contains LinkedHashSet = " + avgContains / cuontLaunch);

  }

  private static void hashMapVsTreeMapVsLinkedHashMap(int cuontLaunch)
  {
    //test c
    long startTime = 0;
    System.out.println();
    System.out.println("test c");
    Map<Integer, String> stringMap = new HashMap<>();
    double avgAddTime = 0;
    double avgGetTime = 0;
    double avgRemoveTime = 0;
    double avgContainsValue = 0;
    double avgContainsKey = 0;
    for(int i = 0; i < 1000000; i++)
    {
      stringMap.put(i,Integer.toString((int) (1 + Math.random() * 1000000)));
    }
    System.out.println();
    System.out.println("HasMap test");

    for(int i = 0; i < cuontLaunch; i++)
    {
//test put
      startTime = System.nanoTime();
      stringMap.put(-1,"Test");
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test get
      startTime = System.nanoTime();
      stringMap.get(1123);
      startTime = System.nanoTime() - startTime;
      avgGetTime += startTime;

//test contains key
      startTime = System.nanoTime();
      stringMap.containsKey(1123);
      startTime = System.nanoTime() - startTime;
      avgContainsKey += startTime;

//test cuntains value
      startTime = System.nanoTime();
      stringMap.containsValue("1233");
      startTime = System.nanoTime() - startTime;
      avgContainsValue += startTime;

//test remove key
      startTime = System.nanoTime();
      stringMap.remove(1233);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;
    }


    System.out.println("Avg Put HasMap = " + avgAddTime / cuontLaunch);
    System.out.println("Avg Get HasMap = " + avgGetTime / cuontLaunch);
    System.out.println("Avg containsKey HasMap = " + avgContainsKey / cuontLaunch);
    System.out.println("Avg containsValue HasMap = " + avgContainsValue / cuontLaunch);
    System.out.println("Avg remove HasMap = " + avgRemoveTime / cuontLaunch);

    Map<Integer, String> integerStringMap = new TreeMap<>();
    avgAddTime = 0;
    avgGetTime = 0;
    avgRemoveTime = 0;
    avgContainsValue = 0;
    avgContainsKey = 0;
    for(int i = 0; i < 1000000; i++)
    {
      integerStringMap.put(i,Integer.toString((int) (1 + Math.random() * 1000000)));
    }
    System.out.println();
    System.out.println("TreeMap test");
    for(int i = 0; i < cuontLaunch; i++)
    {
//test put
      startTime = System.nanoTime();
      integerStringMap.put(-1,"Test");
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test get
      startTime = System.nanoTime();
      integerStringMap.get(1123);
      startTime = System.nanoTime() - startTime;
      avgGetTime += startTime;

//test contains key
      startTime = System.nanoTime();
      integerStringMap.containsKey(1123);
      startTime = System.nanoTime() - startTime;
      avgContainsKey += startTime;

//test contains value
      startTime = System.nanoTime();
      integerStringMap.containsValue("1233");
      startTime = System.nanoTime() - startTime;
      avgContainsValue += startTime;

//test remove key
      startTime = System.nanoTime();
      integerStringMap.remove(1233);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;
    }

    System.out.println("Avg Put TreeMap = " + avgAddTime / cuontLaunch);
    System.out.println("Avg Get TreeMap = " + avgGetTime / cuontLaunch);
    System.out.println("Avg containsKey TreeMap = " + avgContainsKey / cuontLaunch);
    System.out.println("Avg containsValue TreeMap = " + avgContainsValue / cuontLaunch);
    System.out.println("Avg remove TreeMap = " + avgRemoveTime / cuontLaunch);


    Map<Integer, String> integerStrMap = new LinkedHashMap<>();
    avgAddTime = 0;
    avgGetTime = 0;
    avgRemoveTime = 0;
    avgContainsValue = 0;
    avgContainsKey = 0;
    for(int i = 0; i < 1000000; i++)
    {
      integerStrMap.put(i,Integer.toString((int) (1 + Math.random() * 1000000)));
    }
    System.out.println();
    System.out.println("LinkedHashMap test");
    for(int i = 0; i < cuontLaunch; i++)
    {
//test put
      startTime = System.nanoTime();
      integerStrMap.put(-1,"Test");
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test get
      startTime = System.nanoTime();
      integerStrMap.get(1123);
      startTime = System.nanoTime() - startTime;
      avgGetTime += startTime;

//test contains key
      startTime = System.nanoTime();
      integerStrMap.containsKey(1123);
      startTime = System.nanoTime() - startTime;
      avgContainsKey += startTime;

//test cuntains value
      startTime = System.nanoTime();
      integerStrMap.containsValue("1233");
      startTime = System.nanoTime() - startTime;
      avgContainsValue += startTime;

//test remove key
      startTime = System.nanoTime();
      integerStrMap.remove(1233);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;
    }


    System.out.println("Avg Put LinkedHashMap = " + avgAddTime / cuontLaunch);
    System.out.println("Avg Get LinkedHashMap = " + avgGetTime / cuontLaunch);
    System.out.println("Avg containsKey LinkedHashMap = " + avgContainsKey / cuontLaunch);
    System.out.println("Avg containsValue LinkedHashMap = " + avgContainsValue / cuontLaunch);
    System.out.println("Avg remove LinkedHashMap = " + avgRemoveTime / cuontLaunch);
  }

  public static void main(String[] args)
  {
    arrayListVsLinkedList(1000);
    hashSetVsTreeSetVsLinkedHashSet(1000);
    hashMapVsTreeMapVsLinkedHashMap(1000);
  }

}
