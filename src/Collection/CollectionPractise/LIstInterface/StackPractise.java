package Collection.CollectionPractise.LIstInterface;


import java.util.*;


// order follows on implements --> Iterable (interface) --> collection (interface) --> list (interface) ---> Vector (class) ---> stack (class)

// internally follows --> arrays  --> example to remember hotel rooms if it is fill copy entire rooms data and go to the new hotel with 100 % increase capacity.

// default capacity --> 10
// incially capacity --> 10
// maintain insertion order --> yes
// maintain sorted order --> no;
// why to use --> (lifo) to increase capacity exponentially;
// random access --> Yes
// allow null values --> yes
// allow duplicates --> yes
// capacity can be increased --> no --> stack<>(20)
// is it synchronised --> Yes
// what is it good at? // last in first out(lifo principle) multi threading and to increase capacity exponentially;

// purely implementation of list

public class StackPractise {

    public static void main(String[] args) {

        Integer[] arr=new Integer[]{1,2,3,4,5};  // not applicable default capacity is 5


        /*
             Lifo --> last in first out --> stack
             fifo --> first in first out --> queue
             stack is a class in java which implements list interface and extends the vector class and also represent lifo principal
         */


        Stack<Integer> stack=new Stack<>(); //  incial capacity we shoud not provide
        System.out.println(stack.capacity());
        stack.add(10);
        stack.addAll(0,stack);
        stack.add(11);
        stack.add(11);
        stack.add(13);
        stack.add(10);
        stack.add(null);  // add
        stack.add(null);
        stack.add(30);

        stack.set(8,0); // updated

        System.out.println(stack.get(8)); // get element

        System.out.println(stack.remove(0)); // delete

        System.out.println(stack.contains(null));
        System.out.println(stack.containsAll(stack));

        System.out.println(stack.size());
        System.out.println(stack.capacity());

        System.out.println(stack);


        // supports all operation performed by vector and some of the methods added new methods
        // like pop , peek, push, search if you want to fallow fifo principle you need to follow these methods

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.empty());
        stack.push(30);

        System.out.println(stack.search(30));

    }


}
