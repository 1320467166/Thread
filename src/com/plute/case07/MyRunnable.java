package com.plute.case07;

public class MyRunnable implements Runnable{

    private int ticket = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
                method();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void method() {
        if (ticket == 100) {
            return;
        } else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "@" + ticket);
        }
    }
}
