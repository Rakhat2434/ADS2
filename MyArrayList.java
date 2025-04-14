import java.util.Iterator;

public class MyArrayList<T extends Comparable<T>> implements MyList<T> {

    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10]; // начальный размер массива
        size = 0;
    }

    @Override
    public void addFirst(T item) {
        if (size == elements.length) resize();
        System.arraycopy(elements, 0, elements, 1, size);
        elements[0] = item;
        size++;
    }



    @Override
    public void addLast(T item) {
        if (size == elements.length) resize();
        elements[size++] = item;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        T item = (T) elements[0];
        System.arraycopy(elements, 1, elements, 0, size - 1);
        elements[--size] = null;
        return item;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        T item = (T) elements[--size];
        elements[size] = null;
        return item;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        return (T) elements[0];
    }

    @Override
    public T getLast() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        return (T) elements[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        elements = new Object[10];
        size = 0;
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return (T) elements[index++];
            }
        };
    }
}
