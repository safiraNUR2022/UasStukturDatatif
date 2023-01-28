package com.company;

import java.util.LinkedList;

public class LinkedStack {
    private final LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }

    public void push (Employee employee){
        stack.push(employee);
    }

    public void pop(){
        stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public int size(){
        return stack.size();
    }

    public void printStack(){
        for (Employee employee : stack) {
            System.out.println(employee);
        }
    }
}
