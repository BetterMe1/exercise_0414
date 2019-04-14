package Queue.exercise_0414;

public class MyQueueImpl implements  IMyQueue {
    class Node{
        private Node next;
        private int data;
        public  Node(int data){
            this.next = null;
            this.data = data;
        }
    }
    private Node front;
    private Node rear;
    private int useSize;
    public MyQueueImpl(){
        this.front = null;
        this.rear = null;
        this.useSize = 0;
    }
    @Override
    public boolean empty() {
        return this.useSize == 0;
    }

    @Override
    public int peek() {
        if(empty()){
            throw new UnsupportedOperationException("队列为空");
        }
        return this.front.data;
    }

    @Override
    public int poll() {
        if(empty()){
            throw new UnsupportedOperationException("队列为空");
        }
        this.useSize--;
        int tmp = this.front.data;
        this.front = this.front.next;
        return tmp;
    }

    @Override
    public void add(int item) {
        if(empty()){
            this.front = new Node(item);
            this.rear = this.front;
        }else{
            this.rear.next = new Node(item);
            this.rear = this.rear.next;
        }
        this.useSize++;
    }

    @Override
    public int size() {
        return this.useSize;
    }
}
