import java.util.ArrayList;
import java.util.List;

public class MyMinHeap<T extends Comparable<T>> {

    private List<T> heap;

    public MyMinHeap() {
        heap = new ArrayList<>();
    }

    public void insert(T item) {
        heap.add(item);
        heapifyUp();
    }


    public T remove() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        T root = heap.get(0);
        T lastItem = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, lastItem);
            heapifyDown();
        }
        return root;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void clear() {
        heap.clear();
    }

    private void heapifyUp() {
        int index = heap.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) >= 0) break;
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void heapifyDown() {
        int index = 0;
        int leftChildIndex;
        int rightChildIndex;
        int smallestChildIndex;

        while (index < heap.size()) {
            leftChildIndex = 2 * index + 1;
            rightChildIndex = 2 * index + 2;
            smallestChildIndex = index;

            if (leftChildIndex < heap.size() && heap.get(leftChildIndex).compareTo(heap.get(smallestChildIndex)) < 0) {
                smallestChildIndex = leftChildIndex;
            }

            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).compareTo(heap.get(smallestChildIndex)) < 0) {
                smallestChildIndex = rightChildIndex;
            }

            if (smallestChildIndex == index) break;

            swap(index, smallestChildIndex);
            index = smallestChildIndex;
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}
