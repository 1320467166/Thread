package com.plute.case04;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    public MyThread() {
        super();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@"+ i);
            Thread.yield();
        }
    }
}
