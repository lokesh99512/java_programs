package Collection.CollectionPractise.LIstInterface;


import java.util.*;


// order follows on implements --> Iterable (interface) --> collection (interface) --> list (interface) ---> arraylist (class)
// internally follows --> arrays  --> example to remember hotel rooms if it is fill copy entire rooms data and go to the new hotel with 50 % increase capacity.
// default capacity --> 0 --> after adding one element then it will become --> 10
// incially capacity --> 10
// maintain insertion order --> yes
// maintain sorted order --> no;
// why to use --> to increase capacity exponentially;
// random access --> Yes
// allow null values --> yes
// allow duplicates --> yes

// capacity can be increased --> yes --> arrayList<>(20)

// is it synchronised --> NO
// what is it good at?   to increase capacity 50 % and only to retrieve data and add the data these are the best; (with index update is not recommender)

// not recommender of updating the data , removing or adding the data in middle(with index)
// purely implementation of list

public class ArrayPractise {

    public static void main(String[] args) {

        Integer[] arr=new Integer[]{1,2,3,4,5};  // default capacity is 5

        // collections --> 2.0

        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(arr));
                                                    // System.out.println(arrayList.capacity());
        arrayList.add(10);
        arrayList.addAll(0,arrayList);
        arrayList.add(11);
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(10);
        arrayList.add(null);  // add
        arrayList.add(null);
        arrayList.add(0);
        arrayList.set(1,0); // updated
        System.out.println(arrayList.get(8)); // get element
        System.out.println(arrayList.remove(0)); // delete
        System.out.println(arrayList.contains(null));
        System.out.println(arrayList.containsAll(arrayList));
        System.out.println(arrayList.size());
        //System.out.println(arrayList.capacity());
        System.out.println(arrayList);
        for (Integer i:arrayList){
            System.out.println(i);
        }
    }


}
