package Collection.Map;

import java.util.*;


// order follows on implements --> Iterable (interface) --> Map (interface) --> HashTable (class)

// internally follows --> buckets.

// default capacity --> 11
// incially capacity --> 11
// maintain insertion order --> no
// maintain sorted order --> Yes --> based on keys it will get asc;
// why to use --> for keys(unique keys) and values;
// random access --> Yes
// allow null values --> no
// allow duplicates --> no --> only values will be duplicated.  keys must be unique .
// capacity can be increased --> Yes --> We Hashtable<>(20)
// is it synchronised --> Yes
// what is it good at? // for synchronised

// purely implementation of Map

public class HashTable {
    public static void main(String[] args) {

        Map<Integer,String> hashtable= new Hashtable<>(12); // creation of map

        // keys must be unique then only records will be added.
        hashtable.put(14,"raju");
        hashtable.put(15,"siva");
        hashtable.put(12,"loki");
        hashtable.put(12,"loki232");
        hashtable.putAll(hashtable);
        hashtable.put(13,"raju");
        hashtable.put(3,"demo");
        hashtable.put(18,"may be one");
        hashtable.put(16,"rajesh");
        hashtable.put(17,"pavan");
        hashtable.put(5,"demo");// add
     //   hashtable.put(null,"2"); not allowed
//        hashtable.put(null,"2"); not allowed

        System.out.println( hashtable.keySet());  // list of set of keys it will return
        System.out.println(hashtable.values());   // list of collection of values

//        for(Integer i:hashtable.keySet()){
//            System.out.println(hashtable.get(i)); // get element
//        }

        System.out.println(hashtable.remove(0)); // delete
        System.out.println(hashtable.containsKey(12));
        System.out.println(hashtable.containsValue("loki"));

        hashtable.putIfAbsent(12,"raj");
        hashtable.put(13,"lokisds");

       // hashtable.clear(); delete all
        System.out.println(hashtable.size());
        System.out.println(hashtable);

        for (Map.Entry<Integer,String> stringEntry: hashtable.entrySet()){
            System.out.println(stringEntry.getKey() +">>>>" + stringEntry.getValue());

        }

    }
}
