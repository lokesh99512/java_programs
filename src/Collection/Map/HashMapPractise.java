package Collection.Map;

import java.util.HashMap;
import java.util.Map;


// order follows on implements --> Iterable (interface) --> Map (interface) --> hashMap (class)

// internally follows --> buckets.

// default capacity --> 11
// incially capacity --> 11
// maintain insertion order --> no
// maintain sorted order --> Yes --> based on keys it will get desc;
// why to use --> for keys(unique keys) and values;
// random access --> Yes
// allow null values --> Yes
// allow duplicates --> no --> only values will be duplicated.  keys must be unique .
// capacity can be increased --> Yes --> We hashMap<>(20)
// is it synchronised --> No
// what is it good at? // for multi threading.

// purely implementation of Map

public class HashMapPractise {
    public static void main(String[] args) {

        Map<Integer,String> hashMap= new HashMap<>(100); // creation of map

        // keys must be unique then only records will be added.
        hashMap.put(14,"raju");
        hashMap.put(15,"siva");
        hashMap.put(12,"loki");
        hashMap.put(12,"loki232");
        hashMap.putAll(hashMap);
        hashMap.put(13,"raju");
        hashMap.put(18,"may be one");
        hashMap.put(16,"rajesh");
        hashMap.put(null,null);
        hashMap.put(null,null);// add
        hashMap.put(1,null);
        hashMap.put(3,null);


        System.out.println(hashMap);
        System.out.println( hashMap.keySet());  // list of set of keys it will return
        System.out.println(hashMap.values());   // list of collection of values

        for(Integer i:hashMap.keySet()){
            System.out.println(hashMap.get(i)); // get element
        }

        System.out.println(hashMap.remove(0)); // delete
        System.out.println(hashMap.containsKey(12));
        System.out.println(hashMap.containsValue("loki"));

        hashMap.putIfAbsent(12,"raj");
        hashMap.put(13,"lokisds");

       // hashMap.clear(); delete all
        System.out.println(hashMap.size());
        System.out.println(hashMap);

        for (Map.Entry<Integer,String> stringEntry: hashMap.entrySet()){
            System.out.println(stringEntry.getKey() +">>>>" + stringEntry.getValue());

        }

    }
}
