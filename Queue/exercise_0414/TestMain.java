package Queue.exercise_0414;

import java.util.ArrayList;
import java.util.Stack;

public class TestMain {
    public static void main(String[] args) {
        MyQueueImpl myQueue = new MyQueueImpl();
        myQueue.add(1);
        myQueue.add(5);
        myQueue.add(78);
        System.out.println(myQueue.size());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
    }
}
