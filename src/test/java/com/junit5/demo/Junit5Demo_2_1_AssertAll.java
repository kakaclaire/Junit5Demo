package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础脚本,分别执行了加减乘除、计算器操作，并打印了结果〉
 * 1、进行优化，添加自动断言，解决人工查看
 * 2、进行了优化，使用Junit5提供的assertALL进行断言，增加了脚本的容错性。
 *
 * @author Claire
 * @create 2020/11/8
 * @since 1.0.0
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)//可以控制指执行顺序
public class Junit5Demo_2_1_AssertAll {
    @Test
    @Order(1)
    public void addTest() {
        final int result01 = Calculator.add(4, 2);
        System.out.println(result01);


        int result02 = Calculator.add(5, 2);
        System.out.println(result02);

        int result03 = Calculator.add(6, 2);
        System.out.println(result03);
        assertAll("计算结果校验",
                () -> assertEquals(6, result01),
                () -> assertEquals(5, result02),
                () -> assertEquals(7, result03)
        );

    }

    @Test
    @Order(2)
    public void subTractTest() {
        int result = Calculator.subtract(4, 2);
        System.out.println(result);
        assertEquals(2, result);
    }

    @Test
    @Order(3)
    public void multiplyTest() {
        int result = Calculator.multiply(4, 2);
        System.out.println(result);
        assertEquals(8, result);
    }

    @Test
    public void divideTest() {
        int result = Calculator.divide(4, 2);
        System.out.println(result);
        assertEquals(2, result);
    }
    @BeforeEach//每个方法前执行
    public void clear(){
        Calculator.clear();
    }


    @Test
    @Order(5)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4, result);
    }

}
