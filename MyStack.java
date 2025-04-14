public class MyStack<T extends Comparable<T>> {

    private final MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return list.removeLast();
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

}
