package com.plute.case01;

public class ThreadDemo {

    public static void main(String[] args) {
        /**
         * 1、定义一个类，继承Thread类
         * 2、重写run方法
         * 3、创建子类对象，启动线程
         */
        MyThread threadOne = new MyThread();
        threadOne.setName("线程一");
        MyThread threadTwo = new MyThread();
        threadTwo.setName("线程二");
        //开启线程
        threadOne.start();
        threadTwo.start();
    }

}
