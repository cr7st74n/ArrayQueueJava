//****************************************************************
// This program uses an array to implement a queue. The operations
// implemented *********
// ***************************************************************
// Group members: Cristian Gonzalez
// Class: CSIT 112
// Course: Java Programming II
//*********************************************************
// QueueADT.java
// The classic FIFO queue interface.
//**********************************************************
public interface QueueADT
{
    //---------------------------------------------
// Puts item at the end of the queue.
//-------------------------------------------------------
    public void enqueue(Object item);
    //-------------------------------------------------------
// Removes and returns object from the front of the queue.
//-------------------------------------------------------
    public Object dequeue();
//-------------------------------------------------------
// Returns true if the queue is empty.
    public boolean isEmpty();
    //-----------------------------------------------------
// Returns true if the queue is full.
//-----------------------------------------------------
    public boolean isFull();
    //----------------------------------------------------
// Returns the number of elements in the queue.
//-----------------------------------------------------
    public int size();
}
//**********************************************************