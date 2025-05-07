package Collection.CollectionPractise.setInterface;


// order follows on implements --> Iterable (interface) --> collection (interface) --> set (interface) ---> hashset (class) --> linkedHashset (class)
// internally follows --> linkedHashset --> linkedHashMap --> internally link of nodes(key, value);
// values as stored as dummy(object) and keys will be stored as data;
// default capacity --> 16
// incially capacity --> 16
// maintain insertion order --> Yes
// maintain sorted order --> no;
// why to use --> for unique bases.
// random access --> Yes
// allow null values --> yes
// allow duplicates --> no

// capacity can be increased --> yes --> linkedHashset<>(20)

// is it synchronised --> NO
// what is it good at?   to follow priority

//
// purely implementation of set
// to store the  unique values

import java.util.LinkedHashSet;

public class LinkedHashSetPractise {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<>();
        linkedHashset.add(110);
        linkedHashset.add(2);
        linkedHashset.add(155);
        linkedHashset.add(234);
        linkedHashset.add(3);
        linkedHashset.add(null);
        linkedHashset.add(null);
        linkedHashset.addFirst(12);


        linkedHashset.remove(2);  // data you need to remove
        System.out.println(linkedHashset.contains(3));
        System.out.println(linkedHashset.size());
        System.out.println(linkedHashset.isEmpty());
        System.out.println();

        for (Integer i : linkedHashset) {
            System.out.println(i);
        }

        System.out.println(linkedHashset);
    }
}
