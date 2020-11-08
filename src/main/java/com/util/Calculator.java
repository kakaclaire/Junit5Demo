package com.util;

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
        result = a + b;
        return result;
    }
    public static int count(int x) throws InterruptedException {
        int i=result;
        Thread.sleep(1000);
        result= i+x;
        return result;
    }

    public static int subtract(int a, int b) {
        result = a - b;
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
}
