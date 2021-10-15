package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetLearning {
    // Three Set -
        // HashSet - no order, no duplication
        // LinkedHashSet - in adding order, no duplication
        // TreeHashSet - sorted order, no duplication

    Set<Integer> set = new HashSet<Integer>();

    public void implement() {
        set.add(7);
        set.add(9);
        set.add(5);
        set.add(8);
        System.out.println("set: " + set);
        System.out.println("size of set: " + set.size());
        set.remove(7); // remove object
        System.out.println("after remove: " + set);
    }
}
