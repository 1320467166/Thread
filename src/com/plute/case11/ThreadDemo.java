package com.plute.case11;


import java.util.concurrent.ArrayBlockingQueue;

/**
 * 等待唤醒机制的思路
 */
public class ThreadDemo {
    public static void main(String[] args) {
        /**
         *
         */
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        Cook cook = new Cook(arrayBlockingQueue);
        Foodie foodie = new Foodie(arrayBlockingQueue);
        cook.start();
        foodie.start();
    }
}
