package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearning {
    ArrayList<Integer> ar = new ArrayList<Integer>();

    public void implement() {
        // add
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);
        System.out.println("Array: "+ ar);
        System.out.println("size of array: "+ ar.size());
        // add at index
        ar.add(0, 9);
        System.out.println("add element at index 0: "+ ar);
        ar.remove(2);
        System.out.println("remove element at index 2: " + ar);
        System.out.println("get element at index 2: " + ar.get(2));
        System.out.println("get index of element 8:" + ar.indexOf(8));

        // Iterator - three functions
            // 1. hasNext()
            // 2. next()
            // 3. remove

        Iterator<Integer> i = ar.iterator();
        System.out.println("-----------------Starting Iteration--------------");
        while(i.hasNext()){
            System.out.println("---Iterating--- " + i.next());
        }
        System.out.println("---------------Iteration Ended ---------------");
    }
}
