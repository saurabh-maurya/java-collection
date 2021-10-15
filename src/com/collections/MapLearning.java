package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapLearning {
    // Three Map - store data in key-value pair
        // HashMap - no order, no key duplication
        // EnumMap - store in the natural order of their keys(the natural order of keys means the order on which enum constant are declared inside enum type ), no key duplication
        // TreeMap - sorted order, no key duplication
    Map<String, Integer> map = new HashMap<String, Integer>();
    public void implement() {
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        System.out.println("map: " + map);
        System.out.println("size of map: " + map.size());
        System.out.println("get value of key in map: " + map.get("Three"));
        map.remove("Three"); // remove by key
        System.out.println("after remove: " + map);
        System.out.println("entrySet - convert to array: " + map.entrySet());

        // map.entrySet -> takes all key value pair and make set it
        System.out.println("entrySet - convert to array: " + map.entrySet());
        // map.keySet --> takes all keys and make set of it
        System.out.println("keySet - convert to array: " + map.keySet());

        // traversing and getting keys and values
        System.out.println("-----------------Starting Iteration--------------");
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("---Iterating---> KEY = " + e.getKey() + ", VALUE = " + e.getValue());
        }
        System.out.println("---------------Iteration Ended ---------------");
    }
}
