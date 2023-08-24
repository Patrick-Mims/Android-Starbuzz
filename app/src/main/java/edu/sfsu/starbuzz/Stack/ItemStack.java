package edu.sfsu.starbuzz.Stack;

import edu.sfsu.starbuzz.Interfaces.Stack;

public class ItemStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000;

    private final E[] data;
    private int t = -1;

    public ItemStack() {
        this(CAPACITY);
    }

    public ItemStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return (t + 1);
    }

    @Override
    public boolean isEmpty() {
        return (t == -1);
    }

    @Override
    public void push(E e) throws IllegalStateException {
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    @Override
    public E top() {
        if(isEmpty())
            return null;

        return data[t];
    }

    @Override
    public E pop() {
        if(isEmpty()) {
            return null;
        }

        E answer = data[t];

        data[t] = null;

        t--;

        return answer;
    }

    public E dataToString() {
        return null;
    }
}