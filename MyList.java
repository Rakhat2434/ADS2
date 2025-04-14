import java.util.Iterator;

public interface MyList<T> {
    void addFirst(T item);
    void addLast(T item);
    T removeFirst();
    T removeLast();
    T getFirst();
    T getLast();
    int size();
    boolean isEmpty();
    void clear();

    Iterator<T> iterator();
}
