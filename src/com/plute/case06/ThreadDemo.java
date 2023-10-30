package com.plute.case06;

/**
 * 线程安全问题
 */
public class ThreadDemo {
    public static void main(String[] args) {

        //不安全 超卖 卖同一张票
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
