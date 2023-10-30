package com.plute.case08;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{

    private int ticket = 0;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                method();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.unlock();
            System.out.println(1);
        }
    }

    private void method() throws InterruptedException {
        Thread.sleep(10);
        if (ticket == 100) {
            return;
        } else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "@" + ticket);
        }
    }
}
