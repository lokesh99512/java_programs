package Collection.CollectionPractise.QueueInterface;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// order follows on implements --> Iterable (interface) --> collection (interface) --> queue (interface) ---> PriorityQueue (class)
// internally follows --> arrays
// default capacity --> 11
// incially capacity --> 11
// maintain insertion order --> no
// maintain sorted order --> Yes --> natural order (the head will be always pointed the natural of first element);
// why to use --> for priority bases.
// random access --> Yes
// allow null values --> no
// allow duplicates --> yes

// capacity can be increased --> yes --> arrayList<>(20)

// is it synchronised --> NO
// what is it good at?   to follow priority

//
// purely implementation of Queue
// only one way to delete both form head and insertion will be on tail

public class PriorityQueuePractise {

    public static void main(String[] args) {
     //   PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(); // head value follow natural order remaining elements will not follow order


        priorityQueue.add("demo");
        priorityQueue.add("demo");
        priorityQueue.add("abc");
        priorityQueue.add("a");
        priorityQueue.add("z");
//        priorityQueue.add(null); not allowed
        priorityQueue.add("lokesh");
        priorityQueue.offer("dsdfs");
        // addition --> offer,add
        // retrieval --> peek
        // removal --> poll, remove;
        System.out.println(priorityQueue.size());


        System.out.println(priorityQueue.peek());// get the head value
        System.out.println(priorityQueue.poll()); // remove
        System.out.println(priorityQueue.remove("z")); // remove it will throw an exception if the queue is zero

        System.out.println(priorityQueue.contains("blokish"));
        System.out.println();
        System.out.println(priorityQueue);

        // for each is not recommended because if you will not give priority basis, so you can use while loop

//        while (!priorityQueue.isEmpty()){
//            System.out.println(priorityQueue.poll());
//        }

        System.out.println(priorityQueue);

    }
}
