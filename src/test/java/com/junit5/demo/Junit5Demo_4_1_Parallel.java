package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

/**
 * 〈一句话功能简述〉<br>
 * 〈Fixtures〉
 *
 * @author Claire
 * @create 2020/11/8
 * @since 1.0.0
 */
public class Junit5Demo_4_1_Parallel {

    @RepeatedTest(10)
//    @Execution(CONCURRENT) //CONCURRENT表示支持多线程
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
    }
    @RepeatedTest(10)
    @Execution(CONCURRENT) //CONCURRENT表示支持多线程
    public void countSynTest() throws InterruptedException {
        int result = Calculator.syncount(1);
        System.out.println(result);
    }
    //使用java.util.concurrent.atomic
    @RepeatedTest(10)
    public void atomicTest() throws InterruptedException {
        int result=Calculator.atomicCount(1);
        System.out.println(result);
    }
}
