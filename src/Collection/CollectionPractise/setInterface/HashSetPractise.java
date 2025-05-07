package Collection.CollectionPractise.setInterface;


// order follows on implements --> Iterable (interface) --> collection (interface) --> set (interface) ---> HashSet (class)
// internally follows --> hashset --> hashMap --> internally takes place on arrays of nodes(key, value);
// values as stored as dummy(object) and keys will be stored a data;
// default capacity --> 16
// incially capacity --> 16
// maintain insertion order --> no
// maintain sorted order --> no;
// why to use --> for unique bases.
// random access --> Yes
// allow null values --> yes
// allow duplicates --> no

// capacity can be increased --> yes --> HashSet<>(20)

// is it synchronised --> NO
// what is it good at?   to follow priority

//
// purely implementation of set
// to store the  unique values

import java.util.HashSet;

public class HashSetPractise {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(24);

        hashSet.add(110);
        hashSet.add(2);
        hashSet.add(155);
        hashSet.add(234);
        hashSet.add(3);
      //  hashSet.add(null);

        //hashSet.remove(2);  // data you need to remove
        System.out.println(hashSet.contains(3));

        for (Integer i:hashSet){
            System.out.println(i);
        }

        System.out.println(hashSet);
    }
}
