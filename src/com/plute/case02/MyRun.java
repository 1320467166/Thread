package com.plute.case02;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "hello world" + i);
        }
    }
}
