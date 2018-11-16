package javaDz.tasks.collection;

import java.util.*;

public class TestJavaCollections
{
  private static void testListFunc(List<Integer> list, int cuontLaunch, String name)
  {
    int res = 0;
    long startTime = System.nanoTime();
    double avgAddTime = 0;
    double avgAddInPosTime = 0;
    double avgRemoveTime = 0;
    double avgGetTime = 0;
    double avgIndexOfTime = 0;
    double avgSetTime = 0;
    List<Integer> integerList = list;
    for(int i = 0; i < 1000000; i++)
    {
      integerList.add(((int) (1 + Math.random() * 1000000)));
    }

    System.out.println(name);
    for(int i = 0; i < cuontLaunch; i++)
    {
//test add
      startTime = System.nanoTime();
      integerList.add(-111);
      startTime = System.nanoTime() - startTime;
      avgAddTime += startTime;

//test add in pos
      startTime = System.nanoTime();
      integerList.add(10101,-55);
      startTime = System.nanoTime() - startTime;
      avgAddInPosTime += startTime;

//test remove
      startTime = System.nanoTime();
      integerList.remove(1000000);
      startTime = System.nanoTime() - startTime;
      avgRemoveTime += startTime;

//test get
      startTime = System.nanoTime();
      res = integerList.get(101);
      startTime = System.nanoTime() - startTime;
      avgGetTime += startTime;
//test indexOf
      startTime = System.nanoTime();
      res = integerList.indexOf(-111);
      startTime = System.nanoTime() - startTime;
      avgIndexOfTime += startTime;

//test set
      startTime = System.nanoTime();
      res = integerList.set(101010,-77);
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

  private static void arrayListVsLinkedList(int cuontLaunch)
  {
    System.out.println("Test a");
    //ArrayList vs LinkedList
    List<Integer> arList = new ArrayList<>();
    List<Integer> linkList = new LinkedList<>();
    testListFunc(arList, cuontLaunch, "ArrayList");
    System.out.println();
    testListFunc(linkList, cuontLaunch, "LinkedList");

  }

  private static void testSetFunc(Set<Integer> set, int cuontLaunch, String name)
  {
    long startTime = 0;
    double avgAddTime = 0;
    double avgRemoveTime = 0;
    double avgContains = 0;
    System.out.println();
    Set<Integer> integerSet = set;
    for(int i = 0; i < 1000000; i++)
    {
      integerSet.add(((int) (1 + Math.random() * 1000000)));
    }
    System.out.println(name);
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
  }

  private static void hashSetVsTreeSetVsLinkedHashSet(int cuontLaunch)
  {
    System.out.println();
    System.out.println("test b");
    Set<Integer> hashSet = new HashSet<>();
    Set<Integer> integerTreeSet = new TreeSet<>();
    Set<Integer> integerLinkedHashSet = new LinkedHashSet<>();

    testSetFunc(hashSet, cuontLaunch, "HashSet");
    testSetFunc(integerTreeSet, cuontLaunch, "TreeSet");
    testSetFunc(integerLinkedHashSet, cuontLaunch, "LinkedHashSet");
  }

  private static void testMapFunc(Map<Integer, String> map, int cuontLaunch, String name)
  {
    long startTime = 0;
    System.out.println();
    Map<Integer, String> stringMap = map;
    double avgAddTime = 0;
    double avgGetTime = 0;
    double avgRemoveTime = 0;
    double avgContainsValue = 0;
    double avgContainsKey = 0;
    for(int i = 0; i < 1000000; i++)
    {
      stringMap.put(i,Integer.toString((int) (1 + Math.random() * 1000000)));
    }
    System.out.println(name);

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
  }

  private static void hashMapVsTreeMapVsLinkedHashMap(int cuontLaunch)
  {
    //test c
    System.out.println();
    System.out.println("test c");
    Map<Integer, String> stringMap = new HashMap<>();
    Map<Integer, String> integerStringMap = new TreeMap<>();
    Map<Integer, String> integerStrMap = new LinkedHashMap<>();

    testMapFunc(stringMap, cuontLaunch, "HashMap");
    testMapFunc(integerStringMap, cuontLaunch, "TreeMap");
    testMapFunc(integerStrMap, cuontLaunch, "LinkedHashMap");

  }

  public static void main(String[] args)
  {
    arrayListVsLinkedList(1000);
    hashSetVsTreeSetVsLinkedHashSet(1000);
    hashMapVsTreeMapVsLinkedHashMap(1000);
  }

}
