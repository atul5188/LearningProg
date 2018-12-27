package com.ak.learning.concurrency;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTest {
    public  static  void  main(String arg[])
    {
        PriorityBlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<>();
        System.out.println(priorityBlockingQueue.remainingCapacity());
        priorityBlockingQueue.put("hello");
        priorityBlockingQueue.put("world");
        priorityBlockingQueue.put("Learn");

        System.out.println(priorityBlockingQueue);   System.out.println(priorityBlockingQueue.remainingCapacity());


    }
}
