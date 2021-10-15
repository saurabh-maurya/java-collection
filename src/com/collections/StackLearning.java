package com.collections;

import java.util.Stack;

public class StackLearning {
    // peek
    // add - push
    // remove - pop
    Stack<Integer> ar = new Stack<Integer>();

    public void implement() {
        // add
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);
        System.out.println("Stack: " + ar);
        System.out.println("size of stack: " + ar.size());
        ar.add(0, 9);
        System.out.println("add element at index 0: " + ar);
        ar.remove(2);
        System.out.println("remove element at index 2: " + ar);
        System.out.println("get element at index 2: " + ar.get(2));
        System.out.println("get index of element 8:" + ar.indexOf(8));
        ar.push(10);
        System.out.println("push element:" + ar);
        ar.pop();
        System.out.println("pop element:" + ar);
    }
}
