package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础脚本,分别执行了加减乘除、计算器操作，并打印了结果〉
 *
 * @author Claire
 * @create 2020/11/8
 * @since 1.0.0
 */
public class Junit5Demo_1_1_Base {
    @Test
    public void addTest(){
        int result = Calculator.add(4,2);
        System.out.println(result);
    }
    @Test
    public void subTractTest(){
        int result = Calculator.subtract(4,2);
        System.out.println(result);
    }
    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(4,2);
        System.out.println(result);
    }
    @Test
    public void divideTest(){
        int result = Calculator.divide(4,2);
        System.out.println(result);
    }
    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(4);
        System.out.println(result);
    }

}
