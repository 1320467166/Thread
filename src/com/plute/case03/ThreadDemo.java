package com.plute.case03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 1、定义一个类，实现Callable接口
         * 2、重写call方法
         * 3、创建类对象
         * 4、创建Feature对象(FutureTask)，并开启线程
         * 5.创建Thread类对象，并开启
         */
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTaskOne = new FutureTask<>(myCallable);
        Thread threadOne = new Thread(futureTaskOne);
        threadOne.start();
        FutureTask<Integer> futureTaskTwo = new FutureTask<>(myCallable);
        Thread threadTwo = new Thread(futureTaskTwo);
        threadTwo.start();

        System.out.println(futureTaskOne.get());
        System.out.println(futureTaskTwo.get());

    }
}
