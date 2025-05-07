package Collection.CollectionPractise.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
// order follows on implements --> Iterable (interface) --> collection (interface) --> queue (interface) ---> deque (interface) --> 
// internally follows --> arrays
// default capacity --> 17
// maintain insertion order --> Yes
// maintain sorted order --> no
// why to use --> for adding both ends bases.
// random access --> no
// allow null values --> no
// allow duplicates --> yes

// capacity can be increased --> yes --> ArrayDeque<>(20)

// is it synchronised --> NO
// what is it good at?   to follow priority

//
// purely implementation of deque
// it will provide both add and delete on head on tail
// queue basis
public class ArrayDequePractise {

    public static void main(String[] args) {
        
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(12); // head value follow natural order remaining elements will not follow order

        arrayDeque.add("demo");
        arrayDeque.add("abc");
        arrayDeque.add("abc");
        arrayDeque.add("a");
        arrayDeque.add("z");
        arrayDeque.addFirst("rajesh");
        arrayDeque.addLast("ramu");
        arrayDeque.offerFirst("lohit");
        arrayDeque.offerLast("naveen");
      //arrayDeque.add(null); not allowed
        arrayDeque.add("lokesh");
        arrayDeque.offer("dsdfs");
        // addition --> offer,offerFirst,offerLast,add, addFirst,addLast
        // retrieval --> peek,peekFirst, peekLast
        // removal --> poll,pollFirst,PollLast, remove,removeFirst,removeLast;

        System.out.println(arrayDeque.size());


        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.poll()); // remove
        System.out.println(arrayDeque.remove("z")); // remove it will throw an exception if the queue is zero

        System.out.println(arrayDeque.contains("lokesh"));
        System.out.println();
        System.out.println(arrayDeque);

        // for each is not recommended because if you will not give priority basis, so you can use while loop

//        while (!arrayDeque.isEmpty()){
//            System.out.println(arrayDeque.poll());
//        }

        System.out.println(arrayDeque);

    }
}
