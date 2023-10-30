package com.plute.case09;


/**
 * 线程安全问题
 * 死锁（开发中要避免锁嵌套）
 */
public class ThreadDemo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread("线程1");
        MyThread myThread2 = new MyThread("线程2");
        myThread.start();
        myThread2.start();
    }
}
