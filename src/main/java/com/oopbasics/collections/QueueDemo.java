package com.oopbasics.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("apple");
        myQueue.add("oranges");
        myQueue.add("mangoes");
        myQueue.add("grapes");
        System.out.println(myQueue.poll());
    }
}
