package com.company;

import java.util.Arrays;

public class Stack
{
    String[] storage;
    int items;

    public Stack()
    {
        this.storage = new String[1000];
        this.items = 0;
    }

    public void print()
    {
        String[] printed = Arrays.copyOf(storage, items);
        System.out.println(Arrays.toString(printed));
    }

    public String pop()
    {
        String popped = this.storage[items - 1];
        this.storage[items - 1] = null;
        items--;
        return popped;
    }

    public void push(String pushed)
    {
        this.storage[items] = pushed;
        items++;
    }

    public String numOfItems()
    {
        if (items == 0)
        {
            return "There are no items in your Stack.";
        } else
        {
            return Integer.toString(items);
        }
    }

    @Override
    public String toString()
    {
        return "Stack{" +
                "storage=" + Arrays.toString(storage) +
                ", items=" + items +
                '}';
    }
}
