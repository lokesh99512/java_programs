package Collection.CollectionPractise.setInterface;

import java.util.Set;
import java.util.TreeSet;


// order follows on implements --> Iterable (interface) --> collection (interface) --> set (interface) --> sortedSet (interface) --> navigationSet(interface) ---> treeSet (class)
// internally follows -->tree set --> treeMap ->binary tree
// default capacity -->
// incially capacity -->
// maintain insertion order --> no
// maintain sorted order --> Yes --> natural order(asc);
// why to use --> for unique bases.
// random access --> no
// allow null values --> no
// allow duplicates --> no

// capacity can be increased --> no --> TreeSet<>(20)

// is it synchronised --> NO
// what is it good at?   retrieve in asc order

//
// purely implementation of Queue
// to store the  unique values and without null values and to retrieve in asc order

public class TreeSetPractise {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet=  new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
//        treeSet.add(null);
//        treeSet.add(null);

        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.subSet(1,3));
        System.out.println(treeSet.removeFirst());
        System.out.println(treeSet.removeLast());
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);

    }
}
