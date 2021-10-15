package com.collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLearning {
    // peek
    // add - offer
    // remove - poll
    Queue<Integer> queue = new PriorityQueue<Integer>();
    // default-min, min/max priority queue - stored in ascending/descending order, for max add collection.reverseOrder()
    // Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

    public void implement() {
        queue.add(7);
        queue.add(1);
        queue.offer(5);
        queue.offer(8);
        System.out.println("queue: " + queue);
        System.out.println("size of queue: " + queue.size());
        System.out.println("peek element: " + queue.peek());
        queue.remove();
        System.out.println("after remove: " + queue);
        queue.poll();
        System.out.println("after poll: " + queue);
    }
}


// deque - insert/remove element from any side -- ArrayDeque
//    - addFirst()
//    - addLast()
//    - removeFirst()
//    - removeLast()
