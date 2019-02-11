package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        System.out.println(stack.numOfItems());
        stack.push("first");
        stack.push("second");
        stack.push("third");
        System.out.println(stack.numOfItems());
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        System.out.println(stack.numOfItems());
    }
}
