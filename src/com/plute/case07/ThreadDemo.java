package com.plute.case07;


/**
 * 线程安全问题
 * synchronized 方法
 *
 */
public class ThreadDemo {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable,"线程1");
        Thread t2 = new Thread(myRunnable,"线程2");
        Thread t3 = new Thread(myRunnable,"线程3");
        t1.start();
        t2.start();
        t3.start();
    }
}
