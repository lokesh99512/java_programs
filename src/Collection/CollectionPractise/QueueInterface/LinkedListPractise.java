package Collection.CollectionPractise.QueueInterface;

import java.util.Deque;
import java.util.LinkedList;
// order follows on implements --> Iterable (interface) --> collection (interface) --> queue (interface) ---> deque (interface) --> 
// internally follows --> nodes
// default capacity --> 0
// maintain insertion order --> Yes
// maintain sorted order --> no
// why to use --> for adding both ends bases.
// random access --> no
// allow null values --> no
// allow duplicates --> yes

// capacity can be increased --> yes --> linkedList<>(20)

// is it synchronised --> NO
// what is it good at?   to follow priority

//
// purely implementation of deque
// it will provide both add and delete on head on tail

public class LinkedListPractise {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>(); // head value follow natural order remaining elements will not follow order

        linkedList.add("demo");
        linkedList.add("abc");
        linkedList.add("z");
        linkedList.add("z");
        linkedList.add("z");
        linkedList.addFirst("rajesh");
        linkedList.addLast("ramu");
        linkedList.offerFirst("lohit");
        linkedList.offerLast("naveen");
        linkedList.add(null);
        linkedList.add("lokesh");
        linkedList.offer("dsdfs");
        // addition --> offer,offerFirst,offerLast,add, addFirst,addLast
        // retrieval --> peek,peekFirst, peekLast
        // removal --> poll,pollFirst,PollLast, remove,removeFirst,removeLast;

        System.out.println(linkedList.size());


        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.poll()); // remove
        System.out.println(linkedList.remove("z")); // remove it will throw an exception if the queue is zero

        System.out.println(linkedList.contains("lokesh"));
        System.out.println();
        System.out.println(linkedList);

        // for each is not recommended because if you will not give priority basis, so you can use while loop

//        while (!linkedList.isEmpty()){
//            System.out.println(linkedList.poll());
//        }

        System.out.println(linkedList);

    }
}
