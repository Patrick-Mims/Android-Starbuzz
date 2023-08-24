package edu.sfsu.starbuzz.Queue;

import edu.sfsu.starbuzz.Interfaces.Queue;

public class ItemQueue<E> implements Queue<E> {

    private E[] data;
    private int f = 0;
    private int t = 0;
    private int sz = 0;
    public static final int CAPACITY = 1000;

    public ItemQueue() {
        this(CAPACITY);
    }

    public ItemQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public void enqueue() {

    }

    @Override
    public E first() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return sz;
    }
}
