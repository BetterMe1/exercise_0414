package stack.exercise_0414;

public class MyStackImpl implements IMyStack{
    private int[] elem;
    private int top;
    private int usedSize;
    //默认的容量
    private static final int DEFAULT_SIZE = 10;
    public MyStackImpl(){
        this.elem = new int[DEFAULT_SIZE];
        this.top = 0;
        this.usedSize = 0;
    }
    private  boolean isFull(){
        return top == this.elem.length;
    }
    @Override
    public void push(int item) {
        if(isFull()){
           // expand();
            throw new UnsupportedOperationException("栈满了");
        }
        this.elem[this.top] = item;
        this.top++;
        this.usedSize++;
    }
    @Override
    public int pop() {
        if(empty()){
            throw new UnsupportedOperationException("栈顶无元素");
        }
        this.usedSize--;
        return this.elem[--this.top];
    }

    @Override
    public int peek() {
        if(empty()){
            throw new UnsupportedOperationException("栈顶无元素");
        }
        return this.elem[this.top-1];
    }

    @Override
    public boolean empty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.usedSize;
    }
}
