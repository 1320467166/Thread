package com.plute.case04;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 一、如何给线程设置名称
         * 1、setName() and getName()
         *  若未给线程设置名称，则线程有默认名称 Thread-{0},序号从0开始
         *  构造函数中默认赋值  "Thread-" + nextThreadNum()
         * 2、子类中继承Thread构造函数
         *
         * 二、获取当前线程对象
         *  static Thread currentThread()
         *  1、当java虚拟机启动之后,会启用多条线程
         *  其中有一条线程就叫做main方法
         *  他的作用就是去调用main方法，并执行里面的代码
         *
         * 三、让线程休眠指定时间，单位为毫秒
         *  static void sleep(long time)
         *  1、哪条线程执行到这个方法，该线程就会休眠设置的时间
         *  2、1000ms = 1s
         *  3、休眠时间结束后，线程会再次醒来，执行后续代码
         *
         *  四、设置优先级
         *  public final void setPriority(int newPriority)
         *  1、java使用得抢占式调度
         *  2、优先级越高越容易得到cpu调度
         *  3、线程优先级最高10 最低1 默认中间5
         *
         *  五、守护线程
         *  public final void setDaemon(boolean on)
         *  当其他非守护线程结束后，守护线程会陆续结束
         *
         *  运用场景：
         *  QQ聊天+传文件，QQ聊天a线程关闭之后，传文件自动结束
         *
         *  六、礼让线程
         *  Thread.yield();
         *  线程run方法内使用，将cpu礼让给其他线程，但是可能重新获取到cpu调度权
         *  所以该方法，只会让其他线程更有机会
         *
         *  七、插入线程
         *  void join
         *  把线程插入当前线程
         *
         */

//        MyThread t1 = new MyThread("线程1");
//        MyThread t2 = new MyThread("线程2");
//
//        t1.start();
//        t2.start();
        MyThread t1 = new MyThread("线程1");
        t1.start();
        t1.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "@" + i);
        }
    }
}
