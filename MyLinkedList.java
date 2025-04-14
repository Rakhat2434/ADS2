import java.util.Iterator;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        T item;
        Node next;
        Node prev;

        Node(T item) {
            this.item = item;
        }
    }

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    @Override
    public void addFirst(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        Node newNode = new Node(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        T item = head.item;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return item;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        T item = tail.item;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return item;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        return head.item;
    }

    @Override
    public T getLast() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        return tail.item;
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
        head = tail = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T item = current.item;
                current = current.next;
                return item;
            }
        };

    }

}
