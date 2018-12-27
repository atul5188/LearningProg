package com.ak.learning.concurrency;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeTest {
    public static void main(String arg[])
    {
        ConcurrentLinkedDeque<String>  concurrentLinkedDeque  =  new  ConcurrentLinkedDeque<String>();
        concurrentLinkedDeque.push("Welcome");
        concurrentLinkedDeque.push("to");
        concurrentLinkedDeque.push("Learn");

        System.out.println("ConcurrentLinkedDeque" +concurrentLinkedDeque);
        concurrentLinkedDeque.push(null);

    }
}

