package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;


// order follows on implements --> Iterable (interface) --> Map (interface) -->   hashmap(class)  ---> linkedHashMap (class)

// internally follows --> buckets.

// default capacity -->11
// incially capacity --> 11
// maintain insertion order --> Yes
// maintain sorted order --> No --> based on keys it will get desc;
// why to use --> for keys(unique keys) and values; to maintain the insertion order.
// random access --> Yes
// allow null values --> Yes
// allow duplicates --> no --> only values will be duplicated.  keys must be unique .
// capacity can be increased --> Yes --> We linkedHashMap<>(20)
// is it synchronised --> No
// what is it good at? // .

// purely implementation of Map

public class LinkedHashMapPractise {
    public static void main(String[] args) {

        Map<Integer,String> linkedHashMap= new LinkedHashMap<>(10); // creation of map

        // keys must be unique then only records will be added.
        linkedHashMap.put(14,"loki232");
        linkedHashMap.put(15,"siva");
        linkedHashMap.put(12,"loki");
        linkedHashMap.put(12,"loki232");
        linkedHashMap.putAll(linkedHashMap);
        linkedHashMap.put(13,"raju");
        linkedHashMap.put(18,"may be one");
        linkedHashMap.put(16,"rajesh");
        linkedHashMap.put(null,null);
        linkedHashMap.put(null,null);
        linkedHashMap.put(3,null);


        System.out.println( linkedHashMap.keySet());  // list of set of keys it will return
        System.out.println(linkedHashMap.values());   // list of collection of values

//        for(Integer i:linkedHashMap.keySet()){
//            System.out.println(linkedHashMap.get(i)); // get element
//        }

        System.out.println(linkedHashMap.remove(0)); // delete
        System.out.println(linkedHashMap.containsKey(12));
        System.out.println(linkedHashMap.containsValue("loki"));

        linkedHashMap.putIfAbsent(12,"raj");
        linkedHashMap.put(13,"lokisds");

       // linkedHashMap.clear(); delete all
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap);

        for (Map.Entry<Integer,String> stringEntry: linkedHashMap.entrySet()){
            System.out.println(stringEntry.getKey() +">>>>" + stringEntry.getValue());
        }

    }
}
