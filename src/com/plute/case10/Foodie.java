package com.plute.case10;

public class Foodie extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 0) {
                        try {
                            //让当前线程跟锁绑定
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //如果有消息就消费
                        Desk.count--;
                        System.out.println(String.format("还能消费%s条消息", Desk.count));
                        Desk.foodFlag = 0;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
