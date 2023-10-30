package com.plute.case10;

public class Desk {

    /**
     * o: 没有  1：有
     */
    public static int foodFlag = 0;

    /**
     * 最多执行10次
     */
    public static int count = 10;

    public static Object lock = new Object();
}
