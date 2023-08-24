package edu.sfsu.starbuzz.Interfaces;

public interface Queue<E> {
    // Removes and returns the first element from the queue (or null if the queue is empty).
    E dequeue();

    // Adds element e to the back of the queue.
    void enqueue();

    // Returns the first element of the queue. without removing it (or null if the queue is empty).
    E first();

    // Returns a boolean indicating whether the queue is empty.
    boolean isEmpty();

    // Returns the number of elements in the queue.
    int size();
}