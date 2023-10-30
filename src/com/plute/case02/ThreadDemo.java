package com.plute.case02;

public class ThreadDemo {
    public static void main(String[] args) {
        /**
         * 1、定义一个类，实现Runnable接口
         * 2、重写run方法
         * 3、创建类对象
         * 4、创建thread类，并开启线程
         */
        MyRun myRun = new MyRun();

        Thread threadOne = new Thread(myRun);
        threadOne.setName("线程1");
        Thread threadTwo = new Thread(myRun);
        threadTwo.setName("线程2");
        threadOne.start();
        threadTwo.start();

    }
}
