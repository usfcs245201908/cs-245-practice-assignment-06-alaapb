import java.util.Arrays;

public class ArrayStack<T> implements Stack{
    int top;
    Object[] a;
    public ArrayStack() {
        top = -1;
        a = new Object[10];
    }
    public void growArray() {
        Object[] copy = Arrays.copyOfRange(a, 0, a.length*2);
        a = copy;
    }
    public void push(Object item) {
        if(top == a.length - 1) {
            growArray();
        }
        a[++top] = item;
    }
    public Object pop() throws Exception {
        if(empty()) {
            throw new Exception("Empty Array");
        }
        return a[top--];
    }
    public Object peek() throws Exception {
        if(empty()) {
            throw new Exception("Empty Array");
        }
        return a[top];
    }
    public boolean empty() {
        return top == -1;
    }
}
