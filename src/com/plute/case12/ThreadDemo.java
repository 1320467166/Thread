package com.plute.case12;


import java.util.concurrent.*;

/**
 * 等待唤醒机制的思路
 */
public class ThreadDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,  //核心线程数
                6,  //最大线程数(临时+核心)
                10, //临时线程存活时间
                TimeUnit.SECONDS, //存活时间单位
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

//        threadPoolExecutor.submit();
    }
}
