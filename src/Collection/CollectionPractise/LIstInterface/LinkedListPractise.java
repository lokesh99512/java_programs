package Collection.CollectionPractise.LIstInterface;


import java.util.LinkedList;

//     ---------------- (deque interface also implementation)
// order follows on implements --> Iterable (interface) --> collection (interface) --> list (interface) ---> linked list (class)
// internally follows --> arrays  --> example to remember trine compartment it will store prev ,current, next.
// default capacity --> 0 
// incially capacity --> 0
// maintain insertion order --> yes
// maintain sorted order --> no;
// why to use --> for updated or remove or adding elements in middle.
// random access --> Yes
// allow null values --> yes
// allow duplicates --> yes

// capacity can be increased --> no --> linkedLIst<>(20)

// is it synchronised --> NO
// what is it good at?   to increase capacity 50 % and only to retrieve data and add the data these are the best; (with index update is not recommender)

// recommender for updating the data , removing or adding the data in middle(with index)
// not  purely implementation of list because it implements deque interface also.

public class LinkedListPractise {

    public static void main(String[] args) {

        Integer[] arr=new Integer[]{1,2,3,4,5};  // default capacity is 5

        // collections --> 2.0
        // a linked list is a combination of multiple node objects.

        LinkedList<Integer> linkedLIst=new LinkedList<>(); //  incially capacity we should not provide
                                                    //  System.out.println(linkedLIst.capacity()); not working
        linkedLIst.add(10);
        linkedLIst.addAll(0,linkedLIst);
        linkedLIst.add(11);
        linkedLIst.add(10);
        linkedLIst.add(13);
        linkedLIst.add(10);
        linkedLIst.add(null);  // add
        linkedLIst.add(null);
        linkedLIst.add(0);
        linkedLIst.add(2,23);
        linkedLIst.set(1,0); // updated
        System.out.println(linkedLIst.get(8)); // get element
        System.out.println(linkedLIst.remove(0)); // delete
        System.out.println(linkedLIst.contains(null));
        System.out.println(linkedLIst.containsAll(linkedLIst));
        System.out.println(linkedLIst.size());
        //System.out.println(linkedLIst.capacity());
        System.out.println(linkedLIst);
        for (Integer i:linkedLIst){
            System.out.println(i);
        }
    }


}
