package com.plute.case10;


/**
 * 等待唤醒机制的思路
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Foodie foodie = new Foodie();
        cook.setName("生产者");
        foodie.setName("消费者");

        cook.start();
        foodie.start();
    }
}
