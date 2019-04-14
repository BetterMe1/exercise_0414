package stack.exercise_0414;

public class TestMain {
    public static void main(String[] args) {
        MyStackImpl myStack = new MyStackImpl();
        myStack.push(1);
        myStack.push(2);
        myStack.push(4);
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
    }
}
