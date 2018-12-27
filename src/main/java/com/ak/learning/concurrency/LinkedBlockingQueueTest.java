package com.ak.learning.concurrency;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {
    public  static  void main(String arg[]) throws InterruptedException {
        LinkedBlockingQueue<String> strings= new LinkedBlockingQueue<>();
        System.out.println(strings.remainingCapacity());
        strings.put("Hello");
        strings.put("Learning");
        strings.put("Linked");

        System.out.println(strings.remainingCapacity());

        System.out.println(strings);
    }
}
