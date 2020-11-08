package com.util;

import org.junit.platform.commons.function.Try;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试靶场〉
 *
 * @author Claire
 * @create 2020/11/7
 * @since 1.0.0
 */
public class Calculator {
    public static int result = 0;

    public static int add(int a, int b) {
        int result = a + b;
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }

    public static int count(int x) throws InterruptedException {
        int i = result;
        Thread.sleep(1000);
        result = i + x;
        return result;
    }

    //代码锁只适合单实例
    public synchronized static int syncount(int x) throws InterruptedException {
        int i = result;
        Thread.sleep(1000);
        result = i + x;
        return result;
    }

    //使用Atomic原子操作
    public static AtomicInteger atomiccount = new AtomicInteger();

    public static int atomicCount(int x) throws InterruptedException {
        Thread.sleep(1000);
        result = atomiccount.incrementAndGet();
        return result;
    }


    public static int subtract(int a, int b) {
        int result = a - b;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int multiply(int a, int b) {
        result = a * b;
        return result;
    }

    public static int divide(int a, int b) {
        result = a / b;
        return result;
    }

    public static void clear() {
        result = 0;
        System.out.println("当前结果已清零！");
    }
}
