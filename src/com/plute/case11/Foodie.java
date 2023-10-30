package com.plute.case11;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> arrayBlockingQueue;
    public Foodie(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                arrayBlockingQueue.take();
                System.out.println("消费了一个消息");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
