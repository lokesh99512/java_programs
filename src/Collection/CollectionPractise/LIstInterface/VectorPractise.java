package Collection.CollectionPractise.LIstInterface;


import java.util.Arrays;
import java.util.Vector;


// order follows on implements --> Iterable (interface) --> collection (interface) --> list (interface) ---> Vector (class)

// internally follows --> arrays  --> example to remember hotel rooms if it is fill copy entire rooms data and go to the new hotel with 100 % increase capacity.

// default capacity --> 10
// incially capacity --> 10
// maintain insertion order --> yes
// maintain sorted order --> no;
// why to use --> to increase capacity exponentially;
// random access --> Yes
// allow null values --> yes
// allow duplicates --> yes

// capacity can be increased --> yes --> Vector<>(20)

// is it synchronised --> Yes
// what is it good at?  multi threading and to increase capacity exponentially;

// purely implementation of list

public class VectorPractise {

    public static void main(String[] args) {

        Integer[] arr=new Integer[]{1,2,3,4,5};  // default capacity is 5


        // Vector --> 1.0
        // collections --> 2.0
        //

        Vector<Integer> vector=new Vector<>(Arrays.asList(arr));
                                                      System.out.println(vector.capacity());
        vector.add(10);
        vector.addAll(0,vector);
        vector.add(11);
        vector.add(10);
        vector.add(13);
        vector.add(10);
        vector.add(null);  // add
        vector.add(null);
        vector.add(0);

        vector.set(1,0); // updated

        System.out.println(vector.get(8)); // get element

        System.out.println(vector.remove(0)); // delete

        System.out.println(vector.contains(null));
        System.out.println(vector.containsAll(vector));

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        System.out.println(vector);

    }


}
