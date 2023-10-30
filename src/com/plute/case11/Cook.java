package com.plute.case11;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue<String> arrayBlockingQueue;

    public Cook(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                arrayBlockingQueue.put("消息");
                System.out.println("生产了一个消息");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
