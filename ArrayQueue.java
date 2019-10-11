import java.util.Arrays;

public class ArrayQueue<T> implements Queue{
    int top;
    int bot;
    Object[] a;
    public ArrayQueue() {
        top = 0;
        bot = 0;
        a = new Object[10];
    }
    public void growArray() {
        Object[] copy = Arrays.copyOfRange(a, 0, a.length*2);
        a = copy;
    }
    public Object dequeue() throws Exception{
        if(empty()) {
            throw new Exception("Empty Array");
        }
        return a[top++];
    }
    public void enqueue(Object item) {
        if(bot == a.length) {
            growArray();
        }
        a[bot++] = item;
    }
    public boolean empty() {
        return bot == top;
    }
}
