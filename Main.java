public class Main {

    public static void main(String[] args) {
        // Тестирование MyQueue
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue: " + queue);
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue after dequeue: " + queue);

        // Тестирование MyStack
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Stack after pop: " + stack);

        // Тестирование MyMinHeap
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.insert(30);
        minHeap.insert(20);
        minHeap.insert(10);
        minHeap.insert(40);
        minHeap.insert(50);
        System.out.println("MinHeap: " + minHeap);
        System.out.println("Peek: " + minHeap.peek());
        System.out.println("Remove: " + minHeap.remove());
        System.out.println("MinHeap after remove: " + minHeap);

        // Тестирование MyArrayList
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.addLast(5);
        arrayList.addLast(10);
        arrayList.addLast(15);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("First element: " + arrayList.getFirst());
        System.out.println("Last element: " + arrayList.getLast());
        arrayList.removeFirst();
        System.out.println("ArrayList after removeFirst: " + arrayList);
        // Тестирование MyLinkedList
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        System.out.println("LinkedList: " + linkedList);
        linkedList.removeLast();
        System.out.println("LinkedList after removeLast: " + linkedList);
        linkedList.removeFirst();
        System.out.println("LinkedList after removeFirst: " + linkedList);
    }
}
