//**********************************************************
// ArrayQueue.java
// An array-based implementation of the classic FIFO queue interface.
//**********************************************************
public class ArrayQueue implements QueueADT {
    private Object[] queueArray;
    private int front; // Index the front
    private int back; // Index the back
    private int nElements; // Number of elements

    // Constructor
    public ArrayQueue(int capacity) {
        queueArray = new Object[capacity];
        front = 0;
        back = -1; // the queue is empty
        nElements = 0;
    }

    @Override
    public void enqueue(Object item) {
        if (!isFull()) {
            back = (back + 1) % queueArray.length;
            queueArray[back] = item;
            nElements++;
        } else {
            System.out.println("Queue is full. Cannot enqueue.");
        }
    }

    @Override
    public Object dequeue() {
        if (!isEmpty()) {
            Object dequeuedItem = queueArray[front];
            queueArray[front] = null;
            front = (front + 1) % queueArray.length;
            nElements--;
            return dequeuedItem;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return nElements == 0;
    }

    @Override
    public boolean isFull() {
        return nElements == queueArray.length;
    }

    @Override
    public int size() {
        return nElements;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nElements; i++) {
            int index = (front + i) % queueArray.length;
            result.append(queueArray[index]).append("\n");
        }
        return result.toString();
    }
}

