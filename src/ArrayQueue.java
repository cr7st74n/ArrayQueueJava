//**********************************************************
// ArrayQueue.java
// An array-based implementation of the classic FIFO queue interface.
//**********************************************************
public class ArrayQueue implements QueueADT
{
    private final int DEFAULT_SIZE = 5;
    private Object[] elements;
    private int numElements;
    private int front, back;
    //---------------------------------------------
// Constructor; creates array of default size.
//---------------------------------------------
    public ArrayQueue()
    {
    }
    //---------------------------------------------
// Puts item on end of queue.
//---------------------------------------------
    public void enqueue(Object item)
    {
    }
    //---------------------------------------------
// Removes and returns object from front of queue.
//---------------------------------------------
    public Object dequeue()
    {
    }
    //---------------------------------------------
// Returns true if queue is empty.
//---------------------------------------------
    public boolean isEmpty()
    {
    }
    //-----------------------------------------
// Returns true if queue is full.
//-----------------------------------------
    public boolean isFull()
    {
    }
    //---------------------------------------------
// Returns the number of elements in the queue.
//---------------------------------------------
    public int size()
    {
    }
    //---------------------------------------------
// Returns a string containing the elements of the queue
// from first to last
//---------------------------------------------
    public String toString()
    {
        String result = "\n";
        for (int i = front, count=0; count < numElements;
             i=(i+1)%elements.length,count++)
            result = result + elements[i]+ "\n";
        return result;
    }
}
//**********************************************************
