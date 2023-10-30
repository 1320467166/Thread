package com.plute.case09;


public class MyThread extends Thread{
    static Object obj1 = new Object();
    static Object obj2 = new Object();

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (getName().equals("线程1")) {
                synchronized (obj1) {
                    System.out.println("线程1拿到A锁,正准备拿B锁");
                    synchronized (obj2) {
                        System.out.println("线程1拿到了B锁");
                    }
                }
            } else if (getName().equals("线程2")) {
                synchronized (obj2) {
                    System.out.println("线程2拿到B锁，正准备拿A锁");
                    synchronized (obj1) {
                        System.out.println("线程2拿到了A锁");
                    }
                }
            }


        }
    }
}

