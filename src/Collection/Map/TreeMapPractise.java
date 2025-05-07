package Collection.Map;

import java.util.Map;
import java.util.TreeMap;


// order follows on implements --> Iterable (interface) --> Map (interface) --> treeMap (class)

// internally follows --> buckets.

// default capacity --> 11
// incially capacity --> 11
// maintain insertion order --> no
// maintain sorted order --> Yes --> based on keys it will get desc;
// why to use --> for keys(unique keys) and values;
// random access --> Yes
// allow null values --> no
// allow duplicates --> no --> only values will be duplicated.  keys must be unique .
// capacity can be increased --> No --> We treeMap<>(20)
// is it synchronised --> No
// what is it good at? // for multi threading.

// purely implementation of Map

public class TreeMapPractise {
    public static void main(String[] args) {

        Map<Integer,String> treeMap= new TreeMap<>(); // creation of map 

        // keys must be unique then only records will be added.
        treeMap.put(14,"raju");
        treeMap.put(15,"siva");
        treeMap.put(12,"loki");
        treeMap.put(12,"loki232");
        treeMap.putAll(treeMap);
        treeMap.put(13,"raju");
        treeMap.put(18,"may be one");
        treeMap.put(16,"rajesh");
        treeMap.put(1,null);
        treeMap.put(3,null);


        System.out.println( treeMap.keySet());  // list of set of keys it will return
        System.out.println(treeMap.values());   // list of collection of values

//        for(Integer i:treeMap.keySet()){
//            System.out.println(treeMap.get(i)); // get element
//        }

        System.out.println(treeMap.remove(0)); // delete
        System.out.println(treeMap.containsKey(12));
        System.out.println(treeMap.containsValue("loki"));

        treeMap.putIfAbsent(12,"raj");
        treeMap.put(13,"lokisds");

       // treeMap.clear(); delete all
        System.out.println(treeMap.size());
        System.out.println(treeMap);

        for (Map.Entry<Integer,String> stringEntry: treeMap.entrySet()){
            System.out.println(stringEntry.getKey() +">>>>" + stringEntry.getValue());
        }

    }
}
