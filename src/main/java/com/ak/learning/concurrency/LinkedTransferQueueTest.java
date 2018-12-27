package com.ak.learning.concurrency;

import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueueTest {

    public  static  void main(String arg[])
    {
        LinkedTransferQueue<String> stringLinkedTransferQueue = new LinkedTransferQueue<>();
        System.out.println(stringLinkedTransferQueue.remainingCapacity());
        stringLinkedTransferQueue.add("Hello");
        stringLinkedTransferQueue.add("world");
        stringLinkedTransferQueue.add("Learn");
        System.out.println(stringLinkedTransferQueue);
        System.out.println(stringLinkedTransferQueue.remainingCapacity());


    }
}
